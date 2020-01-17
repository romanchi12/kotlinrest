package org.romanchi.kotlinrest.controllers

import org.romanchi.kotlinrest.exceptions.NotFoundException
import org.romanchi.kotlinrest.models.Tender
import org.romanchi.kotlinrest.services.TenderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

/**
 *@project   kotlinrest
 *@author    Roman Malyarchuk
 *@since     17/01/20 14:20
 */
@Controller
class TendersController(@Autowired
                      val tenderService: TenderService) {


    @GetMapping("/tenders/{id}")
    @ResponseBody
    fun getTender(@PathVariable id:String?):Tender{

        id?:IllegalArgumentException("Empty or bad id")

        val tender = id?.let {tenderService.getTenderInfo(id)}

        if(tender != null){
            return tender
        }else{
            throw NotFoundException("Not found")
        }
    }

    @PostMapping("/tenders")
    @ResponseBody
    fun postTender(@RequestBody tender:Tender):Tender{
        return tenderService.save(tender)
    }
}

