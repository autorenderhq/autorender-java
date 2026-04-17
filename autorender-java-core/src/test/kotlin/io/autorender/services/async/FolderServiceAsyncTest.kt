// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClientAsync
import io.autorender.models.folders.FolderCreateParams
import io.autorender.models.folders.FolderListParams
import io.autorender.models.folders.FolderRenameParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FolderServiceAsyncTest {

    @Test
    fun create() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderServiceAsync = client.folders()

        val folderFuture =
            folderServiceAsync.create(
                FolderCreateParams.builder().name("name").parentFolderNo("parent_folder_no").build()
            )

        val folder = folderFuture.get()
        folder.validate()
    }

    @Test
    fun list() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderServiceAsync = client.folders()

        val foldersFuture =
            folderServiceAsync.list(FolderListParams.builder().parentFolderNo("sD1LvqoDzG").build())

        val folders = foldersFuture.get()
        folders.validate()
    }

    @Test
    fun delete() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderServiceAsync = client.folders()

        val folderFuture = folderServiceAsync.delete("my8JeLg4tr")

        val folder = folderFuture.get()
        folder.validate()
    }

    @Test
    fun rename() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderServiceAsync = client.folders()

        val folderFuture =
            folderServiceAsync.rename(
                FolderRenameParams.builder().folderNo("53855hxPoq").name("name").build()
            )

        val folder = folderFuture.get()
        folder.validate()
    }
}
