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
                .expireAt(1704067200L)
                .minPartSize(5242880L)
                .partSize(5242880L)
                .addPart("https://s3.amazonaws.com/bucket/part1?signed=true")
                .policy(
                    MultipartUploadStartResponse.Policy.builder()
                        .folder("/uploads")
                        .format("jpg")
                        .size(104857600L)
                        .addTag("string")
                        .build()
                )
                .publicKey("pk_abc123")
                .sessionId("sess_abc123")
                .uuid("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                .workspaceId("ws_abc123")
                .build()

        assertThat(multipartUploadStartResponse.expireAt()).isEqualTo(1704067200L)
        assertThat(multipartUploadStartResponse.minPartSize()).isEqualTo(5242880L)
        assertThat(multipartUploadStartResponse.partSize()).isEqualTo(5242880L)
        assertThat(multipartUploadStartResponse.parts())
            .containsExactly("https://s3.amazonaws.com/bucket/part1?signed=true")
        assertThat(multipartUploadStartResponse.policy())
            .isEqualTo(
                MultipartUploadStartResponse.Policy.builder()
                    .folder("/uploads")
                    .format("jpg")
                    .size(104857600L)
                    .addTag("string")
                    .build()
            )
        assertThat(multipartUploadStartResponse.publicKey()).isEqualTo("pk_abc123")
        assertThat(multipartUploadStartResponse.sessionId()).isEqualTo("sess_abc123")
        assertThat(multipartUploadStartResponse.uuid())
            .isEqualTo("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
        assertThat(multipartUploadStartResponse.workspaceId()).isEqualTo("ws_abc123")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multipartUploadStartResponse =
            MultipartUploadStartResponse.builder()
                .expireAt(1704067200L)
                .minPartSize(5242880L)
                .partSize(5242880L)
                .addPart("https://s3.amazonaws.com/bucket/part1?signed=true")
                .policy(
                    MultipartUploadStartResponse.Policy.builder()
                        .folder("/uploads")
                        .format("jpg")
                        .size(104857600L)
                        .addTag("string")
                        .build()
                )
                .publicKey("pk_abc123")
                .sessionId("sess_abc123")
                .uuid("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                .workspaceId("ws_abc123")
                .build()

        val roundtrippedMultipartUploadStartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multipartUploadStartResponse),
                jacksonTypeRef<MultipartUploadStartResponse>(),
            )

        assertThat(roundtrippedMultipartUploadStartResponse).isEqualTo(multipartUploadStartResponse)
    }
}
