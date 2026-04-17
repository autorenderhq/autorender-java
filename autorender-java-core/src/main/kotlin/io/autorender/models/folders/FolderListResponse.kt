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
import io.autorender.core.checkKnown
import io.autorender.core.toImmutable
import io.autorender.errors.AutorenderInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class FolderListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val folders: JsonField<List<FolderListItem>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("folders")
        @ExcludeMissing
        folders: JsonField<List<FolderListItem>> = JsonMissing.of()
    ) : this(folders, mutableMapOf())

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun folders(): Optional<List<FolderListItem>> = folders.getOptional("folders")

    /**
     * Returns the raw JSON value of [folders].
     *
     * Unlike [folders], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("folders")
    @ExcludeMissing
    fun _folders(): JsonField<List<FolderListItem>> = folders

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

        /** Returns a mutable builder for constructing an instance of [FolderListResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FolderListResponse]. */
    class Builder internal constructor() {

        private var folders: JsonField<MutableList<FolderListItem>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(folderListResponse: FolderListResponse) = apply {
            folders = folderListResponse.folders.map { it.toMutableList() }
            additionalProperties = folderListResponse.additionalProperties.toMutableMap()
        }

        fun folders(folders: List<FolderListItem>) = folders(JsonField.of(folders))

        /**
         * Sets [Builder.folders] to an arbitrary JSON value.
         *
         * You should usually call [Builder.folders] with a well-typed `List<FolderListItem>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun folders(folders: JsonField<List<FolderListItem>>) = apply {
            this.folders = folders.map { it.toMutableList() }
        }

        /**
         * Adds a single [FolderListItem] to [folders].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFolder(folder: FolderListItem) = apply {
            folders =
                (folders ?: JsonField.of(mutableListOf())).also {
                    checkKnown("folders", it).add(folder)
                }
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
         * Returns an immutable instance of [FolderListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FolderListResponse =
            FolderListResponse(
                (folders ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): FolderListResponse = apply {
        if (validated) {
            return@apply
        }

        folders().ifPresent { it.forEach { it.validate() } }
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
        (folders.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FolderListResponse &&
            folders == other.folders &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(folders, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "FolderListResponse{folders=$folders, additionalProperties=$additionalProperties}"
}
