// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

interface FolderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService

    /** Create a folder under an optional parent. */
    fun create(params: FolderCreateParams): FolderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderCreateResponse

    /**
     * List folders under an optional parent. Omit `parent_folder_no` to list root-level folders.
     */
    fun list(): FolderListResponse = list(FolderListParams.none())

    /** @see list */
    fun list(
        params: FolderListParams = FolderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderListResponse

    /** @see list */
    fun list(params: FolderListParams = FolderListParams.none()): FolderListResponse =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): FolderListResponse =
        list(FolderListParams.none(), requestOptions)

    /** Delete a folder by folder number. No request body required. */
    fun delete(folderNo: String): FolderDeleteResponse = delete(folderNo, FolderDeleteParams.none())

    /** @see delete */
    fun delete(
        folderNo: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderDeleteResponse = delete(params.toBuilder().folderNo(folderNo).build(), requestOptions)

    /** @see delete */
    fun delete(
        folderNo: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
    ): FolderDeleteResponse = delete(folderNo, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FolderDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderDeleteResponse

    /** @see delete */
    fun delete(params: FolderDeleteParams): FolderDeleteResponse =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(folderNo: String, requestOptions: RequestOptions): FolderDeleteResponse =
        delete(folderNo, FolderDeleteParams.none(), requestOptions)

    /** Rename a folder by `folder_no`. */
    fun rename(folderNo: String, params: FolderRenameParams): Folder =
        rename(folderNo, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        folderNo: String,
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder = rename(params.toBuilder().folderNo(folderNo).build(), requestOptions)

    /** @see rename */
    fun rename(params: FolderRenameParams): Folder = rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Folder

    /** A view of [FolderService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): FolderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/folders`, but is otherwise the same as
         * [FolderService.create].
         */
        @MustBeClosed
        fun create(params: FolderCreateParams): HttpResponseFor<FolderCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: FolderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/folders`, but is otherwise the same as
         * [FolderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<FolderListResponse> = list(FolderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FolderListParams = FolderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FolderListParams = FolderListParams.none()
        ): HttpResponseFor<FolderListResponse> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FolderListResponse> =
            list(FolderListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /api/v1/folders/{folderNo}`, but is otherwise the
         * same as [FolderService.delete].
         */
        @MustBeClosed
        fun delete(folderNo: String): HttpResponseFor<FolderDeleteResponse> =
            delete(folderNo, FolderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            folderNo: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderDeleteResponse> =
            delete(params.toBuilder().folderNo(folderNo).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            folderNo: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
        ): HttpResponseFor<FolderDeleteResponse> = delete(folderNo, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderDeleteResponse>

        /** @see delete */
        @MustBeClosed
        fun delete(params: FolderDeleteParams): HttpResponseFor<FolderDeleteResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            folderNo: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FolderDeleteResponse> =
            delete(folderNo, FolderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/folders/rename/{folderNo}`, but is
         * otherwise the same as [FolderService.rename].
         */
        @MustBeClosed
        fun rename(folderNo: String, params: FolderRenameParams): HttpResponseFor<Folder> =
            rename(folderNo, params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            folderNo: String,
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder> =
            rename(params.toBuilder().folderNo(folderNo).build(), requestOptions)

        /** @see rename */
        @MustBeClosed
        fun rename(params: FolderRenameParams): HttpResponseFor<Folder> =
            rename(params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Folder>
    }
}
