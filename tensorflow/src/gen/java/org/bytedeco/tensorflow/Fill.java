// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Creates a tensor filled with a scalar value.
 * 
 *  This operation creates a tensor of shape {@code dims} and fills it with {@code value}.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # Output tensor has shape [2, 3].
 *  fill([2, 3], 9) ==> [[9, 9, 9]
 *                       [9, 9, 9]]
 *  }</pre>
 * 
 *  {@code tf.fill} differs from {@code tf.constant} in a few ways:
 * 
 *  *   {@code tf.fill} only supports scalar contents, whereas {@code tf.constant} supports
 *      Tensor values.
 *  *   {@code tf.fill} creates an Op in the computation graph that constructs the actual
 *      Tensor value at runtime. This is in contrast to {@code tf.constant} which embeds
 *      the entire Tensor into the graph with a {@code Const} node.
 *  *   Because {@code tf.fill} evaluates at graph runtime, it supports dynamic shapes
 *      based on other runtime Tensors, unlike {@code tf.constant}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * dims: 1-D. Represents the shape of the output tensor.
 *  * value: 0-D (scalar). Value to fill the returned tensor.
 * 
 *  \compatibility(numpy)
 *  Equivalent to np.full
 *  \end_compatibility
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Fill extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Fill(Pointer p) { super(p); }

  public Fill(@Const @ByRef Scope scope, @ByVal Input dims,
       @ByVal Input value) { super((Pointer)null); allocate(scope, dims, value); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input dims,
       @ByVal Input value);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Fill operation(Operation setter);
  public native @ByRef Output output(); public native Fill output(Output setter);
}
