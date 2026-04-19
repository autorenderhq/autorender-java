// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadUploadWithTokenResponseTest {

    @Test
    fun create() {
        val uploadUploadWithTokenResponse =
            UploadUploadWithTokenResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .isPrivate(true)
                .metadata(
                    UploadUploadWithTokenResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mimeType("mime_type")
                .name("name")
                .path("path")
                .size(-9007199254740991L)
                .addTag("string")
                .uploadSource("upload_source")
                .url("url")
                .width(-9007199254740991L)
                .workspaceId("workspace_id")
                .format("format")
                .hash("hash")
                .build()

        assertThat(uploadUploadWithTokenResponse.id()).isEqualTo("id")
        assertThat(uploadUploadWithTokenResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(uploadUploadWithTokenResponse.customId()).contains("custom_id")
        assertThat(uploadUploadWithTokenResponse.fileNo()).isEqualTo("file_no")
        assertThat(uploadUploadWithTokenResponse.folderNo()).contains("folder_no")
        assertThat(uploadUploadWithTokenResponse.height()).contains(-9007199254740991L)
        assertThat(uploadUploadWithTokenResponse.isDuplicate()).isEqualTo(true)
        assertThat(uploadUploadWithTokenResponse.isPrivate()).isEqualTo(true)
        assertThat(uploadUploadWithTokenResponse.metadata())
            .contains(
                UploadUploadWithTokenResponse.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(uploadUploadWithTokenResponse.mimeType()).isEqualTo("mime_type")
        assertThat(uploadUploadWithTokenResponse.name()).isEqualTo("name")
        assertThat(uploadUploadWithTokenResponse.path()).isEqualTo("path")
        assertThat(uploadUploadWithTokenResponse.size()).isEqualTo(-9007199254740991L)
        assertThat(uploadUploadWithTokenResponse.tags()).containsExactly("string")
        assertThat(uploadUploadWithTokenResponse.uploadSource()).isEqualTo("upload_source")
        assertThat(uploadUploadWithTokenResponse.url()).isEqualTo("url")
        assertThat(uploadUploadWithTokenResponse.width()).contains(-9007199254740991L)
        assertThat(uploadUploadWithTokenResponse.workspaceId()).isEqualTo("workspace_id")
        assertThat(uploadUploadWithTokenResponse.format()).contains("format")
        assertThat(uploadUploadWithTokenResponse.hash()).contains("hash")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val uploadUploadWithTokenResponse =
            UploadUploadWithTokenResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .isPrivate(true)
                .metadata(
                    UploadUploadWithTokenResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mimeType("mime_type")
                .name("name")
                .path("path")
                .size(-9007199254740991L)
                .addTag("string")
                .uploadSource("upload_source")
                .url("url")
                .width(-9007199254740991L)
                .workspaceId("workspace_id")
                .format("format")
                .hash("hash")
                .build()

        val roundtrippedUploadUploadWithTokenResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadUploadWithTokenResponse),
                jacksonTypeRef<UploadUploadWithTokenResponse>(),
            )

        assertThat(roundtrippedUploadUploadWithTokenResponse)
            .isEqualTo(uploadUploadWithTokenResponse)
    }
}
