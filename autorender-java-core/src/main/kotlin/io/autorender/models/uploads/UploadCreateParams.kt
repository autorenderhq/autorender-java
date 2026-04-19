// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import io.autorender.core.ExcludeMissing
import io.autorender.core.JsonValue
import io.autorender.core.MultipartField
import io.autorender.core.Params
import io.autorender.core.checkRequired
import io.autorender.core.http.Headers
import io.autorender.core.http.QueryParams
import io.autorender.core.toImmutable
import io.autorender.errors.AutorenderInvalidDataException
import java.io.InputStream
import java.nio.file.Path
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.io.path.inputStream
import kotlin.io.path.name

/** Upload a file from your backend server using multipart/form-data. */
class UploadCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * File to upload.
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun file(): InputStream = body.file()

    /**
     * File name (e.g. product.jpg)
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = body.fileName()

    /**
     * Custom identifier
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customId(): Optional<String> = body.customId()

    /**
     * Optional folder path
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folder(): Optional<String> = body.folder()

    /**
     * JSON string of metadata
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<String> = body.metadata()

    /**
     * true/false to append random suffix
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun randomPrefix(): Optional<String> = body.randomPrefix()

    /**
     * Comma-separated tags
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<String> = body.tags()

    /**
     * Transform string (w_300,h_300,c_crop,...)
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transform(): Optional<String> = body.transform()

    /**
     * URL to notify on success
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw multipart value of [file].
     *
     * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _file(): MultipartField<InputStream> = body._file()

    /**
     * Returns the raw multipart value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _fileName(): MultipartField<String> = body._fileName()

    /**
     * Returns the raw multipart value of [customId].
     *
     * Unlike [customId], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _customId(): MultipartField<String> = body._customId()

    /**
     * Returns the raw multipart value of [folder].
     *
     * Unlike [folder], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _folder(): MultipartField<String> = body._folder()

    /**
     * Returns the raw multipart value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _metadata(): MultipartField<String> = body._metadata()

    /**
     * Returns the raw multipart value of [randomPrefix].
     *
     * Unlike [randomPrefix], this method doesn't throw if the multipart field has an unexpected
     * type.
     */
    fun _randomPrefix(): MultipartField<String> = body._randomPrefix()

    /**
     * Returns the raw multipart value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _tags(): MultipartField<String> = body._tags()

    /**
     * Returns the raw multipart value of [transform].
     *
     * Unlike [transform], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _transform(): MultipartField<String> = body._transform()

    /**
     * Returns the raw multipart value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the multipart field has an unexpected type.
     */
    fun _webhookUrl(): MultipartField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UploadCreateParams].
         *
         * The following fields are required:
         * ```java
         * .file()
         * .fileName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(uploadCreateParams: UploadCreateParams) = apply {
            body = uploadCreateParams.body.toBuilder()
            additionalHeaders = uploadCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = uploadCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [file]
         * - [fileName]
         * - [customId]
         * - [folder]
         * - [metadata]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** File to upload. */
        fun file(file: InputStream) = apply { body.file(file) }

        /**
         * Sets [Builder.file] to an arbitrary multipart value.
         *
         * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun file(file: MultipartField<InputStream>) = apply { body.file(file) }

        /** File to upload. */
        fun file(file: ByteArray) = apply { body.file(file) }

        /** File to upload. */
        fun file(path: Path) = apply { body.file(path) }

        /** File name (e.g. product.jpg) */
        fun fileName(fileName: String) = apply { body.fileName(fileName) }

        /**
         * Sets [Builder.fileName] to an arbitrary multipart value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: MultipartField<String>) = apply { body.fileName(fileName) }

        /** Custom identifier */
        fun customId(customId: String) = apply { body.customId(customId) }

        /**
         * Sets [Builder.customId] to an arbitrary multipart value.
         *
         * You should usually call [Builder.customId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customId(customId: MultipartField<String>) = apply { body.customId(customId) }

        /** Optional folder path */
        fun folder(folder: String) = apply { body.folder(folder) }

        /**
         * Sets [Builder.folder] to an arbitrary multipart value.
         *
         * You should usually call [Builder.folder] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folder(folder: MultipartField<String>) = apply { body.folder(folder) }

        /** JSON string of metadata */
        fun metadata(metadata: String) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary multipart value.
         *
         * You should usually call [Builder.metadata] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metadata(metadata: MultipartField<String>) = apply { body.metadata(metadata) }

        /** true/false to append random suffix */
        fun randomPrefix(randomPrefix: String) = apply { body.randomPrefix(randomPrefix) }

        /**
         * Sets [Builder.randomPrefix] to an arbitrary multipart value.
         *
         * You should usually call [Builder.randomPrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun randomPrefix(randomPrefix: MultipartField<String>) = apply {
            body.randomPrefix(randomPrefix)
        }

        /** Comma-separated tags */
        fun tags(tags: String) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary multipart value.
         *
         * You should usually call [Builder.tags] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: MultipartField<String>) = apply { body.tags(tags) }

        /** Transform string (w_300,h_300,c_crop,...) */
        fun transform(transform: String) = apply { body.transform(transform) }

        /**
         * Sets [Builder.transform] to an arbitrary multipart value.
         *
         * You should usually call [Builder.transform] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transform(transform: MultipartField<String>) = apply { body.transform(transform) }

        /** URL to notify on success */
        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary multipart value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: MultipartField<String>) = apply { body.webhookUrl(webhookUrl) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [UploadCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .file()
         * .fileName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UploadCreateParams =
            UploadCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Map<String, MultipartField<*>> =
        (mapOf(
                "file" to _file(),
                "file_name" to _fileName(),
                "custom_id" to _customId(),
                "folder" to _folder(),
                "metadata" to _metadata(),
                "random_prefix" to _randomPrefix(),
                "tags" to _tags(),
                "transform" to _transform(),
                "webhook_url" to _webhookUrl(),
            ) + _additionalBodyProperties().mapValues { (_, value) -> MultipartField.of(value) })
            .toImmutable()

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val file: MultipartField<InputStream>,
        private val fileName: MultipartField<String>,
        private val customId: MultipartField<String>,
        private val folder: MultipartField<String>,
        private val metadata: MultipartField<String>,
        private val randomPrefix: MultipartField<String>,
        private val tags: MultipartField<String>,
        private val transform: MultipartField<String>,
        private val webhookUrl: MultipartField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        /**
         * File to upload.
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun file(): InputStream = file.value.getRequired("file")

        /**
         * File name (e.g. product.jpg)
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileName(): String = fileName.value.getRequired("file_name")

        /**
         * Custom identifier
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customId(): Optional<String> = customId.value.getOptional("custom_id")

        /**
         * Optional folder path
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun folder(): Optional<String> = folder.value.getOptional("folder")

        /**
         * JSON string of metadata
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<String> = metadata.value.getOptional("metadata")

        /**
         * true/false to append random suffix
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun randomPrefix(): Optional<String> = randomPrefix.value.getOptional("random_prefix")

        /**
         * Comma-separated tags
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<String> = tags.value.getOptional("tags")

        /**
         * Transform string (w_300,h_300,c_crop,...)
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transform(): Optional<String> = transform.value.getOptional("transform")

        /**
         * URL to notify on success
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.value.getOptional("webhook_url")

        /**
         * Returns the raw multipart value of [file].
         *
         * Unlike [file], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("file") @ExcludeMissing fun _file(): MultipartField<InputStream> = file

        /**
         * Returns the raw multipart value of [fileName].
         *
         * Unlike [fileName], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("file_name")
        @ExcludeMissing
        fun _fileName(): MultipartField<String> = fileName

        /**
         * Returns the raw multipart value of [customId].
         *
         * Unlike [customId], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("custom_id")
        @ExcludeMissing
        fun _customId(): MultipartField<String> = customId

        /**
         * Returns the raw multipart value of [folder].
         *
         * Unlike [folder], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("folder") @ExcludeMissing fun _folder(): MultipartField<String> = folder

        /**
         * Returns the raw multipart value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): MultipartField<String> = metadata

        /**
         * Returns the raw multipart value of [randomPrefix].
         *
         * Unlike [randomPrefix], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("random_prefix")
        @ExcludeMissing
        fun _randomPrefix(): MultipartField<String> = randomPrefix

        /**
         * Returns the raw multipart value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the multipart field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): MultipartField<String> = tags

        /**
         * Returns the raw multipart value of [transform].
         *
         * Unlike [transform], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("transform")
        @ExcludeMissing
        fun _transform(): MultipartField<String> = transform

        /**
         * Returns the raw multipart value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the multipart field has an unexpected
         * type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): MultipartField<String> = webhookUrl

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .file()
             * .fileName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var file: MultipartField<InputStream>? = null
            private var fileName: MultipartField<String>? = null
            private var customId: MultipartField<String> = MultipartField.of(null)
            private var folder: MultipartField<String> = MultipartField.of(null)
            private var metadata: MultipartField<String> = MultipartField.of(null)
            private var randomPrefix: MultipartField<String> = MultipartField.of(null)
            private var tags: MultipartField<String> = MultipartField.of(null)
            private var transform: MultipartField<String> = MultipartField.of(null)
            private var webhookUrl: MultipartField<String> = MultipartField.of(null)
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                file = body.file
                fileName = body.fileName
                customId = body.customId
                folder = body.folder
                metadata = body.metadata
                randomPrefix = body.randomPrefix
                tags = body.tags
                transform = body.transform
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** File to upload. */
            fun file(file: InputStream) = file(MultipartField.of(file))

            /**
             * Sets [Builder.file] to an arbitrary multipart value.
             *
             * You should usually call [Builder.file] with a well-typed [InputStream] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun file(file: MultipartField<InputStream>) = apply { this.file = file }

            /** File to upload. */
            fun file(file: ByteArray) = file(file.inputStream())

            /** File to upload. */
            fun file(path: Path) =
                file(
                    MultipartField.builder<InputStream>()
                        .value(path.inputStream())
                        .filename(path.name)
                        .build()
                )

            /** File name (e.g. product.jpg) */
            fun fileName(fileName: String) = fileName(MultipartField.of(fileName))

            /**
             * Sets [Builder.fileName] to an arbitrary multipart value.
             *
             * You should usually call [Builder.fileName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileName(fileName: MultipartField<String>) = apply { this.fileName = fileName }

            /** Custom identifier */
            fun customId(customId: String) = customId(MultipartField.of(customId))

            /**
             * Sets [Builder.customId] to an arbitrary multipart value.
             *
             * You should usually call [Builder.customId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customId(customId: MultipartField<String>) = apply { this.customId = customId }

            /** Optional folder path */
            fun folder(folder: String) = folder(MultipartField.of(folder))

            /**
             * Sets [Builder.folder] to an arbitrary multipart value.
             *
             * You should usually call [Builder.folder] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folder(folder: MultipartField<String>) = apply { this.folder = folder }

            /** JSON string of metadata */
            fun metadata(metadata: String) = metadata(MultipartField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary multipart value.
             *
             * You should usually call [Builder.metadata] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: MultipartField<String>) = apply { this.metadata = metadata }

            /** true/false to append random suffix */
            fun randomPrefix(randomPrefix: String) = randomPrefix(MultipartField.of(randomPrefix))

            /**
             * Sets [Builder.randomPrefix] to an arbitrary multipart value.
             *
             * You should usually call [Builder.randomPrefix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun randomPrefix(randomPrefix: MultipartField<String>) = apply {
                this.randomPrefix = randomPrefix
            }

            /** Comma-separated tags */
            fun tags(tags: String) = tags(MultipartField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary multipart value.
             *
             * You should usually call [Builder.tags] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: MultipartField<String>) = apply { this.tags = tags }

            /** Transform string (w_300,h_300,c_crop,...) */
            fun transform(transform: String) = transform(MultipartField.of(transform))

            /**
             * Sets [Builder.transform] to an arbitrary multipart value.
             *
             * You should usually call [Builder.transform] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transform(transform: MultipartField<String>) = apply { this.transform = transform }

            /** URL to notify on success */
            fun webhookUrl(webhookUrl: String) = webhookUrl(MultipartField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary multipart value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: MultipartField<String>) = apply {
                this.webhookUrl = webhookUrl
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .file()
             * .fileName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("file", file),
                    checkRequired("fileName", fileName),
                    customId,
                    folder,
                    metadata,
                    randomPrefix,
                    tags,
                    transform,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            file()
            fileName()
            customId()
            folder()
            metadata()
            randomPrefix()
            tags()
            transform()
            webhookUrl()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: AutorenderInvalidDataException) {
                false
            }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                file == other.file &&
                fileName == other.fileName &&
                customId == other.customId &&
                folder == other.folder &&
                metadata == other.metadata &&
                randomPrefix == other.randomPrefix &&
                tags == other.tags &&
                transform == other.transform &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                file,
                fileName,
                customId,
                folder,
                metadata,
                randomPrefix,
                tags,
                transform,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{file=$file, fileName=$fileName, customId=$customId, folder=$folder, metadata=$metadata, randomPrefix=$randomPrefix, tags=$tags, transform=$transform, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UploadCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
