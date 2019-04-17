// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Concatenates quantized tensors along one dimension.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * concat_dim: 0-D.  The dimension along which to concatenate.  Must be in the
 *  range [0, rank(values)).
 *  * values: The {@code N} Tensors to concatenate. Their ranks and types must match,
 *  and their sizes must match in all dimensions except {@code concat_dim}.
 *  * input_mins: The minimum scalar values for each of the input tensors.
 *  * input_maxes: The maximum scalar values for each of the input tensors.
 * 
 *  Returns:
 *  * {@code Output} output: A {@code Tensor} with the concatenation of values stacked along the
 *  {@code concat_dim} dimension.  This tensor's shape matches that of {@code values} except
 *  in {@code concat_dim} where it has the sum of the sizes.
 *  * {@code Output} output_min: The float value that the minimum quantized output value represents.
 *  * {@code Output} output_max: The float value that the maximum quantized output value represents. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedConcat extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedConcat(Pointer p) { super(p); }

  public QuantizedConcat(@Const @ByRef Scope scope, @ByVal Input concat_dim, @ByVal InputList values,
                  @ByVal InputList input_mins, @ByVal InputList input_maxes) { super((Pointer)null); allocate(scope, concat_dim, values, input_mins, input_maxes); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input concat_dim, @ByVal InputList values,
                  @ByVal InputList input_mins, @ByVal InputList input_maxes);

  public native @ByRef Operation operation(); public native QuantizedConcat operation(Operation setter);
  public native @ByRef Output output(); public native QuantizedConcat output(Output setter);
  public native @ByRef Output output_min(); public native QuantizedConcat output_min(Output setter);
  public native @ByRef Output output_max(); public native QuantizedConcat output_max(Output setter);
}
