// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import io.autorender.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderListParamsTest {

    @Test
    fun create() {
        FolderListParams.builder().parentFolderNo("sD1LvqoDzG").build()
    }

    @Test
    fun queryParams() {
        val params = FolderListParams.builder().parentFolderNo("sD1LvqoDzG").build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("parent_folder_no", "sD1LvqoDzG").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = FolderListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
