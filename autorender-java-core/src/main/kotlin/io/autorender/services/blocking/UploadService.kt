// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.uploads.Upload
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateParams
import io.autorender.models.uploads.UploadCreateWithTokenParams
import io.autorender.models.uploads.UploadGenerateTokenParams
import io.autorender.models.uploads.UploadGenerateTokenResponse
import java.util.function.Consumer

/** Upload files to your workspace */
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

    /**
     * Upload a file to your AutoRender workspace with optional transformations, tags, and folder
     * organization
     */
    fun create(params: UploadCreateParams): Upload = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Upload

    /**
     * Download a file from a remote HTTP/HTTPS URL and store it in your AutoRender workspace.
     * Supports optional transformations and metadata.
     */
    fun createFromUrl(params: UploadCreateFromUrlParams): Upload =
        createFromUrl(params, RequestOptions.none())

    /** @see createFromUrl */
    fun createFromUrl(
        params: UploadCreateFromUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Upload

    /**
     * Upload a file directly from a browser or mobile client using a token from POST
     * /api/v1/generate-token. Send raw file bytes as the request body. Filename and upload policy
     * are taken from the token.
     */
    fun createWithToken(token: String, body: String): Upload =
        createWithToken(token, body, UploadCreateWithTokenParams.none())

    /** @see createWithToken */
    fun createWithToken(
        token: String,
        body: String,
        params: UploadCreateWithTokenParams = UploadCreateWithTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Upload = createWithToken(params.toBuilder().token(token).body(body).build(), requestOptions)

    /** @see createWithToken */
    fun createWithToken(
        token: String,
        body: String,
        params: UploadCreateWithTokenParams = UploadCreateWithTokenParams.none(),
    ): Upload = createWithToken(token, body, params, RequestOptions.none())

    /** @see createWithToken */
    fun createWithToken(
        params: UploadCreateWithTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Upload

    /** @see createWithToken */
    fun createWithToken(params: UploadCreateWithTokenParams): Upload =
        createWithToken(params, RequestOptions.none())

    /** @see createWithToken */
    fun createWithToken(token: String, body: String, requestOptions: RequestOptions): Upload =
        createWithToken(token, body, UploadCreateWithTokenParams.none(), requestOptions)

    /**
     * Generate a short-lived signed token that allows a browser or mobile client to upload directly
     * to AutoRender without exposing your secret API key. The token encodes upload policy (folder,
     * tags, transforms, file size limit). No file record is created until the token is used.
     */
    fun generateToken(params: UploadGenerateTokenParams): UploadGenerateTokenResponse =
        generateToken(params, RequestOptions.none())

    /** @see generateToken */
    fun generateToken(
        params: UploadGenerateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadGenerateTokenResponse

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
        fun create(params: UploadCreateParams): HttpResponseFor<Upload> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Upload>

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads/remote`, but is otherwise the same
         * as [UploadService.createFromUrl].
         */
        @MustBeClosed
        fun createFromUrl(params: UploadCreateFromUrlParams): HttpResponseFor<Upload> =
            createFromUrl(params, RequestOptions.none())

        /** @see createFromUrl */
        @MustBeClosed
        fun createFromUrl(
            params: UploadCreateFromUrlParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Upload>

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads/{token}`, but is otherwise the same
         * as [UploadService.createWithToken].
         */
        @MustBeClosed
        fun createWithToken(token: String, body: String): HttpResponseFor<Upload> =
            createWithToken(token, body, UploadCreateWithTokenParams.none())

        /** @see createWithToken */
        @MustBeClosed
        fun createWithToken(
            token: String,
            body: String,
            params: UploadCreateWithTokenParams = UploadCreateWithTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Upload> =
            createWithToken(params.toBuilder().token(token).body(body).build(), requestOptions)

        /** @see createWithToken */
        @MustBeClosed
        fun createWithToken(
            token: String,
            body: String,
            params: UploadCreateWithTokenParams = UploadCreateWithTokenParams.none(),
        ): HttpResponseFor<Upload> = createWithToken(token, body, params, RequestOptions.none())

        /** @see createWithToken */
        @MustBeClosed
        fun createWithToken(
            params: UploadCreateWithTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Upload>

        /** @see createWithToken */
        @MustBeClosed
        fun createWithToken(params: UploadCreateWithTokenParams): HttpResponseFor<Upload> =
            createWithToken(params, RequestOptions.none())

        /** @see createWithToken */
        @MustBeClosed
        fun createWithToken(
            token: String,
            body: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Upload> =
            createWithToken(token, body, UploadCreateWithTokenParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/generate-token`, but is otherwise the same
         * as [UploadService.generateToken].
         */
        @MustBeClosed
        fun generateToken(
            params: UploadGenerateTokenParams
        ): HttpResponseFor<UploadGenerateTokenResponse> =
            generateToken(params, RequestOptions.none())

        /** @see generateToken */
        @MustBeClosed
        fun generateToken(
            params: UploadGenerateTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadGenerateTokenResponse>
    }
}
