// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileDeleteParamsTest {

    @Test
    fun create() {
        FileDeleteParams.builder().fileNo("2338056701").build()
    }

    @Test
    fun pathParams() {
        val params = FileDeleteParams.builder().fileNo("2338056701").build()

        assertThat(params._pathParam(0)).isEqualTo("2338056701")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
