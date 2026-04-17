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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("avatar.jpg")
        assertThat(body.allowOverride())
            .contains(
                UploadGenerateTokenParams.AllowOverride.builder()
                    .folder(true)
                    .tags(true)
                    .transform(true)
                    .build()
            )
        assertThat(body.customId()).contains("custom_id")
        assertThat(body.folder()).contains("user-uploads/avatars")
        assertThat(body.maxFileSize()).contains(5242880L)
        assertThat(body.metadata())
            .contains(
                UploadGenerateTokenParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.randomPrefix()).contains(true)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.transform()).contains("w_400,h_400,fit_cover")
        assertThat(body.ttlSeconds()).contains(900L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = UploadGenerateTokenParams.builder().fileName("avatar.jpg").build()

        val body = params._body()

        assertThat(body.fileName()).isEqualTo("avatar.jpg")
    }
}
