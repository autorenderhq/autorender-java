// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateFromUrlParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.remoteUrl()).isEqualTo("remote_url")
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.folder()).contains("folder")
        assertThat(body.metadata()).contains("metadata")
        assertThat(body.randomPrefix()).contains("random_prefix")
        assertThat(body.tags()).contains("tags")
        assertThat(body.transform()).contains("transform")
        assertThat(body.webhookUrl()).contains("webhook_url")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UploadCreateFromUrlParams.builder().remoteUrl("remote_url").build()

        val body = params._body()

        assertThat(body.remoteUrl()).isEqualTo("remote_url")
    }
}
