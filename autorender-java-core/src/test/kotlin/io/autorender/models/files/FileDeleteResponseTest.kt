// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileDeleteResponseTest {

    @Test
    fun create() {
        val fileDeleteResponse =
            FileDeleteResponse.builder().message("file deleted successfully").build()

        assertThat(fileDeleteResponse.message()).contains("file deleted successfully")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileDeleteResponse =
            FileDeleteResponse.builder().message("file deleted successfully").build()

        val roundtrippedFileDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileDeleteResponse),
                jacksonTypeRef<FileDeleteResponse>(),
            )

        assertThat(roundtrippedFileDeleteResponse).isEqualTo(fileDeleteResponse)
    }
}
