// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderCreateParamsTest {

    @Test
    fun create() {
        FolderCreateParams.builder().name("name").parentFolderNo("parent_folder_no").build()
    }

    @Test
    fun body() {
        val params =
            FolderCreateParams.builder().name("name").parentFolderNo("parent_folder_no").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
        assertThat(body.parentFolderNo()).contains("parent_folder_no")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FolderCreateParams.builder().name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
