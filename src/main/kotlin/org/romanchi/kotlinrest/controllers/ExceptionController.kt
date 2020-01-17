package org.romanchi.kotlinrest.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody

/**
 *@project   kotlinrest
 *@author    Roman Malyarchuk
 *@since     17/01/20 16:18
 */
@ControllerAdvice
class ExceptionController{

    data class ErrorDetails(val message:String, val code:Int)

    @ExceptionHandler(IllegalArgumentException::class)
    @ResponseBody
    fun handleIllegalArgumentException(ex:IllegalArgumentException):ResponseEntity<ErrorDetails>{
        val errorDetails = ErrorDetails(ex.localizedMessage, HttpStatus.UNPROCESSABLE_ENTITY.ordinal)
        return ResponseEntity(errorDetails, HttpStatus.UNPROCESSABLE_ENTITY)
    }
}