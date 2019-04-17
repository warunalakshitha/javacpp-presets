// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Update 'ref' by adding 'value' to it.
 * 
 *  This operation outputs "ref" after the update is done.
 *  This makes it easier to chain operations that need to use the reset value.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * ref: Should be from a {@code Variable} node.
 *  * value: The value to be added to the variable.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * use_locking: If True, the addition will be protected by a lock;
 *  otherwise the behavior is undefined, but may exhibit less contention.
 * 
 *  Returns:
 *  * {@code Output}: = Same as "ref".  Returned as a convenience for operations that want
 *  to use the new value after the variable has been updated. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AssignAdd extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AssignAdd(Pointer p) { super(p); }

  /** Optional attribute setters for AssignAdd */
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
  
    /** If True, the addition will be protected by a lock;
     *  otherwise the behavior is undefined, but may exhibit less contention.
     * 
     *  Defaults to false */
    public native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

    public native @Cast("bool") boolean use_locking_(); public native Attrs use_locking_(boolean setter);
  }
  public AssignAdd(@Const @ByRef Scope scope, @ByVal Input ref,
            @ByVal Input value) { super((Pointer)null); allocate(scope, ref, value); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref,
            @ByVal Input value);
  public AssignAdd(@Const @ByRef Scope scope, @ByVal Input ref,
            @ByVal Input value, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, ref, value, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input ref,
            @ByVal Input value, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs UseLocking(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native AssignAdd operation(Operation setter);
  public native @ByRef Output output_ref(); public native AssignAdd output_ref(Output setter);
}
