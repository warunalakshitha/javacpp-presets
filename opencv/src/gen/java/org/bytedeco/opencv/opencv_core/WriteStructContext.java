// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \cond IGNORED */
    @Namespace("cv::internal") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class WriteStructContext extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public WriteStructContext(Pointer p) { super(p); }
    
        public WriteStructContext(@ByRef FileStorage _fs, @Str BytePointer name, int flags, @Str BytePointer typeName/*=cv::String()*/) { super((Pointer)null); allocate(_fs, name, flags, typeName); }
        private native void allocate(@ByRef FileStorage _fs, @Str BytePointer name, int flags, @Str BytePointer typeName/*=cv::String()*/);
        public WriteStructContext(@ByRef FileStorage _fs, @Str BytePointer name, int flags) { super((Pointer)null); allocate(_fs, name, flags); }
        private native void allocate(@ByRef FileStorage _fs, @Str BytePointer name, int flags);
        public WriteStructContext(@ByRef FileStorage _fs, @Str String name, int flags, @Str String typeName/*=cv::String()*/) { super((Pointer)null); allocate(_fs, name, flags, typeName); }
        private native void allocate(@ByRef FileStorage _fs, @Str String name, int flags, @Str String typeName/*=cv::String()*/);
        public WriteStructContext(@ByRef FileStorage _fs, @Str String name, int flags) { super((Pointer)null); allocate(_fs, name, flags); }
        private native void allocate(@ByRef FileStorage _fs, @Str String name, int flags);
    }
