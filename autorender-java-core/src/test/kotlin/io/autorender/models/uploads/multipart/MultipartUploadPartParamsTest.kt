// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads.multipart

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartUploadPartParamsTest {

    @Test
    fun create() {
        MultipartUploadPartParams.builder().body("Example data").build()
    }

    @Test
    fun body() {
        val params = MultipartUploadPartParams.builder().body("Example data").build()

        val body = params._body().getOrNull()

        assertThat(body).isEqualTo("Example data")
    }
}
