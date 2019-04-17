// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Joins a string Tensor across the given dimensions.
 * 
 *  Computes the string join across dimensions in the given string Tensor of shape
 *  {@code [\\(d_0, d_1, ..., d_{n-1}\\)]}.  Returns a new Tensor created by joining the input
 *  strings with the given separator (default: empty string).  Negative indices are
 *  counted backwards from the end, with {@code -1} being equivalent to {@code n - 1}.  If
 *  indices are not specified, joins across all dimensions beginning from {@code n - 1}
 *  through {@code 0}.
 * 
 *  For example:
 * 
 *  <pre>{@code python
 *  # tensor `a` is [["a", "b"], ["c", "d"]]
 *  tf.reduce_join(a, 0) ==> ["ac", "bd"]
 *  tf.reduce_join(a, 1) ==> ["ab", "cd"]
 *  tf.reduce_join(a, -2) = tf.reduce_join(a, 0) ==> ["ac", "bd"]
 *  tf.reduce_join(a, -1) = tf.reduce_join(a, 1) ==> ["ab", "cd"]
 *  tf.reduce_join(a, 0, keep_dims=True) ==> [["ac", "bd"]]
 *  tf.reduce_join(a, 1, keep_dims=True) ==> [["ab"], ["cd"]]
 *  tf.reduce_join(a, 0, separator=".") ==> ["a.c", "b.d"]
 *  tf.reduce_join(a, [0, 1]) ==> "acbd"
 *  tf.reduce_join(a, [1, 0]) ==> "abcd"
 *  tf.reduce_join(a, []) ==> [["a", "b"], ["c", "d"]]
 *  tf.reduce_join(a) = tf.reduce_join(a, [1, 0]) ==> "abcd"
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: The input to be joined.  All reduced indices must have non-zero size.
 *  * reduction_indices: The dimensions to reduce over.  Dimensions are reduced in the
 *  order specified.  Omitting {@code reduction_indices} is equivalent to passing
 *  {@code [n-1, n-2, ..., 0]}.  Negative indices from {@code -n} to {@code -1} are supported.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * keep_dims: If {@code True}, retain reduced dimensions with length {@code 1}.
 *  * separator: The separator to use when joining.
 * 
 *  Returns:
 *  * {@code Output}: Has shape equal to that of the input with reduced dimensions removed or
 *  set to {@code 1} depending on {@code keep_dims}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReduceJoin extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReduceJoin(Pointer p) { super(p); }

  /** Optional attribute setters for ReduceJoin */
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
  
    /** If {@code True}, retain reduced dimensions with length {@code 1}.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs KeepDims(@Cast("bool") boolean x);

    /** The separator to use when joining.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs Separator(@StringPiece BytePointer x);
    public native @ByVal Attrs Separator(@StringPiece String x);

    public native @Cast("bool") boolean keep_dims_(); public native Attrs keep_dims_(boolean setter);
    public native @StringPiece BytePointer separator_(); public native Attrs separator_(BytePointer setter);
  }
  public ReduceJoin(@Const @ByRef Scope scope, @ByVal Input inputs,
             @ByVal Input reduction_indices) { super((Pointer)null); allocate(scope, inputs, reduction_indices); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input inputs,
             @ByVal Input reduction_indices);
  public ReduceJoin(@Const @ByRef Scope scope, @ByVal Input inputs,
             @ByVal Input reduction_indices, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, inputs, reduction_indices, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input inputs,
             @ByVal Input reduction_indices, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs KeepDims(@Cast("bool") boolean x);
  public static native @ByVal Attrs Separator(@StringPiece BytePointer x);
  public static native @ByVal Attrs Separator(@StringPiece String x);

  public native @ByRef Operation operation(); public native ReduceJoin operation(Operation setter);
  public native @ByRef Output output(); public native ReduceJoin output(Output setter);
}
