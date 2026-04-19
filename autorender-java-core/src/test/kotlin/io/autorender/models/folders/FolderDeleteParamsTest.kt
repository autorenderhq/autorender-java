// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderDeleteParamsTest {

    @Test
    fun create() {
        FolderDeleteParams.builder().folderNo("folderNo").build()
    }

    @Test
    fun pathParams() {
        val params = FolderDeleteParams.builder().folderNo("folderNo").build()

        assertThat(params._pathParam(0)).isEqualTo("folderNo")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
