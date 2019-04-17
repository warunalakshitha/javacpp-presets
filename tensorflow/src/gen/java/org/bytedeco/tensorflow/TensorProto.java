// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// ===================================================================

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TensorProto extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorProto(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorProto(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorProto position(long position) {
        return (TensorProto)super.position(position);
    }

  public TensorProto() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorProto(@Const @ByRef TensorProto from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorProto from);

  public native @ByRef @Name("operator =") TensorProto put(@Const @ByRef TensorProto from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef TensorProto default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const TensorProto internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(TensorProto other);
  public native void Swap(TensorProto other);
  

  // implements Message ----------------------------------------------

  public native TensorProto New();

  public native TensorProto New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorProto from);
  public native void MergeFrom(@Const @ByRef TensorProto from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated float float_val = 5 [packed = true];
  public native int float_val_size();
  public native void clear_float_val();
  @MemberGetter public static native int kFloatValFieldNumber();
  public static final int kFloatValFieldNumber = kFloatValFieldNumber();
  public native float float_val(int index);
  public native void set_float_val(int index, float value);
  public native void add_float_val(float value);

  // repeated double double_val = 6 [packed = true];
  public native int double_val_size();
  public native void clear_double_val();
  @MemberGetter public static native int kDoubleValFieldNumber();
  public static final int kDoubleValFieldNumber = kDoubleValFieldNumber();
  public native double double_val(int index);
  public native void set_double_val(int index, double value);
  public native void add_double_val(double value);

  // repeated int32 int_val = 7 [packed = true];
  public native int int_val_size();
  public native void clear_int_val();
  @MemberGetter public static native int kIntValFieldNumber();
  public static final int kIntValFieldNumber = kIntValFieldNumber();
  public native @Cast("google::protobuf::int32") int int_val(int index);
  public native void set_int_val(int index, @Cast("google::protobuf::int32") int value);
  public native void add_int_val(@Cast("google::protobuf::int32") int value);

  // repeated bytes string_val = 8;
  public native int string_val_size();
  public native void clear_string_val();
  @MemberGetter public static native int kStringValFieldNumber();
  public static final int kStringValFieldNumber = kStringValFieldNumber();
  public native @StdString BytePointer string_val(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_string_val(int index);
  public native void set_string_val(int index, @StdString BytePointer value);
  public native void set_string_val(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_string_val(int index, @Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_string_val();
  public native void add_string_val(@StdString BytePointer value);
  public native void add_string_val(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_string_val(@Const Pointer value, @Cast("size_t") long size);

  // repeated float scomplex_val = 9 [packed = true];
  public native int scomplex_val_size();
  public native void clear_scomplex_val();
  @MemberGetter public static native int kScomplexValFieldNumber();
  public static final int kScomplexValFieldNumber = kScomplexValFieldNumber();
  public native float scomplex_val(int index);
  public native void set_scomplex_val(int index, float value);
  public native void add_scomplex_val(float value);

  // repeated int64 int64_val = 10 [packed = true];
  public native int int64_val_size();
  public native void clear_int64_val();
  @MemberGetter public static native int kInt64ValFieldNumber();
  public static final int kInt64ValFieldNumber = kInt64ValFieldNumber();
  public native @Cast("google::protobuf::int64") long int64_val(int index);
  public native void set_int64_val(int index, @Cast("google::protobuf::int64") long value);
  public native void add_int64_val(@Cast("google::protobuf::int64") long value);

  // repeated bool bool_val = 11 [packed = true];
  public native int bool_val_size();
  public native void clear_bool_val();
  @MemberGetter public static native int kBoolValFieldNumber();
  public static final int kBoolValFieldNumber = kBoolValFieldNumber();
  public native @Cast("bool") boolean bool_val(int index);
  public native void set_bool_val(int index, @Cast("bool") boolean value);
  public native void add_bool_val(@Cast("bool") boolean value);

  // repeated double dcomplex_val = 12 [packed = true];
  public native int dcomplex_val_size();
  public native void clear_dcomplex_val();
  @MemberGetter public static native int kDcomplexValFieldNumber();
  public static final int kDcomplexValFieldNumber = kDcomplexValFieldNumber();
  public native double dcomplex_val(int index);
  public native void set_dcomplex_val(int index, double value);
  public native void add_dcomplex_val(double value);

  // repeated int32 half_val = 13 [packed = true];
  public native int half_val_size();
  public native void clear_half_val();
  @MemberGetter public static native int kHalfValFieldNumber();
  public static final int kHalfValFieldNumber = kHalfValFieldNumber();
  public native @Cast("google::protobuf::int32") int half_val(int index);
  public native void set_half_val(int index, @Cast("google::protobuf::int32") int value);
  public native void add_half_val(@Cast("google::protobuf::int32") int value);

  // repeated .tensorflow.ResourceHandleProto resource_handle_val = 14;
  public native int resource_handle_val_size();
  public native void clear_resource_handle_val();
  @MemberGetter public static native int kResourceHandleValFieldNumber();
  public static final int kResourceHandleValFieldNumber = kResourceHandleValFieldNumber();
  public native ResourceHandleProto mutable_resource_handle_val(int index);
  public native @Const @ByRef ResourceHandleProto resource_handle_val(int index);
  public native ResourceHandleProto add_resource_handle_val();

  // repeated .tensorflow.VariantTensorDataProto variant_val = 15;
  public native int variant_val_size();
  public native void clear_variant_val();
  @MemberGetter public static native int kVariantValFieldNumber();
  public static final int kVariantValFieldNumber = kVariantValFieldNumber();
  public native VariantTensorDataProto mutable_variant_val(int index);
  public native @Const @ByRef VariantTensorDataProto variant_val(int index);
  public native VariantTensorDataProto add_variant_val();

  // repeated uint32 uint32_val = 16 [packed = true];
  public native int uint32_val_size();
  public native void clear_uint32_val();
  @MemberGetter public static native int kUint32ValFieldNumber();
  public static final int kUint32ValFieldNumber = kUint32ValFieldNumber();
  public native @Cast("google::protobuf::uint32") int uint32_val(int index);
  public native void set_uint32_val(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_uint32_val(@Cast("google::protobuf::uint32") int value);

  // repeated uint64 uint64_val = 17 [packed = true];
  public native int uint64_val_size();
  public native void clear_uint64_val();
  @MemberGetter public static native int kUint64ValFieldNumber();
  public static final int kUint64ValFieldNumber = kUint64ValFieldNumber();
  public native @Cast("google::protobuf::uint64") long uint64_val(int index);
  public native void set_uint64_val(int index, @Cast("google::protobuf::uint64") long value);
  public native void add_uint64_val(@Cast("google::protobuf::uint64") long value);

  // bytes tensor_content = 4;
  public native void clear_tensor_content();
  @MemberGetter public static native int kTensorContentFieldNumber();
  public static final int kTensorContentFieldNumber = kTensorContentFieldNumber();
  public native @StdString BytePointer tensor_content();
  public native void set_tensor_content(@StdString BytePointer value);
  public native void set_tensor_content(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_tensor_content(@Const Pointer value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_tensor_content();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_tensor_content();
  public native void set_allocated_tensor_content(@StdString @Cast({"char*", "std::string*"}) BytePointer tensor_content);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_tensor_content();
  public native @Deprecated void unsafe_arena_set_allocated_tensor_content(
        @StdString @Cast({"char*", "std::string*"}) BytePointer tensor_content);

  // .tensorflow.TensorShapeProto tensor_shape = 2;
  public native @Cast("bool") boolean has_tensor_shape();
  public native void clear_tensor_shape();
  @MemberGetter public static native int kTensorShapeFieldNumber();
  public static final int kTensorShapeFieldNumber = kTensorShapeFieldNumber();
  public native @Const @ByRef TensorShapeProto tensor_shape();
  public native TensorShapeProto release_tensor_shape();
  public native TensorShapeProto mutable_tensor_shape();
  public native void set_allocated_tensor_shape(TensorShapeProto tensor_shape);
  public native void unsafe_arena_set_allocated_tensor_shape(
        TensorShapeProto tensor_shape);
  public native TensorShapeProto unsafe_arena_release_tensor_shape();

  // .tensorflow.DataType dtype = 1;
  public native void clear_dtype();
  @MemberGetter public static native int kDtypeFieldNumber();
  public static final int kDtypeFieldNumber = kDtypeFieldNumber();
  public native @Cast("tensorflow::DataType") int dtype();
  public native void set_dtype(@Cast("tensorflow::DataType") int value);

  // int32 version_number = 3;
  public native void clear_version_number();
  @MemberGetter public static native int kVersionNumberFieldNumber();
  public static final int kVersionNumberFieldNumber = kVersionNumberFieldNumber();
  public native @Cast("google::protobuf::int32") int version_number();
  public native void set_version_number(@Cast("google::protobuf::int32") int value);
}
