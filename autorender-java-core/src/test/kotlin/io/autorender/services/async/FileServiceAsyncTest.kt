// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.async

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClientAsync
import io.autorender.core.JsonValue
import io.autorender.models.files.FileListParams
import io.autorender.models.files.FileRenameParams
import io.autorender.models.files.FileUpdateParams
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

        val fileFuture = fileServiceAsync.retrieve("fileNo")

        val file = fileFuture.get()
        file.validate()
    }

    @Test
    fun update() {
        val client =
            AutorenderOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileServiceAsync = client.files()

        val fileFuture =
            fileServiceAsync.update(
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
            )

        val file = fileFuture.get()
        file.validate()
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
                    .folderNo("folderNo")
                    .limit(1L)
                    .name("name")
                    .page(1L)
                    .path("path")
                    .sort(FileListParams.Sort.CREATED_AT_ASC)
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

        val future = fileServiceAsync.delete("fileNo")

        val response = future.get()
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
                FileRenameParams.builder().fileNo("fileNo").name("name").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}
