// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUpdateResponseTest {

    @Test
    fun create() {
        val fileUpdateResponse =
            FileUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extension("extension")
                .fileNo("file_no")
                .fileSize(0L)
                .folderId("folder_id")
                .format("format")
                .height(0L)
                .metaData(
                    FileUpdateResponse.MetaData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .path("path")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .width(0L)
                .workspaceNo("workspace_no")
                .build()

        assertThat(fileUpdateResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(fileUpdateResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileUpdateResponse.extension()).contains("extension")
        assertThat(fileUpdateResponse.fileNo()).contains("file_no")
        assertThat(fileUpdateResponse.fileSize()).contains(0L)
        assertThat(fileUpdateResponse.folderId()).contains("folder_id")
        assertThat(fileUpdateResponse.format()).contains("format")
        assertThat(fileUpdateResponse.height()).contains(0L)
        assertThat(fileUpdateResponse.metaData())
            .contains(
                FileUpdateResponse.MetaData.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(fileUpdateResponse.name()).contains("name")
        assertThat(fileUpdateResponse.path()).contains("path")
        assertThat(fileUpdateResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(fileUpdateResponse.url()).contains("url")
        assertThat(fileUpdateResponse.width()).contains(0L)
        assertThat(fileUpdateResponse.workspaceNo()).contains("workspace_no")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileUpdateResponse =
            FileUpdateResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .extension("extension")
                .fileNo("file_no")
                .fileSize(0L)
                .folderId("folder_id")
                .format("format")
                .height(0L)
                .metaData(
                    FileUpdateResponse.MetaData.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .name("name")
                .path("path")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .url("url")
                .width(0L)
                .workspaceNo("workspace_no")
                .build()

        val roundtrippedFileUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileUpdateResponse),
                jacksonTypeRef<FileUpdateResponse>(),
            )

        assertThat(roundtrippedFileUpdateResponse).isEqualTo(fileUpdateResponse)
    }
}
