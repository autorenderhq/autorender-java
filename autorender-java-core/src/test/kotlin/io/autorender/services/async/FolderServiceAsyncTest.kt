// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClientAsync
import io.autorender.models.folders.FolderCreateParams
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
                FolderCreateParams.builder().folderName("folder_name").path("path").build()
            )

        val folder = folderFuture.get()
        folder.validate()
    }

    @Test
    fun delete() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderServiceAsync = client.folders()

        val future = folderServiceAsync.delete("folderNo")

        val response = future.get()
    }

    @Test
    fun rename() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val folderServiceAsync = client.folders()

        val responseFuture =
            folderServiceAsync.rename(
                FolderRenameParams.builder().folderNo("folderNo").name("name").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
