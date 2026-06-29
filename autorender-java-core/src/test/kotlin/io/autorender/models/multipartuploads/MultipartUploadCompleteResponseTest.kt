// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.multipartuploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MultipartUploadCompleteResponseTest {

    @Test
    fun create() {
        val multipartUploadCompleteResponse =
            MultipartUploadCompleteResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .extension("extension")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .metadata(
                    MultipartUploadCompleteResponse.Metadata.builder()
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

        assertThat(multipartUploadCompleteResponse.id()).isEqualTo("id")
        assertThat(multipartUploadCompleteResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(multipartUploadCompleteResponse.customId()).contains("custom_id")
        assertThat(multipartUploadCompleteResponse.extension()).isEqualTo("extension")
        assertThat(multipartUploadCompleteResponse.fileNo()).isEqualTo("file_no")
        assertThat(multipartUploadCompleteResponse.folderNo()).contains("folder_no")
        assertThat(multipartUploadCompleteResponse.height()).contains(-9007199254740991L)
        assertThat(multipartUploadCompleteResponse.isDuplicate()).isEqualTo(true)
        assertThat(multipartUploadCompleteResponse.metadata())
            .contains(
                MultipartUploadCompleteResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(multipartUploadCompleteResponse.mimeType()).isEqualTo("mime_type")
        assertThat(multipartUploadCompleteResponse.name()).isEqualTo("name")
        assertThat(multipartUploadCompleteResponse.path()).isEqualTo("path")
        assertThat(multipartUploadCompleteResponse.size()).isEqualTo(-9007199254740991L)
        assertThat(multipartUploadCompleteResponse.tags()).containsExactly("string")
        assertThat(multipartUploadCompleteResponse.thumbnail()).isEqualTo("thumbnail")
        assertThat(multipartUploadCompleteResponse.uploadSource()).isEqualTo("upload_source")
        assertThat(multipartUploadCompleteResponse.url()).isEqualTo("url")
        assertThat(multipartUploadCompleteResponse.width()).contains(-9007199254740991L)
        assertThat(multipartUploadCompleteResponse.workspaceId()).isEqualTo("workspace_id")
        assertThat(multipartUploadCompleteResponse.format()).contains("format")
        assertThat(multipartUploadCompleteResponse.hash()).contains("hash")
        assertThat(multipartUploadCompleteResponse.isPrivate()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val multipartUploadCompleteResponse =
            MultipartUploadCompleteResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .extension("extension")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .metadata(
                    MultipartUploadCompleteResponse.Metadata.builder()
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

        val roundtrippedMultipartUploadCompleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(multipartUploadCompleteResponse),
                jacksonTypeRef<MultipartUploadCompleteResponse>(),
            )

        assertThat(roundtrippedMultipartUploadCompleteResponse)
            .isEqualTo(multipartUploadCompleteResponse)
    }
}
