// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking.uploads

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
import io.autorender.core.prepare
import io.autorender.models.uploads.Upload
import io.autorender.models.uploads.multipart.MultipartCompleteParams
import io.autorender.models.uploads.multipart.MultipartStartParams
import io.autorender.models.uploads.multipart.MultipartUploadPartParams
import io.autorender.models.uploads.multipart.Session
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

/** Large file uploads via multipart */
class MultipartServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MultipartService {

    private val withRawResponse: MultipartService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MultipartService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultipartService =
        MultipartServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun complete(params: MultipartCompleteParams, requestOptions: RequestOptions): Upload =
        // post /api/v1/multipart/complete
        withRawResponse().complete(params, requestOptions).parse()

    override fun start(params: MultipartStartParams, requestOptions: RequestOptions): Session =
        // post /api/v1/multipart/start
        withRawResponse().start(params, requestOptions).parse()

    override fun uploadPart(params: MultipartUploadPartParams, requestOptions: RequestOptions) {
        // put /api/v1/multipart/parts
        withRawResponse().uploadPart(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MultipartService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultipartService.WithRawResponse =
            MultipartServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val completeHandler: Handler<Upload> = jsonHandler<Upload>(clientOptions.jsonMapper)

        override fun complete(
            params: MultipartCompleteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Upload> {
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

        private val startHandler: Handler<Session> = jsonHandler<Session>(clientOptions.jsonMapper)

        override fun start(
            params: MultipartStartParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Session> {
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

        private val uploadPartHandler: Handler<Void?> = emptyHandler()

        override fun uploadPart(
            params: MultipartUploadPartParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { uploadPartHandler.handle(it) }
            }
        }
    }
}
