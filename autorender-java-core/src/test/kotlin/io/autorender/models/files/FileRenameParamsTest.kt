// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRenameParamsTest {

    @Test
    fun create() {
        FileRenameParams.builder().fileNo("2338045312").name("demo").build()
    }

    @Test
    fun pathParams() {
        val params = FileRenameParams.builder().fileNo("2338045312").name("demo").build()

        assertThat(params._pathParam(0)).isEqualTo("2338045312")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params = FileRenameParams.builder().fileNo("2338045312").name("demo").build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("demo")
    }
}
