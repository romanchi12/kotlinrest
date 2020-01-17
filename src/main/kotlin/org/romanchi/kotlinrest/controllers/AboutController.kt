package org.romanchi.kotlinrest.controllers

import org.romanchi.kotlinrest.models.Tender
import org.romanchi.kotlinrest.services.AboutService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.ResponseBody

/**
 *@project   kotlinrest
 *@author    Roman Malyarchuk
 *@since     17/01/20 14:20
 */
@Controller
class AboutController(@Autowired
                      val aboutService: AboutService) {


    @GetMapping("/about/{id}")
    @ResponseBody
    fun aboutInfo(@PathVariable id:String?):Tender{

        id?:IllegalArgumentException("Empty or bad id")

        val tender = id?.let {aboutService.getTenderInfo(id)}

        if(tender != null){
            return tender
        }else{
            throw IllegalArgumentException("Not found")
        }
    }
}

