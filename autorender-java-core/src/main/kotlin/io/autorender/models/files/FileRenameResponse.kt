// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import io.autorender.core.ExcludeMissing
import io.autorender.core.JsonField
import io.autorender.core.JsonMissing
import io.autorender.core.JsonValue
import io.autorender.core.toImmutable
import io.autorender.errors.AutorenderInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** Updated file record after rename */
class FileRenameResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val extension: JsonField<String>,
    private val fileNo: JsonField<String>,
    private val fileSize: JsonField<Long>,
    private val folderId: JsonField<String>,
    private val format: JsonField<String>,
    private val height: JsonField<Long>,
    private val isActive: JsonField<Boolean>,
    private val isDefault: JsonField<Boolean>,
    private val isDelete: JsonField<Boolean>,
    private val metaData: JsonField<MetaData>,
    private val name: JsonField<String>,
    private val orientation: JsonField<String>,
    private val originalUrl: JsonField<String>,
    private val path: JsonField<String>,
    private val source: JsonField<String>,
    private val transformString: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val url: JsonField<String>,
    private val width: JsonField<Long>,
    private val workspaceId: JsonField<String>,
    private val workspaceNo: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by") @ExcludeMissing createdBy: JsonField<String> = JsonMissing.of(),
        @JsonProperty("extension") @ExcludeMissing extension: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_no") @ExcludeMissing fileNo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("file_size") @ExcludeMissing fileSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("folder_id") @ExcludeMissing folderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("format") @ExcludeMissing format: JsonField<String> = JsonMissing.of(),
        @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_default")
        @ExcludeMissing
        isDefault: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_delete") @ExcludeMissing isDelete: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("meta_data") @ExcludeMissing metaData: JsonField<MetaData> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("orientation")
        @ExcludeMissing
        orientation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("original_url")
        @ExcludeMissing
        originalUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transform_string")
        @ExcludeMissing
        transformString: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
        @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("workspace_id")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspace_no")
        @ExcludeMissing
        workspaceNo: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        createdBy,
        extension,
        fileNo,
        fileSize,
        folderId,
        format,
        height,
        isActive,
        isDefault,
        isDelete,
        metaData,
        name,
        orientation,
        originalUrl,
        path,
        source,
        transformString,
        updatedAt,
        url,
        width,
        workspaceId,
        workspaceNo,
        mutableMapOf(),
    )

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun id(): Optional<String> = id.getOptional("id")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): Optional<String> = createdBy.getOptional("created_by")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun extension(): Optional<String> = extension.getOptional("extension")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileNo(): Optional<String> = fileNo.getOptional("file_no")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun fileSize(): Optional<Long> = fileSize.getOptional("file_size")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderId(): Optional<String> = folderId.getOptional("folder_id")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun format(): Optional<String> = format.getOptional("format")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun height(): Optional<Long> = height.getOptional("height")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDefault(): Optional<Boolean> = isDefault.getOptional("is_default")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDelete(): Optional<Boolean> = isDelete.getOptional("is_delete")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metaData(): Optional<MetaData> = metaData.getOptional("meta_data")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun orientation(): Optional<String> = orientation.getOptional("orientation")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originalUrl(): Optional<String> = originalUrl.getOptional("original_url")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun path(): Optional<String> = path.getOptional("path")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun source(): Optional<String> = source.getOptional("source")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun transformString(): Optional<String> = transformString.getOptional("transform_string")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun url(): Optional<String> = url.getOptional("url")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun width(): Optional<Long> = width.getOptional("width")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceNo(): Optional<String> = workspaceNo.getOptional("workspace_no")

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
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<String> = createdBy

    /**
     * Returns the raw JSON value of [extension].
     *
     * Unlike [extension], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("extension") @ExcludeMissing fun _extension(): JsonField<String> = extension

    /**
     * Returns the raw JSON value of [fileNo].
     *
     * Unlike [fileNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_no") @ExcludeMissing fun _fileNo(): JsonField<String> = fileNo

    /**
     * Returns the raw JSON value of [fileSize].
     *
     * Unlike [fileSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("file_size") @ExcludeMissing fun _fileSize(): JsonField<Long> = fileSize

    /**
     * Returns the raw JSON value of [folderId].
     *
     * Unlike [folderId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_id") @ExcludeMissing fun _folderId(): JsonField<String> = folderId

    /**
     * Returns the raw JSON value of [format].
     *
     * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

    /**
     * Returns the raw JSON value of [height].
     *
     * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [isDefault].
     *
     * Unlike [isDefault], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_default") @ExcludeMissing fun _isDefault(): JsonField<Boolean> = isDefault

    /**
     * Returns the raw JSON value of [isDelete].
     *
     * Unlike [isDelete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_delete") @ExcludeMissing fun _isDelete(): JsonField<Boolean> = isDelete

    /**
     * Returns the raw JSON value of [metaData].
     *
     * Unlike [metaData], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("meta_data") @ExcludeMissing fun _metaData(): JsonField<MetaData> = metaData

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [orientation].
     *
     * Unlike [orientation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("orientation") @ExcludeMissing fun _orientation(): JsonField<String> = orientation

    /**
     * Returns the raw JSON value of [originalUrl].
     *
     * Unlike [originalUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("original_url")
    @ExcludeMissing
    fun _originalUrl(): JsonField<String> = originalUrl

    /**
     * Returns the raw JSON value of [path].
     *
     * Unlike [path], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("path") @ExcludeMissing fun _path(): JsonField<String> = path

    /**
     * Returns the raw JSON value of [source].
     *
     * Unlike [source], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<String> = source

    /**
     * Returns the raw JSON value of [transformString].
     *
     * Unlike [transformString], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("transform_string")
    @ExcludeMissing
    fun _transformString(): JsonField<String> = transformString

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

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
     * Returns the raw JSON value of [workspaceNo].
     *
     * Unlike [workspaceNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspace_no")
    @ExcludeMissing
    fun _workspaceNo(): JsonField<String> = workspaceNo

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

        /** Returns a mutable builder for constructing an instance of [FileRenameResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileRenameResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var extension: JsonField<String> = JsonMissing.of()
        private var fileNo: JsonField<String> = JsonMissing.of()
        private var fileSize: JsonField<Long> = JsonMissing.of()
        private var folderId: JsonField<String> = JsonMissing.of()
        private var format: JsonField<String> = JsonMissing.of()
        private var height: JsonField<Long> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var isDefault: JsonField<Boolean> = JsonMissing.of()
        private var isDelete: JsonField<Boolean> = JsonMissing.of()
        private var metaData: JsonField<MetaData> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var orientation: JsonField<String> = JsonMissing.of()
        private var originalUrl: JsonField<String> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var transformString: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var url: JsonField<String> = JsonMissing.of()
        private var width: JsonField<Long> = JsonMissing.of()
        private var workspaceId: JsonField<String> = JsonMissing.of()
        private var workspaceNo: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileRenameResponse: FileRenameResponse) = apply {
            id = fileRenameResponse.id
            createdAt = fileRenameResponse.createdAt
            createdBy = fileRenameResponse.createdBy
            extension = fileRenameResponse.extension
            fileNo = fileRenameResponse.fileNo
            fileSize = fileRenameResponse.fileSize
            folderId = fileRenameResponse.folderId
            format = fileRenameResponse.format
            height = fileRenameResponse.height
            isActive = fileRenameResponse.isActive
            isDefault = fileRenameResponse.isDefault
            isDelete = fileRenameResponse.isDelete
            metaData = fileRenameResponse.metaData
            name = fileRenameResponse.name
            orientation = fileRenameResponse.orientation
            originalUrl = fileRenameResponse.originalUrl
            path = fileRenameResponse.path
            source = fileRenameResponse.source
            transformString = fileRenameResponse.transformString
            updatedAt = fileRenameResponse.updatedAt
            url = fileRenameResponse.url
            width = fileRenameResponse.width
            workspaceId = fileRenameResponse.workspaceId
            workspaceNo = fileRenameResponse.workspaceNo
            additionalProperties = fileRenameResponse.additionalProperties.toMutableMap()
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

        fun createdBy(createdBy: String) = createdBy(JsonField.of(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<String>) = apply { this.createdBy = createdBy }

        fun extension(extension: String) = extension(JsonField.of(extension))

        /**
         * Sets [Builder.extension] to an arbitrary JSON value.
         *
         * You should usually call [Builder.extension] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun extension(extension: JsonField<String>) = apply { this.extension = extension }

        fun fileNo(fileNo: String) = fileNo(JsonField.of(fileNo))

        /**
         * Sets [Builder.fileNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileNo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileNo(fileNo: JsonField<String>) = apply { this.fileNo = fileNo }

        fun fileSize(fileSize: Long) = fileSize(JsonField.of(fileSize))

        /**
         * Sets [Builder.fileSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fileSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun fileSize(fileSize: JsonField<Long>) = apply { this.fileSize = fileSize }

        fun folderId(folderId: String?) = folderId(JsonField.ofNullable(folderId))

        /** Alias for calling [Builder.folderId] with `folderId.orElse(null)`. */
        fun folderId(folderId: Optional<String>) = folderId(folderId.getOrNull())

        /**
         * Sets [Builder.folderId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderId(folderId: JsonField<String>) = apply { this.folderId = folderId }

        fun format(format: String) = format(JsonField.of(format))

        /**
         * Sets [Builder.format] to an arbitrary JSON value.
         *
         * You should usually call [Builder.format] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun format(format: JsonField<String>) = apply { this.format = format }

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

        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        fun isDefault(isDefault: Boolean) = isDefault(JsonField.of(isDefault))

        /**
         * Sets [Builder.isDefault] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDefault] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDefault(isDefault: JsonField<Boolean>) = apply { this.isDefault = isDefault }

        fun isDelete(isDelete: Boolean) = isDelete(JsonField.of(isDelete))

        /**
         * Sets [Builder.isDelete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDelete] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDelete(isDelete: JsonField<Boolean>) = apply { this.isDelete = isDelete }

        fun metaData(metaData: MetaData) = metaData(JsonField.of(metaData))

        /**
         * Sets [Builder.metaData] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metaData] with a well-typed [MetaData] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metaData(metaData: JsonField<MetaData>) = apply { this.metaData = metaData }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun orientation(orientation: String?) = orientation(JsonField.ofNullable(orientation))

        /** Alias for calling [Builder.orientation] with `orientation.orElse(null)`. */
        fun orientation(orientation: Optional<String>) = orientation(orientation.getOrNull())

        /**
         * Sets [Builder.orientation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.orientation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun orientation(orientation: JsonField<String>) = apply { this.orientation = orientation }

        fun originalUrl(originalUrl: String?) = originalUrl(JsonField.ofNullable(originalUrl))

        /** Alias for calling [Builder.originalUrl] with `originalUrl.orElse(null)`. */
        fun originalUrl(originalUrl: Optional<String>) = originalUrl(originalUrl.getOrNull())

        /**
         * Sets [Builder.originalUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun originalUrl(originalUrl: JsonField<String>) = apply { this.originalUrl = originalUrl }

        fun path(path: String?) = path(JsonField.ofNullable(path))

        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
        fun path(path: Optional<String>) = path(path.getOrNull())

        /**
         * Sets [Builder.path] to an arbitrary JSON value.
         *
         * You should usually call [Builder.path] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun path(path: JsonField<String>) = apply { this.path = path }

        fun source(source: String) = source(JsonField.of(source))

        /**
         * Sets [Builder.source] to an arbitrary JSON value.
         *
         * You should usually call [Builder.source] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun source(source: JsonField<String>) = apply { this.source = source }

        fun transformString(transformString: String?) =
            transformString(JsonField.ofNullable(transformString))

        /** Alias for calling [Builder.transformString] with `transformString.orElse(null)`. */
        fun transformString(transformString: Optional<String>) =
            transformString(transformString.getOrNull())

        /**
         * Sets [Builder.transformString] to an arbitrary JSON value.
         *
         * You should usually call [Builder.transformString] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun transformString(transformString: JsonField<String>) = apply {
            this.transformString = transformString
        }

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

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

        fun workspaceNo(workspaceNo: String) = workspaceNo(JsonField.of(workspaceNo))

        /**
         * Sets [Builder.workspaceNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceNo] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceNo(workspaceNo: JsonField<String>) = apply { this.workspaceNo = workspaceNo }

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
         * Returns an immutable instance of [FileRenameResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileRenameResponse =
            FileRenameResponse(
                id,
                createdAt,
                createdBy,
                extension,
                fileNo,
                fileSize,
                folderId,
                format,
                height,
                isActive,
                isDefault,
                isDelete,
                metaData,
                name,
                orientation,
                originalUrl,
                path,
                source,
                transformString,
                updatedAt,
                url,
                width,
                workspaceId,
                workspaceNo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FileRenameResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        createdBy()
        extension()
        fileNo()
        fileSize()
        folderId()
        format()
        height()
        isActive()
        isDefault()
        isDelete()
        metaData().ifPresent { it.validate() }
        name()
        orientation()
        originalUrl()
        path()
        source()
        transformString()
        updatedAt()
        url()
        width()
        workspaceId()
        workspaceNo()
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
            (if (createdBy.asKnown().isPresent) 1 else 0) +
            (if (extension.asKnown().isPresent) 1 else 0) +
            (if (fileNo.asKnown().isPresent) 1 else 0) +
            (if (fileSize.asKnown().isPresent) 1 else 0) +
            (if (folderId.asKnown().isPresent) 1 else 0) +
            (if (format.asKnown().isPresent) 1 else 0) +
            (if (height.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (isDefault.asKnown().isPresent) 1 else 0) +
            (if (isDelete.asKnown().isPresent) 1 else 0) +
            (metaData.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (orientation.asKnown().isPresent) 1 else 0) +
            (if (originalUrl.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (transformString.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (if (url.asKnown().isPresent) 1 else 0) +
            (if (width.asKnown().isPresent) 1 else 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0) +
            (if (workspaceNo.asKnown().isPresent) 1 else 0)

    class MetaData
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

            /** Returns a mutable builder for constructing an instance of [MetaData]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MetaData]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metaData: MetaData) = apply {
                additionalProperties = metaData.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [MetaData].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): MetaData = MetaData(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): MetaData = apply {
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

            return other is MetaData && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "MetaData{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileRenameResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            extension == other.extension &&
            fileNo == other.fileNo &&
            fileSize == other.fileSize &&
            folderId == other.folderId &&
            format == other.format &&
            height == other.height &&
            isActive == other.isActive &&
            isDefault == other.isDefault &&
            isDelete == other.isDelete &&
            metaData == other.metaData &&
            name == other.name &&
            orientation == other.orientation &&
            originalUrl == other.originalUrl &&
            path == other.path &&
            source == other.source &&
            transformString == other.transformString &&
            updatedAt == other.updatedAt &&
            url == other.url &&
            width == other.width &&
            workspaceId == other.workspaceId &&
            workspaceNo == other.workspaceNo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            createdBy,
            extension,
            fileNo,
            fileSize,
            folderId,
            format,
            height,
            isActive,
            isDefault,
            isDelete,
            metaData,
            name,
            orientation,
            originalUrl,
            path,
            source,
            transformString,
            updatedAt,
            url,
            width,
            workspaceId,
            workspaceNo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileRenameResponse{id=$id, createdAt=$createdAt, createdBy=$createdBy, extension=$extension, fileNo=$fileNo, fileSize=$fileSize, folderId=$folderId, format=$format, height=$height, isActive=$isActive, isDefault=$isDefault, isDelete=$isDelete, metaData=$metaData, name=$name, orientation=$orientation, originalUrl=$originalUrl, path=$path, source=$source, transformString=$transformString, updatedAt=$updatedAt, url=$url, width=$width, workspaceId=$workspaceId, workspaceNo=$workspaceNo, additionalProperties=$additionalProperties}"
}
