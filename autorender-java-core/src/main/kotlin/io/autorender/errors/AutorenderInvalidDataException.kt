package io.autorender.errors

class AutorenderInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : AutorenderException(message, cause)
