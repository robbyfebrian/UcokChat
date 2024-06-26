package com.robbies.ucokchat.data

sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null,
    val exception: Exception? = null
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Loading<T>(data: T? = null) : Resource<T>(data)
    class Error<T>(message: String, exception: Exception? = null, data: T? = null) :
        Resource<T>(data, message, exception)
}