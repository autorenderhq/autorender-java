// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.multipartuploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartUploadCompleteResponseTest {

    @Test
    fun create() {
        val multipartUploadCompleteResponse =
            MultipartUploadCompleteResponse.builder()
                .id("id_abc123")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .customId(null)
                .extension("jpg")
                .fileNo("file_abc123")
                .folderNo("folder_abc123")
                .height(1080L)
                .isDuplicate(false)
                .metadata(
                    MultipartUploadCompleteResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mimeType("image/jpeg")
                .name("example.jpg")
                .path("/example.jpg")
                .size(12345L)
                .addTag("string")
                .thumbnail("https://cdn.autorender.io/thumb.jpg")
                .uploadSource("direct")
                .url("https://cdn.autorender.io/example.jpg")
                .width(1920L)
                .workspaceId("ws_abc123")
                .format("jpg")
                .hash("abc123def456")
                .isPrivate(false)
                .build()

        assertThat(multipartUploadCompleteResponse.id()).isEqualTo("id_abc123")
        assertThat(multipartUploadCompleteResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(multipartUploadCompleteResponse.customId()).isEmpty
        assertThat(multipartUploadCompleteResponse.extension()).isEqualTo("jpg")
        assertThat(multipartUploadCompleteResponse.fileNo()).isEqualTo("file_abc123")
        assertThat(multipartUploadCompleteResponse.folderNo()).contains("folder_abc123")
        assertThat(multipartUploadCompleteResponse.height()).contains(1080L)
        assertThat(multipartUploadCompleteResponse.isDuplicate()).isEqualTo(false)
        assertThat(multipartUploadCompleteResponse.metadata())
            .contains(
                MultipartUploadCompleteResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(multipartUploadCompleteResponse.mimeType()).isEqualTo("image/jpeg")
        assertThat(multipartUploadCompleteResponse.name()).isEqualTo("example.jpg")
        assertThat(multipartUploadCompleteResponse.path()).isEqualTo("/example.jpg")
        assertThat(multipartUploadCompleteResponse.size()).isEqualTo(12345L)
        assertThat(multipartUploadCompleteResponse.tags()).containsExactly("string")
        assertThat(multipartUploadCompleteResponse.thumbnail())
            .isEqualTo("https://cdn.autorender.io/thumb.jpg")
        assertThat(multipartUploadCompleteResponse.uploadSource()).isEqualTo("direct")
        assertThat(multipartUploadCompleteResponse.url())
            .isEqualTo("https://cdn.autorender.io/example.jpg")
        assertThat(multipartUploadCompleteResponse.width()).contains(1920L)
        assertThat(multipartUploadCompleteResponse.workspaceId()).isEqualTo("ws_abc123")
        assertThat(multipartUploadCompleteResponse.format()).contains("jpg")
        assertThat(multipartUploadCompleteResponse.hash()).contains("abc123def456")
        assertThat(multipartUploadCompleteResponse.isPrivate()).contains(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multipartUploadCompleteResponse =
            MultipartUploadCompleteResponse.builder()
                .id("id_abc123")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .customId(null)
                .extension("jpg")
                .fileNo("file_abc123")
                .folderNo("folder_abc123")
                .height(1080L)
                .isDuplicate(false)
                .metadata(
                    MultipartUploadCompleteResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mimeType("image/jpeg")
                .name("example.jpg")
                .path("/example.jpg")
                .size(12345L)
                .addTag("string")
                .thumbnail("https://cdn.autorender.io/thumb.jpg")
                .uploadSource("direct")
                .url("https://cdn.autorender.io/example.jpg")
                .width(1920L)
                .workspaceId("ws_abc123")
                .format("jpg")
                .hash("abc123def456")
                .isPrivate(false)
                .build()

        val roundtrippedMultipartUploadCompleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multipartUploadCompleteResponse),
                jacksonTypeRef<MultipartUploadCompleteResponse>(),
            )

        assertThat(roundtrippedMultipartUploadCompleteResponse)
            .isEqualTo(multipartUploadCompleteResponse)
    }
}
