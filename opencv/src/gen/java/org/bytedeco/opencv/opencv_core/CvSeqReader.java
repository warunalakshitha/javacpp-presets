// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSeqReader extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvSeqReader() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSeqReader(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSeqReader(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvSeqReader position(long position) {
        return (CvSeqReader)super.position(position);
    }

    public native int header_size(); public native CvSeqReader header_size(int setter);
    /** sequence, beign read */
    public native CvSeq seq(); public native CvSeqReader seq(CvSeq setter);
    /** current block */
    public native CvSeqBlock block(); public native CvSeqReader block(CvSeqBlock setter);
    /** pointer to element be read next */
    public native @Cast("schar*") BytePointer ptr(); public native CvSeqReader ptr(BytePointer setter);
    /** pointer to the beginning of block */
    public native @Cast("schar*") BytePointer block_min(); public native CvSeqReader block_min(BytePointer setter);
    /** pointer to the end of block */
    public native @Cast("schar*") BytePointer block_max(); public native CvSeqReader block_max(BytePointer setter);
    /** = seq->first->start_index   */
    public native int delta_index(); public native CvSeqReader delta_index(int setter);
    /** pointer to previous element */
    public native @Cast("schar*") BytePointer prev_elem(); public native CvSeqReader prev_elem(BytePointer setter);
}
