// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
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
                    FileListItem.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .extension("extension")
                        .fileNo("file_no")
                        .fileSize(0L)
                        .format("format")
                        .height(0L)
                        .name("name")
                        .path("path")
                        .thumbnail("thumbnail")
                        .url("https://example.com")
                        .width(0L)
                        .workspaceNo("workspace_no")
                        .build()
                )
                .meta(
                    FileListResponse.Meta.builder()
                        .hasNext(true)
                        .hasPrev(true)
                        .limit(0L)
                        .page(0L)
                        .total(0L)
                        .build()
                )
                .build()

        assertThat(fileListResponse.files())
            .containsExactly(
                FileListItem.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .extension("extension")
                    .fileNo("file_no")
                    .fileSize(0L)
                    .format("format")
                    .height(0L)
                    .name("name")
                    .path("path")
                    .thumbnail("thumbnail")
                    .url("https://example.com")
                    .width(0L)
                    .workspaceNo("workspace_no")
                    .build()
            )
        assertThat(fileListResponse.meta())
            .isEqualTo(
                FileListResponse.Meta.builder()
                    .hasNext(true)
                    .hasPrev(true)
                    .limit(0L)
                    .page(0L)
                    .total(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileListResponse =
            FileListResponse.builder()
                .addFile(
                    FileListItem.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .extension("extension")
                        .fileNo("file_no")
                        .fileSize(0L)
                        .format("format")
                        .height(0L)
                        .name("name")
                        .path("path")
                        .thumbnail("thumbnail")
                        .url("https://example.com")
                        .width(0L)
                        .workspaceNo("workspace_no")
                        .build()
                )
                .meta(
                    FileListResponse.Meta.builder()
                        .hasNext(true)
                        .hasPrev(true)
                        .limit(0L)
                        .page(0L)
                        .total(0L)
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
