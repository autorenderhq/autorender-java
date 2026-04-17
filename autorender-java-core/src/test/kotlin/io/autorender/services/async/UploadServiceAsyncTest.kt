// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClientAsync
import io.autorender.core.JsonValue
import io.autorender.models.uploads.UploadCreateFromUrlParams
import io.autorender.models.uploads.UploadCreateParams
import io.autorender.models.uploads.UploadGenerateTokenParams
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
                    .fileName("file_name")
                    .customId("custom_id")
                    .folder("folder")
                    .metadata("metadata")
                    .randomPrefix("random_prefix")
                    .tags("tags")
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

        val uploadFuture =
            uploadServiceAsync.createFromUrl(
                UploadCreateFromUrlParams.builder()
                    .remoteUrl("remote_url")
                    .customId("custom_id")
                    .fileName("file_name")
                    .folder("folder")
                    .metadata("metadata")
                    .randomPrefix("random_prefix")
                    .tags("tags")
                    .transform("transform")
                    .webhookUrl("webhook_url")
                    .build()
            )

        val upload = uploadFuture.get()
        upload.validate()
    }

    @Test
    fun createWithToken() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadServiceAsync = client.uploads()

        val uploadFuture =
            uploadServiceAsync.createWithToken("up_tok_01JHD8X4BX3HQM8NFMD9ZCQ9QN", "Example data")

        val upload = uploadFuture.get()
        upload.validate()
    }

    @Test
    fun generateToken() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val uploadServiceAsync = client.uploads()

        val responseFuture =
            uploadServiceAsync.generateToken(
                UploadGenerateTokenParams.builder()
                    .fileName("avatar.jpg")
                    .allowOverride(
                        UploadGenerateTokenParams.AllowOverride.builder()
                            .folder(true)
                            .tags(true)
                            .transform(true)
                            .build()
                    )
                    .customId("custom_id")
                    .folder("user-uploads/avatars")
                    .maxFileSize(5242880L)
                    .metadata(
                        UploadGenerateTokenParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .randomPrefix(true)
                    .addTag("string")
                    .transform("w_400,h_400,fit_cover")
                    .ttlSeconds(900L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
