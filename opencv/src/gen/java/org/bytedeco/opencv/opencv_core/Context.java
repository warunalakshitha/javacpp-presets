// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;



@Namespace("cv::ocl") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Context extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Context(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Context(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Context position(long position) {
        return (Context)super.position(position);
    }

    public Context() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Context(int dtype) { super((Pointer)null); allocate(dtype); }
    private native void allocate(int dtype);
    public Context(@Const @ByRef Context c) { super((Pointer)null); allocate(c); }
    private native void allocate(@Const @ByRef Context c);
    public native @ByRef @Name("operator =") Context put(@Const @ByRef Context c);

    public native @Cast("bool") boolean create();
    public native @Cast("bool") boolean create(int dtype);
    public native @Cast("size_t") long ndevices();
    public native @Const @ByRef Device device(@Cast("size_t") long idx);
    public native @ByVal Program getProg(@Const @ByRef ProgramSource prog,
                        @Str BytePointer buildopt, @Str BytePointer errmsg);
    public native @ByVal Program getProg(@Const @ByRef ProgramSource prog,
                        @Str String buildopt, @Str String errmsg);
    public native void unloadProg(@ByRef Program prog);

    public static native @ByRef Context getDefault(@Cast("bool") boolean initialize/*=true*/);
    public static native @ByRef Context getDefault();
    public native Pointer ptr();

    

    public native @Cast("bool") boolean useSVM();
    public native void setUseSVM(@Cast("bool") boolean enabled);

    @Opaque public static class Impl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Impl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Impl(Pointer p) { super(p); }
    }
    public native Impl getImpl();
//protected:
    public native Impl p(); public native Context p(Impl setter);
}
