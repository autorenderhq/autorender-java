// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.autorender.core.ExcludeMissing
import io.autorender.core.JsonField
import io.autorender.core.JsonMissing
import io.autorender.core.JsonValue
import io.autorender.core.Params
import io.autorender.core.checkRequired
import io.autorender.core.http.Headers
import io.autorender.core.http.QueryParams
import io.autorender.errors.AutorenderInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional

/** Download a file from a remote URL and store it in AutoRender. */
class UploadCreateFromUrlParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * HTTP/HTTPS URL to fetch
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun remoteUrl(): String = body.remoteUrl()

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customId(): Optional<String> = body.customId()

    /**
     * Override file name
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileName(): Optional<String> = body.fileName()

    /**
     * Destination folder path
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folder(): Optional<String> = body.folder()

    /**
     * JSON string of metadata object
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
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun webhookUrl(): Optional<String> = body.webhookUrl()

    /**
     * Returns the raw JSON value of [remoteUrl].
     *
     * Unlike [remoteUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _remoteUrl(): JsonField<String> = body._remoteUrl()

    /**
     * Returns the raw JSON value of [customId].
     *
     * Unlike [customId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customId(): JsonField<String> = body._customId()

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fileName(): JsonField<String> = body._fileName()

    /**
     * Returns the raw JSON value of [folder].
     *
     * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _folder(): JsonField<String> = body._folder()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<String> = body._metadata()

    /**
     * Returns the raw JSON value of [randomPrefix].
     *
     * Unlike [randomPrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _randomPrefix(): JsonField<String> = body._randomPrefix()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<String> = body._tags()

    /**
     * Returns the raw JSON value of [webhookUrl].
     *
     * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _webhookUrl(): JsonField<String> = body._webhookUrl()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UploadCreateFromUrlParams].
         *
         * The following fields are required:
         * ```java
         * .remoteUrl()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadCreateFromUrlParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(uploadCreateFromUrlParams: UploadCreateFromUrlParams) = apply {
            body = uploadCreateFromUrlParams.body.toBuilder()
            additionalHeaders = uploadCreateFromUrlParams.additionalHeaders.toBuilder()
            additionalQueryParams = uploadCreateFromUrlParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [remoteUrl]
         * - [customId]
         * - [fileName]
         * - [folder]
         * - [metadata]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** HTTP/HTTPS URL to fetch */
        fun remoteUrl(remoteUrl: String) = apply { body.remoteUrl(remoteUrl) }

        /**
         * Sets [Builder.remoteUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.remoteUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun remoteUrl(remoteUrl: JsonField<String>) = apply { body.remoteUrl(remoteUrl) }

        fun customId(customId: String) = apply { body.customId(customId) }

        /**
         * Sets [Builder.customId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customId(customId: JsonField<String>) = apply { body.customId(customId) }

        /** Override file name */
        fun fileName(fileName: String) = apply { body.fileName(fileName) }

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { body.fileName(fileName) }

        /** Destination folder path */
        fun folder(folder: String) = apply { body.folder(folder) }

        /**
         * Sets [Builder.folder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folder] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folder(folder: JsonField<String>) = apply { body.folder(folder) }

        /** JSON string of metadata object */
        fun metadata(metadata: String) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun metadata(metadata: JsonField<String>) = apply { body.metadata(metadata) }

        /** true/false to append random suffix */
        fun randomPrefix(randomPrefix: String) = apply { body.randomPrefix(randomPrefix) }

        /**
         * Sets [Builder.randomPrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.randomPrefix] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun randomPrefix(randomPrefix: JsonField<String>) = apply {
            body.randomPrefix(randomPrefix)
        }

        /** Comma-separated tags */
        fun tags(tags: String) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun tags(tags: JsonField<String>) = apply { body.tags(tags) }

        fun webhookUrl(webhookUrl: String) = apply { body.webhookUrl(webhookUrl) }

        /**
         * Sets [Builder.webhookUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.webhookUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun webhookUrl(webhookUrl: JsonField<String>) = apply { body.webhookUrl(webhookUrl) }

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
         * Returns an immutable instance of [UploadCreateFromUrlParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .remoteUrl()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UploadCreateFromUrlParams =
            UploadCreateFromUrlParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val remoteUrl: JsonField<String>,
        private val customId: JsonField<String>,
        private val fileName: JsonField<String>,
        private val folder: JsonField<String>,
        private val metadata: JsonField<String>,
        private val randomPrefix: JsonField<String>,
        private val tags: JsonField<String>,
        private val webhookUrl: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("remote_url")
            @ExcludeMissing
            remoteUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("custom_id")
            @ExcludeMissing
            customId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_name")
            @ExcludeMissing
            fileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("folder") @ExcludeMissing folder: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<String> = JsonMissing.of(),
            @JsonProperty("random_prefix")
            @ExcludeMissing
            randomPrefix: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<String> = JsonMissing.of(),
            @JsonProperty("webhook_url")
            @ExcludeMissing
            webhookUrl: JsonField<String> = JsonMissing.of(),
        ) : this(
            remoteUrl,
            customId,
            fileName,
            folder,
            metadata,
            randomPrefix,
            tags,
            webhookUrl,
            mutableMapOf(),
        )

        /**
         * HTTP/HTTPS URL to fetch
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun remoteUrl(): String = remoteUrl.getRequired("remote_url")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customId(): Optional<String> = customId.getOptional("custom_id")

        /**
         * Override file name
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileName(): Optional<String> = fileName.getOptional("file_name")

        /**
         * Destination folder path
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun folder(): Optional<String> = folder.getOptional("folder")

        /**
         * JSON string of metadata object
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<String> = metadata.getOptional("metadata")

        /**
         * true/false to append random suffix
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun randomPrefix(): Optional<String> = randomPrefix.getOptional("random_prefix")

        /**
         * Comma-separated tags
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<String> = tags.getOptional("tags")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun webhookUrl(): Optional<String> = webhookUrl.getOptional("webhook_url")

        /**
         * Returns the raw JSON value of [remoteUrl].
         *
         * Unlike [remoteUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("remote_url") @ExcludeMissing fun _remoteUrl(): JsonField<String> = remoteUrl

        /**
         * Returns the raw JSON value of [customId].
         *
         * Unlike [customId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("custom_id") @ExcludeMissing fun _customId(): JsonField<String> = customId

        /**
         * Returns the raw JSON value of [fileName].
         *
         * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_name") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

        /**
         * Returns the raw JSON value of [folder].
         *
         * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("folder") @ExcludeMissing fun _folder(): JsonField<String> = folder

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<String> = metadata

        /**
         * Returns the raw JSON value of [randomPrefix].
         *
         * Unlike [randomPrefix], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("random_prefix")
        @ExcludeMissing
        fun _randomPrefix(): JsonField<String> = randomPrefix

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<String> = tags

        /**
         * Returns the raw JSON value of [webhookUrl].
         *
         * Unlike [webhookUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("webhook_url")
        @ExcludeMissing
        fun _webhookUrl(): JsonField<String> = webhookUrl

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
             * .remoteUrl()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var remoteUrl: JsonField<String>? = null
            private var customId: JsonField<String> = JsonMissing.of()
            private var fileName: JsonField<String> = JsonMissing.of()
            private var folder: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<String> = JsonMissing.of()
            private var randomPrefix: JsonField<String> = JsonMissing.of()
            private var tags: JsonField<String> = JsonMissing.of()
            private var webhookUrl: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                remoteUrl = body.remoteUrl
                customId = body.customId
                fileName = body.fileName
                folder = body.folder
                metadata = body.metadata
                randomPrefix = body.randomPrefix
                tags = body.tags
                webhookUrl = body.webhookUrl
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** HTTP/HTTPS URL to fetch */
            fun remoteUrl(remoteUrl: String) = remoteUrl(JsonField.of(remoteUrl))

            /**
             * Sets [Builder.remoteUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.remoteUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun remoteUrl(remoteUrl: JsonField<String>) = apply { this.remoteUrl = remoteUrl }

            fun customId(customId: String) = customId(JsonField.of(customId))

            /**
             * Sets [Builder.customId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customId(customId: JsonField<String>) = apply { this.customId = customId }

            /** Override file name */
            fun fileName(fileName: String) = fileName(JsonField.of(fileName))

            /**
             * Sets [Builder.fileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

            /** Destination folder path */
            fun folder(folder: String) = folder(JsonField.of(folder))

            /**
             * Sets [Builder.folder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.folder] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folder(folder: JsonField<String>) = apply { this.folder = folder }

            /** JSON string of metadata object */
            fun metadata(metadata: String) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<String>) = apply { this.metadata = metadata }

            /** true/false to append random suffix */
            fun randomPrefix(randomPrefix: String) = randomPrefix(JsonField.of(randomPrefix))

            /**
             * Sets [Builder.randomPrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.randomPrefix] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun randomPrefix(randomPrefix: JsonField<String>) = apply {
                this.randomPrefix = randomPrefix
            }

            /** Comma-separated tags */
            fun tags(tags: String) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun tags(tags: JsonField<String>) = apply { this.tags = tags }

            fun webhookUrl(webhookUrl: String) = webhookUrl(JsonField.of(webhookUrl))

            /**
             * Sets [Builder.webhookUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.webhookUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun webhookUrl(webhookUrl: JsonField<String>) = apply { this.webhookUrl = webhookUrl }

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
             * .remoteUrl()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("remoteUrl", remoteUrl),
                    customId,
                    fileName,
                    folder,
                    metadata,
                    randomPrefix,
                    tags,
                    webhookUrl,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            remoteUrl()
            customId()
            fileName()
            folder()
            metadata()
            randomPrefix()
            tags()
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

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (remoteUrl.asKnown().isPresent) 1 else 0) +
                (if (customId.asKnown().isPresent) 1 else 0) +
                (if (fileName.asKnown().isPresent) 1 else 0) +
                (if (folder.asKnown().isPresent) 1 else 0) +
                (if (metadata.asKnown().isPresent) 1 else 0) +
                (if (randomPrefix.asKnown().isPresent) 1 else 0) +
                (if (tags.asKnown().isPresent) 1 else 0) +
                (if (webhookUrl.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                remoteUrl == other.remoteUrl &&
                customId == other.customId &&
                fileName == other.fileName &&
                folder == other.folder &&
                metadata == other.metadata &&
                randomPrefix == other.randomPrefix &&
                tags == other.tags &&
                webhookUrl == other.webhookUrl &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                remoteUrl,
                customId,
                fileName,
                folder,
                metadata,
                randomPrefix,
                tags,
                webhookUrl,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{remoteUrl=$remoteUrl, customId=$customId, fileName=$fileName, folder=$folder, metadata=$metadata, randomPrefix=$randomPrefix, tags=$tags, webhookUrl=$webhookUrl, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadCreateFromUrlParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UploadCreateFromUrlParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
