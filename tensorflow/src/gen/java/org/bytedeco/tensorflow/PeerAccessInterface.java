// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Interface that a Collective Op implementation uses to exchange data
// with peers.  Note that data exchange is currently limited to types
// for which DMAHelper::CanUseDMA() returns true, i.e.  dense numeric
// types.
@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class PeerAccessInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PeerAccessInterface(Pointer p) { super(p); }


  public native void RecvFromPeer(@StdString BytePointer peer_device, @StdString BytePointer peer_task,
                              @Cast("bool") boolean peer_is_local, @StdString BytePointer key,
                              Device to_device, DeviceContext to_device_ctx,
                              @Const @ByRef AllocatorAttributes to_alloc_attr,
                              Tensor to_tensor,
                              @Const @ByRef DeviceLocality client_locality,
                              int dev_to_dev_stream_index,
                              @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);
  public native void RecvFromPeer(@StdString String peer_device, @StdString String peer_task,
                              @Cast("bool") boolean peer_is_local, @StdString String key,
                              Device to_device, DeviceContext to_device_ctx,
                              @Const @ByRef AllocatorAttributes to_alloc_attr,
                              Tensor to_tensor,
                              @Const @ByRef DeviceLocality client_locality,
                              int dev_to_dev_stream_index,
                              @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);

  public native void PostToPeer(@StdString BytePointer peer_device, @StdString BytePointer peer_task,
                            @StdString BytePointer key, Device from_device,
                            DeviceContext from_device_ctx,
                            @Const @ByRef AllocatorAttributes from_alloc_attr,
                            @Const Tensor from_tensor,
                            @Const @ByRef DeviceLocality client_locality,
                            @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);
  public native void PostToPeer(@StdString String peer_device, @StdString String peer_task,
                            @StdString String key, Device from_device,
                            DeviceContext from_device_ctx,
                            @Const @ByRef AllocatorAttributes from_alloc_attr,
                            @Const Tensor from_tensor,
                            @Const @ByRef DeviceLocality client_locality,
                            @Cast("const tensorflow::StatusCallback*") @ByRef Pointer done);
}
