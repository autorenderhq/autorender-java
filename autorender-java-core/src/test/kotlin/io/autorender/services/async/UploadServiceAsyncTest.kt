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
                    .fileName("file_name")
                    .customId("custom_id")
                    .folder("folder")
                    .metadata("metadata")
                    .randomPrefix("random_prefix")
                    .tags("tags")
                    .transform("transform")
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
}
