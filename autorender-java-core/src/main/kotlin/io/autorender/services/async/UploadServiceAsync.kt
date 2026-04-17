// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.uploads.Upload
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateParams
import io.autorender.models.uploads.UploadCreateWithTokenParams
import io.autorender.models.uploads.UploadGenerateTokenParams
import io.autorender.models.uploads.UploadGenerateTokenResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Upload files to your workspace */
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

    /**
     * Upload a file to your AutoRender workspace with optional transformations, tags, and folder
     * organization
     */
    fun create(params: UploadCreateParams): CompletableFuture<Upload> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Upload>

    /**
     * Download a file from a remote HTTP/HTTPS URL and store it in your AutoRender workspace.
     * Supports optional transformations and metadata.
     */
    fun createFromUrl(params: UploadCreateFromUrlParams): CompletableFuture<Upload> =
        createFromUrl(params, RequestOptions.none())

    /** @see createFromUrl */
    fun createFromUrl(
        params: UploadCreateFromUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Upload>

    /**
     * Upload a file directly from a browser or mobile client using a token from POST
     * /api/v1/generate-token. Send raw file bytes as the request body. Filename and upload policy
     * are taken from the token.
     */
    fun createWithToken(token: String, body: String): CompletableFuture<Upload> =
        createWithToken(token, body, UploadCreateWithTokenParams.none())

    /** @see createWithToken */
    fun createWithToken(
        token: String,
        body: String,
        params: UploadCreateWithTokenParams = UploadCreateWithTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Upload> =
        createWithToken(params.toBuilder().token(token).body(body).build(), requestOptions)

    /** @see createWithToken */
    fun createWithToken(
        token: String,
        body: String,
        params: UploadCreateWithTokenParams = UploadCreateWithTokenParams.none(),
    ): CompletableFuture<Upload> = createWithToken(token, body, params, RequestOptions.none())

    /** @see createWithToken */
    fun createWithToken(
        params: UploadCreateWithTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Upload>

    /** @see createWithToken */
    fun createWithToken(params: UploadCreateWithTokenParams): CompletableFuture<Upload> =
        createWithToken(params, RequestOptions.none())

    /** @see createWithToken */
    fun createWithToken(
        token: String,
        body: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Upload> =
        createWithToken(token, body, UploadCreateWithTokenParams.none(), requestOptions)

    /**
     * Generate a short-lived signed token that allows a browser or mobile client to upload directly
     * to AutoRender without exposing your secret API key. The token encodes upload policy (folder,
     * tags, transforms, file size limit). No file record is created until the token is used.
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
        fun create(params: UploadCreateParams): CompletableFuture<HttpResponseFor<Upload>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Upload>>

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads/remote`, but is otherwise the same
         * as [UploadServiceAsync.createFromUrl].
         */
        fun createFromUrl(
            params: UploadCreateFromUrlParams
        ): CompletableFuture<HttpResponseFor<Upload>> = createFromUrl(params, RequestOptions.none())

        /** @see createFromUrl */
        fun createFromUrl(
            params: UploadCreateFromUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Upload>>

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads/{token}`, but is otherwise the same
         * as [UploadServiceAsync.createWithToken].
         */
        fun createWithToken(
            token: String,
            body: String,
        ): CompletableFuture<HttpResponseFor<Upload>> =
            createWithToken(token, body, UploadCreateWithTokenParams.none())

        /** @see createWithToken */
        fun createWithToken(
            token: String,
            body: String,
            params: UploadCreateWithTokenParams = UploadCreateWithTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Upload>> =
            createWithToken(params.toBuilder().token(token).body(body).build(), requestOptions)

        /** @see createWithToken */
        fun createWithToken(
            token: String,
            body: String,
            params: UploadCreateWithTokenParams = UploadCreateWithTokenParams.none(),
        ): CompletableFuture<HttpResponseFor<Upload>> =
            createWithToken(token, body, params, RequestOptions.none())

        /** @see createWithToken */
        fun createWithToken(
            params: UploadCreateWithTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Upload>>

        /** @see createWithToken */
        fun createWithToken(
            params: UploadCreateWithTokenParams
        ): CompletableFuture<HttpResponseFor<Upload>> =
            createWithToken(params, RequestOptions.none())

        /** @see createWithToken */
        fun createWithToken(
            token: String,
            body: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Upload>> =
            createWithToken(token, body, UploadCreateWithTokenParams.none(), requestOptions)

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
    }
}
