// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads.multipart

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartCompleteParamsTest {

    @Test
    fun create() {
        MultipartCompleteParams.builder().sessionId("session_id").build()
    }

    @Test
    fun body() {
        val params = MultipartCompleteParams.builder().sessionId("session_id").build()

        val body = params._body()

        assertThat(body.sessionId()).isEqualTo("session_id")
    }
}
