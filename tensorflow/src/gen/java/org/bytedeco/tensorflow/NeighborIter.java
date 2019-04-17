// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Iterator for stepping through the neighbors of a node.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NeighborIter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NeighborIter(Pointer p) { super(p); }

  public NeighborIter(@ByVal EdgeSetIterator iter, @Cast("bool") boolean incoming) { super((Pointer)null); allocate(iter, incoming); }
  private native void allocate(@ByVal EdgeSetIterator iter, @Cast("bool") boolean incoming);
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef NeighborIter rhs);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef NeighborIter rhs);
  public native @Name("operator ++") void increment();
  public native @Name("operator *") Node multiply();
  public native @Name("operator ->") Node access();
}
