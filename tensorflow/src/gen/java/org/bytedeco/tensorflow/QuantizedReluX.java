// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes Quantized Rectified Linear X: {@code min(max(features, 0), max_value)}
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * min_features: The float value that the lowest quantized value represents.
 *  * max_features: The float value that the highest quantized value represents.
 * 
 *  Returns:
 *  * {@code Output} activations: Has the same output shape as "features".
 *  * {@code Output} min_activations: The float value that the lowest quantized value represents.
 *  * {@code Output} max_activations: The float value that the highest quantized value represents. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedReluX extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedReluX(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedReluX */
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
  
    /** Defaults to DT_QUINT8 */
    public native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int out_type_(); public native Attrs out_type_(int setter);
  }
  public QuantizedReluX(@Const @ByRef Scope scope, @ByVal Input features,
                 @ByVal Input max_value, @ByVal Input min_features,
                 @ByVal Input max_features) { super((Pointer)null); allocate(scope, features, max_value, min_features, max_features); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input features,
                 @ByVal Input max_value, @ByVal Input min_features,
                 @ByVal Input max_features);
  public QuantizedReluX(@Const @ByRef Scope scope, @ByVal Input features,
                 @ByVal Input max_value, @ByVal Input min_features,
                 @ByVal Input max_features, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, features, max_value, min_features, max_features, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input features,
                 @ByVal Input max_value, @ByVal Input min_features,
                 @ByVal Input max_features, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native QuantizedReluX operation(Operation setter);
  public native @ByRef Output activations(); public native QuantizedReluX activations(Output setter);
  public native @ByRef Output min_activations(); public native QuantizedReluX min_activations(Output setter);
  public native @ByRef Output max_activations(); public native QuantizedReluX max_activations(Output setter);
}
