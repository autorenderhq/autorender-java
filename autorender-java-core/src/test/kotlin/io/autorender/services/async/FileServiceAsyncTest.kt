// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClientAsync
import io.autorender.models.files.FileListParams
import io.autorender.models.files.FileRenameParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val fileObjectFuture = fileServiceAsync.retrieve("2353377462")

        val fileObject = fileObjectFuture.get()
        fileObject.validate()
    }

    @Test
    fun list() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val filesFuture =
            fileServiceAsync.list(
                FileListParams.builder()
                    .folderNo("folder_no")
                    .limit(0L)
                    .name("name")
                    .page(0L)
                    .path("path")
                    .sortField(FileListParams.SortField.FILE_SIZE)
                    .sortOrder(FileListParams.SortOrder.ASC)
                    .tags("tags")
                    .build()
            )

        val files = filesFuture.get()
        files.validate()
    }

    @Test
    fun delete() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val fileFuture = fileServiceAsync.delete("2338056701")

        val file = fileFuture.get()
        file.validate()
    }

    @Test
    fun rename() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val responseFuture =
            fileServiceAsync.rename(
                FileRenameParams.builder().fileNo("2338045312").name("demo").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
