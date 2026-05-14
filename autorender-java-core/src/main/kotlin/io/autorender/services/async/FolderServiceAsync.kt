// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.http.HttpResponse
import io.autorender.core.http.HttpResponseFor
import io.autorender.models.folders.FolderCreateParams
import io.autorender.models.folders.FolderCreateResponse
import io.autorender.models.folders.FolderDeleteParams
import io.autorender.models.folders.FolderListParams
import io.autorender.models.folders.FolderListResponse
import io.autorender.models.folders.FolderRenameParams
import io.autorender.models.folders.FolderRenameResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Folder management endpoints (API key required) */
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

    /** Create folder */
    fun create(params: FolderCreateParams): CompletableFuture<FolderCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderCreateResponse>

    /** List folders */
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

    /** Delete folder */
    fun delete(folderNo: String): CompletableFuture<Void?> =
        delete(folderNo, FolderDeleteParams.none())

    /** @see delete */
    fun delete(
        folderNo: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().folderNo(folderNo).build(), requestOptions)

    /** @see delete */
    fun delete(
        folderNo: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(folderNo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FolderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: FolderDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(folderNo: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(folderNo, FolderDeleteParams.none(), requestOptions)

    /** Rename folder */
    fun rename(
        folderNo: String,
        params: FolderRenameParams,
    ): CompletableFuture<FolderRenameResponse> = rename(folderNo, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        folderNo: String,
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderRenameResponse> =
        rename(params.toBuilder().folderNo(folderNo).build(), requestOptions)

    /** @see rename */
    fun rename(params: FolderRenameParams): CompletableFuture<FolderRenameResponse> =
        rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FolderRenameResponse>

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
        fun delete(folderNo: String): CompletableFuture<HttpResponse> =
            delete(folderNo, FolderDeleteParams.none())

        /** @see delete */
        fun delete(
            folderNo: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().folderNo(folderNo).build(), requestOptions)

        /** @see delete */
        fun delete(
            folderNo: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(folderNo, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: FolderDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            folderNo: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(folderNo, FolderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/folders/rename/{folderNo}`, but is
         * otherwise the same as [FolderServiceAsync.rename].
         */
        fun rename(
            folderNo: String,
            params: FolderRenameParams,
        ): CompletableFuture<HttpResponseFor<FolderRenameResponse>> =
            rename(folderNo, params, RequestOptions.none())

        /** @see rename */
        fun rename(
            folderNo: String,
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderRenameResponse>> =
            rename(params.toBuilder().folderNo(folderNo).build(), requestOptions)

        /** @see rename */
        fun rename(
            params: FolderRenameParams
        ): CompletableFuture<HttpResponseFor<FolderRenameResponse>> =
            rename(params, RequestOptions.none())

        /** @see rename */
        fun rename(
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FolderRenameResponse>>
    }
}
