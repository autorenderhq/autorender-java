// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.multipartuploads.MultipartUploadCompleteParams
import io.autorender.models.multipartuploads.MultipartUploadCompleteResponse
import io.autorender.models.multipartuploads.MultipartUploadStartParams
import io.autorender.models.multipartuploads.MultipartUploadStartResponse
import java.util.function.Consumer

/** Upload endpoints (API key required) */
interface MultipartUploadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartUploadService

    /** Finalise a multipart upload session and return the stored file record. */
    fun complete(params: MultipartUploadCompleteParams): MultipartUploadCompleteResponse =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: MultipartUploadCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MultipartUploadCompleteResponse

    /** Initialise a multipart upload session and receive pre-signed part URLs. */
    fun start(params: MultipartUploadStartParams): MultipartUploadStartResponse =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: MultipartUploadStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MultipartUploadStartResponse

    /**
     * A view of [MultipartUploadService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultipartUploadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/multipart/complete`, but is otherwise the
         * same as [MultipartUploadService.complete].
         */
        @MustBeClosed
        fun complete(
            params: MultipartUploadCompleteParams
        ): HttpResponseFor<MultipartUploadCompleteResponse> =
            complete(params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: MultipartUploadCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MultipartUploadCompleteResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/multipart/start`, but is otherwise the same
         * as [MultipartUploadService.start].
         */
        @MustBeClosed
        fun start(
            params: MultipartUploadStartParams
        ): HttpResponseFor<MultipartUploadStartResponse> = start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: MultipartUploadStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MultipartUploadStartResponse>
    }
}
