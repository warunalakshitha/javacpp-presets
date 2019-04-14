// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class IplROI extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IplROI() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IplROI(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IplROI(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IplROI position(long position) {
        return (IplROI)super.position(position);
    }

    /** 0 - no COI (all channels are selected), 1 - 0th channel is selected ...*/
    public native int coi(); public native IplROI coi(int setter);
    public native int xOffset(); public native IplROI xOffset(int setter);
    public native int yOffset(); public native IplROI yOffset(int setter);
    public native int width(); public native IplROI width(int setter);
    public native int height(); public native IplROI height(int setter);
}
