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
                .id("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .folderNo("folder_abc123")
                .name("example.jpg")
                .parentFolderNo(null)
                .path("/example.jpg")
                .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .build()

        assertThat(folderRenameResponse.id()).isEqualTo("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
        assertThat(folderRenameResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
        assertThat(folderRenameResponse.folderNo()).isEqualTo("folder_abc123")
        assertThat(folderRenameResponse.name()).isEqualTo("example.jpg")
        assertThat(folderRenameResponse.parentFolderNo()).isEmpty
        assertThat(folderRenameResponse.path()).isEqualTo("/example.jpg")
        assertThat(folderRenameResponse.updatedAt())
            .contains(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderRenameResponse =
            FolderRenameResponse.builder()
                .id("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .folderNo("folder_abc123")
                .name("example.jpg")
                .parentFolderNo(null)
                .path("/example.jpg")
                .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .build()

        val roundtrippedFolderRenameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderRenameResponse),
                jacksonTypeRef<FolderRenameResponse>(),
            )

        assertThat(roundtrippedFolderRenameResponse).isEqualTo(folderRenameResponse)
    }
}
