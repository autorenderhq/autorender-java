// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.multipartuploads

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
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull

/** Session created */
class MultipartUploadStartResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val expireAt: JsonField<Long>,
    private val minPartSize: JsonField<Long>,
    private val partSize: JsonField<Long>,
    private val parts: JsonField<List<String>>,
    private val policy: JsonField<Policy>,
    private val publicKey: JsonField<String>,
    private val sessionId: JsonField<String>,
    private val uuid: JsonField<String>,
    private val workspaceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("expire_at") @ExcludeMissing expireAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("min_part_size")
        @ExcludeMissing
        minPartSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("part_size") @ExcludeMissing partSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("parts") @ExcludeMissing parts: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("policy") @ExcludeMissing policy: JsonField<Policy> = JsonMissing.of(),
        @JsonProperty("public_key") @ExcludeMissing publicKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("session_id") @ExcludeMissing sessionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("uuid") @ExcludeMissing uuid: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspace_id")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
    ) : this(
        expireAt,
        minPartSize,
        partSize,
        parts,
        policy,
        publicKey,
        sessionId,
        uuid,
        workspaceId,
        mutableMapOf(),
    )

    /**
     * Unix timestamp when the session expires
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expireAt(): Long = expireAt.getRequired("expire_at")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun minPartSize(): Long = minPartSize.getRequired("min_part_size")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun partSize(): Long = partSize.getRequired("part_size")

    /**
     * Pre-signed S3 upload URLs, one per part
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun parts(): List<String> = parts.getRequired("parts")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun policy(): Policy = policy.getRequired("policy")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun publicKey(): String = publicKey.getRequired("public_key")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun sessionId(): String = sessionId.getRequired("session_id")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun uuid(): String = uuid.getRequired("uuid")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun workspaceId(): String = workspaceId.getRequired("workspace_id")

    /**
     * Returns the raw JSON value of [expireAt].
     *
     * Unlike [expireAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expire_at") @ExcludeMissing fun _expireAt(): JsonField<Long> = expireAt

    /**
     * Returns the raw JSON value of [minPartSize].
     *
     * Unlike [minPartSize], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("min_part_size") @ExcludeMissing fun _minPartSize(): JsonField<Long> = minPartSize

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
     * Returns the raw JSON value of [policy].
     *
     * Unlike [policy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("policy") @ExcludeMissing fun _policy(): JsonField<Policy> = policy

    /**
     * Returns the raw JSON value of [publicKey].
     *
     * Unlike [publicKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("public_key") @ExcludeMissing fun _publicKey(): JsonField<String> = publicKey

    /**
     * Returns the raw JSON value of [sessionId].
     *
     * Unlike [sessionId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("session_id") @ExcludeMissing fun _sessionId(): JsonField<String> = sessionId

    /**
     * Returns the raw JSON value of [uuid].
     *
     * Unlike [uuid], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("uuid") @ExcludeMissing fun _uuid(): JsonField<String> = uuid

    /**
     * Returns the raw JSON value of [workspaceId].
     *
     * Unlike [workspaceId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("workspace_id")
    @ExcludeMissing
    fun _workspaceId(): JsonField<String> = workspaceId

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
         * Returns a mutable builder for constructing an instance of [MultipartUploadStartResponse].
         *
         * The following fields are required:
         * ```java
         * .expireAt()
         * .minPartSize()
         * .partSize()
         * .parts()
         * .policy()
         * .publicKey()
         * .sessionId()
         * .uuid()
         * .workspaceId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [MultipartUploadStartResponse]. */
    class Builder internal constructor() {

        private var expireAt: JsonField<Long>? = null
        private var minPartSize: JsonField<Long>? = null
        private var partSize: JsonField<Long>? = null
        private var parts: JsonField<MutableList<String>>? = null
        private var policy: JsonField<Policy>? = null
        private var publicKey: JsonField<String>? = null
        private var sessionId: JsonField<String>? = null
        private var uuid: JsonField<String>? = null
        private var workspaceId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(multipartUploadStartResponse: MultipartUploadStartResponse) = apply {
            expireAt = multipartUploadStartResponse.expireAt
            minPartSize = multipartUploadStartResponse.minPartSize
            partSize = multipartUploadStartResponse.partSize
            parts = multipartUploadStartResponse.parts.map { it.toMutableList() }
            policy = multipartUploadStartResponse.policy
            publicKey = multipartUploadStartResponse.publicKey
            sessionId = multipartUploadStartResponse.sessionId
            uuid = multipartUploadStartResponse.uuid
            workspaceId = multipartUploadStartResponse.workspaceId
            additionalProperties = multipartUploadStartResponse.additionalProperties.toMutableMap()
        }

        /** Unix timestamp when the session expires */
        fun expireAt(expireAt: Long) = expireAt(JsonField.of(expireAt))

        /**
         * Sets [Builder.expireAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expireAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expireAt(expireAt: JsonField<Long>) = apply { this.expireAt = expireAt }

        fun minPartSize(minPartSize: Long) = minPartSize(JsonField.of(minPartSize))

        /**
         * Sets [Builder.minPartSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.minPartSize] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun minPartSize(minPartSize: JsonField<Long>) = apply { this.minPartSize = minPartSize }

        fun partSize(partSize: Long) = partSize(JsonField.of(partSize))

        /**
         * Sets [Builder.partSize] to an arbitrary JSON value.
         *
         * You should usually call [Builder.partSize] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun partSize(partSize: JsonField<Long>) = apply { this.partSize = partSize }

        /** Pre-signed S3 upload URLs, one per part */
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

        fun policy(policy: Policy) = policy(JsonField.of(policy))

        /**
         * Sets [Builder.policy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.policy] with a well-typed [Policy] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun policy(policy: JsonField<Policy>) = apply { this.policy = policy }

        fun publicKey(publicKey: String) = publicKey(JsonField.of(publicKey))

        /**
         * Sets [Builder.publicKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.publicKey] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun publicKey(publicKey: JsonField<String>) = apply { this.publicKey = publicKey }

        fun sessionId(sessionId: String) = sessionId(JsonField.of(sessionId))

        /**
         * Sets [Builder.sessionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sessionId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun sessionId(sessionId: JsonField<String>) = apply { this.sessionId = sessionId }

        fun uuid(uuid: String) = uuid(JsonField.of(uuid))

        /**
         * Sets [Builder.uuid] to an arbitrary JSON value.
         *
         * You should usually call [Builder.uuid] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun uuid(uuid: JsonField<String>) = apply { this.uuid = uuid }

        fun workspaceId(workspaceId: String) = workspaceId(JsonField.of(workspaceId))

        /**
         * Sets [Builder.workspaceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.workspaceId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun workspaceId(workspaceId: JsonField<String>) = apply { this.workspaceId = workspaceId }

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
         * Returns an immutable instance of [MultipartUploadStartResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .expireAt()
         * .minPartSize()
         * .partSize()
         * .parts()
         * .policy()
         * .publicKey()
         * .sessionId()
         * .uuid()
         * .workspaceId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): MultipartUploadStartResponse =
            MultipartUploadStartResponse(
                checkRequired("expireAt", expireAt),
                checkRequired("minPartSize", minPartSize),
                checkRequired("partSize", partSize),
                checkRequired("parts", parts).map { it.toImmutable() },
                checkRequired("policy", policy),
                checkRequired("publicKey", publicKey),
                checkRequired("sessionId", sessionId),
                checkRequired("uuid", uuid),
                checkRequired("workspaceId", workspaceId),
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
    fun validate(): MultipartUploadStartResponse = apply {
        if (validated) {
            return@apply
        }

        expireAt()
        minPartSize()
        partSize()
        parts()
        policy().validate()
        publicKey()
        sessionId()
        uuid()
        workspaceId()
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
        (if (expireAt.asKnown().isPresent) 1 else 0) +
            (if (minPartSize.asKnown().isPresent) 1 else 0) +
            (if (partSize.asKnown().isPresent) 1 else 0) +
            (parts.asKnown().getOrNull()?.size ?: 0) +
            (policy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (publicKey.asKnown().isPresent) 1 else 0) +
            (if (sessionId.asKnown().isPresent) 1 else 0) +
            (if (uuid.asKnown().isPresent) 1 else 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0)

    class Policy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val folder: JsonField<String>,
        private val format: JsonField<String>,
        private val size: JsonField<Long>,
        private val tags: JsonField<List<String>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("folder") @ExcludeMissing folder: JsonField<String> = JsonMissing.of(),
            @JsonProperty("format") @ExcludeMissing format: JsonField<String> = JsonMissing.of(),
            @JsonProperty("size") @ExcludeMissing size: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
        ) : this(folder, format, size, tags, mutableMapOf())

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun folder(): String = folder.getRequired("folder")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun format(): String = format.getRequired("format")

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
         * Returns the raw JSON value of [folder].
         *
         * Unlike [folder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("folder") @ExcludeMissing fun _folder(): JsonField<String> = folder

        /**
         * Returns the raw JSON value of [format].
         *
         * Unlike [format], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("format") @ExcludeMissing fun _format(): JsonField<String> = format

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
             * Returns a mutable builder for constructing an instance of [Policy].
             *
             * The following fields are required:
             * ```java
             * .folder()
             * .format()
             * .size()
             * .tags()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Policy]. */
        class Builder internal constructor() {

            private var folder: JsonField<String>? = null
            private var format: JsonField<String>? = null
            private var size: JsonField<Long>? = null
            private var tags: JsonField<MutableList<String>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(policy: Policy) = apply {
                folder = policy.folder
                format = policy.format
                size = policy.size
                tags = policy.tags.map { it.toMutableList() }
                additionalProperties = policy.additionalProperties.toMutableMap()
            }

            fun folder(folder: String) = folder(JsonField.of(folder))

            /**
             * Sets [Builder.folder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.folder] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folder(folder: JsonField<String>) = apply { this.folder = folder }

            fun format(format: String) = format(JsonField.of(format))

            /**
             * Sets [Builder.format] to an arbitrary JSON value.
             *
             * You should usually call [Builder.format] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun format(format: JsonField<String>) = apply { this.format = format }

            fun size(size: Long) = size(JsonField.of(size))

            /**
             * Sets [Builder.size] to an arbitrary JSON value.
             *
             * You should usually call [Builder.size] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun size(size: JsonField<Long>) = apply { this.size = size }

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
             * Returns an immutable instance of [Policy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .folder()
             * .format()
             * .size()
             * .tags()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Policy =
                Policy(
                    checkRequired("folder", folder),
                    checkRequired("format", format),
                    checkRequired("size", size),
                    checkRequired("tags", tags).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
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
        fun validate(): Policy = apply {
            if (validated) {
                return@apply
            }

            folder()
            format()
            size()
            tags()
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
                (if (format.asKnown().isPresent) 1 else 0) +
                (if (size.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Policy &&
                folder == other.folder &&
                format == other.format &&
                size == other.size &&
                tags == other.tags &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(folder, format, size, tags, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Policy{folder=$folder, format=$format, size=$size, tags=$tags, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is MultipartUploadStartResponse &&
            expireAt == other.expireAt &&
            minPartSize == other.minPartSize &&
            partSize == other.partSize &&
            parts == other.parts &&
            policy == other.policy &&
            publicKey == other.publicKey &&
            sessionId == other.sessionId &&
            uuid == other.uuid &&
            workspaceId == other.workspaceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            expireAt,
            minPartSize,
            partSize,
            parts,
            policy,
            publicKey,
            sessionId,
            uuid,
            workspaceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "MultipartUploadStartResponse{expireAt=$expireAt, minPartSize=$minPartSize, partSize=$partSize, parts=$parts, policy=$policy, publicKey=$publicKey, sessionId=$sessionId, uuid=$uuid, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
}
