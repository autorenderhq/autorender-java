// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async.uploads

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponse
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.uploads.Upload
import io.autorender.models.uploads.multipart.MultipartCompleteParams
import io.autorender.models.uploads.multipart.MultipartStartParams
import io.autorender.models.uploads.multipart.MultipartUploadPartParams
import io.autorender.models.uploads.multipart.Session
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Large file uploads via multipart */
interface MultipartServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartServiceAsync

    /**
     * Finalize a multipart upload after all parts have been uploaded. Assembles the parts and
     * creates the file record.
     */
    fun complete(params: MultipartCompleteParams): CompletableFuture<Upload> =
        complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: MultipartCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Upload>

    /**
     * Initiate a multipart upload session for large files. Returns presigned PUT URLs for each
     * part. Upload each part to its URL in order, then call POST /api/v1/multipart/complete.
     */
    fun start(params: MultipartStartParams): CompletableFuture<Session> =
        start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: MultipartStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Session>

    /**
     * Upload a single part using one of the presigned URLs from POST /api/v1/multipart/start. Send
     * raw bytes directly — do not include the AutoRender Authorization header, as auth is embedded
     * in the presigned URL.
     */
    fun uploadPart(body: String): CompletableFuture<Void?> =
        uploadPart(body, MultipartUploadPartParams.none())

    /** @see uploadPart */
    fun uploadPart(
        body: String,
        params: MultipartUploadPartParams = MultipartUploadPartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> = uploadPart(params.toBuilder().body(body).build(), requestOptions)

    /** @see uploadPart */
    fun uploadPart(
        body: String,
        params: MultipartUploadPartParams = MultipartUploadPartParams.none(),
    ): CompletableFuture<Void?> = uploadPart(body, params, RequestOptions.none())

    /** @see uploadPart */
    fun uploadPart(
        body: String,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        uploadPart(MultipartUploadPartParams.builder().body(body).build(), requestOptions)

    /** @see uploadPart */
    fun uploadPart(body: String): CompletableFuture<Void?> = uploadPart(body, RequestOptions.none())

    /** @see uploadPart */
    fun uploadPart(
        params: MultipartUploadPartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see uploadPart */
    fun uploadPart(params: MultipartUploadPartParams): CompletableFuture<Void?> =
        uploadPart(params, RequestOptions.none())

    /** @see uploadPart */
    fun uploadPart(body: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        uploadPart(body, MultipartUploadPartParams.none(), requestOptions)

    /**
     * A view of [MultipartServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultipartServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/multipart/complete`, but is otherwise the
         * same as [MultipartServiceAsync.complete].
         */
        fun complete(params: MultipartCompleteParams): CompletableFuture<HttpResponseFor<Upload>> =
            complete(params, RequestOptions.none())

        /** @see complete */
        fun complete(
            params: MultipartCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Upload>>

        /**
         * Returns a raw HTTP response for `post /api/v1/multipart/start`, but is otherwise the same
         * as [MultipartServiceAsync.start].
         */
        fun start(params: MultipartStartParams): CompletableFuture<HttpResponseFor<Session>> =
            start(params, RequestOptions.none())

        /** @see start */
        fun start(
            params: MultipartStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Session>>

        /**
         * Returns a raw HTTP response for `put /api/v1/multipart/parts`, but is otherwise the same
         * as [MultipartServiceAsync.uploadPart].
         */
        fun uploadPart(body: String): CompletableFuture<HttpResponse> =
            uploadPart(body, MultipartUploadPartParams.none())

        /** @see uploadPart */
        fun uploadPart(
            body: String,
            params: MultipartUploadPartParams = MultipartUploadPartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            uploadPart(params.toBuilder().body(body).build(), requestOptions)

        /** @see uploadPart */
        fun uploadPart(
            body: String,
            params: MultipartUploadPartParams = MultipartUploadPartParams.none(),
        ): CompletableFuture<HttpResponse> = uploadPart(body, params, RequestOptions.none())

        /** @see uploadPart */
        fun uploadPart(
            body: String,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            uploadPart(MultipartUploadPartParams.builder().body(body).build(), requestOptions)

        /** @see uploadPart */
        fun uploadPart(body: String): CompletableFuture<HttpResponse> =
            uploadPart(body, RequestOptions.none())

        /** @see uploadPart */
        fun uploadPart(
            params: MultipartUploadPartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see uploadPart */
        fun uploadPart(params: MultipartUploadPartParams): CompletableFuture<HttpResponse> =
            uploadPart(params, RequestOptions.none())

        /** @see uploadPart */
        fun uploadPart(
            body: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            uploadPart(body, MultipartUploadPartParams.none(), requestOptions)
    }
}
