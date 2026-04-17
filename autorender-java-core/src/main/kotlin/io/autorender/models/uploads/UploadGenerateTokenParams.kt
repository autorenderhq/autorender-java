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
import io.autorender.core.checkKnown
import io.autorender.core.checkRequired
import io.autorender.core.http.Headers
import io.autorender.core.http.QueryParams
import io.autorender.core.toImmutable
import io.autorender.errors.AutorenderInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Generate a short-lived signed token that allows a browser or mobile client to upload directly to
 * AutoRender without exposing your secret API key. The token encodes upload policy (folder, tags,
 * transforms, file size limit). No file record is created until the token is used.
 */
class UploadGenerateTokenParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Filename for the upload (e.g., avatar.jpg)
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileName(): String = body.fileName()

    /**
     * Which policy fields the uploader may override
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowOverride(): Optional<AllowOverride> = body.allowOverride()

    /**
     * Custom identifier for the file
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customId(): Optional<String> = body.customId()

    /**
     * Destination folder path
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folder(): Optional<String> = body.folder()

    /**
     * Maximum allowed file size in bytes
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun maxFileSize(): Optional<Long> = body.maxFileSize()

    /**
     * Custom metadata to attach
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Add a random prefix to the filename
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun randomPrefix(): Optional<Boolean> = body.randomPrefix()

    /**
     * Tags to apply to the uploaded file
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tags(): Optional<List<String>> = body.tags()

    /**
     * Transformation string applied on upload
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transform(): Optional<String> = body.transform()

    /**
     * Token lifetime in seconds (default: 300)
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ttlSeconds(): Optional<Long> = body.ttlSeconds()

    /**
     * Returns the raw JSON value of [fileName].
     *
     * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _fileName(): JsonField<String> = body._fileName()

    /**
     * Returns the raw JSON value of [allowOverride].
     *
     * Unlike [allowOverride], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _allowOverride(): JsonField<AllowOverride> = body._allowOverride()

    /**
     * Returns the raw JSON value of [customId].
     *
     * Unlike [customId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _customId(): JsonField<String> = body._customId()

    /**
     * Returns the raw JSON value of [folder].
     *
     * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _folder(): JsonField<String> = body._folder()

    /**
     * Returns the raw JSON value of [maxFileSize].
     *
     * Unlike [maxFileSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _maxFileSize(): JsonField<Long> = body._maxFileSize()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [randomPrefix].
     *
     * Unlike [randomPrefix], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _randomPrefix(): JsonField<Boolean> = body._randomPrefix()

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _tags(): JsonField<List<String>> = body._tags()

    /**
     * Returns the raw JSON value of [transform].
     *
     * Unlike [transform], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _transform(): JsonField<String> = body._transform()

    /**
     * Returns the raw JSON value of [ttlSeconds].
     *
     * Unlike [ttlSeconds], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _ttlSeconds(): JsonField<Long> = body._ttlSeconds()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [UploadGenerateTokenParams].
         *
         * The following fields are required:
         * ```java
         * .fileName()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadGenerateTokenParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(uploadGenerateTokenParams: UploadGenerateTokenParams) = apply {
            body = uploadGenerateTokenParams.body.toBuilder()
            additionalHeaders = uploadGenerateTokenParams.additionalHeaders.toBuilder()
            additionalQueryParams = uploadGenerateTokenParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [fileName]
         * - [allowOverride]
         * - [customId]
         * - [folder]
         * - [maxFileSize]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** Filename for the upload (e.g., avatar.jpg) */
        fun fileName(fileName: String) = apply { body.fileName(fileName) }

        /**
         * Sets [Builder.fileName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileName] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileName(fileName: JsonField<String>) = apply { body.fileName(fileName) }

        /** Which policy fields the uploader may override */
        fun allowOverride(allowOverride: AllowOverride) = apply {
            body.allowOverride(allowOverride)
        }

        /**
         * Sets [Builder.allowOverride] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowOverride] with a well-typed [AllowOverride] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowOverride(allowOverride: JsonField<AllowOverride>) = apply {
            body.allowOverride(allowOverride)
        }

        /** Custom identifier for the file */
        fun customId(customId: String) = apply { body.customId(customId) }

        /**
         * Sets [Builder.customId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customId(customId: JsonField<String>) = apply { body.customId(customId) }

        /** Destination folder path */
        fun folder(folder: String) = apply { body.folder(folder) }

        /**
         * Sets [Builder.folder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folder] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folder(folder: JsonField<String>) = apply { body.folder(folder) }

        /** Maximum allowed file size in bytes */
        fun maxFileSize(maxFileSize: Long) = apply { body.maxFileSize(maxFileSize) }

        /**
         * Sets [Builder.maxFileSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.maxFileSize] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun maxFileSize(maxFileSize: JsonField<Long>) = apply { body.maxFileSize(maxFileSize) }

        /** Custom metadata to attach */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Add a random prefix to the filename */
        fun randomPrefix(randomPrefix: Boolean) = apply { body.randomPrefix(randomPrefix) }

        /**
         * Sets [Builder.randomPrefix] to an arbitrary JSON value.
         *
         * You should usually call [Builder.randomPrefix] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun randomPrefix(randomPrefix: JsonField<Boolean>) = apply {
            body.randomPrefix(randomPrefix)
        }

        /** Tags to apply to the uploaded file */
        fun tags(tags: List<String>) = apply { body.tags(tags) }

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tags(tags: JsonField<List<String>>) = apply { body.tags(tags) }

        /**
         * Adds a single [String] to [tags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addTag(tag: String) = apply { body.addTag(tag) }

        /** Transformation string applied on upload */
        fun transform(transform: String) = apply { body.transform(transform) }

        /**
         * Sets [Builder.transform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transform] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun transform(transform: JsonField<String>) = apply { body.transform(transform) }

        /** Token lifetime in seconds (default: 300) */
        fun ttlSeconds(ttlSeconds: Long) = apply { body.ttlSeconds(ttlSeconds) }

        /**
         * Sets [Builder.ttlSeconds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ttlSeconds] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { body.ttlSeconds(ttlSeconds) }

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
         * Returns an immutable instance of [UploadGenerateTokenParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .fileName()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UploadGenerateTokenParams =
            UploadGenerateTokenParams(
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
        private val fileName: JsonField<String>,
        private val allowOverride: JsonField<AllowOverride>,
        private val customId: JsonField<String>,
        private val folder: JsonField<String>,
        private val maxFileSize: JsonField<Long>,
        private val metadata: JsonField<Metadata>,
        private val randomPrefix: JsonField<Boolean>,
        private val tags: JsonField<List<String>>,
        private val transform: JsonField<String>,
        private val ttlSeconds: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("file_name")
            @ExcludeMissing
            fileName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("allow_override")
            @ExcludeMissing
            allowOverride: JsonField<AllowOverride> = JsonMissing.of(),
            @JsonProperty("custom_id")
            @ExcludeMissing
            customId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("folder") @ExcludeMissing folder: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_file_size")
            @ExcludeMissing
            maxFileSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("random_prefix")
            @ExcludeMissing
            randomPrefix: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("transform")
            @ExcludeMissing
            transform: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ttl_seconds")
            @ExcludeMissing
            ttlSeconds: JsonField<Long> = JsonMissing.of(),
        ) : this(
            fileName,
            allowOverride,
            customId,
            folder,
            maxFileSize,
            metadata,
            randomPrefix,
            tags,
            transform,
            ttlSeconds,
            mutableMapOf(),
        )

        /**
         * Filename for the upload (e.g., avatar.jpg)
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun fileName(): String = fileName.getRequired("file_name")

        /**
         * Which policy fields the uploader may override
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allowOverride(): Optional<AllowOverride> = allowOverride.getOptional("allow_override")

        /**
         * Custom identifier for the file
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun customId(): Optional<String> = customId.getOptional("custom_id")

        /**
         * Destination folder path
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun folder(): Optional<String> = folder.getOptional("folder")

        /**
         * Maximum allowed file size in bytes
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxFileSize(): Optional<Long> = maxFileSize.getOptional("max_file_size")

        /**
         * Custom metadata to attach
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Add a random prefix to the filename
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun randomPrefix(): Optional<Boolean> = randomPrefix.getOptional("random_prefix")

        /**
         * Tags to apply to the uploaded file
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * Transformation string applied on upload
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transform(): Optional<String> = transform.getOptional("transform")

        /**
         * Token lifetime in seconds (default: 300)
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun ttlSeconds(): Optional<Long> = ttlSeconds.getOptional("ttl_seconds")

        /**
         * Returns the raw JSON value of [fileName].
         *
         * Unlike [fileName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("file_name") @ExcludeMissing fun _fileName(): JsonField<String> = fileName

        /**
         * Returns the raw JSON value of [allowOverride].
         *
         * Unlike [allowOverride], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("allow_override")
        @ExcludeMissing
        fun _allowOverride(): JsonField<AllowOverride> = allowOverride

        /**
         * Returns the raw JSON value of [customId].
         *
         * Unlike [customId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("custom_id") @ExcludeMissing fun _customId(): JsonField<String> = customId

        /**
         * Returns the raw JSON value of [folder].
         *
         * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("folder") @ExcludeMissing fun _folder(): JsonField<String> = folder

        /**
         * Returns the raw JSON value of [maxFileSize].
         *
         * Unlike [maxFileSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("max_file_size")
        @ExcludeMissing
        fun _maxFileSize(): JsonField<Long> = maxFileSize

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /**
         * Returns the raw JSON value of [randomPrefix].
         *
         * Unlike [randomPrefix], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("random_prefix")
        @ExcludeMissing
        fun _randomPrefix(): JsonField<Boolean> = randomPrefix

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

        /**
         * Returns the raw JSON value of [transform].
         *
         * Unlike [transform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transform") @ExcludeMissing fun _transform(): JsonField<String> = transform

        /**
         * Returns the raw JSON value of [ttlSeconds].
         *
         * Unlike [ttlSeconds], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ttl_seconds") @ExcludeMissing fun _ttlSeconds(): JsonField<Long> = ttlSeconds

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
             * .fileName()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var fileName: JsonField<String>? = null
            private var allowOverride: JsonField<AllowOverride> = JsonMissing.of()
            private var customId: JsonField<String> = JsonMissing.of()
            private var folder: JsonField<String> = JsonMissing.of()
            private var maxFileSize: JsonField<Long> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var randomPrefix: JsonField<Boolean> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var transform: JsonField<String> = JsonMissing.of()
            private var ttlSeconds: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                fileName = body.fileName
                allowOverride = body.allowOverride
                customId = body.customId
                folder = body.folder
                maxFileSize = body.maxFileSize
                metadata = body.metadata
                randomPrefix = body.randomPrefix
                tags = body.tags.map { it.toMutableList() }
                transform = body.transform
                ttlSeconds = body.ttlSeconds
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** Filename for the upload (e.g., avatar.jpg) */
            fun fileName(fileName: String) = fileName(JsonField.of(fileName))

            /**
             * Sets [Builder.fileName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileName] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileName(fileName: JsonField<String>) = apply { this.fileName = fileName }

            /** Which policy fields the uploader may override */
            fun allowOverride(allowOverride: AllowOverride) =
                allowOverride(JsonField.of(allowOverride))

            /**
             * Sets [Builder.allowOverride] to an arbitrary JSON value.
             *
             * You should usually call [Builder.allowOverride] with a well-typed [AllowOverride]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun allowOverride(allowOverride: JsonField<AllowOverride>) = apply {
                this.allowOverride = allowOverride
            }

            /** Custom identifier for the file */
            fun customId(customId: String) = customId(JsonField.of(customId))

            /**
             * Sets [Builder.customId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customId(customId: JsonField<String>) = apply { this.customId = customId }

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

            /** Maximum allowed file size in bytes */
            fun maxFileSize(maxFileSize: Long) = maxFileSize(JsonField.of(maxFileSize))

            /**
             * Sets [Builder.maxFileSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxFileSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxFileSize(maxFileSize: JsonField<Long>) = apply { this.maxFileSize = maxFileSize }

            /** Custom metadata to attach */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Add a random prefix to the filename */
            fun randomPrefix(randomPrefix: Boolean) = randomPrefix(JsonField.of(randomPrefix))

            /**
             * Sets [Builder.randomPrefix] to an arbitrary JSON value.
             *
             * You should usually call [Builder.randomPrefix] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun randomPrefix(randomPrefix: JsonField<Boolean>) = apply {
                this.randomPrefix = randomPrefix
            }

            /** Tags to apply to the uploaded file */
            fun tags(tags: List<String>) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed `List<String>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<List<String>>) = apply {
                this.tags = tags.map { it.toMutableList() }
            }

            /**
             * Adds a single [String] to [tags].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTag(tag: String) = apply {
                tags =
                    (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
            }

            /** Transformation string applied on upload */
            fun transform(transform: String) = transform(JsonField.of(transform))

            /**
             * Sets [Builder.transform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transform] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transform(transform: JsonField<String>) = apply { this.transform = transform }

            /** Token lifetime in seconds (default: 300) */
            fun ttlSeconds(ttlSeconds: Long) = ttlSeconds(JsonField.of(ttlSeconds))

            /**
             * Sets [Builder.ttlSeconds] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ttlSeconds] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ttlSeconds(ttlSeconds: JsonField<Long>) = apply { this.ttlSeconds = ttlSeconds }

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
             * .fileName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("fileName", fileName),
                    allowOverride,
                    customId,
                    folder,
                    maxFileSize,
                    metadata,
                    randomPrefix,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    transform,
                    ttlSeconds,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            fileName()
            allowOverride().ifPresent { it.validate() }
            customId()
            folder()
            maxFileSize()
            metadata().ifPresent { it.validate() }
            randomPrefix()
            tags()
            transform()
            ttlSeconds()
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
            (if (fileName.asKnown().isPresent) 1 else 0) +
                (allowOverride.asKnown().getOrNull()?.validity() ?: 0) +
                (if (customId.asKnown().isPresent) 1 else 0) +
                (if (folder.asKnown().isPresent) 1 else 0) +
                (if (maxFileSize.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (if (randomPrefix.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (transform.asKnown().isPresent) 1 else 0) +
                (if (ttlSeconds.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                fileName == other.fileName &&
                allowOverride == other.allowOverride &&
                customId == other.customId &&
                folder == other.folder &&
                maxFileSize == other.maxFileSize &&
                metadata == other.metadata &&
                randomPrefix == other.randomPrefix &&
                tags == other.tags &&
                transform == other.transform &&
                ttlSeconds == other.ttlSeconds &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                fileName,
                allowOverride,
                customId,
                folder,
                maxFileSize,
                metadata,
                randomPrefix,
                tags,
                transform,
                ttlSeconds,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{fileName=$fileName, allowOverride=$allowOverride, customId=$customId, folder=$folder, maxFileSize=$maxFileSize, metadata=$metadata, randomPrefix=$randomPrefix, tags=$tags, transform=$transform, ttlSeconds=$ttlSeconds, additionalProperties=$additionalProperties}"
    }

    /** Which policy fields the uploader may override */
    class AllowOverride
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val folder: JsonField<Boolean>,
        private val tags: JsonField<Boolean>,
        private val transform: JsonField<Boolean>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("folder") @ExcludeMissing folder: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("transform")
            @ExcludeMissing
            transform: JsonField<Boolean> = JsonMissing.of(),
        ) : this(folder, tags, transform, mutableMapOf())

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun folder(): Optional<Boolean> = folder.getOptional("folder")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<Boolean> = tags.getOptional("tags")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transform(): Optional<Boolean> = transform.getOptional("transform")

        /**
         * Returns the raw JSON value of [folder].
         *
         * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("folder") @ExcludeMissing fun _folder(): JsonField<Boolean> = folder

        /**
         * Returns the raw JSON value of [tags].
         *
         * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<Boolean> = tags

        /**
         * Returns the raw JSON value of [transform].
         *
         * Unlike [transform], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transform") @ExcludeMissing fun _transform(): JsonField<Boolean> = transform

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

            /** Returns a mutable builder for constructing an instance of [AllowOverride]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [AllowOverride]. */
        class Builder internal constructor() {

            private var folder: JsonField<Boolean> = JsonMissing.of()
            private var tags: JsonField<Boolean> = JsonMissing.of()
            private var transform: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(allowOverride: AllowOverride) = apply {
                folder = allowOverride.folder
                tags = allowOverride.tags
                transform = allowOverride.transform
                additionalProperties = allowOverride.additionalProperties.toMutableMap()
            }

            fun folder(folder: Boolean) = folder(JsonField.of(folder))

            /**
             * Sets [Builder.folder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.folder] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folder(folder: JsonField<Boolean>) = apply { this.folder = folder }

            fun tags(tags: Boolean) = tags(JsonField.of(tags))

            /**
             * Sets [Builder.tags] to an arbitrary JSON value.
             *
             * You should usually call [Builder.tags] with a well-typed [Boolean] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun tags(tags: JsonField<Boolean>) = apply { this.tags = tags }

            fun transform(transform: Boolean) = transform(JsonField.of(transform))

            /**
             * Sets [Builder.transform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transform] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transform(transform: JsonField<Boolean>) = apply { this.transform = transform }

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
             * Returns an immutable instance of [AllowOverride].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): AllowOverride =
                AllowOverride(folder, tags, transform, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): AllowOverride = apply {
            if (validated) {
                return@apply
            }

            folder()
            tags()
            transform()
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
            (if (folder.asKnown().isPresent) 1 else 0) +
                (if (tags.asKnown().isPresent) 1 else 0) +
                (if (transform.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AllowOverride &&
                folder == other.folder &&
                tags == other.tags &&
                transform == other.transform &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(folder, tags, transform, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AllowOverride{folder=$folder, tags=$tags, transform=$transform, additionalProperties=$additionalProperties}"
    }

    /** Custom metadata to attach */
    class Metadata
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                additionalProperties = metadata.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Metadata{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadGenerateTokenParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UploadGenerateTokenParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
