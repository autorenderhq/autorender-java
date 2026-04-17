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
                .token("up_tok_01JHD8X4BX3HQM8NFMD9ZCQ9QN")
                .expireAt(0L)
                .policy(
                    UploadGenerateTokenResponse.Policy.builder()
                        .allowOverride(
                            UploadGenerateTokenResponse.Policy.AllowOverride.builder()
                                .folder(true)
                                .tags(true)
                                .transform(true)
                                .build()
                        )
                        .folder("folder")
                        .maxFileSize(0L)
                        .addTag("string")
                        .transform("transform")
                        .build()
                )
                .publicKey("public_key")
                .signature("signature")
                .workspaceId("workspace_id")
                .build()

        assertThat(uploadGenerateTokenResponse.token())
            .contains("up_tok_01JHD8X4BX3HQM8NFMD9ZCQ9QN")
        assertThat(uploadGenerateTokenResponse.expireAt()).contains(0L)
        assertThat(uploadGenerateTokenResponse.policy())
            .contains(
                UploadGenerateTokenResponse.Policy.builder()
                    .allowOverride(
                        UploadGenerateTokenResponse.Policy.AllowOverride.builder()
                            .folder(true)
                            .tags(true)
                            .transform(true)
                            .build()
                    )
                    .folder("folder")
                    .maxFileSize(0L)
                    .addTag("string")
                    .transform("transform")
                    .build()
            )
        assertThat(uploadGenerateTokenResponse.publicKey()).contains("public_key")
        assertThat(uploadGenerateTokenResponse.signature()).contains("signature")
        assertThat(uploadGenerateTokenResponse.workspaceId()).contains("workspace_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadGenerateTokenResponse =
            UploadGenerateTokenResponse.builder()
                .token("up_tok_01JHD8X4BX3HQM8NFMD9ZCQ9QN")
                .expireAt(0L)
                .policy(
                    UploadGenerateTokenResponse.Policy.builder()
                        .allowOverride(
                            UploadGenerateTokenResponse.Policy.AllowOverride.builder()
                                .folder(true)
                                .tags(true)
                                .transform(true)
                                .build()
                        )
                        .folder("folder")
                        .maxFileSize(0L)
                        .addTag("string")
                        .transform("transform")
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
