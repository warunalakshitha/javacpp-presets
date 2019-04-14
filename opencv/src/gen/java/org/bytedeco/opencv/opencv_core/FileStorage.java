// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief XML/YAML/JSON file storage class that encapsulates all the information necessary for writing or
reading data to/from a file.
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class FileStorage extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileStorage(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FileStorage(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FileStorage position(long position) {
        return (FileStorage)super.position(position);
    }

    /** file storage mode */
    /** enum cv::FileStorage::Mode */
    public static final int
        /** value, open the file for reading */
        READ        = 0,
        /** value, open the file for writing */
        WRITE       = 1,
        /** value, open the file for appending */
        APPEND      = 2,
        /** flag, read data from source or write data to the internal buffer (which is
 *  returned by FileStorage::release) */
        MEMORY      = 4,
        /** mask for format flags */
        FORMAT_MASK = (7<<3),
        /** flag, auto format */
        FORMAT_AUTO = 0,
        /** flag, XML format */
        FORMAT_XML  = (1<<3),
        /** flag, YAML format */
        FORMAT_YAML = (2<<3),
        /** flag, JSON format */
        FORMAT_JSON = (3<<3),

        /** flag, write rawdata in Base64 by default. (consider using WRITE_BASE64) */
        BASE64      = 64,
        /** flag, enable both WRITE and BASE64 */
        WRITE_BASE64 = BASE64 | WRITE;
    /** enum cv::FileStorage::State */
    public static final int
        UNDEFINED      = 0,
        VALUE_EXPECTED = 1,
        NAME_EXPECTED  = 2,
        INSIDE_MAP     = 4;

    /** \brief The constructors.
     <p>
     The full constructor opens the file. Alternatively you can use the default constructor and then
     call FileStorage::open.
     */
    public FileStorage() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
     \copydoc open()
     */
    public FileStorage(@Str BytePointer filename, int flags, @Str BytePointer encoding/*=cv::String()*/) { super((Pointer)null); allocate(filename, flags, encoding); }
    private native void allocate(@Str BytePointer filename, int flags, @Str BytePointer encoding/*=cv::String()*/);
    public FileStorage(@Str BytePointer filename, int flags) { super((Pointer)null); allocate(filename, flags); }
    private native void allocate(@Str BytePointer filename, int flags);
    public FileStorage(@Str String filename, int flags, @Str String encoding/*=cv::String()*/) { super((Pointer)null); allocate(filename, flags, encoding); }
    private native void allocate(@Str String filename, int flags, @Str String encoding/*=cv::String()*/);
    public FileStorage(@Str String filename, int flags) { super((Pointer)null); allocate(filename, flags); }
    private native void allocate(@Str String filename, int flags);

    /** the destructor. calls release() */

    /** \brief Opens a file.
     <p>
     See description of parameters in FileStorage::FileStorage. The method calls FileStorage::release
     before opening the file.
     @param filename Name of the file to open or the text string to read the data from.
     Extension of the file (.xml, .yml/.yaml or .json) determines its format (XML, YAML or JSON
     respectively). Also you can append .gz to work with compressed files, for example myHugeMatrix.xml.gz. If both
     FileStorage::WRITE and FileStorage::MEMORY flags are specified, source is used just to specify
     the output file format (e.g. mydata.xml, .yml etc.). A file name can also contain parameters.
     You can use this format, "*?base64" (e.g. "file.json?base64" (case sensitive)), as an alternative to
     FileStorage::BASE64 flag.
     @param flags Mode of operation. One of FileStorage::Mode
     @param encoding Encoding of the file. Note that UTF-16 XML encoding is not supported currently and
     you should use 8-bit encoding instead of it.
     */
    public native @Cast("bool") boolean open(@Str BytePointer filename, int flags, @Str BytePointer encoding/*=cv::String()*/);
    public native @Cast("bool") boolean open(@Str BytePointer filename, int flags);
    public native @Cast("bool") boolean open(@Str String filename, int flags, @Str String encoding/*=cv::String()*/);
    public native @Cast("bool") boolean open(@Str String filename, int flags);

    /** \brief Checks whether the file is opened.
     <p>
     @return true if the object is associated with the current file and false otherwise. It is a
     good practice to call this method after you tried to open a file.
     */
    public native @Cast("bool") boolean isOpened();

    /** \brief Closes the file and releases all the memory buffers.
     <p>
     Call this method after all I/O operations with the storage are finished.
     */
    public native void release();

    /** \brief Closes the file and releases all the memory buffers.
     <p>
     Call this method after all I/O operations with the storage are finished. If the storage was
     opened for writing data and FileStorage::WRITE was specified
     */
    public native @Str BytePointer releaseAndGetString();

    /** \brief Returns the first element of the top-level mapping.
     @return The first element of the top-level mapping.
     */
    public native @ByVal FileNode getFirstTopLevelNode();

    /** \brief Returns the top-level mapping
     @param streamidx Zero-based index of the stream. In most cases there is only one stream in the file.
     However, YAML supports multiple streams and so there can be several.
     @return The top-level mapping.
     */
    public native @ByVal FileNode root(int streamidx/*=0*/);
    public native @ByVal FileNode root();

    /** \brief Returns the specified element of the top-level mapping.
     @param nodename Name of the file node.
     @return Node with the given name.
     */
    public native @ByVal @Name("operator []") FileNode get(@Str BytePointer nodename);
    public native @ByVal @Name("operator []") FileNode get(@Str String nodename);

    /** \overload */
    public native @ByVal @Name("operator []") FileNode getNode(@Cast("const char*") BytePointer nodename);
    public native @ByVal @Name("operator []") FileNode getNode(String nodename);

    /**
     * \brief Simplified writing API to use with bindings.
     * @param name Name of the written object
     * @param val Value of the written object
     */
    public native void write(@Str BytePointer name, int val);
    public native void write(@Str String name, int val);
    /** \overload */
    public native void write(@Str BytePointer name, double val);
    public native void write(@Str String name, double val);
    /** \overload */
    public native void write(@Str BytePointer name, @Str BytePointer val);
    public native void write(@Str String name, @Str String val);
    /** \overload */
    public native void write(@Str BytePointer name, @Const @ByRef Mat val);
    public native void write(@Str String name, @Const @ByRef Mat val);
    /** \overload */
    public native void write(@Str BytePointer name, @Const @ByRef StringVector val);
    public native void write(@Str String name, @Const @ByRef StringVector val);

    /** \brief Writes multiple numbers.
     <p>
     Writes one or more numbers of the specified format to the currently written structure. Usually it is
     more convenient to use operator {@code <<} instead of this method.
     @param fmt Specification of each array element, see \ref format_spec "format specification"
     @param vec Pointer to the written array.
     @param len Number of the uchar elements to write.
     */
    public native void writeRaw( @Str BytePointer fmt, @Const Pointer vec, @Cast("size_t") long len );
    public native void writeRaw( @Str String fmt, @Const Pointer vec, @Cast("size_t") long len );

    /** \brief Writes a comment.
     <p>
     The function writes a comment into file storage. The comments are skipped when the storage is read.
     @param comment The written comment, single-line or multi-line
     @param append If true, the function tries to put the comment at the end of current line.
     Else if the comment is multi-line, or if it does not fit at the end of the current
     line, the comment starts a new line.
     */
    public native void writeComment(@Str BytePointer comment, @Cast("bool") boolean append/*=false*/);
    public native void writeComment(@Str BytePointer comment);
    public native void writeComment(@Str String comment, @Cast("bool") boolean append/*=false*/);
    public native void writeComment(@Str String comment);

    public native void startWriteStruct(@Str BytePointer name, int flags, @Str BytePointer typeName);
    public native void startWriteStruct(@Str String name, int flags, @Str String typeName);
    public native void endWriteStruct();

    /** \brief Returns the normalized object name for the specified name of a file.
     @param filename Name of a file
     @return The normalized object name.
     */
    public static native @Str BytePointer getDefaultObjectName(@Str BytePointer filename);
    public static native @Str String getDefaultObjectName(@Str String filename);

    /** \brief Returns the current format.
     * @return The current format, see FileStorage::Mode
     */
    public native int getFormat();

    public native int state(); public native FileStorage state(int setter);
    public native @StdString BytePointer elname(); public native FileStorage elname(BytePointer setter);
}
