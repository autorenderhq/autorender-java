// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.folders.Folder
import io.autorender.models.folders.FolderCreateParams
import io.autorender.models.folders.FolderCreateResponse
import io.autorender.models.folders.FolderDeleteParams
import io.autorender.models.folders.FolderDeleteResponse
import io.autorender.models.folders.FolderListParams
import io.autorender.models.folders.FolderListResponse
import io.autorender.models.folders.FolderRenameParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FolderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderServiceAsync

    /** Create a folder under an optional parent. */
    fun create(params: FolderCreateParams): CompletableFuture<FolderCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderCreateResponse>

    /**
     * List folders under an optional parent. Omit `parent_folder_no` to list root-level folders.
     */
    fun list(): CompletableFuture<FolderListResponse> = list(FolderListParams.none())

    /** @see list */
    fun list(
        params: FolderListParams = FolderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderListResponse>

    /** @see list */
    fun list(
        params: FolderListParams = FolderListParams.none()
    ): CompletableFuture<FolderListResponse> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<FolderListResponse> =
        list(FolderListParams.none(), requestOptions)

    /** Delete a folder by folder number. No request body required. */
    fun delete(folderNo: String): CompletableFuture<FolderDeleteResponse> =
        delete(folderNo, FolderDeleteParams.none())

    /** @see delete */
    fun delete(
        folderNo: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderDeleteResponse> =
        delete(params.toBuilder().folderNo(folderNo).build(), requestOptions)

    /** @see delete */
    fun delete(
        folderNo: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
    ): CompletableFuture<FolderDeleteResponse> = delete(folderNo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FolderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderDeleteResponse>

    /** @see delete */
    fun delete(params: FolderDeleteParams): CompletableFuture<FolderDeleteResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        folderNo: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FolderDeleteResponse> =
        delete(folderNo, FolderDeleteParams.none(), requestOptions)

    /** Rename a folder by `folder_no`. */
    fun rename(folderNo: String, params: FolderRenameParams): CompletableFuture<Folder> =
        rename(folderNo, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        folderNo: String,
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder> =
        rename(params.toBuilder().folderNo(folderNo).build(), requestOptions)

    /** @see rename */
    fun rename(params: FolderRenameParams): CompletableFuture<Folder> =
        rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Folder>

    /**
     * A view of [FolderServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FolderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/folders`, but is otherwise the same as
         * [FolderServiceAsync.create].
         */
        fun create(
            params: FolderCreateParams
        ): CompletableFuture<HttpResponseFor<FolderCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /api/v1/folders`, but is otherwise the same as
         * [FolderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FolderListResponse>> =
            list(FolderListParams.none())

        /** @see list */
        fun list(
            params: FolderListParams = FolderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderListResponse>>

        /** @see list */
        fun list(
            params: FolderListParams = FolderListParams.none()
        ): CompletableFuture<HttpResponseFor<FolderListResponse>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FolderListResponse>> =
            list(FolderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/folders/{folderNo}`, but is otherwise the
         * same as [FolderServiceAsync.delete].
         */
        fun delete(folderNo: String): CompletableFuture<HttpResponseFor<FolderDeleteResponse>> =
            delete(folderNo, FolderDeleteParams.none())

        /** @see delete */
        fun delete(
            folderNo: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderDeleteResponse>> =
            delete(params.toBuilder().folderNo(folderNo).build(), requestOptions)

        /** @see delete */
        fun delete(
            folderNo: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
        ): CompletableFuture<HttpResponseFor<FolderDeleteResponse>> =
            delete(folderNo, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderDeleteResponse>>

        /** @see delete */
        fun delete(
            params: FolderDeleteParams
        ): CompletableFuture<HttpResponseFor<FolderDeleteResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            folderNo: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FolderDeleteResponse>> =
            delete(folderNo, FolderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/folders/rename/{folderNo}`, but is
         * otherwise the same as [FolderServiceAsync.rename].
         */
        fun rename(
            folderNo: String,
            params: FolderRenameParams,
        ): CompletableFuture<HttpResponseFor<Folder>> =
            rename(folderNo, params, RequestOptions.none())

        /** @see rename */
        fun rename(
            folderNo: String,
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>> =
            rename(params.toBuilder().folderNo(folderNo).build(), requestOptions)

        /** @see rename */
        fun rename(params: FolderRenameParams): CompletableFuture<HttpResponseFor<Folder>> =
            rename(params, RequestOptions.none())

        /** @see rename */
        fun rename(
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Folder>>
    }
}
