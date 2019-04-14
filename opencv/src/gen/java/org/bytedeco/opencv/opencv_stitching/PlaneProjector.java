// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \brief Base class for rotation-based warper using a detail::ProjectorBase_ derived class.
 */


@Namespace("cv::detail") @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class PlaneProjector extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PlaneProjector() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PlaneProjector(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PlaneProjector(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PlaneProjector position(long position) {
        return (PlaneProjector)super.position(position);
    }

    public native void mapForward(float x, float y, @ByRef FloatPointer u, @ByRef FloatPointer v);
    public native void mapForward(float x, float y, @ByRef FloatBuffer u, @ByRef FloatBuffer v);
    public native void mapForward(float x, float y, @ByRef float[] u, @ByRef float[] v);
    public native void mapBackward(float u, float v, @ByRef FloatPointer x, @ByRef FloatPointer y);
    public native void mapBackward(float u, float v, @ByRef FloatBuffer x, @ByRef FloatBuffer y);
    public native void mapBackward(float u, float v, @ByRef float[] x, @ByRef float[] y);
}
