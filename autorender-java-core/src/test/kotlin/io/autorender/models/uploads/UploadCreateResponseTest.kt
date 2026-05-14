// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateResponseTest {

    @Test
    fun create() {
        val uploadCreateResponse =
            UploadCreateResponse.builder()
                .id("id_abc123")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .customId(null)
                .extension("jpg")
                .fileNo("file_abc123")
                .folderNo("folder_abc123")
                .height(1080L)
                .isDuplicate(false)
                .metadata(
                    UploadCreateResponse.Metadata.builder()
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

        assertThat(uploadCreateResponse.id()).isEqualTo("id_abc123")
        assertThat(uploadCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(uploadCreateResponse.customId()).isEmpty
        assertThat(uploadCreateResponse.extension()).isEqualTo("jpg")
        assertThat(uploadCreateResponse.fileNo()).isEqualTo("file_abc123")
        assertThat(uploadCreateResponse.folderNo()).contains("folder_abc123")
        assertThat(uploadCreateResponse.height()).contains(1080L)
        assertThat(uploadCreateResponse.isDuplicate()).isEqualTo(false)
        assertThat(uploadCreateResponse.metadata())
            .contains(
                UploadCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(uploadCreateResponse.mimeType()).isEqualTo("image/jpeg")
        assertThat(uploadCreateResponse.name()).isEqualTo("example.jpg")
        assertThat(uploadCreateResponse.path()).isEqualTo("/example.jpg")
        assertThat(uploadCreateResponse.size()).isEqualTo(12345L)
        assertThat(uploadCreateResponse.tags()).containsExactly("string")
        assertThat(uploadCreateResponse.thumbnail())
            .isEqualTo("https://cdn.autorender.io/thumb.jpg")
        assertThat(uploadCreateResponse.uploadSource()).isEqualTo("direct")
        assertThat(uploadCreateResponse.url()).isEqualTo("https://cdn.autorender.io/example.jpg")
        assertThat(uploadCreateResponse.width()).contains(1920L)
        assertThat(uploadCreateResponse.workspaceId()).isEqualTo("ws_abc123")
        assertThat(uploadCreateResponse.format()).contains("jpg")
        assertThat(uploadCreateResponse.hash()).contains("abc123def456")
        assertThat(uploadCreateResponse.isPrivate()).contains(false)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadCreateResponse =
            UploadCreateResponse.builder()
                .id("id_abc123")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .customId(null)
                .extension("jpg")
                .fileNo("file_abc123")
                .folderNo("folder_abc123")
                .height(1080L)
                .isDuplicate(false)
                .metadata(
                    UploadCreateResponse.Metadata.builder()
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

        val roundtrippedUploadCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadCreateResponse),
                jacksonTypeRef<UploadCreateResponse>(),
            )

        assertThat(roundtrippedUploadCreateResponse).isEqualTo(uploadCreateResponse)
    }
}
