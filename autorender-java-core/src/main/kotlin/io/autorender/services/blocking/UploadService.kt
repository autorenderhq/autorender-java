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
import io.autorender.models.uploads.UploadGenerateTokenParams
import io.autorender.models.uploads.UploadGenerateTokenResponse
import io.autorender.models.uploads.UploadUploadWithTokenParams
import io.autorender.models.uploads.UploadUploadWithTokenResponse
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

    /**
     * Generate a short-lived token for direct browser uploads. No file is created at this stage.
     */
    fun generateToken(params: UploadGenerateTokenParams): UploadGenerateTokenResponse =
        generateToken(params, RequestOptions.none())

    /** @see generateToken */
    fun generateToken(
        params: UploadGenerateTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadGenerateTokenResponse

    /**
     * Upload a file directly from the browser using a token from /generate-token. Send the raw file
     * as binary in the request body.
     */
    fun uploadWithToken(token: String, file: String): UploadUploadWithTokenResponse =
        uploadWithToken(token, file, UploadUploadWithTokenParams.none())

    /** @see uploadWithToken */
    fun uploadWithToken(
        token: String,
        file: String,
        params: UploadUploadWithTokenParams = UploadUploadWithTokenParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadUploadWithTokenResponse =
        uploadWithToken(params.toBuilder().token(token).file(file).build(), requestOptions)

    /** @see uploadWithToken */
    fun uploadWithToken(
        token: String,
        file: String,
        params: UploadUploadWithTokenParams = UploadUploadWithTokenParams.none(),
    ): UploadUploadWithTokenResponse = uploadWithToken(token, file, params, RequestOptions.none())

    /** @see uploadWithToken */
    fun uploadWithToken(
        params: UploadUploadWithTokenParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UploadUploadWithTokenResponse

    /** @see uploadWithToken */
    fun uploadWithToken(params: UploadUploadWithTokenParams): UploadUploadWithTokenResponse =
        uploadWithToken(params, RequestOptions.none())

    /** @see uploadWithToken */
    fun uploadWithToken(
        token: String,
        file: String,
        requestOptions: RequestOptions,
    ): UploadUploadWithTokenResponse =
        uploadWithToken(token, file, UploadUploadWithTokenParams.none(), requestOptions)

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

        /**
         * Returns a raw HTTP response for `post /api/v1/uploads/{token}`, but is otherwise the same
         * as [UploadService.uploadWithToken].
         */
        @MustBeClosed
        fun uploadWithToken(
            token: String,
            file: String,
        ): HttpResponseFor<UploadUploadWithTokenResponse> =
            uploadWithToken(token, file, UploadUploadWithTokenParams.none())

        /** @see uploadWithToken */
        @MustBeClosed
        fun uploadWithToken(
            token: String,
            file: String,
            params: UploadUploadWithTokenParams = UploadUploadWithTokenParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadUploadWithTokenResponse> =
            uploadWithToken(params.toBuilder().token(token).file(file).build(), requestOptions)

        /** @see uploadWithToken */
        @MustBeClosed
        fun uploadWithToken(
            token: String,
            file: String,
            params: UploadUploadWithTokenParams = UploadUploadWithTokenParams.none(),
        ): HttpResponseFor<UploadUploadWithTokenResponse> =
            uploadWithToken(token, file, params, RequestOptions.none())

        /** @see uploadWithToken */
        @MustBeClosed
        fun uploadWithToken(
            params: UploadUploadWithTokenParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UploadUploadWithTokenResponse>

        /** @see uploadWithToken */
        @MustBeClosed
        fun uploadWithToken(
            params: UploadUploadWithTokenParams
        ): HttpResponseFor<UploadUploadWithTokenResponse> =
            uploadWithToken(params, RequestOptions.none())

        /** @see uploadWithToken */
        @MustBeClosed
        fun uploadWithToken(
            token: String,
            file: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<UploadUploadWithTokenResponse> =
            uploadWithToken(token, file, UploadUploadWithTokenParams.none(), requestOptions)
    }
}
