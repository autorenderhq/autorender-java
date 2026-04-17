// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateWithTokenParamsTest {

    @Test
    fun create() {
        UploadCreateWithTokenParams.builder()
            .token("up_tok_01JHD8X4BX3HQM8NFMD9ZCQ9QN")
            .body("Example data")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            UploadCreateWithTokenParams.builder()
                .token("up_tok_01JHD8X4BX3HQM8NFMD9ZCQ9QN")
                .body("Example data")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("up_tok_01JHD8X4BX3HQM8NFMD9ZCQ9QN")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UploadCreateWithTokenParams.builder()
                .token("up_tok_01JHD8X4BX3HQM8NFMD9ZCQ9QN")
                .body("Example data")
                .build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("Example data")
    }
}
