// File generated from our OpenAPI spec by Stainless.

package io.autorender.services.blocking

import io.autorender.TestServerExtension
import io.autorender.client.okhttp.AutorenderOkHttpClient
import io.autorender.models.files.FileListParams
import io.autorender.models.files.FileRenameParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class FileServiceTest {

    @Test
    fun retrieve() {
        val client = AutorenderOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        val file = fileService.retrieve("fileNo")

        file.validate()
    }

    @Test
    fun list() {
        val client = AutorenderOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        val files =
            fileService.list(
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

        files.validate()
    }

    @Test
    fun delete() {
        val client = AutorenderOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        fileService.delete("fileNo")
    }

    @Test
    fun rename() {
        val client = AutorenderOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val fileService = client.files()

        val response =
            fileService.rename(FileRenameParams.builder().fileNo("fileNo").name("name").build())

        response.validate()
    }
}
