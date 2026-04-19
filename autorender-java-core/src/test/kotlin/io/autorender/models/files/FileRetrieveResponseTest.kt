// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileRetrieveResponseTest {

    @Test
    fun create() {
        val fileRetrieveResponse =
            FileRetrieveResponse.builder()
                .data(
                    FileRetrieveResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fileNo("file_no")
                        .folderName("folder_name")
                        .folderNo("folder_no")
                        .format("format")
                        .height(-9007199254740991L)
                        .metadata(
                            FileRetrieveResponse.Data.Metadata.builder()
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
                .success(FileRetrieveResponse.Success.TRUE)
                .build()

        assertThat(fileRetrieveResponse.data())
            .isEqualTo(
                FileRetrieveResponse.Data.builder()
                    .id("id")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .fileNo("file_no")
                    .folderName("folder_name")
                    .folderNo("folder_no")
                    .format("format")
                    .height(-9007199254740991L)
                    .metadata(
                        FileRetrieveResponse.Data.Metadata.builder()
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
        assertThat(fileRetrieveResponse.success()).isEqualTo(FileRetrieveResponse.Success.TRUE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fileRetrieveResponse =
            FileRetrieveResponse.builder()
                .data(
                    FileRetrieveResponse.Data.builder()
                        .id("id")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .fileNo("file_no")
                        .folderName("folder_name")
                        .folderNo("folder_no")
                        .format("format")
                        .height(-9007199254740991L)
                        .metadata(
                            FileRetrieveResponse.Data.Metadata.builder()
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
                .success(FileRetrieveResponse.Success.TRUE)
                .build()

        val roundtrippedFileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fileRetrieveResponse),
                jacksonTypeRef<FileRetrieveResponse>(),
            )

        assertThat(roundtrippedFileRetrieveResponse).isEqualTo(fileRetrieveResponse)
    }
}
