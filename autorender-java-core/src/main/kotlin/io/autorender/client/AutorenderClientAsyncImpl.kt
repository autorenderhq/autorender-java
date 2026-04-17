// File generated from our OpenAPI spec by Stainless.

package io.autorender.client

import io.autorender.core.ClientOptions
import io.autorender.core.getPackageVersion
import io.autorender.services.async.FileServiceAsync
import io.autorender.services.async.FileServiceAsyncImpl
import io.autorender.services.async.FolderServiceAsync
import io.autorender.services.async.FolderServiceAsyncImpl
import io.autorender.services.async.UploadServiceAsync
import io.autorender.services.async.UploadServiceAsyncImpl
import java.util.function.Consumer

class AutorenderClientAsyncImpl(private val clientOptions: ClientOptions) : AutorenderClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: AutorenderClient by lazy { AutorenderClientImpl(clientOptions) }

    private val withRawResponse: AutorenderClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val uploads: UploadServiceAsync by lazy {
        UploadServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val folders: FolderServiceAsync by lazy {
        FolderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): AutorenderClient = sync

    override fun withRawResponse(): AutorenderClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AutorenderClientAsync =
        AutorenderClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun uploads(): UploadServiceAsync = uploads

    override fun files(): FileServiceAsync = files

    override fun folders(): FolderServiceAsync = folders

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AutorenderClientAsync.WithRawResponse {

        private val uploads: UploadServiceAsync.WithRawResponse by lazy {
            UploadServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val folders: FolderServiceAsync.WithRawResponse by lazy {
            FolderServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AutorenderClientAsync.WithRawResponse =
            AutorenderClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun uploads(): UploadServiceAsync.WithRawResponse = uploads

        override fun files(): FileServiceAsync.WithRawResponse = files

        override fun folders(): FolderServiceAsync.WithRawResponse = folders
    }
}
