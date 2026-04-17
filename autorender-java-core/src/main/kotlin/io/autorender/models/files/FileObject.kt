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
import io.autorender.errors.AutorenderInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FileObject
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val data: JsonField<Data>,
    private val success: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("data") @ExcludeMissing data: JsonField<Data> = JsonMissing.of(),
        @JsonProperty("success") @ExcludeMissing success: JsonField<Boolean> = JsonMissing.of(),
    ) : this(data, success, mutableMapOf())

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun data(): Optional<Data> = data.getOptional("data")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun success(): Optional<Boolean> = success.getOptional("success")

    /**
     * Returns the raw JSON value of [data].
     *
     * Unlike [data], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("data") @ExcludeMissing fun _data(): JsonField<Data> = data

    /**
     * Returns the raw JSON value of [success].
     *
     * Unlike [success], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("success") @ExcludeMissing fun _success(): JsonField<Boolean> = success

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

        /** Returns a mutable builder for constructing an instance of [FileObject]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileObject]. */
    class Builder internal constructor() {

        private var data: JsonField<Data> = JsonMissing.of()
        private var success: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(fileObject: FileObject) = apply {
            data = fileObject.data
            success = fileObject.success
            additionalProperties = fileObject.additionalProperties.toMutableMap()
        }

        fun data(data: Data) = data(JsonField.of(data))

        /**
         * Sets [Builder.data] to an arbitrary JSON value.
         *
         * You should usually call [Builder.data] with a well-typed [Data] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun data(data: JsonField<Data>) = apply { this.data = data }

        fun success(success: Boolean) = success(JsonField.of(success))

        /**
         * Sets [Builder.success] to an arbitrary JSON value.
         *
         * You should usually call [Builder.success] with a well-typed [Boolean] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun success(success: JsonField<Boolean>) = apply { this.success = success }

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
         * Returns an immutable instance of [FileObject].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileObject = FileObject(data, success, additionalProperties.toMutableMap())
    }

    private var validated: Boolean = false

    fun validate(): FileObject = apply {
        if (validated) {
            return@apply
        }

        data().ifPresent { it.validate() }
        success()
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
        (data.asKnown().getOrNull()?.validity() ?: 0) + (if (success.asKnown().isPresent) 1 else 0)

    class Data
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val assetKey: JsonField<String>,
        private val assetUrl: JsonField<String>,
        private val dimensions: JsonField<Dimensions>,
        private val extension: JsonField<String>,
        private val fileNo: JsonField<String>,
        private val folder: JsonValue,
        private val format: JsonField<String>,
        private val name: JsonField<String>,
        private val path: JsonField<String>,
        private val size: JsonField<Long>,
        private val uploadedAt: JsonField<OffsetDateTime>,
        private val uploadedBy: JsonField<String>,
        private val url: JsonField<String>,
        private val workspace: JsonField<Workspace>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("asset_key")
            @ExcludeMissing
            assetKey: JsonField<String> = JsonMissing.of(),
            @JsonProperty("asset_url")
            @ExcludeMissing
            assetUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("dimensions")
            @ExcludeMissing
            dimensions: JsonField<Dimensions> = JsonMissing.of(),
            @JsonProperty("extension")
            @ExcludeMissing
            extension: JsonField<String> = JsonMissing.of(),
            @JsonProperty("file_no") @ExcludeMissing fileNo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("folder") @ExcludeMissing folder: JsonValue = JsonMissing.of(),
            @JsonProperty("format") @ExcludeMissing format: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("uploaded_at")
            @ExcludeMissing
            uploadedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("uploaded_by")
            @ExcludeMissing
            uploadedBy: JsonField<String> = JsonMissing.of(),
            @JsonProperty("url") @ExcludeMissing url: JsonField<String> = JsonMissing.of(),
            @JsonProperty("workspace")
            @ExcludeMissing
            workspace: JsonField<Workspace> = JsonMissing.of(),
        ) : this(
            id,
            assetKey,
            assetUrl,
            dimensions,
            extension,
            fileNo,
            folder,
            format,
            name,
            path,
            size,
            uploadedAt,
            uploadedBy,
            url,
            workspace,
            mutableMapOf(),
        )

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun id(): Optional<String> = id.getOptional("id")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun assetKey(): Optional<String> = assetKey.getOptional("asset_key")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun assetUrl(): Optional<String> = assetUrl.getOptional("asset_url")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun dimensions(): Optional<Dimensions> = dimensions.getOptional("dimensions")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun extension(): Optional<String> = extension.getOptional("extension")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun fileNo(): Optional<String> = fileNo.getOptional("file_no")

        /**
         * This arbitrary value can be deserialized into a custom type using the `convert` method:
         * ```java
         * MyClass myObject = data.folder().convert(MyClass.class);
         * ```
         */
        @JsonProperty("folder") @ExcludeMissing fun _folder(): JsonValue = folder

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun format(): Optional<String> = format.getOptional("format")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun name(): Optional<String> = name.getOptional("name")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun path(): Optional<String> = path.getOptional("path")

        /**
         * File size in bytes
         *
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun size(): Optional<Long> = size.getOptional("size")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uploadedAt(): Optional<OffsetDateTime> = uploadedAt.getOptional("uploaded_at")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun uploadedBy(): Optional<String> = uploadedBy.getOptional("uploaded_by")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun url(): Optional<String> = url.getOptional("url")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workspace(): Optional<Workspace> = workspace.getOptional("workspace")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [assetKey].
         *
         * Unlike [assetKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("asset_key") @ExcludeMissing fun _assetKey(): JsonField<String> = assetKey

        /**
         * Returns the raw JSON value of [assetUrl].
         *
         * Unlike [assetUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("asset_url") @ExcludeMissing fun _assetUrl(): JsonField<String> = assetUrl

        /**
         * Returns the raw JSON value of [dimensions].
         *
         * Unlike [dimensions], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dimensions")
        @ExcludeMissing
        fun _dimensions(): JsonField<Dimensions> = dimensions

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
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

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
         * Returns the raw JSON value of [uploadedAt].
         *
         * Unlike [uploadedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uploaded_at")
        @ExcludeMissing
        fun _uploadedAt(): JsonField<OffsetDateTime> = uploadedAt

        /**
         * Returns the raw JSON value of [uploadedBy].
         *
         * Unlike [uploadedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("uploaded_by")
        @ExcludeMissing
        fun _uploadedBy(): JsonField<String> = uploadedBy

        /**
         * Returns the raw JSON value of [url].
         *
         * Unlike [url], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("url") @ExcludeMissing fun _url(): JsonField<String> = url

        /**
         * Returns the raw JSON value of [workspace].
         *
         * Unlike [workspace], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("workspace")
        @ExcludeMissing
        fun _workspace(): JsonField<Workspace> = workspace

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

            /** Returns a mutable builder for constructing an instance of [Data]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Data]. */
        class Builder internal constructor() {

            private var id: JsonField<String> = JsonMissing.of()
            private var assetKey: JsonField<String> = JsonMissing.of()
            private var assetUrl: JsonField<String> = JsonMissing.of()
            private var dimensions: JsonField<Dimensions> = JsonMissing.of()
            private var extension: JsonField<String> = JsonMissing.of()
            private var fileNo: JsonField<String> = JsonMissing.of()
            private var folder: JsonValue = JsonMissing.of()
            private var format: JsonField<String> = JsonMissing.of()
            private var name: JsonField<String> = JsonMissing.of()
            private var path: JsonField<String> = JsonMissing.of()
            private var size: JsonField<Long> = JsonMissing.of()
            private var uploadedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var uploadedBy: JsonField<String> = JsonMissing.of()
            private var url: JsonField<String> = JsonMissing.of()
            private var workspace: JsonField<Workspace> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(data: Data) = apply {
                id = data.id
                assetKey = data.assetKey
                assetUrl = data.assetUrl
                dimensions = data.dimensions
                extension = data.extension
                fileNo = data.fileNo
                folder = data.folder
                format = data.format
                name = data.name
                path = data.path
                size = data.size
                uploadedAt = data.uploadedAt
                uploadedBy = data.uploadedBy
                url = data.url
                workspace = data.workspace
                additionalProperties = data.additionalProperties.toMutableMap()
            }

            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            fun assetKey(assetKey: String) = assetKey(JsonField.of(assetKey))

            /**
             * Sets [Builder.assetKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assetKey] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assetKey(assetKey: JsonField<String>) = apply { this.assetKey = assetKey }

            fun assetUrl(assetUrl: String) = assetUrl(JsonField.of(assetUrl))

            /**
             * Sets [Builder.assetUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.assetUrl] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun assetUrl(assetUrl: JsonField<String>) = apply { this.assetUrl = assetUrl }

            fun dimensions(dimensions: Dimensions) = dimensions(JsonField.of(dimensions))

            /**
             * Sets [Builder.dimensions] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dimensions] with a well-typed [Dimensions] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dimensions(dimensions: JsonField<Dimensions>) = apply {
                this.dimensions = dimensions
            }

            fun extension(extension: String) = extension(JsonField.of(extension))

            /**
             * Sets [Builder.extension] to an arbitrary JSON value.
             *
             * You should usually call [Builder.extension] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun extension(extension: JsonField<String>) = apply { this.extension = extension }

            fun fileNo(fileNo: String) = fileNo(JsonField.of(fileNo))

            /**
             * Sets [Builder.fileNo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.fileNo] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun fileNo(fileNo: JsonField<String>) = apply { this.fileNo = fileNo }

            fun folder(folder: JsonValue) = apply { this.folder = folder }

            fun format(format: String) = format(JsonField.of(format))

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<String>) = apply { this.format = format }

            fun name(name: String) = name(JsonField.of(name))

            /**
             * Sets [Builder.name] to an arbitrary JSON value.
             *
             * You should usually call [Builder.name] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun name(name: JsonField<String>) = apply { this.name = name }

            fun path(path: String?) = path(JsonField.ofNullable(path))

            /** Alias for calling [Builder.path] with `path.orElse(null)`. */
            fun path(path: Optional<String>) = path(path.getOrNull())

            /**
             * Sets [Builder.path] to an arbitrary JSON value.
             *
             * You should usually call [Builder.path] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun path(path: JsonField<String>) = apply { this.path = path }

            /** File size in bytes */
            fun size(size: Long) = size(JsonField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Long>) = apply { this.size = size }

            fun uploadedAt(uploadedAt: OffsetDateTime) = uploadedAt(JsonField.of(uploadedAt))

            /**
             * Sets [Builder.uploadedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uploadedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uploadedAt(uploadedAt: JsonField<OffsetDateTime>) = apply {
                this.uploadedAt = uploadedAt
            }

            fun uploadedBy(uploadedBy: String) = uploadedBy(JsonField.of(uploadedBy))

            /**
             * Sets [Builder.uploadedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.uploadedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun uploadedBy(uploadedBy: JsonField<String>) = apply { this.uploadedBy = uploadedBy }

            fun url(url: String) = url(JsonField.of(url))

            /**
             * Sets [Builder.url] to an arbitrary JSON value.
             *
             * You should usually call [Builder.url] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun url(url: JsonField<String>) = apply { this.url = url }

            fun workspace(workspace: Workspace) = workspace(JsonField.of(workspace))

            /**
             * Sets [Builder.workspace] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspace] with a well-typed [Workspace] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun workspace(workspace: JsonField<Workspace>) = apply { this.workspace = workspace }

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
             * Returns an immutable instance of [Data].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Data =
                Data(
                    id,
                    assetKey,
                    assetUrl,
                    dimensions,
                    extension,
                    fileNo,
                    folder,
                    format,
                    name,
                    path,
                    size,
                    uploadedAt,
                    uploadedBy,
                    url,
                    workspace,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Data = apply {
            if (validated) {
                return@apply
            }

            id()
            assetKey()
            assetUrl()
            dimensions().ifPresent { it.validate() }
            extension()
            fileNo()
            format()
            name()
            path()
            size()
            uploadedAt()
            uploadedBy()
            url()
            workspace().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (if (assetKey.asKnown().isPresent) 1 else 0) +
                (if (assetUrl.asKnown().isPresent) 1 else 0) +
                (dimensions.asKnown().getOrNull()?.validity() ?: 0) +
                (if (extension.asKnown().isPresent) 1 else 0) +
                (if (fileNo.asKnown().isPresent) 1 else 0) +
                (if (format.asKnown().isPresent) 1 else 0) +
                (if (name.asKnown().isPresent) 1 else 0) +
                (if (path.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0) +
                (if (uploadedAt.asKnown().isPresent) 1 else 0) +
                (if (uploadedBy.asKnown().isPresent) 1 else 0) +
                (if (url.asKnown().isPresent) 1 else 0) +
                (workspace.asKnown().getOrNull()?.validity() ?: 0)

        class Dimensions
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val height: JsonField<Long>,
            private val width: JsonField<Long>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("height") @ExcludeMissing height: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("width") @ExcludeMissing width: JsonField<Long> = JsonMissing.of(),
            ) : this(height, width, mutableMapOf())

            /**
             * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun height(): Optional<Long> = height.getOptional("height")

            /**
             * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun width(): Optional<Long> = width.getOptional("width")

            /**
             * Returns the raw JSON value of [height].
             *
             * Unlike [height], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("height") @ExcludeMissing fun _height(): JsonField<Long> = height

            /**
             * Returns the raw JSON value of [width].
             *
             * Unlike [width], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("width") @ExcludeMissing fun _width(): JsonField<Long> = width

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

                /** Returns a mutable builder for constructing an instance of [Dimensions]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Dimensions]. */
            class Builder internal constructor() {

                private var height: JsonField<Long> = JsonMissing.of()
                private var width: JsonField<Long> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(dimensions: Dimensions) = apply {
                    height = dimensions.height
                    width = dimensions.width
                    additionalProperties = dimensions.additionalProperties.toMutableMap()
                }

                fun height(height: Long) = height(JsonField.of(height))

                /**
                 * Sets [Builder.height] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.height] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun height(height: JsonField<Long>) = apply { this.height = height }

                fun width(width: Long) = width(JsonField.of(width))

                /**
                 * Sets [Builder.width] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.width] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun width(width: JsonField<Long>) = apply { this.width = width }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Dimensions].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Dimensions =
                    Dimensions(height, width, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Dimensions = apply {
                if (validated) {
                    return@apply
                }

                height()
                width()
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
                (if (height.asKnown().isPresent) 1 else 0) +
                    (if (width.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Dimensions &&
                    height == other.height &&
                    width == other.width &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(height, width, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Dimensions{height=$height, width=$width, additionalProperties=$additionalProperties}"
        }

        class Workspace
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val name: JsonField<String>,
            private val workspaceNo: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("workspace_no")
                @ExcludeMissing
                workspaceNo: JsonField<String> = JsonMissing.of(),
            ) : this(name, workspaceNo, mutableMapOf())

            /**
             * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun workspaceNo(): Optional<String> = workspaceNo.getOptional("workspace_no")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [workspaceNo].
             *
             * Unlike [workspaceNo], this method doesn't throw if the JSON field has an unexpected
             * type.
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

                /** Returns a mutable builder for constructing an instance of [Workspace]. */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Workspace]. */
            class Builder internal constructor() {

                private var name: JsonField<String> = JsonMissing.of()
                private var workspaceNo: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(workspace: Workspace) = apply {
                    name = workspace.name
                    workspaceNo = workspace.workspaceNo
                    additionalProperties = workspace.additionalProperties.toMutableMap()
                }

                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun workspaceNo(workspaceNo: String) = workspaceNo(JsonField.of(workspaceNo))

                /**
                 * Sets [Builder.workspaceNo] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.workspaceNo] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun workspaceNo(workspaceNo: JsonField<String>) = apply {
                    this.workspaceNo = workspaceNo
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Workspace].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 */
                fun build(): Workspace =
                    Workspace(name, workspaceNo, additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Workspace = apply {
                if (validated) {
                    return@apply
                }

                name()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (name.asKnown().isPresent) 1 else 0) +
                    (if (workspaceNo.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Workspace &&
                    name == other.name &&
                    workspaceNo == other.workspaceNo &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(name, workspaceNo, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Workspace{name=$name, workspaceNo=$workspaceNo, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Data &&
                id == other.id &&
                assetKey == other.assetKey &&
                assetUrl == other.assetUrl &&
                dimensions == other.dimensions &&
                extension == other.extension &&
                fileNo == other.fileNo &&
                folder == other.folder &&
                format == other.format &&
                name == other.name &&
                path == other.path &&
                size == other.size &&
                uploadedAt == other.uploadedAt &&
                uploadedBy == other.uploadedBy &&
                url == other.url &&
                workspace == other.workspace &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                assetKey,
                assetUrl,
                dimensions,
                extension,
                fileNo,
                folder,
                format,
                name,
                path,
                size,
                uploadedAt,
                uploadedBy,
                url,
                workspace,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Data{id=$id, assetKey=$assetKey, assetUrl=$assetUrl, dimensions=$dimensions, extension=$extension, fileNo=$fileNo, folder=$folder, format=$format, name=$name, path=$path, size=$size, uploadedAt=$uploadedAt, uploadedBy=$uploadedBy, url=$url, workspace=$workspace, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileObject &&
            data == other.data &&
            success == other.success &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(data, success, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FileObject{data=$data, success=$success, additionalProperties=$additionalProperties}"
}
