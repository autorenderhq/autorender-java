// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClientAsync
import io.autorender.core.JsonValue
import io.autorender.models.multipartuploads.MultipartUploadCompleteParams
import io.autorender.models.multipartuploads.MultipartUploadStartParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultipartUploadServiceAsyncTest {

    @Test
    fun complete() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartUploadServiceAsync = client.multipartUploads()

        val responseFuture =
            multipartUploadServiceAsync.complete(
                MultipartUploadCompleteParams.builder().sessionId("x").uuid("uuid").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun start() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartUploadServiceAsync = client.multipartUploads()

        val responseFuture =
            multipartUploadServiceAsync.start(
                MultipartUploadStartParams.builder()
                    .fileName("x")
                    .format("x")
                    .size(1L)
                    .customId("custom_id")
                    .folder("folder")
                    .metadata(
                        MultipartUploadStartParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .randomPrefix(true)
                    .tagsOfStrings(listOf("string"))
                    .ttlSeconds(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
