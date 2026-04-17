// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderCreateParamsTest {

    @Test
    fun create() {
        FolderCreateParams.builder().name("demo2").parentFolderNo("sD1LvqoDzG").build()
    }

    @Test
    fun body() {
        val params = FolderCreateParams.builder().name("demo2").parentFolderNo("sD1LvqoDzG").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("demo2")
        assertThat(body.parentFolderNo()).contains("sD1LvqoDzG")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FolderCreateParams.builder().name("demo2").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("demo2")
    }
}
