// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads.multipart

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionTest {

    @Test
    fun create() {
        val session =
            Session.builder()
                .partSize(0L)
                .addPart("https://example.com")
                .sessionId("session_id")
                .build()

        assertThat(session.partSize()).contains(0L)
        assertThat(session.parts().getOrNull()).containsExactly("https://example.com")
        assertThat(session.sessionId()).contains("session_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val session =
            Session.builder()
                .partSize(0L)
                .addPart("https://example.com")
                .sessionId("session_id")
                .build()

        val roundtrippedSession =
            jsonMapper.readValue(jsonMapper.writeValueAsString(session), jacksonTypeRef<Session>())

        assertThat(roundtrippedSession).isEqualTo(session)
    }
}
