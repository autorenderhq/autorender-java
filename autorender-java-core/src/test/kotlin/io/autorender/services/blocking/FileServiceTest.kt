// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.core.JsonValue
import io.autorender.models.files.FileListParams
import io.autorender.models.files.FileRenameParams
import io.autorender.models.files.FileUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Test
    fun retrieve() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val fileObject = fileService.retrieve("2353377462")

        fileObject.validate()
    }

    @Test
    fun update() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val file =
            fileService.update(
                FileUpdateParams.builder()
                    .fileNo("2353377462")
                    .addAddTag("string")
                    .metadata(
                        FileUpdateParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .addRemoveTag("string")
                    .build()
            )

        file.validate()
    }

    @Test
    fun list() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val files =
            fileService.list(
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

        files.validate()
    }

    @Test
    fun delete() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val file = fileService.delete("2353377462")

        file.validate()
    }

    @Test
    fun rename() {
        val client =
            AutorenderOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val fileService = client.files()

        val response =
            fileService.rename(FileRenameParams.builder().fileNo("2353377462").name("name").build())

        response.validate()
    }
}
