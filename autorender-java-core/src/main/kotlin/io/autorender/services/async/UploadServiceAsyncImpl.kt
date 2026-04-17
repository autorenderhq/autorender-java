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
import io.autorender.core.http.multipartFormData
import io.autorender.core.http.parseable
import io.autorender.core.prepareAsync
import io.autorender.models.uploads.Upload
import io.autorender.models.uploads.UploadCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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
    ): CompletableFuture<Upload> =
        // post /api/v1/uploads
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

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

        private val createHandler: Handler<Upload> = jsonHandler<Upload>(clientOptions.jsonMapper)

        override fun create(
            params: UploadCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Upload>> {
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
    }
}
