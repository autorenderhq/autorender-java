// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class UploadServiceTest {

    @Test
    fun create() {
        val client = AutorenderOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val uploadService = client.uploads()

        val upload =
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

        upload.validate()
    }

    @Test
    fun createFromUrl() {
        val client = AutorenderOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val uploadService = client.uploads()

        val response =
            uploadService.createFromUrl(
                UploadCreateFromUrlParams.builder()
                    .remoteUrl("https://example.com")
                    .customId("custom_id")
                    .fileName("file_name")
                    .folder("folder")
                    .metadata("metadata")
                    .randomPrefix("random_prefix")
                    .tags("tags")
                    .webhookUrl("https://example.com")
                    .build()
            )

        response.validate()
    }
}
