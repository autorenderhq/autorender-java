// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateFromUrlParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.remoteUrl()).isEqualTo("https://example.com")
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.fileName()).contains("file_name")
        assertThat(body.folder()).contains("folder")
        assertThat(body.metadata()).contains("metadata")
        assertThat(body.randomPrefix()).contains("random_prefix")
        assertThat(body.tags()).contains("tags")
        assertThat(body.webhookUrl()).contains("https://example.com")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UploadCreateFromUrlParams.builder().remoteUrl("https://example.com").build()

        val body = params._body()

        assertThat(body.remoteUrl()).isEqualTo("https://example.com")
    }
}
