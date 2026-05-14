// File generated from our OpenAPI spec by Stainless.

package io.autorender.client

import io.autorender.core.ClientOptions
import io.autorender.core.getPackageVersion
import io.autorender.services.blocking.FileService
import io.autorender.services.blocking.FileServiceImpl
import io.autorender.services.blocking.FolderService
import io.autorender.services.blocking.FolderServiceImpl
import io.autorender.services.blocking.MultipartUploadService
import io.autorender.services.blocking.MultipartUploadServiceImpl
import io.autorender.services.blocking.UploadService
import io.autorender.services.blocking.UploadServiceImpl
import java.util.function.Consumer

class AutorenderClientImpl(private val clientOptions: ClientOptions) : AutorenderClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: AutorenderClientAsync by lazy { AutorenderClientAsyncImpl(clientOptions) }

    private val withRawResponse: AutorenderClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val uploads: UploadService by lazy { UploadServiceImpl(clientOptionsWithUserAgent) }

    private val files: FileService by lazy { FileServiceImpl(clientOptionsWithUserAgent) }

    private val folders: FolderService by lazy { FolderServiceImpl(clientOptionsWithUserAgent) }

    private val multipartUploads: MultipartUploadService by lazy {
        MultipartUploadServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): AutorenderClientAsync = async

    override fun withRawResponse(): AutorenderClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutorenderClient =
        AutorenderClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Upload endpoints (API key required) */
    override fun uploads(): UploadService = uploads

    /** File management endpoints (API key required) */
    override fun files(): FileService = files

    /** Folder management endpoints (API key required) */
    override fun folders(): FolderService = folders

    /** Upload endpoints (API key required) */
    override fun multipartUploads(): MultipartUploadService = multipartUploads

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutorenderClient.WithRawResponse {

        private val uploads: UploadService.WithRawResponse by lazy {
            UploadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val folders: FolderService.WithRawResponse by lazy {
            FolderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val multipartUploads: MultipartUploadService.WithRawResponse by lazy {
            MultipartUploadServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutorenderClient.WithRawResponse =
            AutorenderClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Upload endpoints (API key required) */
        override fun uploads(): UploadService.WithRawResponse = uploads

        /** File management endpoints (API key required) */
        override fun files(): FileService.WithRawResponse = files

        /** Folder management endpoints (API key required) */
        override fun folders(): FolderService.WithRawResponse = folders

        /** Upload endpoints (API key required) */
        override fun multipartUploads(): MultipartUploadService.WithRawResponse = multipartUploads
    }
}
