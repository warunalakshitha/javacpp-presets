// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::vector<std::pair<std::string,tensorflow::Tensor> >") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringTensorPairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringTensorPairVector(Pointer p) { super(p); }
    public StringTensorPairVector(BytePointer[] firstValue, Tensor[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringTensorPairVector(String[] firstValue, Tensor[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringTensorPairVector()       { allocate();  }
    public StringTensorPairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef StringTensorPairVector put(@ByRef StringTensorPairVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @StdString BytePointer first(@Cast("size_t") long i); public native StringTensorPairVector first(@Cast("size_t") long i, BytePointer first);
    @Index(function = "at") public native @ByRef Tensor second(@Cast("size_t") long i);  public native StringTensorPairVector second(@Cast("size_t") long i, Tensor second);
    @MemberSetter @Index(function = "at") public native StringTensorPairVector first(@Cast("size_t") long i, @StdString String first);

    public StringTensorPairVector put(BytePointer[] firstValue, Tensor[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }

    public StringTensorPairVector put(String[] firstValue, Tensor[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

