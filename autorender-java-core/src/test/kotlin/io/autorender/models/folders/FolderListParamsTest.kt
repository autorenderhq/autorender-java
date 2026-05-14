// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import io.autorender.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderListParamsTest {

    @Test
    fun create() {
        FolderListParams.builder()
            .parentFolderNo("parent_folder_no")
            .search("search")
            .sort(FolderListParams.Sort.NAME_ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            FolderListParams.builder()
                .parentFolderNo("parent_folder_no")
                .search("search")
                .sort(FolderListParams.Sort.NAME_ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("parent_folder_no", "parent_folder_no")
                    .put("search", "search")
                    .put("sort", "name_asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FolderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
