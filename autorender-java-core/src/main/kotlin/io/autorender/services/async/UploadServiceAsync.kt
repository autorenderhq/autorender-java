// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateFromUrlResponse
import io.autorender.models.uploads.UploadCreateParams
import io.autorender.models.uploads.UploadCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Upload endpoints (API key required) */
interface UploadServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadServiceAsync

    /** Upload a file from your backend server using multipart/form-data. */
    fun create(params: UploadCreateParams): CompletableFuture<UploadCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadCreateResponse>

    /** Download a file from a remote URL and store it in AutoRender. */
    fun createFromUrl(
        params: UploadCreateFromUrlParams
    ): CompletableFuture<UploadCreateFromUrlResponse> = createFromUrl(params, RequestOptions.none())

    /** @see createFromUrl */
    fun createFromUrl(
        params: UploadCreateFromUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadCreateFromUrlResponse>

    /**
     * A view of [UploadServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UploadServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads`, but is otherwise the same as
         * [UploadServiceAsync.create].
         */
        fun create(
            params: UploadCreateParams
        ): CompletableFuture<HttpResponseFor<UploadCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads/remote`, but is otherwise the same
         * as [UploadServiceAsync.createFromUrl].
         */
        fun createFromUrl(
            params: UploadCreateFromUrlParams
        ): CompletableFuture<HttpResponseFor<UploadCreateFromUrlResponse>> =
            createFromUrl(params, RequestOptions.none())

        /** @see createFromUrl */
        fun createFromUrl(
            params: UploadCreateFromUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadCreateFromUrlResponse>>
    }
}
