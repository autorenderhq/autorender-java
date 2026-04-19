// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderCreateParamsTest {

    @Test
    fun create() {
        FolderCreateParams.builder().folderName("folder_name").path("path").build()
    }

    @Test
    fun body() {
        val params = FolderCreateParams.builder().folderName("folder_name").path("path").build()

        val body = params._body()

        assertThat(body.folderName()).isEqualTo("folder_name")
        assertThat(body.path()).contains("path")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FolderCreateParams.builder().folderName("folder_name").build()

        val body = params._body()

        assertThat(body.folderName()).isEqualTo("folder_name")
    }
}
