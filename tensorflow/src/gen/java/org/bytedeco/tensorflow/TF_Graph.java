// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_Graph extends org.bytedeco.tensorflow.AbstractTF_Graph {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_Graph(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_Graph(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TF_Graph position(long position) {
        return (TF_Graph)super.position(position);
    }

  public TF_Graph() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @ByRef @Cast("tensorflow::mutex*") Pointer mu(); public native TF_Graph mu(Pointer setter);
  public native @MemberGetter @ByRef Graph graph();

  // Runs shape inference.
  public native @MemberGetter @ByRef ShapeRefiner refiner();

  // Maps from name of an operation to the Node* in 'graph'.
  public native @ByRef StringNodeMap name_map(); public native TF_Graph name_map(StringNodeMap setter);

  // The keys of this map are all the active sessions using this graph. Each
  // value records whether the graph has been mutated since the corresponding
  // session has been run (this is detected in RecordMutation function). If the
  // string is empty, no mutation has occurred. Otherwise the string is a
  // description of the mutation suitable for returning to the user.
  //
  // Sessions are added to this map in TF_NewSession, and removed in
  // TF_DeleteSession.
  // TF_Graph may only / must be deleted when
  //   sessions.size() == 0 && delete_requested == true
  //
  // TODO(b/74949947): mutations currently trigger a warning instead of a bad
  // status, this should be reverted when possible.
  public native @ByRef TF_SessionStringMap sessions(); public native TF_Graph sessions(TF_SessionStringMap setter);
  public native @Cast("bool") boolean delete_requested(); public native TF_Graph delete_requested(boolean setter);  // set true by TF_DeleteGraph

  // Used to link graphs contained in TF_WhileParams to the parent graph that
  // will eventually contain the full while loop.
  public native TF_Graph parent(); public native TF_Graph parent(TF_Graph setter);
  public native TF_Output parent_inputs(); public native TF_Graph parent_inputs(TF_Output setter);
}
