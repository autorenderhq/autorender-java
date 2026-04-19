// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderRenameResponseTest {

    @Test
    fun create() {
        val folderRenameResponse =
            FolderRenameResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .folderNo("folder_no")
                .name("name")
                .parentFolderNo("parent_folder_no")
                .path("path")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(folderRenameResponse.id()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(folderRenameResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(folderRenameResponse.folderNo()).isEqualTo("folder_no")
        assertThat(folderRenameResponse.name()).isEqualTo("name")
        assertThat(folderRenameResponse.parentFolderNo()).contains("parent_folder_no")
        assertThat(folderRenameResponse.path()).isEqualTo("path")
        assertThat(folderRenameResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderRenameResponse =
            FolderRenameResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .folderNo("folder_no")
                .name("name")
                .parentFolderNo("parent_folder_no")
                .path("path")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedFolderRenameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderRenameResponse),
                jacksonTypeRef<FolderRenameResponse>(),
            )

        assertThat(roundtrippedFolderRenameResponse).isEqualTo(folderRenameResponse)
    }
}
