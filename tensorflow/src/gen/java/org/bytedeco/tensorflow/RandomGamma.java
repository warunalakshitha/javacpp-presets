// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Outputs random values from the Gamma distribution(s) described by alpha.
 * 
 *  This op uses the algorithm by Marsaglia et al. to acquire samples via
 *  transformation-rejection from pairs of uniform and normal random variables.
 *  See http://dl.acm.org/citation.cfm?id=358414
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: 1-D integer tensor. Shape of independent samples to draw from each
 *  distribution described by the shape parameters given in alpha.
 *  * alpha: A tensor in which each scalar is a "shape" parameter describing the
 *  associated gamma distribution.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * seed: If either {@code seed} or {@code seed2} are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: A second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output}: A tensor with shape {@code shape + shape(alpha)}. Each slice
 *  {@code [:, ..., :, i0, i1, ...iN]} contains the samples drawn for
 *  {@code alpha[i0, i1, ...iN]}. The dtype of the output matches the dtype of alpha. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RandomGamma extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomGamma(Pointer p) { super(p); }

  /** Optional attribute setters for RandomGamma */
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
  
    /** If either {@code seed} or {@code seed2} are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** A second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
  }
  public RandomGamma(@Const @ByRef Scope scope, @ByVal Input shape,
              @ByVal Input alpha) { super((Pointer)null); allocate(scope, shape, alpha); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
              @ByVal Input alpha);
  public RandomGamma(@Const @ByRef Scope scope, @ByVal Input shape,
              @ByVal Input alpha, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, shape, alpha, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
              @ByVal Input alpha, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native RandomGamma operation(Operation setter);
  public native @ByRef Output output(); public native RandomGamma output(Output setter);
}
