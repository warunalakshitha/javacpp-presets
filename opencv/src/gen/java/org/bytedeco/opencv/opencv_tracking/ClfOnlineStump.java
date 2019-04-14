// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;


@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class ClfOnlineStump extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClfOnlineStump(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ClfOnlineStump(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ClfOnlineStump position(long position) {
        return (ClfOnlineStump)super.position(position);
    }

  public native float _mu0(); public native ClfOnlineStump _mu0(float setter);
  public native float _mu1(); public native ClfOnlineStump _mu1(float setter);
  public native float _sig0(); public native ClfOnlineStump _sig0(float setter);
  public native float _sig1(); public native ClfOnlineStump _sig1(float setter);
  public native float _q(); public native ClfOnlineStump _q(float setter);
  public native int _s(); public native ClfOnlineStump _s(int setter);
  public native float _log_n1(); public native ClfOnlineStump _log_n1(float setter);
  public native float _log_n0(); public native ClfOnlineStump _log_n0(float setter);
  public native float _e1(); public native ClfOnlineStump _e1(float setter);
  public native float _e0(); public native ClfOnlineStump _e0(float setter);
  public native float _lRate(); public native ClfOnlineStump _lRate(float setter);

  public ClfOnlineStump() { super((Pointer)null); allocate(); }
  private native void allocate();
  public ClfOnlineStump( int ind ) { super((Pointer)null); allocate(ind); }
  private native void allocate( int ind );
  public native void init();
  public native void update( @Const @ByRef Mat posx, @Const @ByRef Mat negx );
  public native @Cast("bool") boolean classify( @Const @ByRef Mat x, int i );
  public native float classifyF( @Const @ByRef Mat x, int i );
  public native @StdVector FloatPointer classifySetF( @Const @ByRef Mat x );

}
