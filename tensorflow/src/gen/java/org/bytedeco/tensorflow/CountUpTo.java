// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Increments 'ref' until it reaches 'limit'.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * ref: Should be from a scalar {@code Variable} node.
 *  * limit: If incrementing ref would bring it above limit, instead generates an
 *  'OutOfRange' error.
 * 
 *  Returns:
 *  * {@code Output}: A copy of the input before increment. If nothing else modifies the
 *  input, the values produced will all be distinct. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CountUpTo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CountUpTo(Pointer p) { super(p); }

  public CountUpTo(@Const @ByRef Scope scope, @ByVal Input ref, @Cast("tensorflow::int64") long limit) { super((Pointer)null); allocate(scope, ref, limit); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref, @Cast("tensorflow::int64") long limit);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native CountUpTo operation(Operation setter);
  public native @ByRef Output output(); public native CountUpTo output(Output setter);
}
