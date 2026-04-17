// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadDataTest {

    @Test
    fun create() {
        val uploadData =
            UploadData.builder()
                .id("id")
                .fileNo("file_no")
                .fileSize(0L)
                .format("format")
                .height(0L)
                .name("name")
                .path("path")
                .url("url")
                .width(0L)
                .workspaceNo("workspace_no")
                .build()

        assertThat(uploadData.id()).contains("id")
        assertThat(uploadData.fileNo()).contains("file_no")
        assertThat(uploadData.fileSize()).contains(0L)
        assertThat(uploadData.format()).contains("format")
        assertThat(uploadData.height()).contains(0L)
        assertThat(uploadData.name()).contains("name")
        assertThat(uploadData.path()).contains("path")
        assertThat(uploadData.url()).contains("url")
        assertThat(uploadData.width()).contains(0L)
        assertThat(uploadData.workspaceNo()).contains("workspace_no")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadData =
            UploadData.builder()
                .id("id")
                .fileNo("file_no")
                .fileSize(0L)
                .format("format")
                .height(0L)
                .name("name")
                .path("path")
                .url("url")
                .width(0L)
                .workspaceNo("workspace_no")
                .build()

        val roundtrippedUploadData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadData),
                jacksonTypeRef<UploadData>(),
            )

        assertThat(roundtrippedUploadData).isEqualTo(uploadData)
    }
}
