// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Removes dimensions of size 1 from the shape of a tensor.
 * 
 *  Given a tensor {@code input}, this operation returns a tensor of the same type with
 *  all dimensions of size 1 removed. If you don't want to remove all size 1
 *  dimensions, you can remove specific size 1 dimensions by specifying
 *  {@code axis}.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # 't' is a tensor of shape [1, 2, 1, 3, 1, 1]
 *  shape(squeeze(t)) ==> [2, 3]
 *  }</pre>
 * 
 *  Or, to remove specific size 1 dimensions:
 * 
 *  <pre>{@code
 *  # 't' is a tensor of shape [1, 2, 1, 3, 1, 1]
 *  shape(squeeze(t, [2, 4])) ==> [1, 2, 3, 1]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The {@code input} to squeeze.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * axis: If specified, only squeezes the dimensions listed. The dimension
 *  index starts at 0. It is an error to squeeze a dimension that is not 1. Must
 *  be in the range {@code [-rank(input), rank(input))}.
 * 
 *  Returns:
 *  * {@code Output}: Contains the same data as {@code input}, but has one or more dimensions of
 *  size 1 removed. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Squeeze extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Squeeze(Pointer p) { super(p); }

  /** Optional attribute setters for Squeeze */
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
  
    /** If specified, only squeezes the dimensions listed. The dimension
     *  index starts at 0. It is an error to squeeze a dimension that is not 1. Must
     *  be in the range {@code [-rank(input), rank(input))}.
     * 
     *  Defaults to [] */
    public native @ByVal Attrs Axis(@ArraySlice IntPointer x);
    public native @ByVal Attrs Axis(@ArraySlice IntBuffer x);
    public native @ByVal Attrs Axis(@ArraySlice int... x);

    public native @ArraySlice IntPointer axis_(); public native Attrs axis_(IntPointer setter);
  }
  public Squeeze(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public Squeeze(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Axis(@ArraySlice IntPointer x);
  public static native @ByVal Attrs Axis(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs Axis(@ArraySlice int... x);

  public native @ByRef Operation operation(); public native Squeeze operation(Operation setter);
  public native @ByRef Output output(); public native Squeeze output(Output setter);
}
