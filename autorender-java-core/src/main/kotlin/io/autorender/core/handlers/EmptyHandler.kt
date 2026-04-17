@file:JvmName("EmptyHandler")

package io.autorender.core.handlers

import io.autorender.core.http.HttpResponse
import io.autorender.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
