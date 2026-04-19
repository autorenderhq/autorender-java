// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.models.folders.FolderCreateParams
import io.autorender.models.folders.FolderRenameParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FolderServiceTest {

    @Test
    fun create() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderService = client.folders()

        val folder =
            folderService.create(
                FolderCreateParams.builder().folderName("folder_name").path("path").build()
            )

        folder.validate()
    }

    @Test
    fun delete() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderService = client.folders()

        folderService.delete("folderNo")
    }

    @Test
    fun rename() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderService = client.folders()

        val response =
            folderService.rename(
                FolderRenameParams.builder().folderNo("folderNo").name("name").build()
            )

        response.validate()
    }
}
