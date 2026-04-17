// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.folders

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

class Folder
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<String>,
    private val folderNo: JsonField<String>,
    private val isActive: JsonField<Boolean>,
    private val isDelete: JsonField<Boolean>,
    private val name: JsonField<String>,
    private val parentFolder: JsonField<String>,
    private val path: JsonField<String>,
    private val source: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val workspace: JsonField<Workspace>,
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
        @JsonProperty("folder_no") @ExcludeMissing folderNo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_active") @ExcludeMissing isActive: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("is_delete") @ExcludeMissing isDelete: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("parent_folder")
        @ExcludeMissing
        parentFolder: JsonField<String> = JsonMissing.of(),
        @JsonProperty("path") @ExcludeMissing path: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source") @ExcludeMissing source: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("workspace")
        @ExcludeMissing
        workspace: JsonField<Workspace> = JsonMissing.of(),
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
        folderNo,
        isActive,
        isDelete,
        name,
        parentFolder,
        path,
        source,
        updatedAt,
        workspace,
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
    fun folderNo(): Optional<String> = folderNo.getOptional("folder_no")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isActive(): Optional<Boolean> = isActive.getOptional("is_active")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isDelete(): Optional<Boolean> = isDelete.getOptional("is_delete")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parentFolder(): Optional<String> = parentFolder.getOptional("parent_folder")

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
    fun updatedAt(): Optional<OffsetDateTime> = updatedAt.getOptional("updated_at")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspace(): Optional<Workspace> = workspace.getOptional("workspace")

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
     * Returns the raw JSON value of [folderNo].
     *
     * Unlike [folderNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_no") @ExcludeMissing fun _folderNo(): JsonField<String> = folderNo

    /**
     * Returns the raw JSON value of [isActive].
     *
     * Unlike [isActive], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_active") @ExcludeMissing fun _isActive(): JsonField<Boolean> = isActive

    /**
     * Returns the raw JSON value of [isDelete].
     *
     * Unlike [isDelete], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_delete") @ExcludeMissing fun _isDelete(): JsonField<Boolean> = isDelete

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [parentFolder].
     *
     * Unlike [parentFolder], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parent_folder")
    @ExcludeMissing
    fun _parentFolder(): JsonField<String> = parentFolder

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
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [workspace].
     *
     * Unlike [workspace], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspace") @ExcludeMissing fun _workspace(): JsonField<Workspace> = workspace

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

        /** Returns a mutable builder for constructing an instance of [Folder]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Folder]. */
    class Builder internal constructor() {

        private var id: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<String> = JsonMissing.of()
        private var folderNo: JsonField<String> = JsonMissing.of()
        private var isActive: JsonField<Boolean> = JsonMissing.of()
        private var isDelete: JsonField<Boolean> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var parentFolder: JsonField<String> = JsonMissing.of()
        private var path: JsonField<String> = JsonMissing.of()
        private var source: JsonField<String> = JsonMissing.of()
        private var updatedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var workspace: JsonField<Workspace> = JsonMissing.of()
        private var workspaceId: JsonField<String> = JsonMissing.of()
        private var workspaceNo: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(folder: Folder) = apply {
            id = folder.id
            createdAt = folder.createdAt
            createdBy = folder.createdBy
            folderNo = folder.folderNo
            isActive = folder.isActive
            isDelete = folder.isDelete
            name = folder.name
            parentFolder = folder.parentFolder
            path = folder.path
            source = folder.source
            updatedAt = folder.updatedAt
            workspace = folder.workspace
            workspaceId = folder.workspaceId
            workspaceNo = folder.workspaceNo
            additionalProperties = folder.additionalProperties.toMutableMap()
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

        fun folderNo(folderNo: String) = folderNo(JsonField.of(folderNo))

        /**
         * Sets [Builder.folderNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderNo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderNo(folderNo: JsonField<String>) = apply { this.folderNo = folderNo }

        fun isActive(isActive: Boolean) = isActive(JsonField.of(isActive))

        /**
         * Sets [Builder.isActive] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isActive] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isActive(isActive: JsonField<Boolean>) = apply { this.isActive = isActive }

        fun isDelete(isDelete: Boolean) = isDelete(JsonField.of(isDelete))

        /**
         * Sets [Builder.isDelete] to an arbitrary JSON value.
         *
         * You should usually call [Builder.isDelete] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun isDelete(isDelete: JsonField<Boolean>) = apply { this.isDelete = isDelete }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun parentFolder(parentFolder: String?) = parentFolder(JsonField.ofNullable(parentFolder))

        /** Alias for calling [Builder.parentFolder] with `parentFolder.orElse(null)`. */
        fun parentFolder(parentFolder: Optional<String>) = parentFolder(parentFolder.getOrNull())

        /**
         * Sets [Builder.parentFolder] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parentFolder] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parentFolder(parentFolder: JsonField<String>) = apply {
            this.parentFolder = parentFolder
        }

        fun path(path: String) = path(JsonField.of(path))

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

        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        fun workspace(workspace: Workspace) = workspace(JsonField.of(workspace))

        /**
         * Sets [Builder.workspace] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspace] with a well-typed [Workspace] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspace(workspace: JsonField<Workspace>) = apply { this.workspace = workspace }

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
         * Returns an immutable instance of [Folder].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Folder =
            Folder(
                id,
                createdAt,
                createdBy,
                folderNo,
                isActive,
                isDelete,
                name,
                parentFolder,
                path,
                source,
                updatedAt,
                workspace,
                workspaceId,
                workspaceNo,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Folder = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        createdBy()
        folderNo()
        isActive()
        isDelete()
        name()
        parentFolder()
        path()
        source()
        updatedAt()
        workspace().ifPresent { it.validate() }
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
            (if (folderNo.asKnown().isPresent) 1 else 0) +
            (if (isActive.asKnown().isPresent) 1 else 0) +
            (if (isDelete.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (parentFolder.asKnown().isPresent) 1 else 0) +
            (if (path.asKnown().isPresent) 1 else 0) +
            (if (source.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (workspace.asKnown().getOrNull()?.validity() ?: 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0) +
            (if (workspaceNo.asKnown().isPresent) 1 else 0)

    class Workspace
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val workspaceNo: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("workspace_no")
            @ExcludeMissing
            workspaceNo: JsonField<String> = JsonMissing.of()
        ) : this(workspaceNo, mutableMapOf())

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun workspaceNo(): Optional<String> = workspaceNo.getOptional("workspace_no")

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

            /** Returns a mutable builder for constructing an instance of [Workspace]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Workspace]. */
        class Builder internal constructor() {

            private var workspaceNo: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(workspace: Workspace) = apply {
                workspaceNo = workspace.workspaceNo
                additionalProperties = workspace.additionalProperties.toMutableMap()
            }

            fun workspaceNo(workspaceNo: String) = workspaceNo(JsonField.of(workspaceNo))

            /**
             * Sets [Builder.workspaceNo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.workspaceNo] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Workspace].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Workspace = Workspace(workspaceNo, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Workspace = apply {
            if (validated) {
                return@apply
            }

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
        @JvmSynthetic internal fun validity(): Int = (if (workspaceNo.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Workspace &&
                workspaceNo == other.workspaceNo &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(workspaceNo, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Workspace{workspaceNo=$workspaceNo, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Folder &&
            id == other.id &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            folderNo == other.folderNo &&
            isActive == other.isActive &&
            isDelete == other.isDelete &&
            name == other.name &&
            parentFolder == other.parentFolder &&
            path == other.path &&
            source == other.source &&
            updatedAt == other.updatedAt &&
            workspace == other.workspace &&
            workspaceId == other.workspaceId &&
            workspaceNo == other.workspaceNo &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            createdBy,
            folderNo,
            isActive,
            isDelete,
            name,
            parentFolder,
            path,
            source,
            updatedAt,
            workspace,
            workspaceId,
            workspaceNo,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Folder{id=$id, createdAt=$createdAt, createdBy=$createdBy, folderNo=$folderNo, isActive=$isActive, isDelete=$isDelete, name=$name, parentFolder=$parentFolder, path=$path, source=$source, updatedAt=$updatedAt, workspace=$workspace, workspaceId=$workspaceId, workspaceNo=$workspaceNo, additionalProperties=$additionalProperties}"
}
