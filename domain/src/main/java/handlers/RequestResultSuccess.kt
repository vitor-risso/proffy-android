package com.ciandt.cardmanager.service.handlers

import retrofit2.Response

data class RequestResultSuccess<T>(val data: Response<T>) : RequestResult<T>()