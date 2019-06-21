// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

        @Namespace("ngraph::op") @NoOffset @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class Result extends Op {
            static { Loader.load(); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public Result(Pointer p) { super(p); }
        
            /** \brief Allows a value to be used as a function result.
             * 
             *  @param arg Node that produces the input tensor. */
            public Result(@Const @SharedPtr @ByRef Node arg, @Cast("bool") boolean needs_default_layout/*=false*/) { super((Pointer)null); allocate(arg, needs_default_layout); }
            private native void allocate(@Const @SharedPtr @ByRef Node arg, @Cast("bool") boolean needs_default_layout/*=false*/);
            public Result(@Const @SharedPtr @ByRef Node arg) { super((Pointer)null); allocate(arg); }
            private native void allocate(@Const @SharedPtr @ByRef Node arg);

            public native void validate_and_infer_types();

            public native @SharedPtr @ByVal Node copy_with_new_args(@Const @ByRef NodeVector new_args);

            public native @Cast("bool") boolean is_output();
            public native void set_needs_default_layout(@Cast("bool") boolean val);
            public native @Cast("bool") boolean needs_default_layout();
        }
