// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_saliency;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;

import static org.bytedeco.opencv.global.opencv_saliency.*;


/** \addtogroup saliency
 *  \{
<p>
/************************************ Saliency Base Class ************************************/

@Namespace("cv::saliency") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_saliency.class)
public class Saliency extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Saliency(Pointer p) { super(p); }

  /**
   * \brief Destructor
   */

  /**
   * \brief Compute the saliency
   * @param image        The image.
   * @param saliencyMap      The computed saliency map.
   * @return true if the saliency map is computed, false otherwise
   */
  public native @Cast("bool") boolean computeSaliency( @ByVal Mat image, @ByVal Mat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal UMat image, @ByVal UMat saliencyMap );
  public native @Cast("bool") boolean computeSaliency( @ByVal GpuMat image, @ByVal GpuMat saliencyMap );
}
