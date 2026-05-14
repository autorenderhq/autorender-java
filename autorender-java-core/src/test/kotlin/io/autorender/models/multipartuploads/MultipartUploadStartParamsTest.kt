// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.multipartuploads

import io.autorender.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartUploadStartParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("x")
        assertThat(body.format()).isEqualTo("x")
        assertThat(body.size()).isEqualTo(1L)
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.folder()).contains("folder")
        assertThat(body.metadata())
            .contains(
                MultipartUploadStartParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.randomPrefix()).contains(true)
        assertThat(body.tags())
            .contains(MultipartUploadStartParams.Tags.ofStrings(listOf("string")))
        assertThat(body.ttlSeconds()).contains(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MultipartUploadStartParams.builder().fileName("x").format("x").size(1L).build()

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("x")
        assertThat(body.format()).isEqualTo("x")
        assertThat(body.size()).isEqualTo(1L)
    }
}
