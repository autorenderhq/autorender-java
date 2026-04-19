// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUpdateResponseTest {

    @Test
    fun create() {
        val fileUpdateResponse =
            FileUpdateResponse.builder()
                .data(
                    FileUpdateResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fileNo("file_no")
                        .folderName("folder_name")
                        .folderNo("folder_no")
                        .format("format")
                        .height(-9007199254740991L)
                        .metadata(
                            FileUpdateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .mimeType("mime_type")
                        .name("name")
                        .path("path")
                        .size(-9007199254740991L)
                        .source("source")
                        .addTag("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .url("url")
                        .width(-9007199254740991L)
                        .build()
                )
                .success(FileUpdateResponse.Success.TRUE)
                .build()

        assertThat(fileUpdateResponse.data())
            .isEqualTo(
                FileUpdateResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fileNo("file_no")
                    .folderName("folder_name")
                    .folderNo("folder_no")
                    .format("format")
                    .height(-9007199254740991L)
                    .metadata(
                        FileUpdateResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .mimeType("mime_type")
                    .name("name")
                    .path("path")
                    .size(-9007199254740991L)
                    .source("source")
                    .addTag("string")
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .url("url")
                    .width(-9007199254740991L)
                    .build()
            )
        assertThat(fileUpdateResponse.success()).isEqualTo(FileUpdateResponse.Success.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileUpdateResponse =
            FileUpdateResponse.builder()
                .data(
                    FileUpdateResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fileNo("file_no")
                        .folderName("folder_name")
                        .folderNo("folder_no")
                        .format("format")
                        .height(-9007199254740991L)
                        .metadata(
                            FileUpdateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .mimeType("mime_type")
                        .name("name")
                        .path("path")
                        .size(-9007199254740991L)
                        .source("source")
                        .addTag("string")
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .url("url")
                        .width(-9007199254740991L)
                        .build()
                )
                .success(FileUpdateResponse.Success.TRUE)
                .build()

        val roundtrippedFileUpdateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileUpdateResponse),
                jacksonTypeRef<FileUpdateResponse>(),
            )

        assertThat(roundtrippedFileUpdateResponse).isEqualTo(fileUpdateResponse)
    }
}
