// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_ml.*;


/****************************************************************************************\
*                          K-Nearest Neighbour Classifier                                *
\****************************************************************************************/

/** \brief The class implements K-Nearest Neighbors model
<p>
@see \ref ml_intro_knn
 */
@Namespace("cv::ml") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class KNearest extends StatModel {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KNearest(Pointer p) { super(p); }


    /** Default number of neighbors to use in predict method. */
    /** @see setDefaultK */
    public native int getDefaultK();
    /** \copybrief getDefaultK @see getDefaultK */
    public native void setDefaultK(int val);

    /** Whether classification or regression model should be trained. */
    /** @see setIsClassifier */
    public native @Cast("bool") boolean getIsClassifier();
    /** \copybrief getIsClassifier @see getIsClassifier */
    public native void setIsClassifier(@Cast("bool") boolean val);

    /** Parameter for KDTree implementation. */
    /** @see setEmax */
    public native int getEmax();
    /** \copybrief getEmax @see getEmax */
    public native void setEmax(int val);

    /** %Algorithm type, one of KNearest::Types. */
    /** @see setAlgorithmType */
    public native int getAlgorithmType();
    /** \copybrief getAlgorithmType @see getAlgorithmType */
    public native void setAlgorithmType(int val);

    /** \brief Finds the neighbors and predicts responses for input vectors.
    <p>
    @param samples Input samples stored by rows. It is a single-precision floating-point matrix of
        {@code <number_of_samples> * k} size.
    @param k Number of used nearest neighbors. Should be greater than 1.
    @param results Vector with results of prediction (regression or classification) for each input
        sample. It is a single-precision floating-point vector with {@code <number_of_samples>} elements.
    @param neighborResponses Optional output values for corresponding neighbors. It is a single-
        precision floating-point matrix of {@code <number_of_samples> * k} size.
    @param dist Optional output distances from the input vectors to the corresponding neighbors. It
        is a single-precision floating-point matrix of {@code <number_of_samples> * k} size.
    <p>
    For each input vector (a row of the matrix samples), the method finds the k nearest neighbors.
    In case of regression, the predicted result is a mean value of the particular vector's neighbor
    responses. In case of classification, the class is determined by voting.
    <p>
    For each input vector, the neighbors are sorted by their distances to the vector.
    <p>
    In case of C++ interface you can use output pointers to empty matrices and the function will
    allocate memory itself.
    <p>
    If only a single input vector is passed, all output matrices are optional and the predicted
    value is returned by the method.
    <p>
    The function is parallelized with the TBB library.
     */
    public native float findNearest( @ByVal Mat samples, int k,
                                   @ByVal Mat results,
                                   @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat neighborResponses,
                                   @ByVal(nullValue = "cv::OutputArray(cv::noArray())") Mat dist );
    public native float findNearest( @ByVal Mat samples, int k,
                                   @ByVal Mat results );
    public native float findNearest( @ByVal UMat samples, int k,
                                   @ByVal UMat results,
                                   @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat neighborResponses,
                                   @ByVal(nullValue = "cv::OutputArray(cv::noArray())") UMat dist );
    public native float findNearest( @ByVal UMat samples, int k,
                                   @ByVal UMat results );
    public native float findNearest( @ByVal GpuMat samples, int k,
                                   @ByVal GpuMat results,
                                   @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat neighborResponses,
                                   @ByVal(nullValue = "cv::OutputArray(cv::noArray())") GpuMat dist );
    public native float findNearest( @ByVal GpuMat samples, int k,
                                   @ByVal GpuMat results );

    /** \brief Implementations of KNearest algorithm
       */
    /** enum cv::ml::KNearest::Types */
    public static final int
        BRUTE_FORCE = 1,
        KDTREE = 2;

    /** \brief Creates the empty model
    <p>
    The static method creates empty %KNearest classifier. It should be then trained using StatModel::train method.
     */
    public static native @Ptr KNearest create();
}
