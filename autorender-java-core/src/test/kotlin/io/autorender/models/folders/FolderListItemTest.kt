// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderListItemTest {

    @Test
    fun create() {
        val folderListItem =
            FolderListItem.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .folderNo("folder_no")
                .name("name")
                .totalItems(0L)
                .totalSize(0L)
                .build()

        assertThat(folderListItem.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(folderListItem.folderNo()).contains("folder_no")
        assertThat(folderListItem.name()).contains("name")
        assertThat(folderListItem.totalItems()).contains(0L)
        assertThat(folderListItem.totalSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderListItem =
            FolderListItem.builder()
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .folderNo("folder_no")
                .name("name")
                .totalItems(0L)
                .totalSize(0L)
                .build()

        val roundtrippedFolderListItem =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderListItem),
                jacksonTypeRef<FolderListItem>(),
            )

        assertThat(roundtrippedFolderListItem).isEqualTo(folderListItem)
    }
}
