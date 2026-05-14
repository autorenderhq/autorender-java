// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.handlers.errorBodyHandler
import io.autorender.core.handlers.errorHandler
import io.autorender.core.handlers.jsonHandler
import io.autorender.core.http.HttpMethod
import io.autorender.core.http.HttpRequest
import io.autorender.core.http.HttpResponse
import io.autorender.core.http.HttpResponse.Handler
import io.autorender.core.http.HttpResponseFor
import io.autorender.core.http.json
import io.autorender.core.http.parseable
import io.autorender.core.prepareAsync
import io.autorender.models.multipartuploads.MultipartUploadCompleteParams
import io.autorender.models.multipartuploads.MultipartUploadCompleteResponse
import io.autorender.models.multipartuploads.MultipartUploadStartParams
import io.autorender.models.multipartuploads.MultipartUploadStartResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

/** Upload endpoints (API key required) */
class MultipartUploadServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : MultipartUploadServiceAsync {

    private val withRawResponse: MultipartUploadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MultipartUploadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): MultipartUploadServiceAsync =
        MultipartUploadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun complete(
        params: MultipartUploadCompleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MultipartUploadCompleteResponse> =
        // post /api/v1/multipart/complete
        withRawResponse().complete(params, requestOptions).thenApply { it.parse() }

    override fun start(
        params: MultipartUploadStartParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MultipartUploadStartResponse> =
        // post /api/v1/multipart/start
        withRawResponse().start(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultipartUploadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultipartUploadServiceAsync.WithRawResponse =
            MultipartUploadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeHandler: Handler<MultipartUploadCompleteResponse> =
            jsonHandler<MultipartUploadCompleteResponse>(clientOptions.jsonMapper)

        override fun complete(
            params: MultipartUploadCompleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MultipartUploadCompleteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "multipart", "complete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { completeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val startHandler: Handler<MultipartUploadStartResponse> =
            jsonHandler<MultipartUploadStartResponse>(clientOptions.jsonMapper)

        override fun start(
            params: MultipartUploadStartParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MultipartUploadStartResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "multipart", "start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { startHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
