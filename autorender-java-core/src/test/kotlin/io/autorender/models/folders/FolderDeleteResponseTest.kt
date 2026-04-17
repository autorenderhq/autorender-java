// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FolderDeleteResponseTest {

    @Test
    fun create() {
        val folderDeleteResponse = FolderDeleteResponse.builder().message("folder deleted").build()

        assertThat(folderDeleteResponse.message()).contains("folder deleted")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val folderDeleteResponse = FolderDeleteResponse.builder().message("folder deleted").build()

        val roundtrippedFolderDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(folderDeleteResponse),
                jacksonTypeRef<FolderDeleteResponse>(),
            )

        assertThat(roundtrippedFolderDeleteResponse).isEqualTo(folderDeleteResponse)
    }
}
