// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** A type for representing the input to ops that require a list of tensors. */
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class InputList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InputList(Pointer p) { super(p); }

  /** Implicitly convert a list of outputs to a list of inputs. This is useful
   *  to write code such as ops::Concat(ops::Split(x, 4)). */
  public InputList(@Cast("const tensorflow::OutputList*") @ByRef OutputVector out) { super((Pointer)null); allocate(out); }
  private native void allocate(@Cast("const tensorflow::OutputList*") @ByRef OutputVector out);

  public InputList(@ArraySlice Input inputs) { super((Pointer)null); allocate(inputs); }
  private native void allocate(@ArraySlice Input inputs);
}
