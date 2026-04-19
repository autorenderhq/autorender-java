// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.core.ClientOptions
import io.autorender.core.RequestOptions
import io.autorender.core.checkRequired
import io.autorender.core.handlers.errorBodyHandler
import io.autorender.core.handlers.errorHandler
import io.autorender.core.handlers.jsonHandler
import io.autorender.core.http.HttpMethod
import io.autorender.core.http.HttpRequest
import io.autorender.core.http.HttpResponse
import io.autorender.core.http.HttpResponse.Handler
import io.autorender.core.http.HttpResponseFor
import io.autorender.core.http.json
import io.autorender.core.http.multipartFormData
import io.autorender.core.http.parseable
import io.autorender.core.prepareAsync
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateFromUrlResponse
import io.autorender.models.uploads.UploadCreateParams
import io.autorender.models.uploads.UploadCreateResponse
import io.autorender.models.uploads.UploadGenerateTokenParams
import io.autorender.models.uploads.UploadGenerateTokenResponse
import io.autorender.models.uploads.UploadUploadWithTokenParams
import io.autorender.models.uploads.UploadUploadWithTokenResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Upload endpoints (API key required) */
class UploadServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    UploadServiceAsync {

    private val withRawResponse: UploadServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): UploadServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): UploadServiceAsync =
        UploadServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: UploadCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UploadCreateResponse> =
        // post /api/v1/uploads
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun createFromUrl(
        params: UploadCreateFromUrlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UploadCreateFromUrlResponse> =
        // post /api/v1/uploads/remote
        withRawResponse().createFromUrl(params, requestOptions).thenApply { it.parse() }

    override fun generateToken(
        params: UploadGenerateTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UploadGenerateTokenResponse> =
        // post /api/v1/generate-token
        withRawResponse().generateToken(params, requestOptions).thenApply { it.parse() }

    override fun uploadWithToken(
        params: UploadUploadWithTokenParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<UploadUploadWithTokenResponse> =
        // post /api/v1/uploads/{token}
        withRawResponse().uploadWithToken(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        UploadServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): UploadServiceAsync.WithRawResponse =
            UploadServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<UploadCreateResponse> =
            jsonHandler<UploadCreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "uploads")
                    .body(multipartFormData(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createFromUrlHandler: Handler<UploadCreateFromUrlResponse> =
            jsonHandler<UploadCreateFromUrlResponse>(clientOptions.jsonMapper)

        override fun createFromUrl(
            params: UploadCreateFromUrlParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadCreateFromUrlResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "uploads", "remote")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createFromUrlHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val generateTokenHandler: Handler<UploadGenerateTokenResponse> =
            jsonHandler<UploadGenerateTokenResponse>(clientOptions.jsonMapper)

        override fun generateToken(
            params: UploadGenerateTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadGenerateTokenResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "generate-token")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { generateTokenHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val uploadWithTokenHandler: Handler<UploadUploadWithTokenResponse> =
            jsonHandler<UploadUploadWithTokenResponse>(clientOptions.jsonMapper)

        override fun uploadWithToken(
            params: UploadUploadWithTokenParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<UploadUploadWithTokenResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            checkRequired("file", params._body().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "uploads", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { uploadWithTokenHandler.handle(it) }
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
