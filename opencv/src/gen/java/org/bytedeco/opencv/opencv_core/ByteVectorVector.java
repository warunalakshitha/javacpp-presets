// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<std::vector<char> >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class ByteVectorVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ByteVectorVector(Pointer p) { super(p); }
    public ByteVectorVector(byte[] ... array) { this(array.length); put(array); }
    public ByteVectorVector()       { allocate();  }
    public ByteVectorVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef ByteVectorVector put(@ByRef ByteVectorVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);
    public boolean empty(@Cast("size_t") long i) { return size(i) == 0; }
    public native @Index(function = "at") long size(@Cast("size_t") long i);
    public void clear(@Cast("size_t") long i) { resize(i, 0); }
    public native @Index(function = "at") void resize(@Cast("size_t") long i, @Cast("size_t") long n);

    @Index(function = "at") public native @Cast("char") byte get(@Cast("size_t") long i, @Cast("size_t") long j);
    public native ByteVectorVector put(@Cast("size_t") long i, @Cast("size_t") long j, byte value);

    public byte[][] get() {
        byte[][] array = new byte[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new byte[size(i) < Integer.MAX_VALUE ? (int)size(i) : Integer.MAX_VALUE];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = get(i, j);
            }
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.deepToString(get());
    }

    public ByteVectorVector put(byte[] ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            if (size(i) != array[i].length) { resize(i, array[i].length); }
            for (int j = 0; j < array[i].length; j++) {
                put(i, j, array[i][j]);
            }
        }
        return this;
    }
}

