// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import io.autorender.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadGenerateTokenParamsTest {

    @Test
    fun create() {
        UploadGenerateTokenParams.builder()
            .fileName("file_name")
            .allowOverride(
                UploadGenerateTokenParams.AllowOverride.builder().folder(true).tags(true).build()
            )
            .customId("custom_id")
            .folder("folder")
            .maxFileSize(-9007199254740991L)
            .metadata(
                UploadGenerateTokenParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .randomPrefix(true)
            .addTag("string")
            .ttlSeconds(-9007199254740991L)
            .build()
    }

    @Test
    fun body() {
        val params =
            UploadGenerateTokenParams.builder()
                .fileName("file_name")
                .allowOverride(
                    UploadGenerateTokenParams.AllowOverride.builder()
                        .folder(true)
                        .tags(true)
                        .build()
                )
                .customId("custom_id")
                .folder("folder")
                .maxFileSize(-9007199254740991L)
                .metadata(
                    UploadGenerateTokenParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .randomPrefix(true)
                .addTag("string")
                .ttlSeconds(-9007199254740991L)
                .build()

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("file_name")
        assertThat(body.allowOverride())
            .contains(
                UploadGenerateTokenParams.AllowOverride.builder().folder(true).tags(true).build()
            )
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.folder()).contains("folder")
        assertThat(body.maxFileSize()).contains(-9007199254740991L)
        assertThat(body.metadata())
            .contains(
                UploadGenerateTokenParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.randomPrefix()).contains(true)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.ttlSeconds()).contains(-9007199254740991L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UploadGenerateTokenParams.builder().fileName("file_name").build()

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("file_name")
    }
}
