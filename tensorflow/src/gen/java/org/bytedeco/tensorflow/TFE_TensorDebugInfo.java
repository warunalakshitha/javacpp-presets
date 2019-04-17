// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_TensorDebugInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_TensorDebugInfo(Pointer p) { super(p); }

  public TFE_TensorDebugInfo(@Cast("tensorflow::int64*") @StdVector LongPointer dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@Cast("tensorflow::int64*") @StdVector LongPointer dims);
  public TFE_TensorDebugInfo(@Cast("tensorflow::int64*") @StdVector LongBuffer dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@Cast("tensorflow::int64*") @StdVector LongBuffer dims);
  public TFE_TensorDebugInfo(@Cast("tensorflow::int64*") @StdVector long... dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@Cast("tensorflow::int64*") @StdVector long... dims);

  // Fully-padded, minor-to-major.
  public native @Cast("tensorflow::int64*") @StdVector LongPointer dev_dims(); public native TFE_TensorDebugInfo dev_dims(LongPointer setter);
}
