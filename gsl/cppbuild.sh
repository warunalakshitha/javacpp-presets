#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" gsl
    popd
    exit
fi

GSL_VERSION=2.4
download ftp://ftp.gnu.org/gnu/gsl/gsl-$GSL_VERSION.tar.gz gsl-$GSL_VERSION.tar.gz

mkdir -p $PLATFORM
cd $PLATFORM
INSTALL_PATH=`pwd`

OPENBLAS_PATH="$INSTALL_PATH/../../../openblas/cppbuild/$PLATFORM/"

if [[ -n "${BUILD_PATH:-}" ]]; then
    PREVIFS="$IFS"
    IFS="$BUILD_PATH_SEPARATOR"
    for P in $BUILD_PATH; do
        if [[ -f "$P/include/openblas_config.h" ]]; then
            OPENBLAS_PATH="$P"
        fi
    done
    IFS="$PREVIFS"
fi

echo "Decompressing archives..."
tar --totals -xzf ../gsl-$GSL_VERSION.tar.gz
cd gsl-$GSL_VERSION

export GSL_LDFLAGS="-L$OPENBLAS_PATH/ -L$OPENBLAS_PATH/lib/ -lopenblas"
case $PLATFORM in
    android-arm)
        export AR="$ANDROID_BIN-ar"
        export RANLIB="$ANDROID_BIN-ranlib"
        export CPP="$ANDROID_BIN-cpp"
        export CC="$ANDROID_BIN-gcc"
        export STRIP="$ANDROID_BIN-strip"
        export CPPFLAGS="--sysroot=$ANDROID_ROOT -DANDROID"
        export CFLAGS="$CPPFLAGS -fPIC -ffunction-sections -funwind-tables -fstack-protector -march=armv7-a -mfloat-abi=softfp -mfpu=vfpv3-d16 -fomit-frame-pointer -fstrict-aliasing -funswitch-loops -finline-limit=300 -Dlog2\(x\)=\(log\(x\)/1.44269504088896340736\)"
        export LDFLAGS="-nostdlib -Wl,--fix-cortex-a8 -z text"
        export LIBS="-lgcc -ldl -lz -lm -lc"
        patch -Np1 < ../../../gsl-$GSL_VERSION-android.patch
        ./configure --prefix=$INSTALL_PATH --host="arm-linux-androideabi" --with-sysroot="$ANDROID_ROOT"
        make -j $MAKEJ
        make install-strip
        ;;
     android-x86)
        export AR="$ANDROID_BIN-ar"
        export RANLIB="$ANDROID_BIN-ranlib"
        export CPP="$ANDROID_BIN-cpp"
        export CC="$ANDROID_BIN-gcc"
        export STRIP="$ANDROID_BIN-strip"
        export CPPFLAGS="--sysroot=$ANDROID_ROOT -DANDROID"
        export CFLAGS="$CPPFLAGS -fPIC -ffunction-sections -funwind-tables -mssse3 -mfpmath=sse -fomit-frame-pointer -fstrict-aliasing -funswitch-loops -finline-limit=300 -Dlog2\(x\)=\(log\(x\)/1.44269504088896340736\)"
        export LDFLAGS="-nostdlib -z text"
        export LIBS="-lgcc -ldl -lz -lm -lc"
        patch -Np1 < ../../../gsl-$GSL_VERSION-android.patch
        ./configure --prefix=$INSTALL_PATH --host="i686-linux-android" --with-sysroot="$ANDROID_ROOT"
        make -j $MAKEJ
        make install-strip
        ;;
    linux-x86)
        ./configure --prefix=$INSTALL_PATH CC="$OLDCC -m32"
        make -j $MAKEJ
        make install-strip
        ;;
    linux-x86_64)
        ./configure --prefix=$INSTALL_PATH CC="$OLDCC -m64"
        make -j $MAKEJ
        make install-strip
        ;;
    linux-armhf)
        ./configure --prefix=$INSTALL_PATH --host=arm-linux-gnueabihf
        make -j $MAKEJ
        make install-strip
        ;;
    linux-ppc64le)
        sed -i s/elf64ppc/elf64lppc/ configure
        MACHINE_TYPE=$( uname -m )
        if [[ "$MACHINE_TYPE" =~ ppc64 ]]; then
          ./configure --prefix=$INSTALL_PATH CC="$OLDCC -m64"
        else
          ./configure --prefix=$INSTALL_PATH --host=powerpc64le-linux-gnu --build=ppc64le-linux CC="powerpc64le-linux-gnu-gcc -m64"
        fi
        make -j $MAKEJ
        make install-strip
        ;;
    macosx-*)
        patch -Np1 < ../../../gsl-$GSL_VERSION-macosx.patch
        ./configure --prefix=$INSTALL_PATH
        make -j $MAKEJ
        make install-strip
        ;;
    windows-x86)
        ./configure --prefix=$INSTALL_PATH CC="gcc -m32 -static-libgcc"
        make -j $MAKEJ
        make install-strip
        ;;
    windows-x86_64)
        ./configure --prefix=$INSTALL_PATH CC="gcc -m64 -static-libgcc"
        make -j $MAKEJ
        make install-strip
        ;;
    *)
        echo "Error: Platform \"$PLATFORM\" is not supported"
        ;;
esac

cd ../..
