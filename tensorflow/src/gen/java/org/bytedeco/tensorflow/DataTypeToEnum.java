// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Name("tensorflow::DataTypeToEnum<float>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DataTypeToEnum extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DataTypeToEnum() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DataTypeToEnum(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataTypeToEnum(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DataTypeToEnum position(long position) {
        return (DataTypeToEnum)super.position(position);
    }

    public static native @Cast("tensorflow::DataType") int v();
    public static native @Cast("tensorflow::DataType") int ref();
    @MemberGetter public static native @Cast("const tensorflow::DataType") int value();
    public static final int value = value();
  }
