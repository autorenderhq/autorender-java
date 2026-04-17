// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import io.autorender.core.MultipartField
import java.io.InputStream
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UploadCreateParamsTest {

    @Test
    fun create() {
        UploadCreateParams.builder()
            .file("Example data".byteInputStream())
            .fileName("file_name")
            .customId("custom_id")
            .folder("folder")
            .metadata("metadata")
            .randomPrefix("random_prefix")
            .tags("tags")
            .transform("transform")
            .webhookUrl("webhook_url")
            .build()
    }

    @Test
    fun body() {
        val params =
            UploadCreateParams.builder()
                .file("Example data".byteInputStream())
                .fileName("file_name")
                .customId("custom_id")
                .folder("folder")
                .metadata("metadata")
                .randomPrefix("random_prefix")
                .tags("tags")
                .transform("transform")
                .webhookUrl("webhook_url")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "file_name" to MultipartField.of("file_name"),
                        "custom_id" to MultipartField.of("custom_id"),
                        "folder" to MultipartField.of("folder"),
                        "metadata" to MultipartField.of("metadata"),
                        "random_prefix" to MultipartField.of("random_prefix"),
                        "tags" to MultipartField.of("tags"),
                        "transform" to MultipartField.of("transform"),
                        "webhook_url" to MultipartField.of("webhook_url"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            UploadCreateParams.builder()
                .file("Example data".byteInputStream())
                .fileName("file_name")
                .build()

        val body = params._body()

        assertThat(body.filterValues { !it.value.isNull() })
            .usingRecursiveComparison()
            // TODO(AssertJ): Replace this and the `mapValues` below with:
            // https://github.com/assertj/assertj/issues/3165
            .withEqualsForType(
                { a, b -> a.readBytes() contentEquals b.readBytes() },
                InputStream::class.java,
            )
            .isEqualTo(
                mapOf(
                        "file" to MultipartField.of("Example data".byteInputStream()),
                        "file_name" to MultipartField.of("file_name"),
                    )
                    .mapValues { (_, field) ->
                        field.map { (it as? ByteArray)?.inputStream() ?: it }
                    }
            )
    }
}
