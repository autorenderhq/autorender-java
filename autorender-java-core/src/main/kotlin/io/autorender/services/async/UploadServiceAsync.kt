// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateFromUrlResponse
import io.autorender.models.uploads.UploadCreateParams
import io.autorender.models.uploads.UploadCreateResponse
import io.autorender.models.uploads.UploadGenerateTokenParams
import io.autorender.models.uploads.UploadGenerateTokenResponse
import io.autorender.models.uploads.UploadUploadWithTokenParams
import io.autorender.models.uploads.UploadUploadWithTokenResponse
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
     * Generate a short-lived token for direct browser uploads. No file is created at this stage.
     */
    fun generateToken(
        params: UploadGenerateTokenParams
    ): CompletableFuture<UploadGenerateTokenResponse> = generateToken(params, RequestOptions.none())

    /** @see generateToken */
    fun generateToken(
        params: UploadGenerateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadGenerateTokenResponse>

    /**
     * Upload a file directly from the browser using a token from /generate-token. Send the raw file
     * as binary in the request body.
     */
    fun uploadWithToken(
        token: String,
        body: String,
    ): CompletableFuture<UploadUploadWithTokenResponse> =
        uploadWithToken(token, body, UploadUploadWithTokenParams.none())

    /** @see uploadWithToken */
    fun uploadWithToken(
        token: String,
        body: String,
        params: UploadUploadWithTokenParams = UploadUploadWithTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadUploadWithTokenResponse> =
        uploadWithToken(params.toBuilder().token(token).body(body).build(), requestOptions)

    /** @see uploadWithToken */
    fun uploadWithToken(
        token: String,
        body: String,
        params: UploadUploadWithTokenParams = UploadUploadWithTokenParams.none(),
    ): CompletableFuture<UploadUploadWithTokenResponse> =
        uploadWithToken(token, body, params, RequestOptions.none())

    /** @see uploadWithToken */
    fun uploadWithToken(
        params: UploadUploadWithTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<UploadUploadWithTokenResponse>

    /** @see uploadWithToken */
    fun uploadWithToken(
        params: UploadUploadWithTokenParams
    ): CompletableFuture<UploadUploadWithTokenResponse> =
        uploadWithToken(params, RequestOptions.none())

    /** @see uploadWithToken */
    fun uploadWithToken(
        token: String,
        body: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<UploadUploadWithTokenResponse> =
        uploadWithToken(token, body, UploadUploadWithTokenParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `post /api/v1/generate-token`, but is otherwise the same
         * as [UploadServiceAsync.generateToken].
         */
        fun generateToken(
            params: UploadGenerateTokenParams
        ): CompletableFuture<HttpResponseFor<UploadGenerateTokenResponse>> =
            generateToken(params, RequestOptions.none())

        /** @see generateToken */
        fun generateToken(
            params: UploadGenerateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadGenerateTokenResponse>>

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads/{token}`, but is otherwise the same
         * as [UploadServiceAsync.uploadWithToken].
         */
        fun uploadWithToken(
            token: String,
            body: String,
        ): CompletableFuture<HttpResponseFor<UploadUploadWithTokenResponse>> =
            uploadWithToken(token, body, UploadUploadWithTokenParams.none())

        /** @see uploadWithToken */
        fun uploadWithToken(
            token: String,
            body: String,
            params: UploadUploadWithTokenParams = UploadUploadWithTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadUploadWithTokenResponse>> =
            uploadWithToken(params.toBuilder().token(token).body(body).build(), requestOptions)

        /** @see uploadWithToken */
        fun uploadWithToken(
            token: String,
            body: String,
            params: UploadUploadWithTokenParams = UploadUploadWithTokenParams.none(),
        ): CompletableFuture<HttpResponseFor<UploadUploadWithTokenResponse>> =
            uploadWithToken(token, body, params, RequestOptions.none())

        /** @see uploadWithToken */
        fun uploadWithToken(
            params: UploadUploadWithTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<UploadUploadWithTokenResponse>>

        /** @see uploadWithToken */
        fun uploadWithToken(
            params: UploadUploadWithTokenParams
        ): CompletableFuture<HttpResponseFor<UploadUploadWithTokenResponse>> =
            uploadWithToken(params, RequestOptions.none())

        /** @see uploadWithToken */
        fun uploadWithToken(
            token: String,
            body: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadUploadWithTokenResponse>> =
            uploadWithToken(token, body, UploadUploadWithTokenParams.none(), requestOptions)
    }
}
