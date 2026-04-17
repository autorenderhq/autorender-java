// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.files.FileDeleteParams
import io.autorender.models.files.FileDeleteResponse
import io.autorender.models.files.FileListParams
import io.autorender.models.files.FileListResponse
import io.autorender.models.files.FileObject
import io.autorender.models.files.FileRenameParams
import io.autorender.models.files.FileRenameResponse
import io.autorender.models.files.FileRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync

    /** Retrieve detailed information about a file by numeric file id (`file_no`). */
    fun retrieve(fileNo: String): CompletableFuture<FileObject> =
        retrieve(fileNo, FileRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        fileNo: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileObject> =
        retrieve(params.toBuilder().fileNo(fileNo).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        fileNo: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
    ): CompletableFuture<FileObject> = retrieve(fileNo, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileObject>

    /** @see retrieve */
    fun retrieve(params: FileRetrieveParams): CompletableFuture<FileObject> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(fileNo: String, requestOptions: RequestOptions): CompletableFuture<FileObject> =
        retrieve(fileNo, FileRetrieveParams.none(), requestOptions)

    /**
     * Paginated list of files in the workspace. Filter by folder, sort by field and order, and page
     * through results.
     */
    fun list(): CompletableFuture<FileListResponse> = list(FileListParams.none())

    /** @see list */
    fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileListResponse>

    /** @see list */
    fun list(params: FileListParams = FileListParams.none()): CompletableFuture<FileListResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FileListResponse> =
        list(FileListParams.none(), requestOptions)

    /** Permanently delete a file. No request body is required. */
    fun delete(fileNo: String): CompletableFuture<FileDeleteResponse> =
        delete(fileNo, FileDeleteParams.none())

    /** @see delete */
    fun delete(
        fileNo: String,
        params: FileDeleteParams = FileDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileDeleteResponse> =
        delete(params.toBuilder().fileNo(fileNo).build(), requestOptions)

    /** @see delete */
    fun delete(
        fileNo: String,
        params: FileDeleteParams = FileDeleteParams.none(),
    ): CompletableFuture<FileDeleteResponse> = delete(fileNo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FileDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileDeleteResponse>

    /** @see delete */
    fun delete(params: FileDeleteParams): CompletableFuture<FileDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        fileNo: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FileDeleteResponse> =
        delete(fileNo, FileDeleteParams.none(), requestOptions)

    /**
     * Rename a file. The API may preserve or normalize the file extension (e.g. `demo` →
     * `demo.png`).
     */
    fun rename(fileNo: String, params: FileRenameParams): CompletableFuture<FileRenameResponse> =
        rename(fileNo, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        fileNo: String,
        params: FileRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileRenameResponse> =
        rename(params.toBuilder().fileNo(fileNo).build(), requestOptions)

    /** @see rename */
    fun rename(params: FileRenameParams): CompletableFuture<FileRenameResponse> =
        rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: FileRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FileRenameResponse>

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/files/{fileNo}`, but is otherwise the same
         * as [FileServiceAsync.retrieve].
         */
        fun retrieve(fileNo: String): CompletableFuture<HttpResponseFor<FileObject>> =
            retrieve(fileNo, FileRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            fileNo: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileObject>> =
            retrieve(params.toBuilder().fileNo(fileNo).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            fileNo: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FileObject>> =
            retrieve(fileNo, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileObject>>

        /** @see retrieve */
        fun retrieve(params: FileRetrieveParams): CompletableFuture<HttpResponseFor<FileObject>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            fileNo: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileObject>> =
            retrieve(fileNo, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(FileListParams.none())

        /** @see list */
        fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileListResponse>>

        /** @see list */
        fun list(
            params: FileListParams = FileListParams.none()
        ): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FileListResponse>> =
            list(FileListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/files/{fileNo}`, but is otherwise the
         * same as [FileServiceAsync.delete].
         */
        fun delete(fileNo: String): CompletableFuture<HttpResponseFor<FileDeleteResponse>> =
            delete(fileNo, FileDeleteParams.none())

        /** @see delete */
        fun delete(
            fileNo: String,
            params: FileDeleteParams = FileDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>> =
            delete(params.toBuilder().fileNo(fileNo).build(), requestOptions)

        /** @see delete */
        fun delete(
            fileNo: String,
            params: FileDeleteParams = FileDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>> =
            delete(fileNo, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FileDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>>

        /** @see delete */
        fun delete(
            params: FileDeleteParams
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            fileNo: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FileDeleteResponse>> =
            delete(fileNo, FileDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /api/v1/files/{fileNo}/rename`, but is otherwise
         * the same as [FileServiceAsync.rename].
         */
        fun rename(
            fileNo: String,
            params: FileRenameParams,
        ): CompletableFuture<HttpResponseFor<FileRenameResponse>> =
            rename(fileNo, params, RequestOptions.none())

        /** @see rename */
        fun rename(
            fileNo: String,
            params: FileRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileRenameResponse>> =
            rename(params.toBuilder().fileNo(fileNo).build(), requestOptions)

        /** @see rename */
        fun rename(
            params: FileRenameParams
        ): CompletableFuture<HttpResponseFor<FileRenameResponse>> =
            rename(params, RequestOptions.none())

        /** @see rename */
        fun rename(
            params: FileRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FileRenameResponse>>
    }
}
