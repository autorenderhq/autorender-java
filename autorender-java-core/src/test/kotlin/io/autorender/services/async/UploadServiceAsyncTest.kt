// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClientAsync
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UploadServiceAsyncTest {

    @Test
    fun create() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadServiceAsync = client.uploads()

        val uploadFuture =
            uploadServiceAsync.create(
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

        val upload = uploadFuture.get()
        upload.validate()
    }

    @Test
    fun createFromUrl() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadServiceAsync = client.uploads()

        val responseFuture =
            uploadServiceAsync.createFromUrl(
                UploadCreateFromUrlParams.builder()
                    .remoteUrl("https://example.com")
                    .customId("custom_id")
                    .fileName("file_name")
                    .folder("folder")
                    .metadata("metadata")
                    .randomPrefix("random_prefix")
                    .tagsOfStrings(listOf("string"))
                    .webhookUrl("https://example.com")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
