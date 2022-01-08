package com.ciandt.cardmanager.extensions

import com.ciandt.cardmanager.service.handlers.RequestResult
import com.ciandt.cardmanager.service.handlers.RequestResultError
import com.ciandt.cardmanager.service.handlers.RequestResultNotFound
import com.ciandt.cardmanager.service.handlers.RequestResultSuccess
import com.ciandt.cardmanager.service.handlers.RequestResultUnauthorized
import retrofit2.Call
import retrofit2.awaitResponse

suspend fun <T> Call<T>.toRequestResult(): RequestResult<T> {
    val response = this.awaitResponse()

    return if (response.isSuccessful) {
        RequestResultSuccess(response)
    } else {
        when (response.code()) {
            401 -> RequestResultUnauthorized()
            404 -> RequestResultNotFound()
            else -> RequestResultError(response.code().toString() + ": " + response.message())
        }
    }
}