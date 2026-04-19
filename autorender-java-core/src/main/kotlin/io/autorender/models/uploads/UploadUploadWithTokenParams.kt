// File generated from our OpenAPI spec by Stainless.

package io.autorender.models.uploads

import io.autorender.core.Params
import io.autorender.core.http.Headers
import io.autorender.core.http.QueryParams
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Upload a file directly from the browser using a token from /generate-token. Send the raw file as
 * binary in the request body.
 */
class UploadUploadWithTokenParams
private constructor(
    private val token: String?,
    private val file: String?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun token(): Optional<String> = Optional.ofNullable(token)

    /** Raw file bytes. Accepts any file type (images, documents, videos, etc.). */
    fun file(): Optional<String> = Optional.ofNullable(file)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): UploadUploadWithTokenParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of [UploadUploadWithTokenParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [UploadUploadWithTokenParams]. */
    class Builder internal constructor() {

        private var token: String? = null
        private var file: String? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(uploadUploadWithTokenParams: UploadUploadWithTokenParams) = apply {
            token = uploadUploadWithTokenParams.token
            file = uploadUploadWithTokenParams.file
            additionalHeaders = uploadUploadWithTokenParams.additionalHeaders.toBuilder()
            additionalQueryParams = uploadUploadWithTokenParams.additionalQueryParams.toBuilder()
        }

        fun token(token: String?) = apply { this.token = token }

        /** Alias for calling [Builder.token] with `token.orElse(null)`. */
        fun token(token: Optional<String>) = token(token.getOrNull())

        /** Raw file bytes. Accepts any file type (images, documents, videos, etc.). */
        fun file(file: String?) = apply { this.file = file }

        /** Alias for calling [Builder.file] with `file.orElse(null)`. */
        fun file(file: Optional<String>) = file(file.getOrNull())

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
         * Returns an immutable instance of [UploadUploadWithTokenParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): UploadUploadWithTokenParams =
            UploadUploadWithTokenParams(
                token,
                file,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Optional<String> = Optional.ofNullable(file)

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> token ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is UploadUploadWithTokenParams &&
            token == other.token &&
            file == other.file &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(token, file, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "UploadUploadWithTokenParams{token=$token, file=$file, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
