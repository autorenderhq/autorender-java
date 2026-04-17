// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async.uploads

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.checkRequired
import io.autorender.core.handlers.emptyHandler
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
import io.autorender.models.uploads.Upload
import io.autorender.models.uploads.multipart.MultipartCompleteParams
import io.autorender.models.uploads.multipart.MultipartStartParams
import io.autorender.models.uploads.multipart.MultipartUploadPartParams
import io.autorender.models.uploads.multipart.Session
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Large file uploads via multipart */
class MultipartServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MultipartServiceAsync {

    private val withRawResponse: MultipartServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MultipartServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartServiceAsync =
        MultipartServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun complete(
        params: MultipartCompleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Upload> =
        // post /api/v1/multipart/complete
        withRawResponse().complete(params, requestOptions).thenApply { it.parse() }

    override fun start(
        params: MultipartStartParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Session> =
        // post /api/v1/multipart/start
        withRawResponse().start(params, requestOptions).thenApply { it.parse() }

    override fun uploadPart(
        params: MultipartUploadPartParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /api/v1/multipart/parts
        withRawResponse().uploadPart(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultipartServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultipartServiceAsync.WithRawResponse =
            MultipartServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeHandler: Handler<Upload> = jsonHandler<Upload>(clientOptions.jsonMapper)

        override fun complete(
            params: MultipartCompleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Upload>> {
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

        private val startHandler: Handler<Session> = jsonHandler<Session>(clientOptions.jsonMapper)

        override fun start(
            params: MultipartStartParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Session>> {
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

        private val uploadPartHandler: Handler<Void?> = emptyHandler()

        override fun uploadPart(
            params: MultipartUploadPartParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("body", params._body().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "multipart", "parts")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { uploadPartHandler.handle(it) }
                    }
                }
        }
    }
}
