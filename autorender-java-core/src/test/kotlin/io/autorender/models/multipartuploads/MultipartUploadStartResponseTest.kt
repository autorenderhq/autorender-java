// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.multipartuploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartUploadStartResponseTest {

    @Test
    fun create() {
        val multipartUploadStartResponse =
            MultipartUploadStartResponse.builder()
                .expireAt(-9007199254740991L)
                .minPartSize(-9007199254740991L)
                .partSize(-9007199254740991L)
                .addPart("string")
                .policy(
                    MultipartUploadStartResponse.Policy.builder()
                        .folder("folder")
                        .format("format")
                        .size(-9007199254740991L)
                        .addTag("string")
                        .build()
                )
                .publicKey("public_key")
                .sessionId("session_id")
                .uuid("uuid")
                .workspaceId("workspace_id")
                .build()

        assertThat(multipartUploadStartResponse.expireAt()).isEqualTo(-9007199254740991L)
        assertThat(multipartUploadStartResponse.minPartSize()).isEqualTo(-9007199254740991L)
        assertThat(multipartUploadStartResponse.partSize()).isEqualTo(-9007199254740991L)
        assertThat(multipartUploadStartResponse.parts()).containsExactly("string")
        assertThat(multipartUploadStartResponse.policy())
            .isEqualTo(
                MultipartUploadStartResponse.Policy.builder()
                    .folder("folder")
                    .format("format")
                    .size(-9007199254740991L)
                    .addTag("string")
                    .build()
            )
        assertThat(multipartUploadStartResponse.publicKey()).isEqualTo("public_key")
        assertThat(multipartUploadStartResponse.sessionId()).isEqualTo("session_id")
        assertThat(multipartUploadStartResponse.uuid()).isEqualTo("uuid")
        assertThat(multipartUploadStartResponse.workspaceId()).isEqualTo("workspace_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multipartUploadStartResponse =
            MultipartUploadStartResponse.builder()
                .expireAt(-9007199254740991L)
                .minPartSize(-9007199254740991L)
                .partSize(-9007199254740991L)
                .addPart("string")
                .policy(
                    MultipartUploadStartResponse.Policy.builder()
                        .folder("folder")
                        .format("format")
                        .size(-9007199254740991L)
                        .addTag("string")
                        .build()
                )
                .publicKey("public_key")
                .sessionId("session_id")
                .uuid("uuid")
                .workspaceId("workspace_id")
                .build()

        val roundtrippedMultipartUploadStartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multipartUploadStartResponse),
                jacksonTypeRef<MultipartUploadStartResponse>(),
            )

        assertThat(roundtrippedMultipartUploadStartResponse).isEqualTo(multipartUploadStartResponse)
    }
}
