// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRetrieveParamsTest {

    @Test
    fun create() {
        FileRetrieveParams.builder().fileNo("2353377462").build()
    }

    @Test
    fun pathParams() {
        val params = FileRetrieveParams.builder().fileNo("2353377462").build()

        assertThat(params._pathParam(0)).isEqualTo("2353377462")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
