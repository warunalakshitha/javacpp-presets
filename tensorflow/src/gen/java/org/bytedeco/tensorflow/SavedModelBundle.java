// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** SavedModel representation once the SavedModel is loaded from storage. */
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SavedModelBundle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedModelBundle(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedModelBundle(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedModelBundle position(long position) {
        return (SavedModelBundle)super.position(position);
    }

  public native @MemberGetter @UniquePtr Session session();
  public native @ByRef MetaGraphDef meta_graph_def(); public native SavedModelBundle meta_graph_def(MetaGraphDef setter);

  /** A TensorFlow Session does not Close itself on destruction. To avoid
   *  resource leaks, we explicitly call Close on Sessions that we create. */

  public SavedModelBundle() { super((Pointer)null); allocate(); }
  private native void allocate();
}
