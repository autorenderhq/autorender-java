// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListResponseTest {

    @Test
    fun create() {
        val fileListResponse =
            FileListResponse.builder()
                .addFile(
                    FileListResponse.File.builder()
                        .id("id_abc123")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .fileNo("file_abc123")
                        .folderName(null)
                        .folderNo(null)
                        .format("jpg")
                        .height(1080L)
                        .metadata(
                            FileListResponse.File.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .mimeType("image/jpeg")
                        .name("example.jpg")
                        .path("/example.jpg")
                        .size(12345L)
                        .source("direct")
                        .addTag("string")
                        .updatedAt(null)
                        .url("https://cdn.autorender.io/example.jpg")
                        .width(1920L)
                        .build()
                )
                .meta(
                    FileListResponse.Meta.builder()
                        .hasNext(false)
                        .hasPrev(false)
                        .limit(20L)
                        .page(1L)
                        .total(100L)
                        .build()
                )
                .build()

        assertThat(fileListResponse.files())
            .containsExactly(
                FileListResponse.File.builder()
                    .id("id_abc123")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .fileNo("file_abc123")
                    .folderName(null)
                    .folderNo(null)
                    .format("jpg")
                    .height(1080L)
                    .metadata(
                        FileListResponse.File.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .mimeType("image/jpeg")
                    .name("example.jpg")
                    .path("/example.jpg")
                    .size(12345L)
                    .source("direct")
                    .addTag("string")
                    .updatedAt(null)
                    .url("https://cdn.autorender.io/example.jpg")
                    .width(1920L)
                    .build()
            )
        assertThat(fileListResponse.meta())
            .isEqualTo(
                FileListResponse.Meta.builder()
                    .hasNext(false)
                    .hasPrev(false)
                    .limit(20L)
                    .page(1L)
                    .total(100L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileListResponse =
            FileListResponse.builder()
                .addFile(
                    FileListResponse.File.builder()
                        .id("id_abc123")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .fileNo("file_abc123")
                        .folderName(null)
                        .folderNo(null)
                        .format("jpg")
                        .height(1080L)
                        .metadata(
                            FileListResponse.File.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .mimeType("image/jpeg")
                        .name("example.jpg")
                        .path("/example.jpg")
                        .size(12345L)
                        .source("direct")
                        .addTag("string")
                        .updatedAt(null)
                        .url("https://cdn.autorender.io/example.jpg")
                        .width(1920L)
                        .build()
                )
                .meta(
                    FileListResponse.Meta.builder()
                        .hasNext(false)
                        .hasPrev(false)
                        .limit(20L)
                        .page(1L)
                        .total(100L)
                        .build()
                )
                .build()

        val roundtrippedFileListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileListResponse),
                jacksonTypeRef<FileListResponse>(),
            )

        assertThat(roundtrippedFileListResponse).isEqualTo(fileListResponse)
    }
}
