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

class FolderListItem
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val createdAt: JsonField<OffsetDateTime>,
    private val folderNo: JsonField<String>,
    private val name: JsonField<String>,
    private val totalItems: JsonField<Long>,
    private val totalSize: JsonField<Long>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("folder_no") @ExcludeMissing folderNo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("total_items") @ExcludeMissing totalItems: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("total_size") @ExcludeMissing totalSize: JsonField<Long> = JsonMissing.of(),
    ) : this(createdAt, folderNo, name, totalItems, totalSize, mutableMapOf())

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdAt(): Optional<OffsetDateTime> = createdAt.getOptional("created_at")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folderNo(): Optional<String> = folderNo.getOptional("folder_no")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalItems(): Optional<Long> = totalItems.getOptional("total_items")

    /**
     * Total size of items in bytes
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun totalSize(): Optional<Long> = totalSize.getOptional("total_size")

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [folderNo].
     *
     * Unlike [folderNo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folder_no") @ExcludeMissing fun _folderNo(): JsonField<String> = folderNo

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [totalItems].
     *
     * Unlike [totalItems], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_items") @ExcludeMissing fun _totalItems(): JsonField<Long> = totalItems

    /**
     * Returns the raw JSON value of [totalSize].
     *
     * Unlike [totalSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("total_size") @ExcludeMissing fun _totalSize(): JsonField<Long> = totalSize

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

        /** Returns a mutable builder for constructing an instance of [FolderListItem]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FolderListItem]. */
    class Builder internal constructor() {

        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var folderNo: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var totalItems: JsonField<Long> = JsonMissing.of()
        private var totalSize: JsonField<Long> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(folderListItem: FolderListItem) = apply {
            createdAt = folderListItem.createdAt
            folderNo = folderListItem.folderNo
            name = folderListItem.name
            totalItems = folderListItem.totalItems
            totalSize = folderListItem.totalSize
            additionalProperties = folderListItem.additionalProperties.toMutableMap()
        }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun folderNo(folderNo: String) = folderNo(JsonField.of(folderNo))

        /**
         * Sets [Builder.folderNo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folderNo] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun folderNo(folderNo: JsonField<String>) = apply { this.folderNo = folderNo }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        fun totalItems(totalItems: Long) = totalItems(JsonField.of(totalItems))

        /**
         * Sets [Builder.totalItems] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalItems] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalItems(totalItems: JsonField<Long>) = apply { this.totalItems = totalItems }

        /** Total size of items in bytes */
        fun totalSize(totalSize: Long) = totalSize(JsonField.of(totalSize))

        /**
         * Sets [Builder.totalSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.totalSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun totalSize(totalSize: JsonField<Long>) = apply { this.totalSize = totalSize }

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
         * Returns an immutable instance of [FolderListItem].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FolderListItem =
            FolderListItem(
                createdAt,
                folderNo,
                name,
                totalItems,
                totalSize,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FolderListItem = apply {
        if (validated) {
            return@apply
        }

        createdAt()
        folderNo()
        name()
        totalItems()
        totalSize()
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
        (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (folderNo.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (totalItems.asKnown().isPresent) 1 else 0) +
            (if (totalSize.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderListItem &&
            createdAt == other.createdAt &&
            folderNo == other.folderNo &&
            name == other.name &&
            totalItems == other.totalItems &&
            totalSize == other.totalSize &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(createdAt, folderNo, name, totalItems, totalSize, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FolderListItem{createdAt=$createdAt, folderNo=$folderNo, name=$name, totalItems=$totalItems, totalSize=$totalSize, additionalProperties=$additionalProperties}"
}
