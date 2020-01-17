package org.romanchi.kotlinrest.exceptions

class NotFoundException():Throwable(){

    override var message:String = ""

    constructor(message:String):this(){
        this.message = message
    }
}