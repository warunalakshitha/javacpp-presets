// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** String lengths of {@code input}.
 * 
 *  Computes the length of each string given in the input tensor.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The string for which to compute the length.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * unit: The unit that is counted to compute string length.  One of: {@code "BYTE"} (for
 *  the number of bytes in each string) or {@code "UTF8_CHAR"} (for the number of UTF-8
 *  encoded Unicode code points in each string).  Results are undefined
 *  if {@code unit=UTF8_CHAR} and the {@code input} strings do not contain structurally
 *  valid UTF-8.
 * 
 *  Returns:
 *  * {@code Output}: Integer tensor that has the same shape as {@code input}. The output contains the
 *  element-wise string lengths of {@code input}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringLength extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringLength(Pointer p) { super(p); }

  /** Optional attribute setters for StringLength */
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
  
    /** The unit that is counted to compute string length.  One of: {@code "BYTE"} (for
     *  the number of bytes in each string) or {@code "UTF8_CHAR"} (for the number of UTF-8
     *  encoded Unicode code points in each string).  Results are undefined
     *  if {@code unit=UTF8_CHAR} and the {@code input} strings do not contain structurally
     *  valid UTF-8.
     * 
     *  Defaults to "BYTE" */
    public native @ByVal Attrs Unit(@StringPiece BytePointer x);
    public native @ByVal Attrs Unit(@StringPiece String x);

    public native @StringPiece BytePointer unit_(); public native Attrs unit_(BytePointer setter);
  }
  public StringLength(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public StringLength(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Unit(@StringPiece BytePointer x);
  public static native @ByVal Attrs Unit(@StringPiece String x);

  public native @ByRef Operation operation(); public native StringLength operation(Operation setter);
  public native @ByRef Output output(); public native StringLength output(Output setter);
}
