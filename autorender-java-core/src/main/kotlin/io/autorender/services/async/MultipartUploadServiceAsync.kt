// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.multipartuploads.MultipartUploadCompleteParams
import io.autorender.models.multipartuploads.MultipartUploadCompleteResponse
import io.autorender.models.multipartuploads.MultipartUploadStartParams
import io.autorender.models.multipartuploads.MultipartUploadStartResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Upload endpoints (API key required) */
interface MultipartUploadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartUploadServiceAsync

    /** Finalise a multipart upload session and return the stored file record. */
    fun complete(
        params: MultipartUploadCompleteParams
    ): CompletableFuture<MultipartUploadCompleteResponse> = complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: MultipartUploadCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MultipartUploadCompleteResponse>

    /** Initialise a multipart upload session and receive pre-signed part URLs. */
    fun start(params: MultipartUploadStartParams): CompletableFuture<MultipartUploadStartResponse> =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: MultipartUploadStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MultipartUploadStartResponse>

    /**
     * A view of [MultipartUploadServiceAsync] that provides access to raw HTTP responses for each
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
        ): MultipartUploadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/multipart/complete`, but is otherwise the
         * same as [MultipartUploadServiceAsync.complete].
         */
        fun complete(
            params: MultipartUploadCompleteParams
        ): CompletableFuture<HttpResponseFor<MultipartUploadCompleteResponse>> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: MultipartUploadCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MultipartUploadCompleteResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/multipart/start`, but is otherwise the same
         * as [MultipartUploadServiceAsync.start].
         */
        fun start(
            params: MultipartUploadStartParams
        ): CompletableFuture<HttpResponseFor<MultipartUploadStartResponse>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            params: MultipartUploadStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MultipartUploadStartResponse>>
    }
}
