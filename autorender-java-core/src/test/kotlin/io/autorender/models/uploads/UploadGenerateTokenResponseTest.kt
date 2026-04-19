// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadGenerateTokenResponseTest {

    @Test
    fun create() {
        val uploadGenerateTokenResponse =
            UploadGenerateTokenResponse.builder()
                .token("token")
                .expireAt(-9007199254740991L)
                .policy(
                    UploadGenerateTokenResponse.Policy.builder()
                        .allowOverride(
                            UploadGenerateTokenResponse.Policy.AllowOverride.builder()
                                .folder(true)
                                .tags(true)
                                .build()
                        )
                        .folder("folder")
                        .maxFileSize(-9007199254740991L)
                        .addTag("string")
                        .build()
                )
                .publicKey("public_key")
                .signature("signature")
                .workspaceId("workspace_id")
                .build()

        assertThat(uploadGenerateTokenResponse.token()).isEqualTo("token")
        assertThat(uploadGenerateTokenResponse.expireAt()).isEqualTo(-9007199254740991L)
        assertThat(uploadGenerateTokenResponse.policy())
            .isEqualTo(
                UploadGenerateTokenResponse.Policy.builder()
                    .allowOverride(
                        UploadGenerateTokenResponse.Policy.AllowOverride.builder()
                            .folder(true)
                            .tags(true)
                            .build()
                    )
                    .folder("folder")
                    .maxFileSize(-9007199254740991L)
                    .addTag("string")
                    .build()
            )
        assertThat(uploadGenerateTokenResponse.publicKey()).isEqualTo("public_key")
        assertThat(uploadGenerateTokenResponse.signature()).isEqualTo("signature")
        assertThat(uploadGenerateTokenResponse.workspaceId()).isEqualTo("workspace_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadGenerateTokenResponse =
            UploadGenerateTokenResponse.builder()
                .token("token")
                .expireAt(-9007199254740991L)
                .policy(
                    UploadGenerateTokenResponse.Policy.builder()
                        .allowOverride(
                            UploadGenerateTokenResponse.Policy.AllowOverride.builder()
                                .folder(true)
                                .tags(true)
                                .build()
                        )
                        .folder("folder")
                        .maxFileSize(-9007199254740991L)
                        .addTag("string")
                        .build()
                )
                .publicKey("public_key")
                .signature("signature")
                .workspaceId("workspace_id")
                .build()

        val roundtrippedUploadGenerateTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadGenerateTokenResponse),
                jacksonTypeRef<UploadGenerateTokenResponse>(),
            )

        assertThat(roundtrippedUploadGenerateTokenResponse).isEqualTo(uploadGenerateTokenResponse)
    }
}
