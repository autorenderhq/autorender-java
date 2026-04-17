// File generated from our OpenAPI spec by Stainless.

package io.autorender.errors

import io.autorender.core.JsonValue
import io.autorender.core.http.Headers

abstract class AutorenderServiceException
protected constructor(message: String, cause: Throwable? = null) :
    AutorenderException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
