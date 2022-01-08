package com.ciandt.cardmanager.service.handlers

open class RequestResultError<T>(val message: String) : RequestResult<T>()