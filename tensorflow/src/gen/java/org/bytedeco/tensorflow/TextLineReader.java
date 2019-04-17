// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** A Reader that outputs the lines of a file delimited by '\n'.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * skip_header_lines: Number of lines to skip from the beginning of every file.
 *  * container: If non-empty, this reader is placed in the given container.
 *  Otherwise, a default container is used.
 *  * shared_name: If non-empty, this reader is named in the given bucket
 *  with this shared_name. Otherwise, the node name is used instead.
 * 
 *  Returns:
 *  * {@code Output}: The handle to reference the Reader. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TextLineReader extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TextLineReader(Pointer p) { super(p); }

  /** Optional attribute setters for TextLineReader */
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
  
    /** Number of lines to skip from the beginning of every file.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs SkipHeaderLines(@Cast("tensorflow::int64") long x);

    /** If non-empty, this reader is placed in the given container.
     *  Otherwise, a default container is used.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** If non-empty, this reader is named in the given bucket
     *  with this shared_name. Otherwise, the node name is used instead.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    public native @Cast("tensorflow::int64") long skip_header_lines_(); public native Attrs skip_header_lines_(long setter);
    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
  }
  public TextLineReader(@Const @ByRef Scope scope) { super((Pointer)null); allocate(scope); }
  private native void allocate(@Const @ByRef Scope scope);
  public TextLineReader(@Const @ByRef Scope scope, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs SkipHeaderLines(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);

  public native @ByRef Operation operation(); public native TextLineReader operation(Operation setter);
  public native @ByRef Output reader_handle(); public native TextLineReader reader_handle(Output setter);
}
