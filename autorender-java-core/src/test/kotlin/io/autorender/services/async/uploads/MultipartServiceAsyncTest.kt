// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async.uploads

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClientAsync
import io.autorender.core.JsonValue
import io.autorender.models.uploads.multipart.MultipartCompleteParams
import io.autorender.models.uploads.multipart.MultipartStartParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultipartServiceAsyncTest {

    @Test
    fun complete() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartServiceAsync = client.uploads().multipart()

        val uploadFuture =
            multipartServiceAsync.complete(
                MultipartCompleteParams.builder().sessionId("session_id").build()
            )

        val upload = uploadFuture.get()
        upload.validate()
    }

    @Test
    fun start() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartServiceAsync = client.uploads().multipart()

        val sessionFuture =
            multipartServiceAsync.start(
                MultipartStartParams.builder()
                    .fileName("file_name")
                    .format("format")
                    .size(0L)
                    .customId("custom_id")
                    .folder("folder")
                    .metadata(
                        MultipartStartParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .randomPrefix(true)
                    .addTag("string")
                    .ttlSeconds(0L)
                    .build()
            )

        val session = sessionFuture.get()
        session.validate()
    }

    @Test
    fun uploadPart() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartServiceAsync = client.uploads().multipart()

        val future = multipartServiceAsync.uploadPart("Example data")

        val response = future.get()
    }
}
