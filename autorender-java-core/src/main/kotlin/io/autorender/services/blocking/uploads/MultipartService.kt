// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking.uploads

import com.google.errorprone.annotations.MustBeClosed
import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponse
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.uploads.Upload
import io.autorender.models.uploads.multipart.MultipartCompleteParams
import io.autorender.models.uploads.multipart.MultipartStartParams
import io.autorender.models.uploads.multipart.MultipartUploadPartParams
import io.autorender.models.uploads.multipart.Session
import java.util.function.Consumer

/** Large file uploads via multipart */
interface MultipartService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartService

    /**
     * Finalize a multipart upload after all parts have been uploaded. Assembles the parts and
     * creates the file record.
     */
    fun complete(params: MultipartCompleteParams): Upload = complete(params, RequestOptions.none())

    /** @see complete */
    fun complete(
        params: MultipartCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Upload

    /**
     * Initiate a multipart upload session for large files. Returns presigned PUT URLs for each
     * part. Upload each part to its URL in order, then call POST /api/v1/multipart/complete.
     */
    fun start(params: MultipartStartParams): Session = start(params, RequestOptions.none())

    /** @see start */
    fun start(
        params: MultipartStartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Session

    /**
     * Upload a single part using one of the presigned URLs from POST /api/v1/multipart/start. Send
     * raw bytes directly — do not include the AutoRender Authorization header, as auth is embedded
     * in the presigned URL.
     */
    fun uploadPart(body: String) = uploadPart(body, MultipartUploadPartParams.none())

    /** @see uploadPart */
    fun uploadPart(
        body: String,
        params: MultipartUploadPartParams = MultipartUploadPartParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = uploadPart(params.toBuilder().body(body).build(), requestOptions)

    /** @see uploadPart */
    fun uploadPart(
        body: String,
        params: MultipartUploadPartParams = MultipartUploadPartParams.none(),
    ) = uploadPart(body, params, RequestOptions.none())

    /** @see uploadPart */
    fun uploadPart(body: String, requestOptions: RequestOptions = RequestOptions.none()) =
        uploadPart(MultipartUploadPartParams.builder().body(body).build(), requestOptions)

    /** @see uploadPart */
    fun uploadPart(body: String) = uploadPart(body, RequestOptions.none())

    /** @see uploadPart */
    fun uploadPart(
        params: MultipartUploadPartParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see uploadPart */
    fun uploadPart(params: MultipartUploadPartParams) = uploadPart(params, RequestOptions.none())

    /** @see uploadPart */
    fun uploadPart(body: String, requestOptions: RequestOptions) =
        uploadPart(body, MultipartUploadPartParams.none(), requestOptions)

    /** A view of [MultipartService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/multipart/complete`, but is otherwise the
         * same as [MultipartService.complete].
         */
        @MustBeClosed
        fun complete(params: MultipartCompleteParams): HttpResponseFor<Upload> =
            complete(params, RequestOptions.none())

        /** @see complete */
        @MustBeClosed
        fun complete(
            params: MultipartCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Upload>

        /**
         * Returns a raw HTTP response for `post /api/v1/multipart/start`, but is otherwise the same
         * as [MultipartService.start].
         */
        @MustBeClosed
        fun start(params: MultipartStartParams): HttpResponseFor<Session> =
            start(params, RequestOptions.none())

        /** @see start */
        @MustBeClosed
        fun start(
            params: MultipartStartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Session>

        /**
         * Returns a raw HTTP response for `put /api/v1/multipart/parts`, but is otherwise the same
         * as [MultipartService.uploadPart].
         */
        @MustBeClosed
        fun uploadPart(body: String): HttpResponse =
            uploadPart(body, MultipartUploadPartParams.none())

        /** @see uploadPart */
        @MustBeClosed
        fun uploadPart(
            body: String,
            params: MultipartUploadPartParams = MultipartUploadPartParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = uploadPart(params.toBuilder().body(body).build(), requestOptions)

        /** @see uploadPart */
        @MustBeClosed
        fun uploadPart(
            body: String,
            params: MultipartUploadPartParams = MultipartUploadPartParams.none(),
        ): HttpResponse = uploadPart(body, params, RequestOptions.none())

        /** @see uploadPart */
        @MustBeClosed
        fun uploadPart(
            body: String,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            uploadPart(MultipartUploadPartParams.builder().body(body).build(), requestOptions)

        /** @see uploadPart */
        @MustBeClosed
        fun uploadPart(body: String): HttpResponse = uploadPart(body, RequestOptions.none())

        /** @see uploadPart */
        @MustBeClosed
        fun uploadPart(
            params: MultipartUploadPartParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see uploadPart */
        @MustBeClosed
        fun uploadPart(params: MultipartUploadPartParams): HttpResponse =
            uploadPart(params, RequestOptions.none())

        /** @see uploadPart */
        @MustBeClosed
        fun uploadPart(body: String, requestOptions: RequestOptions): HttpResponse =
            uploadPart(body, MultipartUploadPartParams.none(), requestOptions)
    }
}
