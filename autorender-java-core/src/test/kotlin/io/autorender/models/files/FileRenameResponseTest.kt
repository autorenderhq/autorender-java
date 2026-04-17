// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRenameResponseTest {

    @Test
    fun create() {
        val fileRenameResponse =
            FileRenameResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extension("extension")
                .fileNo("file_no")
                .fileSize(0L)
                .folderId("folder_id")
                .format("format")
                .height(0L)
                .isActive(true)
                .isDefault(true)
                .isDelete(true)
                .metaData(
                    FileRenameResponse.MetaData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .orientation("orientation")
                .originalUrl("original_url")
                .path("path")
                .source("source")
                .transformString("transform_string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .width(0L)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workspaceNo("workspace_no")
                .build()

        assertThat(fileRenameResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(fileRenameResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileRenameResponse.createdBy()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(fileRenameResponse.extension()).contains("extension")
        assertThat(fileRenameResponse.fileNo()).contains("file_no")
        assertThat(fileRenameResponse.fileSize()).contains(0L)
        assertThat(fileRenameResponse.folderId()).contains("folder_id")
        assertThat(fileRenameResponse.format()).contains("format")
        assertThat(fileRenameResponse.height()).contains(0L)
        assertThat(fileRenameResponse.isActive()).contains(true)
        assertThat(fileRenameResponse.isDefault()).contains(true)
        assertThat(fileRenameResponse.isDelete()).contains(true)
        assertThat(fileRenameResponse.metaData())
            .contains(
                FileRenameResponse.MetaData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(fileRenameResponse.name()).contains("name")
        assertThat(fileRenameResponse.orientation()).contains("orientation")
        assertThat(fileRenameResponse.originalUrl()).contains("original_url")
        assertThat(fileRenameResponse.path()).contains("path")
        assertThat(fileRenameResponse.source()).contains("source")
        assertThat(fileRenameResponse.transformString()).contains("transform_string")
        assertThat(fileRenameResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileRenameResponse.url()).contains("url")
        assertThat(fileRenameResponse.width()).contains(0L)
        assertThat(fileRenameResponse.workspaceId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(fileRenameResponse.workspaceNo()).contains("workspace_no")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileRenameResponse =
            FileRenameResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdBy("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .extension("extension")
                .fileNo("file_no")
                .fileSize(0L)
                .folderId("folder_id")
                .format("format")
                .height(0L)
                .isActive(true)
                .isDefault(true)
                .isDelete(true)
                .metaData(
                    FileRenameResponse.MetaData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .orientation("orientation")
                .originalUrl("original_url")
                .path("path")
                .source("source")
                .transformString("transform_string")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .width(0L)
                .workspaceId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .workspaceNo("workspace_no")
                .build()

        val roundtrippedFileRenameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileRenameResponse),
                jacksonTypeRef<FileRenameResponse>(),
            )

        assertThat(roundtrippedFileRenameResponse).isEqualTo(fileRenameResponse)
    }
}
