// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderRenameParamsTest {

    @Test
    fun create() {
        FolderRenameParams.builder().folderNo("folderNo").name("name").build()
    }

    @Test
    fun pathParams() {
        val params = FolderRenameParams.builder().folderNo("folderNo").name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("folderNo")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = FolderRenameParams.builder().folderNo("folderNo").name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
