// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.multipartuploads

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartUploadCompleteParamsTest {

    @Test
    fun create() {
        MultipartUploadCompleteParams.builder().sessionId("x").uuid("uuid").build()
    }

    @Test
    fun body() {
        val params = MultipartUploadCompleteParams.builder().sessionId("x").uuid("uuid").build()

        val body = params._body()

        assertThat(body.sessionId()).isEqualTo("x")
        assertThat(body.uuid()).contains("uuid")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = MultipartUploadCompleteParams.builder().sessionId("x").build()

        val body = params._body()

        assertThat(body.sessionId()).isEqualTo("x")
    }
}
