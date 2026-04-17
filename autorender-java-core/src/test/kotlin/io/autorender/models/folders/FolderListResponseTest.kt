// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderListResponseTest {

    @Test
    fun create() {
        val folderListResponse =
            FolderListResponse.builder()
                .addFolder(
                    FolderListItem.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .folderNo("folder_no")
                        .name("name")
                        .totalItems(0L)
                        .totalSize(0L)
                        .build()
                )
                .build()

        assertThat(folderListResponse.folders().getOrNull())
            .containsExactly(
                FolderListItem.builder()
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .folderNo("folder_no")
                    .name("name")
                    .totalItems(0L)
                    .totalSize(0L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderListResponse =
            FolderListResponse.builder()
                .addFolder(
                    FolderListItem.builder()
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .folderNo("folder_no")
                        .name("name")
                        .totalItems(0L)
                        .totalSize(0L)
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
