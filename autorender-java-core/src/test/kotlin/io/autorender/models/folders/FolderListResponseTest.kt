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
                        .id("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .folderNo("folder_abc123")
                        .name("My Folder")
                        .parentFolderNo(null)
                        .path("/My Folder")
                        .updatedAt(null)
                        .build()
                )
                .build()

        assertThat(folderListResponse.folders())
            .containsExactly(
                FolderListResponse.Folder.builder()
                    .id("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .folderNo("folder_abc123")
                    .name("My Folder")
                    .parentFolderNo(null)
                    .path("/My Folder")
                    .updatedAt(null)
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
                        .id("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .folderNo("folder_abc123")
                        .name("My Folder")
                        .parentFolderNo(null)
                        .path("/My Folder")
                        .updatedAt(null)
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
