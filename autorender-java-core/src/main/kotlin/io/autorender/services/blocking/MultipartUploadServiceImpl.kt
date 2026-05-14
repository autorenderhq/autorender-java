// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

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
import io.autorender.core.prepare
import io.autorender.models.multipartuploads.MultipartUploadCompleteParams
import io.autorender.models.multipartuploads.MultipartUploadCompleteResponse
import io.autorender.models.multipartuploads.MultipartUploadStartParams
import io.autorender.models.multipartuploads.MultipartUploadStartResponse
import java.util.function.Consumer

/** Upload endpoints (API key required) */
class MultipartUploadServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MultipartUploadService {

    private val withRawResponse: MultipartUploadService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MultipartUploadService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartUploadService =
        MultipartUploadServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun complete(
        params: MultipartUploadCompleteParams,
        requestOptions: RequestOptions,
    ): MultipartUploadCompleteResponse =
        // post /api/v1/multipart/complete
        withRawResponse().complete(params, requestOptions).parse()

    override fun start(
        params: MultipartUploadStartParams,
        requestOptions: RequestOptions,
    ): MultipartUploadStartResponse =
        // post /api/v1/multipart/start
        withRawResponse().start(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultipartUploadService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultipartUploadService.WithRawResponse =
            MultipartUploadServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeHandler: Handler<MultipartUploadCompleteResponse> =
            jsonHandler<MultipartUploadCompleteResponse>(clientOptions.jsonMapper)

        override fun complete(
            params: MultipartUploadCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MultipartUploadCompleteResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "multipart", "complete")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { completeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val startHandler: Handler<MultipartUploadStartResponse> =
            jsonHandler<MultipartUploadStartResponse>(clientOptions.jsonMapper)

        override fun start(
            params: MultipartUploadStartParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MultipartUploadStartResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "multipart", "start")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
