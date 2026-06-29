// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateResponseTest {

    @Test
    fun create() {
        val uploadCreateResponse =
            UploadCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .extension("extension")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .metadata(
                    UploadCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mimeType("mime_type")
                .name("name")
                .path("path")
                .size(-9007199254740991L)
                .addTag("string")
                .thumbnail("thumbnail")
                .uploadSource("upload_source")
                .url("url")
                .width(-9007199254740991L)
                .workspaceId("workspace_id")
                .format("format")
                .hash("hash")
                .isPrivate(true)
                .build()

        assertThat(uploadCreateResponse.id()).isEqualTo("id")
        assertThat(uploadCreateResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(uploadCreateResponse.customId()).contains("custom_id")
        assertThat(uploadCreateResponse.extension()).isEqualTo("extension")
        assertThat(uploadCreateResponse.fileNo()).isEqualTo("file_no")
        assertThat(uploadCreateResponse.folderNo()).contains("folder_no")
        assertThat(uploadCreateResponse.height()).contains(-9007199254740991L)
        assertThat(uploadCreateResponse.isDuplicate()).isEqualTo(true)
        assertThat(uploadCreateResponse.metadata())
            .contains(
                UploadCreateResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(uploadCreateResponse.mimeType()).isEqualTo("mime_type")
        assertThat(uploadCreateResponse.name()).isEqualTo("name")
        assertThat(uploadCreateResponse.path()).isEqualTo("path")
        assertThat(uploadCreateResponse.size()).isEqualTo(-9007199254740991L)
        assertThat(uploadCreateResponse.tags()).containsExactly("string")
        assertThat(uploadCreateResponse.thumbnail()).isEqualTo("thumbnail")
        assertThat(uploadCreateResponse.uploadSource()).isEqualTo("upload_source")
        assertThat(uploadCreateResponse.url()).isEqualTo("url")
        assertThat(uploadCreateResponse.width()).contains(-9007199254740991L)
        assertThat(uploadCreateResponse.workspaceId()).isEqualTo("workspace_id")
        assertThat(uploadCreateResponse.format()).contains("format")
        assertThat(uploadCreateResponse.hash()).contains("hash")
        assertThat(uploadCreateResponse.isPrivate()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadCreateResponse =
            UploadCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .extension("extension")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .metadata(
                    UploadCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mimeType("mime_type")
                .name("name")
                .path("path")
                .size(-9007199254740991L)
                .addTag("string")
                .thumbnail("thumbnail")
                .uploadSource("upload_source")
                .url("url")
                .width(-9007199254740991L)
                .workspaceId("workspace_id")
                .format("format")
                .hash("hash")
                .isPrivate(true)
                .build()

        val roundtrippedUploadCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadCreateResponse),
                jacksonTypeRef<UploadCreateResponse>(),
            )

        assertThat(roundtrippedUploadCreateResponse).isEqualTo(uploadCreateResponse)
    }
}
