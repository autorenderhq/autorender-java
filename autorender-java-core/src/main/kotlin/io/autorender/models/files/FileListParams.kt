// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.files

import com.fasterxml.jackson.annotation.JsonCreator
import io.autorender.core.Enum
import io.autorender.core.JsonField
import io.autorender.core.Params
import io.autorender.core.http.Headers
import io.autorender.core.http.QueryParams
import io.autorender.errors.AutorenderInvalidDataException
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Paginated list of files in the workspace. Filter by folder, path prefix, name, or tags. Sort by
 * various fields.
 */
class FileListParams
private constructor(
    private val folderNo: String?,
    private val limit: Long?,
    private val name: String?,
    private val page: Long?,
    private val path: String?,
    private val sortField: SortField?,
    private val sortOrder: SortOrder?,
    private val tags: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** Filter to files in this folder */
    fun folderNo(): Optional<String> = Optional.ofNullable(folderNo)

    /** Items per page */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /** Partial filename match (case-insensitive) */
    fun name(): Optional<String> = Optional.ofNullable(name)

    /** Page number (1-based) */
    fun page(): Optional<Long> = Optional.ofNullable(page)

    /** Filter by path prefix (e.g., products/sku123/) */
    fun path(): Optional<String> = Optional.ofNullable(path)

    /** Field to sort by */
    fun sortField(): Optional<SortField> = Optional.ofNullable(sortField)

    /** Sort direction */
    fun sortOrder(): Optional<SortOrder> = Optional.ofNullable(sortOrder)

    /** Comma-separated tags to filter by */
    fun tags(): Optional<String> = Optional.ofNullable(tags)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): FileListParams = builder().build()

        /** Returns a mutable builder for constructing an instance of [FileListParams]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FileListParams]. */
    class Builder internal constructor() {

        private var folderNo: String? = null
        private var limit: Long? = null
        private var name: String? = null
        private var page: Long? = null
        private var path: String? = null
        private var sortField: SortField? = null
        private var sortOrder: SortOrder? = null
        private var tags: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(fileListParams: FileListParams) = apply {
            folderNo = fileListParams.folderNo
            limit = fileListParams.limit
            name = fileListParams.name
            page = fileListParams.page
            path = fileListParams.path
            sortField = fileListParams.sortField
            sortOrder = fileListParams.sortOrder
            tags = fileListParams.tags
            additionalHeaders = fileListParams.additionalHeaders.toBuilder()
            additionalQueryParams = fileListParams.additionalQueryParams.toBuilder()
        }

        /** Filter to files in this folder */
        fun folderNo(folderNo: String?) = apply { this.folderNo = folderNo }

        /** Alias for calling [Builder.folderNo] with `folderNo.orElse(null)`. */
        fun folderNo(folderNo: Optional<String>) = folderNo(folderNo.getOrNull())

        /** Items per page */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /** Partial filename match (case-insensitive) */
        fun name(name: String?) = apply { this.name = name }

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /** Page number (1-based) */
        fun page(page: Long?) = apply { this.page = page }

        /**
         * Alias for [Builder.page].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun page(page: Long) = page(page as Long?)

        /** Alias for calling [Builder.page] with `page.orElse(null)`. */
        fun page(page: Optional<Long>) = page(page.getOrNull())

        /** Filter by path prefix (e.g., products/sku123/) */
        fun path(path: String?) = apply { this.path = path }

        /** Alias for calling [Builder.path] with `path.orElse(null)`. */
        fun path(path: Optional<String>) = path(path.getOrNull())

        /** Field to sort by */
        fun sortField(sortField: SortField?) = apply { this.sortField = sortField }

        /** Alias for calling [Builder.sortField] with `sortField.orElse(null)`. */
        fun sortField(sortField: Optional<SortField>) = sortField(sortField.getOrNull())

        /** Sort direction */
        fun sortOrder(sortOrder: SortOrder?) = apply { this.sortOrder = sortOrder }

        /** Alias for calling [Builder.sortOrder] with `sortOrder.orElse(null)`. */
        fun sortOrder(sortOrder: Optional<SortOrder>) = sortOrder(sortOrder.getOrNull())

        /** Comma-separated tags to filter by */
        fun tags(tags: String?) = apply { this.tags = tags }

        /** Alias for calling [Builder.tags] with `tags.orElse(null)`. */
        fun tags(tags: Optional<String>) = tags(tags.getOrNull())

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
         * Returns an immutable instance of [FileListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): FileListParams =
            FileListParams(
                folderNo,
                limit,
                name,
                page,
                path,
                sortField,
                sortOrder,
                tags,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                folderNo?.let { put("folder_no", it) }
                limit?.let { put("limit", it.toString()) }
                name?.let { put("name", it) }
                page?.let { put("page", it.toString()) }
                path?.let { put("path", it) }
                sortField?.let { put("sort_field", it.toString()) }
                sortOrder?.let { put("sort_order", it.toString()) }
                tags?.let { put("tags", it) }
                putAll(additionalQueryParams)
            }
            .build()

    /** Field to sort by */
    class SortField @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val FILE_SIZE = of("file_size")

            @JvmField val NAME = of("name")

            @JvmField val CREATED_AT = of("created_at")

            @JvmField val UPDATED_AT = of("updated_at")

            @JvmStatic fun of(value: String) = SortField(JsonField.of(value))
        }

        /** An enum containing [SortField]'s known values. */
        enum class Known {
            FILE_SIZE,
            NAME,
            CREATED_AT,
            UPDATED_AT,
        }

        /**
         * An enum containing [SortField]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortField] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FILE_SIZE,
            NAME,
            CREATED_AT,
            UPDATED_AT,
            /**
             * An enum member indicating that [SortField] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                FILE_SIZE -> Value.FILE_SIZE
                NAME -> Value.NAME
                CREATED_AT -> Value.CREATED_AT
                UPDATED_AT -> Value.UPDATED_AT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws AutorenderInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                FILE_SIZE -> Known.FILE_SIZE
                NAME -> Known.NAME
                CREATED_AT -> Known.CREATED_AT
                UPDATED_AT -> Known.UPDATED_AT
                else -> throw AutorenderInvalidDataException("Unknown SortField: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws AutorenderInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                AutorenderInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): SortField = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SortField && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Sort direction */
    class SortOrder @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ASC = of("asc")

            @JvmField val DESC = of("desc")

            @JvmStatic fun of(value: String) = SortOrder(JsonField.of(value))
        }

        /** An enum containing [SortOrder]'s known values. */
        enum class Known {
            ASC,
            DESC,
        }

        /**
         * An enum containing [SortOrder]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SortOrder] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ASC,
            DESC,
            /**
             * An enum member indicating that [SortOrder] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ASC -> Value.ASC
                DESC -> Value.DESC
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws AutorenderInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ASC -> Known.ASC
                DESC -> Known.DESC
                else -> throw AutorenderInvalidDataException("Unknown SortOrder: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws AutorenderInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow {
                AutorenderInvalidDataException("Value is not a String")
            }

        private var validated: Boolean = false

        fun validate(): SortOrder = apply {
            if (validated) {
                return@apply
            }

            known()
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
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SortOrder && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FileListParams &&
            folderNo == other.folderNo &&
            limit == other.limit &&
            name == other.name &&
            page == other.page &&
            path == other.path &&
            sortField == other.sortField &&
            sortOrder == other.sortOrder &&
            tags == other.tags &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            folderNo,
            limit,
            name,
            page,
            path,
            sortField,
            sortOrder,
            tags,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "FileListParams{folderNo=$folderNo, limit=$limit, name=$name, page=$page, path=$path, sortField=$sortField, sortOrder=$sortOrder, tags=$tags, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
