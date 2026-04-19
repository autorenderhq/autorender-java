// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import io.autorender.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileListParamsTest {

    @Test
    fun create() {
        FileListParams.builder()
            .folderNo("folderNo")
            .limit(1L)
            .name("name")
            .page(1L)
            .path("path")
            .sort(FileListParams.Sort.CREATED_AT_ASC)
            .tags("tags")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FileListParams.builder()
                .folderNo("folderNo")
                .limit(1L)
                .name("name")
                .page(1L)
                .path("path")
                .sort(FileListParams.Sort.CREATED_AT_ASC)
                .tags("tags")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("folderNo", "folderNo")
                    .put("limit", "1")
                    .put("name", "name")
                    .put("page", "1")
                    .put("path", "path")
                    .put("sort", "created_at_asc")
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
