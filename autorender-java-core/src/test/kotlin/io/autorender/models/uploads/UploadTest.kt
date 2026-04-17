// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadTest {

    @Test
    fun create() {
        val upload =
            Upload.builder()
                .data(
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
                )
                .success(true)
                .build()

        assertThat(upload.data())
            .isEqualTo(
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
            )
        assertThat(upload.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val upload =
            Upload.builder()
                .data(
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
                )
                .success(true)
                .build()

        val roundtrippedUpload =
            jsonMapper.readValue(jsonMapper.writeValueAsString(upload), jacksonTypeRef<Upload>())

        assertThat(roundtrippedUpload).isEqualTo(upload)
    }
}
