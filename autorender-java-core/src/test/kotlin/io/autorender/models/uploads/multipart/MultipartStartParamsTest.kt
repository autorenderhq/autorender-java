// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads.multipart

import io.autorender.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartStartParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("file_name")
        assertThat(body.format()).isEqualTo("format")
        assertThat(body.size()).isEqualTo(0L)
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.folder()).contains("folder")
        assertThat(body.metadata())
            .contains(
                MultipartStartParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.randomPrefix()).contains(true)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.ttlSeconds()).contains(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MultipartStartParams.builder().fileName("file_name").format("format").size(0L).build()

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("file_name")
        assertThat(body.format()).isEqualTo("format")
        assertThat(body.size()).isEqualTo(0L)
    }
}
