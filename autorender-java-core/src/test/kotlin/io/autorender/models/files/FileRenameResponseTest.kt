// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRenameResponseTest {

    @Test
    fun create() {
        val fileRenameResponse =
            FileRenameResponse.builder()
                .data(
                    FileRenameResponse.Data.builder()
                        .id("id_abc123")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .fileNo("file_abc123")
                        .folderName(null)
                        .folderNo(null)
                        .format("jpg")
                        .height(1080L)
                        .metadata(
                            FileRenameResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .mimeType("image/jpeg")
                        .name("example.jpg")
                        .path("/example.jpg")
                        .size(12345L)
                        .source("direct")
                        .addTag("string")
                        .updatedAt(null)
                        .url("https://cdn.autorender.io/example.jpg")
                        .width(1920L)
                        .build()
                )
                .success(FileRenameResponse.Success.TRUE)
                .build()

        assertThat(fileRenameResponse.data())
            .isEqualTo(
                FileRenameResponse.Data.builder()
                    .id("id_abc123")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .fileNo("file_abc123")
                    .folderName(null)
                    .folderNo(null)
                    .format("jpg")
                    .height(1080L)
                    .metadata(
                        FileRenameResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .mimeType("image/jpeg")
                    .name("example.jpg")
                    .path("/example.jpg")
                    .size(12345L)
                    .source("direct")
                    .addTag("string")
                    .updatedAt(null)
                    .url("https://cdn.autorender.io/example.jpg")
                    .width(1920L)
                    .build()
            )
        assertThat(fileRenameResponse.success()).isEqualTo(FileRenameResponse.Success.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileRenameResponse =
            FileRenameResponse.builder()
                .data(
                    FileRenameResponse.Data.builder()
                        .id("id_abc123")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .fileNo("file_abc123")
                        .folderName(null)
                        .folderNo(null)
                        .format("jpg")
                        .height(1080L)
                        .metadata(
                            FileRenameResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .mimeType("image/jpeg")
                        .name("example.jpg")
                        .path("/example.jpg")
                        .size(12345L)
                        .source("direct")
                        .addTag("string")
                        .updatedAt(null)
                        .url("https://cdn.autorender.io/example.jpg")
                        .width(1920L)
                        .build()
                )
                .success(FileRenameResponse.Success.TRUE)
                .build()

        val roundtrippedFileRenameResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileRenameResponse),
                jacksonTypeRef<FileRenameResponse>(),
            )

        assertThat(roundtrippedFileRenameResponse).isEqualTo(fileRenameResponse)
    }
}
