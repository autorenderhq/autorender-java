// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileObjectTest {

    @Test
    fun create() {
        val fileObject =
            FileObject.builder()
                .data(
                    FileObject.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .assetKey("asset_key")
                        .assetUrl("asset_url")
                        .dimensions(
                            FileObject.Data.Dimensions.builder().height(0L).width(0L).build()
                        )
                        .extension("extension")
                        .fileNo("file_no")
                        .folder(JsonValue.from(mapOf<String, Any>()))
                        .format("format")
                        .name("name")
                        .path("path")
                        .size(0L)
                        .uploadedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .uploadedBy("uploaded_by")
                        .url("url")
                        .workspace(
                            FileObject.Data.Workspace.builder()
                                .name("name")
                                .workspaceNo("workspace_no")
                                .build()
                        )
                        .build()
                )
                .success(true)
                .build()

        assertThat(fileObject.data())
            .contains(
                FileObject.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .assetKey("asset_key")
                    .assetUrl("asset_url")
                    .dimensions(FileObject.Data.Dimensions.builder().height(0L).width(0L).build())
                    .extension("extension")
                    .fileNo("file_no")
                    .folder(JsonValue.from(mapOf<String, Any>()))
                    .format("format")
                    .name("name")
                    .path("path")
                    .size(0L)
                    .uploadedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .uploadedBy("uploaded_by")
                    .url("url")
                    .workspace(
                        FileObject.Data.Workspace.builder()
                            .name("name")
                            .workspaceNo("workspace_no")
                            .build()
                    )
                    .build()
            )
        assertThat(fileObject.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileObject =
            FileObject.builder()
                .data(
                    FileObject.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .assetKey("asset_key")
                        .assetUrl("asset_url")
                        .dimensions(
                            FileObject.Data.Dimensions.builder().height(0L).width(0L).build()
                        )
                        .extension("extension")
                        .fileNo("file_no")
                        .folder(JsonValue.from(mapOf<String, Any>()))
                        .format("format")
                        .name("name")
                        .path("path")
                        .size(0L)
                        .uploadedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .uploadedBy("uploaded_by")
                        .url("url")
                        .workspace(
                            FileObject.Data.Workspace.builder()
                                .name("name")
                                .workspaceNo("workspace_no")
                                .build()
                        )
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedFileObject =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileObject),
                jacksonTypeRef<FileObject>(),
            )

        assertThat(roundtrippedFileObject).isEqualTo(fileObject)
    }
}
