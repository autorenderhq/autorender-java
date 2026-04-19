// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateFromUrlResponse
import io.autorender.models.uploads.UploadCreateParams
import io.autorender.models.uploads.UploadCreateResponse
import java.util.function.Consumer

/** Upload endpoints (API key required) */
interface UploadService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadService

    /** Upload a file from your backend server using multipart/form-data. */
    fun create(params: UploadCreateParams): UploadCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadCreateResponse

    /** Download a file from a remote URL and store it in AutoRender. */
    fun createFromUrl(params: UploadCreateFromUrlParams): UploadCreateFromUrlResponse =
        createFromUrl(params, RequestOptions.none())

    /** @see createFromUrl */
    fun createFromUrl(
        params: UploadCreateFromUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadCreateFromUrlResponse

    /** A view of [UploadService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads`, but is otherwise the same as
         * [UploadService.create].
         */
        @MustBeClosed
        fun create(params: UploadCreateParams): HttpResponseFor<UploadCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadCreateResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads/remote`, but is otherwise the same
         * as [UploadService.createFromUrl].
         */
        @MustBeClosed
        fun createFromUrl(
            params: UploadCreateFromUrlParams
        ): HttpResponseFor<UploadCreateFromUrlResponse> =
            createFromUrl(params, RequestOptions.none())

        /** @see createFromUrl */
        @MustBeClosed
        fun createFromUrl(
            params: UploadCreateFromUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadCreateFromUrlResponse>
    }
}
