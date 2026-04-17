// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import io.autorender.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListParamsTest {

    @Test
    fun create() {
        FileListParams.builder()
            .folderNo("folder_no")
            .limit(0L)
            .name("name")
            .page(0L)
            .path("path")
            .sortField(FileListParams.SortField.FILE_SIZE)
            .sortOrder(FileListParams.SortOrder.ASC)
            .tags("tags")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FileListParams.builder()
                .folderNo("folder_no")
                .limit(0L)
                .name("name")
                .page(0L)
                .path("path")
                .sortField(FileListParams.SortField.FILE_SIZE)
                .sortOrder(FileListParams.SortOrder.ASC)
                .tags("tags")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("folder_no", "folder_no")
                    .put("limit", "0")
                    .put("name", "name")
                    .put("page", "0")
                    .put("path", "path")
                    .put("sort_field", "file_size")
                    .put("sort_order", "asc")
                    .put("tags", "tags")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FileListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
