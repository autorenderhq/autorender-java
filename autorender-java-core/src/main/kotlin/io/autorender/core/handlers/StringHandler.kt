@file:JvmName("StringHandler")

package io.autorender.core.handlers

import io.autorender.core.http.HttpResponse
import io.autorender.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}
