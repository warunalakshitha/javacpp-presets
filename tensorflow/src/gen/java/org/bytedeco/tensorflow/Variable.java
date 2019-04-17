// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Holds state in the form of a tensor that persists across steps.
 * 
 *  Outputs a ref to the tensor state so it may be read or modified.
 *  TODO(zhifengc/mrry): Adds a pointer to a more detail document
 *  about sharing states in tensorflow.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: The shape of the variable tensor.
 *  * dtype: The type of elements in the variable tensor.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * container: If non-empty, this variable is placed in the given container.
 *  Otherwise, a default container is used.
 *  * shared_name: If non-empty, this variable is named in the given bucket
 *  with this shared_name. Otherwise, the node name is used instead.
 * 
 *  Returns:
 *  * {@code Output}: A reference to the variable tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Variable extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Variable(Pointer p) { super(p); }

  /** Optional attribute setters for Variable */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If non-empty, this variable is placed in the given container.
     *  Otherwise, a default container is used.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** If non-empty, this variable is named in the given bucket
     *  with this shared_name. Otherwise, the node name is used instead.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
  }
  public Variable(@Const @ByRef Scope scope, @ByVal PartialTensorShape shape, @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, shape, dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal PartialTensorShape shape, @Cast("tensorflow::DataType") int dtype);
  public Variable(@Const @ByRef Scope scope, @ByVal PartialTensorShape shape, @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, shape, dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal PartialTensorShape shape, @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);

  public native @ByRef Operation operation(); public native Variable operation(Operation setter);
  public native @ByRef Output ref(); public native Variable ref(Output setter);
}
