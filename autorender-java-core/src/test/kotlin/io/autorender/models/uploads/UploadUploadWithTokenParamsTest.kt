// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadUploadWithTokenParamsTest {

    @Test
    fun create() {
        UploadUploadWithTokenParams.builder().token("token").body("Example data").build()
    }

    @Test
    fun pathParams() {
        val params =
            UploadUploadWithTokenParams.builder().token("token").body("Example data").build()

        assertThat(params._pathParam(0)).isEqualTo("token")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            UploadUploadWithTokenParams.builder().token("token").body("Example data").build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("Example data")
    }
}
