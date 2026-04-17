// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRenameParamsTest {

    @Test
    fun create() {
        FileRenameParams.builder().fileNo("2353377462").name("name").build()
    }

    @Test
    fun pathParams() {
        val params = FileRenameParams.builder().fileNo("2353377462").name("name").build()

        assertThat(params._pathParam(0)).isEqualTo("2353377462")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = FileRenameParams.builder().fileNo("2353377462").name("name").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("name")
    }
}
