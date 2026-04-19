// File generated from our OpenAPI spec by Stainless.

package io.autorender.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import io.autorender.client.AutorenderClient
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.core.JsonValue
import io.autorender.core.http.Headers
import io.autorender.core.jsonMapper
import io.autorender.errors.AutorenderException
import io.autorender.errors.BadRequestException
import io.autorender.errors.InternalServerException
import io.autorender.errors.NotFoundException
import io.autorender.errors.PermissionDeniedException
import io.autorender.errors.RateLimitException
import io.autorender.errors.UnauthorizedException
import io.autorender.errors.UnexpectedStatusCodeException
import io.autorender.errors.UnprocessableEntityException
import io.autorender.models.uploads.UploadCreateParams
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.parallel.ResourceLock

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

    private lateinit var client: AutorenderClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client = AutorenderOkHttpClient.builder().baseUrl(wmRuntimeInfo.httpBaseUrl).build()
    }

    @Test
    fun uploadsCreate400() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate400WithRawResponse() {
        val uploadService = client.uploads().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate401() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate401WithRawResponse() {
        val uploadService = client.uploads().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate403() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate403WithRawResponse() {
        val uploadService = client.uploads().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate404() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate404WithRawResponse() {
        val uploadService = client.uploads().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate422() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate422WithRawResponse() {
        val uploadService = client.uploads().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate429() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate429WithRawResponse() {
        val uploadService = client.uploads().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate500() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate500WithRawResponse() {
        val uploadService = client.uploads().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate999() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreate999WithRawResponse() {
        val uploadService = client.uploads().withRawResponse()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun uploadsCreateInvalidJsonBody() {
        val uploadService = client.uploads()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<AutorenderException> {
                uploadService.create(
                    UploadCreateParams.builder()
                        .file("Example data".byteInputStream())
                        .fileName("product.jpg")
                        .customId("sku123")
                        .folder("products/sku123")
                        .metadata("{\"productId\":\"123\"}")
                        .randomPrefix("random_prefix")
                        .tags("product,thumbnail")
                        .transform("transform")
                        .webhookUrl("webhook_url")
                        .build()
                )
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}
