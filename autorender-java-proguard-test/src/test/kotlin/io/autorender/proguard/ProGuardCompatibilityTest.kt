// File generated from our OpenAPI spec by Stainless.

package io.autorender.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.core.JsonValue
import io.autorender.core.jsonMapper
import io.autorender.models.uploads.UploadCreateResponse
import java.time.OffsetDateTime
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.jvm.javaMethod
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ProGuardCompatibilityTest {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")

            // We have to manually run the test methods instead of using the JUnit runner because it
            // seems impossible to get working with R8.
            val test = ProGuardCompatibilityTest()
            test::class
                .memberFunctions
                .asSequence()
                .filter { function ->
                    function.javaMethod?.isAnnotationPresent(Test::class.java) == true
                }
                .forEach { it.call(test) }
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/autorender-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = AutorenderOkHttpClient.builder().apiKey("My API Key").build()

        assertThat(client).isNotNull()
        assertThat(client.uploads()).isNotNull()
        assertThat(client.files()).isNotNull()
        assertThat(client.folders()).isNotNull()
    }

    @Test
    fun uploadCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val uploadCreateResponse =
            UploadCreateResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .customId("custom_id")
                .fileNo("file_no")
                .folderNo("folder_no")
                .height(-9007199254740991L)
                .isDuplicate(true)
                .isPrivate(true)
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
                .uploadSource("upload_source")
                .url("url")
                .width(-9007199254740991L)
                .workspaceId("workspace_id")
                .format("format")
                .hash("hash")
                .build()

        val roundtrippedUploadCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadCreateResponse),
                jacksonTypeRef<UploadCreateResponse>(),
            )

        assertThat(roundtrippedUploadCreateResponse).isEqualTo(uploadCreateResponse)
    }
}
