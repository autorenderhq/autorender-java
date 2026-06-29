// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderListResponseTest {

    @Test
    fun create() {
        val folderListResponse =
            FolderListResponse.builder()
                .addFolder(
                    FolderListResponse.Folder.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .folderNo("folder_no")
                        .name("name")
                        .parentFolderNo("parent_folder_no")
                        .path("path")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(folderListResponse.folders())
            .containsExactly(
                FolderListResponse.Folder.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .folderNo("folder_no")
                    .name("name")
                    .parentFolderNo("parent_folder_no")
                    .path("path")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderListResponse =
            FolderListResponse.builder()
                .addFolder(
                    FolderListResponse.Folder.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .folderNo("folder_no")
                        .name("name")
                        .parentFolderNo("parent_folder_no")
                        .path("path")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedFolderListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderListResponse),
                jacksonTypeRef<FolderListResponse>(),
            )

        assertThat(roundtrippedFolderListResponse).isEqualTo(folderListResponse)
    }
}
