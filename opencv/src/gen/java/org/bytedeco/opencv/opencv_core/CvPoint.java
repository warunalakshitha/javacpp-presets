// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif


/******************************* CvPoint and variants ***********************************/

@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvPoint extends AbstractCvPoint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvPoint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvPoint position(long position) {
        return (CvPoint)super.position(position);
    }

    public native int x(); public native CvPoint x(int setter);
    public native int y(); public native CvPoint y(int setter);

// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvPoint() { super((Pointer)null); allocate(); }
    private native void allocate();
// #elif defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
    public CvPoint(int _x/*=0*/, int _y/*=0*/) { super((Pointer)null); allocate(_x, _y); }
    private native void allocate(int _x/*=0*/, int _y/*=0*/);
// #endif
// #ifdef __cplusplus
// #endif
}
