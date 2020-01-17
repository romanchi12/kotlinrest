package org.romanchi.kotlinrest.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.romanchi.kotlinrest.models.Tender
import org.romanchi.kotlinrest.services.AboutService
import org.springframework.beans.factory.annotation.Autowired

/**
 *@project   kotlinrest
 *@author    Roman Malyarchuk
 *@since     17/01/20 14:20
 */
@Controller
class AboutController(@Autowired
                      val aboutService: AboutService) {


    @GetMapping("/about")
    @ResponseBody
    fun aboutInfo():Tender{
        return aboutService.getTenderInfo()
    }
}

