// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
import java.util.function.Consumer

/** Folder management endpoints (API key required) */
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

    /** Create folder */
    fun create(params: FolderCreateParams): FolderCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: FolderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderCreateResponse

    /** List folders */
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

    /** Delete folder */
    fun delete(folderNo: String) = delete(folderNo, FolderDeleteParams.none())

    /** @see delete */
    fun delete(
        folderNo: String,
        params: FolderDeleteParams = FolderDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().folderNo(folderNo).build(), requestOptions)

    /** @see delete */
    fun delete(folderNo: String, params: FolderDeleteParams = FolderDeleteParams.none()) =
        delete(folderNo, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: FolderDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: FolderDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(folderNo: String, requestOptions: RequestOptions) =
        delete(folderNo, FolderDeleteParams.none(), requestOptions)

    /** Rename folder */
    fun rename(folderNo: String, params: FolderRenameParams): FolderRenameResponse =
        rename(folderNo, params, RequestOptions.none())

    /** @see rename */
    fun rename(
        folderNo: String,
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderRenameResponse = rename(params.toBuilder().folderNo(folderNo).build(), requestOptions)

    /** @see rename */
    fun rename(params: FolderRenameParams): FolderRenameResponse =
        rename(params, RequestOptions.none())

    /** @see rename */
    fun rename(
        params: FolderRenameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FolderRenameResponse

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
        fun delete(folderNo: String): HttpResponse = delete(folderNo, FolderDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            folderNo: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().folderNo(folderNo).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            folderNo: String,
            params: FolderDeleteParams = FolderDeleteParams.none(),
        ): HttpResponse = delete(folderNo, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: FolderDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: FolderDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(folderNo: String, requestOptions: RequestOptions): HttpResponse =
            delete(folderNo, FolderDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/folders/rename/{folderNo}`, but is
         * otherwise the same as [FolderService.rename].
         */
        @MustBeClosed
        fun rename(
            folderNo: String,
            params: FolderRenameParams,
        ): HttpResponseFor<FolderRenameResponse> = rename(folderNo, params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            folderNo: String,
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderRenameResponse> =
            rename(params.toBuilder().folderNo(folderNo).build(), requestOptions)

        /** @see rename */
        @MustBeClosed
        fun rename(params: FolderRenameParams): HttpResponseFor<FolderRenameResponse> =
            rename(params, RequestOptions.none())

        /** @see rename */
        @MustBeClosed
        fun rename(
            params: FolderRenameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FolderRenameResponse>
    }
}
