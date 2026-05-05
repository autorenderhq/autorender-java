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
import io.autorender.core.checkKnown
import io.autorender.core.checkRequired
import io.autorender.core.toImmutable
import io.autorender.errors.AutorenderInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Upload created */
class UploadUploadWithTokenResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val customId: JsonField<String>,
    private val fileNo: JsonField<String>,
    private val folderNo: JsonField<String>,
    private val height: JsonField<Long>,
    private val isDuplicate: JsonField<Boolean>,
    private val isPrivate: JsonField<Boolean>,
    private val metadata: JsonField<Metadata>,
    private val mimeType: JsonField<String>,
    private val name: JsonField<String>,
    private val path: JsonField<String>,
    private val size: JsonField<Long>,
    private val tags: JsonField<List<String>>,
    private val uploadSource: JsonField<String>,
    private val url: JsonField<String>,
    private val width: JsonField<Long>,
    private val workspaceId: JsonField<String>,
    private val format: JsonField<String>,
    private val hash: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("custom_id") @ExcludeMissing customId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_no") @ExcludeMissing fileNo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("folder_no") @ExcludeMissing folderNo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("is_duplicate")
        @ExcludeMissing
        isDuplicate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_private")
        @ExcludeMissing
        isPrivate: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("metadata") @ExcludeMissing metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("mime_type") @ExcludeMissing mimeType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("upload_source")
        @ExcludeMissing
        uploadSource: JsonField<String> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("workspace_id")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("format") @ExcludeMissing format: JsonField<String> = JsonMissing.of(),
        @JsonProperty("hash") @ExcludeMissing hash: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        customId,
        fileNo,
        folderNo,
        height,
        isDuplicate,
        isPrivate,
        metadata,
        mimeType,
        name,
        path,
        size,
        tags,
        uploadSource,
        url,
        width,
        workspaceId,
        format,
        hash,
        mutableMapOf(),
    )

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun customId(): Optional<String> = customId.getOptional("custom_id")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fileNo(): String = fileNo.getRequired("file_no")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderNo(): Optional<String> = folderNo.getOptional("folder_no")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Long> = height.getOptional("height")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isDuplicate(): Boolean = isDuplicate.getRequired("is_duplicate")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun isPrivate(): Boolean = isPrivate.getRequired("is_private")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mimeType(): String = mimeType.getRequired("mime_type")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun path(): String = path.getRequired("path")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun size(): Long = size.getRequired("size")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tags(): List<String> = tags.getRequired("tags")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uploadSource(): String = uploadSource.getRequired("upload_source")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun url(): String = url.getRequired("url")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Optional<Long> = width.getOptional("width")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workspaceId(): String = workspaceId.getRequired("workspace_id")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun format(): Optional<String> = format.getOptional("format")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun hash(): Optional<String> = hash.getOptional("hash")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [customId].
     *
     * Unlike [customId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("custom_id") @ExcludeMissing fun _customId(): JsonField<String> = customId

    /**
     * Returns the raw JSON value of [fileNo].
     *
     * Unlike [fileNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_no") @ExcludeMissing fun _fileNo(): JsonField<String> = fileNo

    /**
     * Returns the raw JSON value of [folderNo].
     *
     * Unlike [folderNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_no") @ExcludeMissing fun _folderNo(): JsonField<String> = folderNo

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

    /**
     * Returns the raw JSON value of [isDuplicate].
     *
     * Unlike [isDuplicate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_duplicate")
    @ExcludeMissing
    fun _isDuplicate(): JsonField<Boolean> = isDuplicate

    /**
     * Returns the raw JSON value of [isPrivate].
     *
     * Unlike [isPrivate], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_private") @ExcludeMissing fun _isPrivate(): JsonField<Boolean> = isPrivate

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

    /**
     * Returns the raw JSON value of [mimeType].
     *
     * Unlike [mimeType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mime_type") @ExcludeMissing fun _mimeType(): JsonField<String> = mimeType

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [size].
     *
     * Unlike [size], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("size") @ExcludeMissing fun _size(): JsonField<Long> = size

    /**
     * Returns the raw JSON value of [tags].
     *
     * Unlike [tags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("tags") @ExcludeMissing fun _tags(): JsonField<List<String>> = tags

    /**
     * Returns the raw JSON value of [uploadSource].
     *
     * Unlike [uploadSource], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("upload_source")
    @ExcludeMissing
    fun _uploadSource(): JsonField<String> = uploadSource

    /**
     * Returns the raw JSON value of [url].
     *
     * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

    /**
     * Returns the raw JSON value of [width].
     *
     * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

    /**
     * Returns the raw JSON value of [workspaceId].
     *
     * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspace_id")
    @ExcludeMissing
    fun _workspaceId(): JsonField<String> = workspaceId

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

    /**
     * Returns the raw JSON value of [hash].
     *
     * Unlike [hash], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("hash") @ExcludeMissing fun _hash(): JsonField<String> = hash

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
         * Returns a mutable builder for constructing an instance of
         * [UploadUploadWithTokenResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .customId()
         * .fileNo()
         * .folderNo()
         * .height()
         * .isDuplicate()
         * .isPrivate()
         * .metadata()
         * .mimeType()
         * .name()
         * .path()
         * .size()
         * .tags()
         * .uploadSource()
         * .url()
         * .width()
         * .workspaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadUploadWithTokenResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var customId: JsonField<String>? = null
        private var fileNo: JsonField<String>? = null
        private var folderNo: JsonField<String>? = null
        private var height: JsonField<Long>? = null
        private var isDuplicate: JsonField<Boolean>? = null
        private var isPrivate: JsonField<Boolean>? = null
        private var metadata: JsonField<Metadata>? = null
        private var mimeType: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var path: JsonField<String>? = null
        private var size: JsonField<Long>? = null
        private var tags: JsonField<MutableList<String>>? = null
        private var uploadSource: JsonField<String>? = null
        private var url: JsonField<String>? = null
        private var width: JsonField<Long>? = null
        private var workspaceId: JsonField<String>? = null
        private var format: JsonField<String> = JsonMissing.of()
        private var hash: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uploadUploadWithTokenResponse: UploadUploadWithTokenResponse) = apply {
            id = uploadUploadWithTokenResponse.id
            createdAt = uploadUploadWithTokenResponse.createdAt
            customId = uploadUploadWithTokenResponse.customId
            fileNo = uploadUploadWithTokenResponse.fileNo
            folderNo = uploadUploadWithTokenResponse.folderNo
            height = uploadUploadWithTokenResponse.height
            isDuplicate = uploadUploadWithTokenResponse.isDuplicate
            isPrivate = uploadUploadWithTokenResponse.isPrivate
            metadata = uploadUploadWithTokenResponse.metadata
            mimeType = uploadUploadWithTokenResponse.mimeType
            name = uploadUploadWithTokenResponse.name
            path = uploadUploadWithTokenResponse.path
            size = uploadUploadWithTokenResponse.size
            tags = uploadUploadWithTokenResponse.tags.map { it.toMutableList() }
            uploadSource = uploadUploadWithTokenResponse.uploadSource
            url = uploadUploadWithTokenResponse.url
            width = uploadUploadWithTokenResponse.width
            workspaceId = uploadUploadWithTokenResponse.workspaceId
            format = uploadUploadWithTokenResponse.format
            hash = uploadUploadWithTokenResponse.hash
            additionalProperties = uploadUploadWithTokenResponse.additionalProperties.toMutableMap()
        }

        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun customId(customId: String?) = customId(JsonField.ofNullable(customId))

        /** Alias for calling [Builder.customId] with `customId.orElse(null)`. */
        fun customId(customId: Optional<String>) = customId(customId.getOrNull())

        /**
         * Sets [Builder.customId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.customId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun customId(customId: JsonField<String>) = apply { this.customId = customId }

        fun fileNo(fileNo: String) = fileNo(JsonField.of(fileNo))

        /**
         * Sets [Builder.fileNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileNo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileNo(fileNo: JsonField<String>) = apply { this.fileNo = fileNo }

        fun folderNo(folderNo: String?) = folderNo(JsonField.ofNullable(folderNo))

        /** Alias for calling [Builder.folderNo] with `folderNo.orElse(null)`. */
        fun folderNo(folderNo: Optional<String>) = folderNo(folderNo.getOrNull())

        /**
         * Sets [Builder.folderNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderNo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderNo(folderNo: JsonField<String>) = apply { this.folderNo = folderNo }

        fun height(height: Long?) = height(JsonField.ofNullable(height))

        /**
         * Alias for [Builder.height].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun height(height: Long) = height(height as Long?)

        /** Alias for calling [Builder.height] with `height.orElse(null)`. */
        fun height(height: Optional<Long>) = height(height.getOrNull())

        /**
         * Sets [Builder.height] to an arbitrary JSON value.
         *
         * You should usually call [Builder.height] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun height(height: JsonField<Long>) = apply { this.height = height }

        fun isDuplicate(isDuplicate: Boolean) = isDuplicate(JsonField.of(isDuplicate))

        /**
         * Sets [Builder.isDuplicate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDuplicate] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDuplicate(isDuplicate: JsonField<Boolean>) = apply { this.isDuplicate = isDuplicate }

        fun isPrivate(isPrivate: Boolean) = isPrivate(JsonField.of(isPrivate))

        /**
         * Sets [Builder.isPrivate] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isPrivate] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isPrivate(isPrivate: JsonField<Boolean>) = apply { this.isPrivate = isPrivate }

        fun metadata(metadata: Metadata?) = metadata(JsonField.ofNullable(metadata))

        /** Alias for calling [Builder.metadata] with `metadata.orElse(null)`. */
        fun metadata(metadata: Optional<Metadata>) = metadata(metadata.getOrNull())

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun mimeType(mimeType: String) = mimeType(JsonField.of(mimeType))

        /**
         * Sets [Builder.mimeType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mimeType] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mimeType(mimeType: JsonField<String>) = apply { this.mimeType = mimeType }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun path(path: String) = path(JsonField.of(path))

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        fun size(size: Long) = size(JsonField.of(size))

        /**
         * Sets [Builder.size] to an arbitrary JSON value.
         *
         * You should usually call [Builder.size] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun size(size: JsonField<Long>) = apply { this.size = size }

        fun tags(tags: List<String>) = tags(JsonField.of(tags))

        /**
         * Sets [Builder.tags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tags] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
            tags = (tags ?: JsonField.of(mutableListOf())).also { checkKnown("tags", it).add(tag) }
        }

        fun uploadSource(uploadSource: String) = uploadSource(JsonField.of(uploadSource))

        /**
         * Sets [Builder.uploadSource] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uploadSource] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun uploadSource(uploadSource: JsonField<String>) = apply {
            this.uploadSource = uploadSource
        }

        fun url(url: String) = url(JsonField.of(url))

        /**
         * Sets [Builder.url] to an arbitrary JSON value.
         *
         * You should usually call [Builder.url] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun url(url: JsonField<String>) = apply { this.url = url }

        fun width(width: Long?) = width(JsonField.ofNullable(width))

        /**
         * Alias for [Builder.width].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun width(width: Long) = width(width as Long?)

        /** Alias for calling [Builder.width] with `width.orElse(null)`. */
        fun width(width: Optional<Long>) = width(width.getOrNull())

        /**
         * Sets [Builder.width] to an arbitrary JSON value.
         *
         * You should usually call [Builder.width] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun width(width: JsonField<Long>) = apply { this.width = width }

        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

        fun format(format: String) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<String>) = apply { this.format = format }

        fun hash(hash: String) = hash(JsonField.of(hash))

        /**
         * Sets [Builder.hash] to an arbitrary JSON value.
         *
         * You should usually call [Builder.hash] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun hash(hash: JsonField<String>) = apply { this.hash = hash }

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
         * Returns an immutable instance of [UploadUploadWithTokenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .customId()
         * .fileNo()
         * .folderNo()
         * .height()
         * .isDuplicate()
         * .isPrivate()
         * .metadata()
         * .mimeType()
         * .name()
         * .path()
         * .size()
         * .tags()
         * .uploadSource()
         * .url()
         * .width()
         * .workspaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): UploadUploadWithTokenResponse =
            UploadUploadWithTokenResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("customId", customId),
                checkRequired("fileNo", fileNo),
                checkRequired("folderNo", folderNo),
                checkRequired("height", height),
                checkRequired("isDuplicate", isDuplicate),
                checkRequired("isPrivate", isPrivate),
                checkRequired("metadata", metadata),
                checkRequired("mimeType", mimeType),
                checkRequired("name", name),
                checkRequired("path", path),
                checkRequired("size", size),
                checkRequired("tags", tags).map { it.toImmutable() },
                checkRequired("uploadSource", uploadSource),
                checkRequired("url", url),
                checkRequired("width", width),
                checkRequired("workspaceId", workspaceId),
                format,
                hash,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws AutorenderInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): UploadUploadWithTokenResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        customId()
        fileNo()
        folderNo()
        height()
        isDuplicate()
        isPrivate()
        metadata().ifPresent { it.validate() }
        mimeType()
        name()
        path()
        size()
        tags()
        uploadSource()
        url()
        width()
        workspaceId()
        format()
        hash()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (customId.asKnown().isPresent) 1 else 0) +
            (if (fileNo.asKnown().isPresent) 1 else 0) +
            (if (folderNo.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (isDuplicate.asKnown().isPresent) 1 else 0) +
            (if (isPrivate.asKnown().isPresent) 1 else 0) +
            (metadata.asKnown().getOrNull()?.validity() ?: 0) +
            (if (mimeType.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (size.asKnown().isPresent) 1 else 0) +
            (tags.asKnown().getOrNull()?.size ?: 0) +
            (if (uploadSource.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0) +
            (if (format.asKnown().isPresent) 1 else 0) +
            (if (hash.asKnown().isPresent) 1 else 0)

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws AutorenderInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

        return other is UploadUploadWithTokenResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            customId == other.customId &&
            fileNo == other.fileNo &&
            folderNo == other.folderNo &&
            height == other.height &&
            isDuplicate == other.isDuplicate &&
            isPrivate == other.isPrivate &&
            metadata == other.metadata &&
            mimeType == other.mimeType &&
            name == other.name &&
            path == other.path &&
            size == other.size &&
            tags == other.tags &&
            uploadSource == other.uploadSource &&
            url == other.url &&
            width == other.width &&
            workspaceId == other.workspaceId &&
            format == other.format &&
            hash == other.hash &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            customId,
            fileNo,
            folderNo,
            height,
            isDuplicate,
            isPrivate,
            metadata,
            mimeType,
            name,
            path,
            size,
            tags,
            uploadSource,
            url,
            width,
            workspaceId,
            format,
            hash,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UploadUploadWithTokenResponse{id=$id, createdAt=$createdAt, customId=$customId, fileNo=$fileNo, folderNo=$folderNo, height=$height, isDuplicate=$isDuplicate, isPrivate=$isPrivate, metadata=$metadata, mimeType=$mimeType, name=$name, path=$path, size=$size, tags=$tags, uploadSource=$uploadSource, url=$url, width=$width, workspaceId=$workspaceId, format=$format, hash=$hash, additionalProperties=$additionalProperties}"
}
