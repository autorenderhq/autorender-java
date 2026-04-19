// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponse
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.files.FileDeleteParams
import io.autorender.models.files.FileListParams
import io.autorender.models.files.FileListResponse
import io.autorender.models.files.FileRenameParams
import io.autorender.models.files.FileRenameResponse
import io.autorender.models.files.FileRetrieveParams
import io.autorender.models.files.FileRetrieveResponse
import io.autorender.models.files.FileUpdateParams
import io.autorender.models.files.FileUpdateResponse
import java.util.function.Consumer

/** File management endpoints (API key required) */
interface FileService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService

    /** Get file details */
    fun retrieve(fileNo: String): FileRetrieveResponse = retrieve(fileNo, FileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        fileNo: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileRetrieveResponse = retrieve(params.toBuilder().fileNo(fileNo).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        fileNo: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
    ): FileRetrieveResponse = retrieve(fileNo, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: FileRetrieveParams): FileRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(fileNo: String, requestOptions: RequestOptions): FileRetrieveResponse =
        retrieve(fileNo, FileRetrieveParams.none(), requestOptions)

    /** Update file tags/metadata */
    fun update(fileNo: String): FileUpdateResponse = update(fileNo, FileUpdateParams.none())

    /** @see update */
    fun update(
        fileNo: String,
        params: FileUpdateParams = FileUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUpdateResponse = update(params.toBuilder().fileNo(fileNo).build(), requestOptions)

    /** @see update */
    fun update(
        fileNo: String,
        params: FileUpdateParams = FileUpdateParams.none(),
    ): FileUpdateResponse = update(fileNo, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FileUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileUpdateResponse

    /** @see update */
    fun update(params: FileUpdateParams): FileUpdateResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(fileNo: String, requestOptions: RequestOptions): FileUpdateResponse =
        update(fileNo, FileUpdateParams.none(), requestOptions)

    /** List/search files with pagination, filtering, and sorting. */
    fun list(): FileListResponse = list(FileListParams.none())

    /** @see list */
    fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListResponse

    /** @see list */
    fun list(params: FileListParams = FileListParams.none()): FileListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FileListResponse =
        list(FileListParams.none(), requestOptions)

    /** Delete file */
    fun delete(fileNo: String) = delete(fileNo, FileDeleteParams.none())

    /** @see delete */
    fun delete(
        fileNo: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().fileNo(fileNo).build(), requestOptions)

    /** @see delete */
    fun delete(fileNo: String, params: FileDeleteParams = FileDeleteParams.none()) =
        delete(fileNo, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FileDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FileDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(fileNo: String, requestOptions: RequestOptions) =
        delete(fileNo, FileDeleteParams.none(), requestOptions)

    /** Rename file */
    fun rename(fileNo: String, params: FileRenameParams): FileRenameResponse =
        rename(fileNo, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        fileNo: String,
        params: FileRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileRenameResponse = rename(params.toBuilder().fileNo(fileNo).build(), requestOptions)

    /** @see rename */
    fun rename(params: FileRenameParams): FileRenameResponse = rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: FileRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileRenameResponse

    /** A view of [FileService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/files/{fileNo}`, but is otherwise the same
         * as [FileService.retrieve].
         */
        @MustBeClosed
        fun retrieve(fileNo: String): HttpResponseFor<FileRetrieveResponse> =
            retrieve(fileNo, FileRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fileNo: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRetrieveResponse> =
            retrieve(params.toBuilder().fileNo(fileNo).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fileNo: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
        ): HttpResponseFor<FileRetrieveResponse> = retrieve(fileNo, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FileRetrieveParams): HttpResponseFor<FileRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fileNo: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileRetrieveResponse> =
            retrieve(fileNo, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/files/{fileNo}`, but is otherwise the same
         * as [FileService.update].
         */
        @MustBeClosed
        fun update(fileNo: String): HttpResponseFor<FileUpdateResponse> =
            update(fileNo, FileUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            fileNo: String,
            params: FileUpdateParams = FileUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUpdateResponse> =
            update(params.toBuilder().fileNo(fileNo).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            fileNo: String,
            params: FileUpdateParams = FileUpdateParams.none(),
        ): HttpResponseFor<FileUpdateResponse> = update(fileNo, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: FileUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileUpdateResponse>

        /** @see update */
        @MustBeClosed
        fun update(params: FileUpdateParams): HttpResponseFor<FileUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            fileNo: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FileUpdateResponse> =
            update(fileNo, FileUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/files`, but is otherwise the same as
         * [FileService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<FileListResponse> = list(FileListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FileListParams = FileListParams.none()
        ): HttpResponseFor<FileListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FileListResponse> =
            list(FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/files/{fileNo}`, but is otherwise the
         * same as [FileService.delete].
         */
        @MustBeClosed
        fun delete(fileNo: String): HttpResponse = delete(fileNo, FileDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileNo: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().fileNo(fileNo).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            fileNo: String,
            params: FileDeleteParams = FileDeleteParams.none(),
        ): HttpResponse = delete(fileNo, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FileDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(fileNo: String, requestOptions: RequestOptions): HttpResponse =
            delete(fileNo, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/files/{fileNo}/rename`, but is otherwise
         * the same as [FileService.rename].
         */
        @MustBeClosed
        fun rename(fileNo: String, params: FileRenameParams): HttpResponseFor<FileRenameResponse> =
            rename(fileNo, params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            fileNo: String,
            params: FileRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRenameResponse> =
            rename(params.toBuilder().fileNo(fileNo).build(), requestOptions)

        /** @see rename */
        @MustBeClosed
        fun rename(params: FileRenameParams): HttpResponseFor<FileRenameResponse> =
            rename(params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            params: FileRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileRenameResponse>
    }
}
