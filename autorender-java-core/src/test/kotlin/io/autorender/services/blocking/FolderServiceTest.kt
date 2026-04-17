// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.models.folders.FolderCreateParams
import io.autorender.models.folders.FolderListParams
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
                FolderCreateParams.builder().name("name").parentFolderNo("parent_folder_no").build()
            )

        folder.validate()
    }

    @Test
    fun list() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderService = client.folders()

        val folders =
            folderService.list(FolderListParams.builder().parentFolderNo("sD1LvqoDzG").build())

        folders.validate()
    }

    @Test
    fun delete() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderService = client.folders()

        val folder = folderService.delete("my8JeLg4tr")

        folder.validate()
    }

    @Test
    fun rename() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderService = client.folders()

        val folder =
            folderService.rename(
                FolderRenameParams.builder().folderNo("53855hxPoq").name("name").build()
            )

        folder.validate()
    }
}
