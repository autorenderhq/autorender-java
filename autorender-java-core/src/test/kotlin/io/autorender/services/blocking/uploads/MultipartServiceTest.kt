// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking.uploads

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.core.JsonValue
import io.autorender.models.uploads.multipart.MultipartCompleteParams
import io.autorender.models.uploads.multipart.MultipartStartParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MultipartServiceTest {

    @Test
    fun complete() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartService = client.uploads().multipart()

        val upload =
            multipartService.complete(
                MultipartCompleteParams.builder().sessionId("session_id").build()
            )

        upload.validate()
    }

    @Test
    fun start() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartService = client.uploads().multipart()

        val session =
            multipartService.start(
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

        session.validate()
    }

    @Test
    fun uploadPart() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val multipartService = client.uploads().multipart()

        multipartService.uploadPart("Example data")
    }
}
