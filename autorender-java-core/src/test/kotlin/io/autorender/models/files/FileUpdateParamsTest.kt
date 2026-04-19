// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import io.autorender.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FileUpdateParamsTest {

    @Test
    fun create() {
        FileUpdateParams.builder()
            .fileNo("fileNo")
            .addAddTag("string")
            .metadata(
                FileUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .addRemoveTag("string")
            .build()
    }

    @Test
    fun pathParams() {
        val params = FileUpdateParams.builder().fileNo("fileNo").build()

        assertThat(params._pathParam(0)).isEqualTo("fileNo")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            FileUpdateParams.builder()
                .fileNo("fileNo")
                .addAddTag("string")
                .metadata(
                    FileUpdateParams.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .addRemoveTag("string")
                .build()

        val body = params._body()

        assertThat(body.addTags().getOrNull()).containsExactly("string")
        assertThat(body.metadata())
            .contains(
                FileUpdateParams.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.removeTags().getOrNull()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = FileUpdateParams.builder().fileNo("fileNo").build()

        val body = params._body()
    }
}
