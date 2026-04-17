// File generated from our OpenAPI spec by Stainless.

package io.autorender.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.core.jsonMapper
import io.autorender.models.uploads.Upload
import io.autorender.models.uploads.UploadData
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
    fun uploadRoundtrip() {
        val jsonMapper = jsonMapper()
        val upload =
            Upload.builder()
                .data(
                    UploadData.builder()
                        .id("id")
                        .fileNo("file_no")
                        .fileSize(0L)
                        .format("format")
                        .height(0L)
                        .name("name")
                        .path("path")
                        .url("url")
                        .width(0L)
                        .workspaceNo("workspace_no")
                        .build()
                )
                .success(true)
                .build()

        val roundtrippedUpload =
            jsonMapper.readValue(jsonMapper.writeValueAsString(upload), jacksonTypeRef<Upload>())

        assertThat(roundtrippedUpload).isEqualTo(upload)
    }
}
