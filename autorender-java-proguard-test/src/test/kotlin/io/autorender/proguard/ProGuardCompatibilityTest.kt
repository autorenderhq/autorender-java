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
        assertThat(client.multipartUploads()).isNotNull()
    }

    @Test
    fun uploadCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val uploadCreateResponse =
            UploadCreateResponse.builder()
                .id("id_abc123")
                .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                .customId(null)
                .extension("jpg")
                .fileNo("file_abc123")
                .folderNo("folder_abc123")
                .height(1080L)
                .isDuplicate(false)
                .metadata(
                    UploadCreateResponse.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .mimeType("image/jpeg")
                .name("example.jpg")
                .path("/example.jpg")
                .size(12345L)
                .addTag("string")
                .thumbnail("https://cdn.autorender.io/thumb.jpg")
                .uploadSource("direct")
                .url("https://cdn.autorender.io/example.jpg")
                .width(1920L)
                .workspaceId("ws_abc123")
                .format("jpg")
                .hash("abc123def456")
                .isPrivate(false)
                .build()

        val roundtrippedUploadCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(uploadCreateResponse),
                jacksonTypeRef<UploadCreateResponse>(),
            )

        assertThat(roundtrippedUploadCreateResponse).isEqualTo(uploadCreateResponse)
    }
}
