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
import io.autorender.core.toImmutable
import io.autorender.errors.AutorenderInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class UploadGenerateTokenResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val expireAt: JsonField<Long>,
    private val policy: JsonField<Policy>,
    private val publicKey: JsonField<String>,
    private val signature: JsonField<String>,
    private val workspaceId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expire_at") @ExcludeMissing expireAt: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("policy") @ExcludeMissing policy: JsonField<Policy> = JsonMissing.of(),
        @JsonProperty("public_key") @ExcludeMissing publicKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signature") @ExcludeMissing signature: JsonField<String> = JsonMissing.of(),
        @JsonProperty("workspace_id")
        @ExcludeMissing
        workspaceId: JsonField<String> = JsonMissing.of(),
    ) : this(token, expireAt, policy, publicKey, signature, workspaceId, mutableMapOf())

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun token(): Optional<String> = token.getOptional("token")

    /**
     * Unix timestamp of expiry
     *
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expireAt(): Optional<Long> = expireAt.getOptional("expire_at")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun policy(): Optional<Policy> = policy.getOptional("policy")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun publicKey(): Optional<String> = publicKey.getOptional("public_key")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signature(): Optional<String> = signature.getOptional("signature")

    /**
     * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun workspaceId(): Optional<String> = workspaceId.getOptional("workspace_id")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [expireAt].
     *
     * Unlike [expireAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expire_at") @ExcludeMissing fun _expireAt(): JsonField<Long> = expireAt

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
     * Returns the raw JSON value of [signature].
     *
     * Unlike [signature], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signature") @ExcludeMissing fun _signature(): JsonField<String> = signature

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
         * Returns a mutable builder for constructing an instance of [UploadGenerateTokenResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadGenerateTokenResponse]. */
    class Builder internal constructor() {

        private var token: JsonField<String> = JsonMissing.of()
        private var expireAt: JsonField<Long> = JsonMissing.of()
        private var policy: JsonField<Policy> = JsonMissing.of()
        private var publicKey: JsonField<String> = JsonMissing.of()
        private var signature: JsonField<String> = JsonMissing.of()
        private var workspaceId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(uploadGenerateTokenResponse: UploadGenerateTokenResponse) = apply {
            token = uploadGenerateTokenResponse.token
            expireAt = uploadGenerateTokenResponse.expireAt
            policy = uploadGenerateTokenResponse.policy
            publicKey = uploadGenerateTokenResponse.publicKey
            signature = uploadGenerateTokenResponse.signature
            workspaceId = uploadGenerateTokenResponse.workspaceId
            additionalProperties = uploadGenerateTokenResponse.additionalProperties.toMutableMap()
        }

        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Unix timestamp of expiry */
        fun expireAt(expireAt: Long) = expireAt(JsonField.of(expireAt))

        /**
         * Sets [Builder.expireAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expireAt] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun expireAt(expireAt: JsonField<Long>) = apply { this.expireAt = expireAt }

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

        fun signature(signature: String) = signature(JsonField.of(signature))

        /**
         * Sets [Builder.signature] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signature] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun signature(signature: JsonField<String>) = apply { this.signature = signature }

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
         * Returns an immutable instance of [UploadGenerateTokenResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UploadGenerateTokenResponse =
            UploadGenerateTokenResponse(
                token,
                expireAt,
                policy,
                publicKey,
                signature,
                workspaceId,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): UploadGenerateTokenResponse = apply {
        if (validated) {
            return@apply
        }

        token()
        expireAt()
        policy().ifPresent { it.validate() }
        publicKey()
        signature()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (expireAt.asKnown().isPresent) 1 else 0) +
            (policy.asKnown().getOrNull()?.validity() ?: 0) +
            (if (publicKey.asKnown().isPresent) 1 else 0) +
            (if (signature.asKnown().isPresent) 1 else 0) +
            (if (workspaceId.asKnown().isPresent) 1 else 0)

    class Policy
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val allowOverride: JsonField<AllowOverride>,
        private val folder: JsonField<String>,
        private val maxFileSize: JsonField<Long>,
        private val tags: JsonField<List<String>>,
        private val transform: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("allow_override")
            @ExcludeMissing
            allowOverride: JsonField<AllowOverride> = JsonMissing.of(),
            @JsonProperty("folder") @ExcludeMissing folder: JsonField<String> = JsonMissing.of(),
            @JsonProperty("max_file_size")
            @ExcludeMissing
            maxFileSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("tags") @ExcludeMissing tags: JsonField<List<String>> = JsonMissing.of(),
            @JsonProperty("transform")
            @ExcludeMissing
            transform: JsonField<String> = JsonMissing.of(),
        ) : this(allowOverride, folder, maxFileSize, tags, transform, mutableMapOf())

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun allowOverride(): Optional<AllowOverride> = allowOverride.getOptional("allow_override")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun folder(): Optional<String> = folder.getOptional("folder")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun maxFileSize(): Optional<Long> = maxFileSize.getOptional("max_file_size")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun tags(): Optional<List<String>> = tags.getOptional("tags")

        /**
         * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun transform(): Optional<String> = transform.getOptional("transform")

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

            /** Returns a mutable builder for constructing an instance of [Policy]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Policy]. */
        class Builder internal constructor() {

            private var allowOverride: JsonField<AllowOverride> = JsonMissing.of()
            private var folder: JsonField<String> = JsonMissing.of()
            private var maxFileSize: JsonField<Long> = JsonMissing.of()
            private var tags: JsonField<MutableList<String>>? = null
            private var transform: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(policy: Policy) = apply {
                allowOverride = policy.allowOverride
                folder = policy.folder
                maxFileSize = policy.maxFileSize
                tags = policy.tags.map { it.toMutableList() }
                transform = policy.transform
                additionalProperties = policy.additionalProperties.toMutableMap()
            }

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

            fun folder(folder: String) = folder(JsonField.of(folder))

            /**
             * Sets [Builder.folder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.folder] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun folder(folder: JsonField<String>) = apply { this.folder = folder }

            fun maxFileSize(maxFileSize: Long) = maxFileSize(JsonField.of(maxFileSize))

            /**
             * Sets [Builder.maxFileSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.maxFileSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun maxFileSize(maxFileSize: JsonField<Long>) = apply { this.maxFileSize = maxFileSize }

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

            fun transform(transform: String?) = transform(JsonField.ofNullable(transform))

            /** Alias for calling [Builder.transform] with `transform.orElse(null)`. */
            fun transform(transform: Optional<String>) = transform(transform.getOrNull())

            /**
             * Sets [Builder.transform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transform] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transform(transform: JsonField<String>) = apply { this.transform = transform }

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
             */
            fun build(): Policy =
                Policy(
                    allowOverride,
                    folder,
                    maxFileSize,
                    (tags ?: JsonMissing.of()).map { it.toImmutable() },
                    transform,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Policy = apply {
            if (validated) {
                return@apply
            }

            allowOverride().ifPresent { it.validate() }
            folder()
            maxFileSize()
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
            (allowOverride.asKnown().getOrNull()?.validity() ?: 0) +
                (if (folder.asKnown().isPresent) 1 else 0) +
                (if (maxFileSize.asKnown().isPresent) 1 else 0) +
                (tags.asKnown().getOrNull()?.size ?: 0) +
                (if (transform.asKnown().isPresent) 1 else 0)

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
                @JsonProperty("folder")
                @ExcludeMissing
                folder: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("tags") @ExcludeMissing tags: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("transform")
                @ExcludeMissing
                transform: JsonField<Boolean> = JsonMissing.of(),
            ) : this(folder, tags, transform, mutableMapOf())

            /**
             * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun folder(): Optional<Boolean> = folder.getOptional("folder")

            /**
             * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun tags(): Optional<Boolean> = tags.getOptional("tags")

            /**
             * @throws AutorenderInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
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
             * Unlike [transform], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("transform")
            @ExcludeMissing
            fun _transform(): JsonField<Boolean> = transform

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
                 * You should usually call [Builder.folder] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
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
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun transform(transform: JsonField<Boolean>) = apply { this.transform = transform }

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Policy &&
                allowOverride == other.allowOverride &&
                folder == other.folder &&
                maxFileSize == other.maxFileSize &&
                tags == other.tags &&
                transform == other.transform &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(allowOverride, folder, maxFileSize, tags, transform, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Policy{allowOverride=$allowOverride, folder=$folder, maxFileSize=$maxFileSize, tags=$tags, transform=$transform, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadGenerateTokenResponse &&
            token == other.token &&
            expireAt == other.expireAt &&
            policy == other.policy &&
            publicKey == other.publicKey &&
            signature == other.signature &&
            workspaceId == other.workspaceId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            expireAt,
            policy,
            publicKey,
            signature,
            workspaceId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "UploadGenerateTokenResponse{token=$token, expireAt=$expireAt, policy=$policy, publicKey=$publicKey, signature=$signature, workspaceId=$workspaceId, additionalProperties=$additionalProperties}"
}
