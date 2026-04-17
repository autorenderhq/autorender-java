// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListItemTest {

    @Test
    fun create() {
        val fileListItem =
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

        assertThat(fileListItem.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileListItem.extension()).contains("extension")
        assertThat(fileListItem.fileNo()).contains("file_no")
        assertThat(fileListItem.fileSize()).contains(0L)
        assertThat(fileListItem.format()).contains("format")
        assertThat(fileListItem.height()).contains(0L)
        assertThat(fileListItem.name()).contains("name")
        assertThat(fileListItem.path()).contains("path")
        assertThat(fileListItem.thumbnail()).contains("thumbnail")
        assertThat(fileListItem.url()).contains("https://example.com")
        assertThat(fileListItem.width()).contains(0L)
        assertThat(fileListItem.workspaceNo()).contains("workspace_no")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileListItem =
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

        val roundtrippedFileListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileListItem),
                jacksonTypeRef<FileListItem>(),
            )

        assertThat(roundtrippedFileListItem).isEqualTo(fileListItem)
    }
}
