// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateFromUrlResponseTest {

    @Test
    fun create() {
        val uploadCreateFromUrlResponse =
            UploadCreateFromUrlResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .extension("extension")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .metadata(
                    UploadCreateFromUrlResponse.Metadata.builder()
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

        assertThat(uploadCreateFromUrlResponse.id()).isEqualTo("id")
        assertThat(uploadCreateFromUrlResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(uploadCreateFromUrlResponse.customId()).contains("custom_id")
        assertThat(uploadCreateFromUrlResponse.extension()).isEqualTo("extension")
        assertThat(uploadCreateFromUrlResponse.fileNo()).isEqualTo("file_no")
        assertThat(uploadCreateFromUrlResponse.folderNo()).contains("folder_no")
        assertThat(uploadCreateFromUrlResponse.height()).contains(-9007199254740991L)
        assertThat(uploadCreateFromUrlResponse.isDuplicate()).isEqualTo(true)
        assertThat(uploadCreateFromUrlResponse.metadata())
            .contains(
                UploadCreateFromUrlResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(uploadCreateFromUrlResponse.mimeType()).isEqualTo("mime_type")
        assertThat(uploadCreateFromUrlResponse.name()).isEqualTo("name")
        assertThat(uploadCreateFromUrlResponse.path()).isEqualTo("path")
        assertThat(uploadCreateFromUrlResponse.size()).isEqualTo(-9007199254740991L)
        assertThat(uploadCreateFromUrlResponse.tags()).containsExactly("string")
        assertThat(uploadCreateFromUrlResponse.thumbnail()).isEqualTo("thumbnail")
        assertThat(uploadCreateFromUrlResponse.uploadSource()).isEqualTo("upload_source")
        assertThat(uploadCreateFromUrlResponse.url()).isEqualTo("url")
        assertThat(uploadCreateFromUrlResponse.width()).contains(-9007199254740991L)
        assertThat(uploadCreateFromUrlResponse.workspaceId()).isEqualTo("workspace_id")
        assertThat(uploadCreateFromUrlResponse.format()).contains("format")
        assertThat(uploadCreateFromUrlResponse.hash()).contains("hash")
        assertThat(uploadCreateFromUrlResponse.isPrivate()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadCreateFromUrlResponse =
            UploadCreateFromUrlResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .extension("extension")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .metadata(
                    UploadCreateFromUrlResponse.Metadata.builder()
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

        val roundtrippedUploadCreateFromUrlResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadCreateFromUrlResponse),
                jacksonTypeRef<UploadCreateFromUrlResponse>(),
            )

        assertThat(roundtrippedUploadCreateFromUrlResponse).isEqualTo(uploadCreateFromUrlResponse)
    }
}
