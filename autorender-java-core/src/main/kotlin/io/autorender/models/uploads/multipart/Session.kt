// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads.multipart

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

class Session
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val partSize: JsonField<Long>,
    private val parts: JsonField<List<String>>,
    private val sessionId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("part_size") @ExcludeMissing partSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parts") @ExcludeMissing parts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
    ) : this(partSize, parts, sessionId, mutableMapOf())

    /**
     * Part size in bytes
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun partSize(): Optional<Long> = partSize.getOptional("part_size")

    /**
     * Presigned PUT URLs in order, one per part
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun parts(): Optional<List<String>> = parts.getOptional("parts")

    /**
     * Session UUID; required for the complete call
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sessionId(): Optional<String> = sessionId.getOptional("session_id")

    /**
     * Returns the raw JSON value of [partSize].
     *
     * Unlike [partSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("part_size") @ExcludeMissing fun _partSize(): JsonField<Long> = partSize

    /**
     * Returns the raw JSON value of [parts].
     *
     * Unlike [parts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("parts") @ExcludeMissing fun _parts(): JsonField<List<String>> = parts

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

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

        /** Returns a mutable builder for constructing an instance of [Session]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Session]. */
    class Builder internal constructor() {

        private var partSize: JsonField<Long> = JsonMissing.of()
        private var parts: JsonField<MutableList<String>>? = null
        private var sessionId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(session: Session) = apply {
            partSize = session.partSize
            parts = session.parts.map { it.toMutableList() }
            sessionId = session.sessionId
            additionalProperties = session.additionalProperties.toMutableMap()
        }

        /** Part size in bytes */
        fun partSize(partSize: Long) = partSize(JsonField.of(partSize))

        /**
         * Sets [Builder.partSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun partSize(partSize: JsonField<Long>) = apply { this.partSize = partSize }

        /** Presigned PUT URLs in order, one per part */
        fun parts(parts: List<String>) = parts(JsonField.of(parts))

        /**
         * Sets [Builder.parts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.parts] with a well-typed `List<String>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun parts(parts: JsonField<List<String>>) = apply {
            this.parts = parts.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [parts].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addPart(part: String) = apply {
            parts =
                (parts ?: JsonField.of(mutableListOf())).also { checkKnown("parts", it).add(part) }
        }

        /** Session UUID; required for the complete call */
        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

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
         * Returns an immutable instance of [Session].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): Session =
            Session(
                partSize,
                (parts ?: JsonMissing.of()).map { it.toImmutable() },
                sessionId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Session = apply {
        if (validated) {
            return@apply
        }

        partSize()
        parts()
        sessionId()
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
        (if (partSize.asKnown().isPresent) 1 else 0) +
            (parts.asKnown().getOrNull()?.size ?: 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Session &&
            partSize == other.partSize &&
            parts == other.parts &&
            sessionId == other.sessionId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(partSize, parts, sessionId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Session{partSize=$partSize, parts=$parts, sessionId=$sessionId, additionalProperties=$additionalProperties}"
}
