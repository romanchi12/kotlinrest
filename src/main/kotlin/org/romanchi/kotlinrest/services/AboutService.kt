package org.romanchi.kotlinrest.services

import org.romanchi.kotlinrest.models.Tender
import org.romanchi.kotlinrest.repositories.TenderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

/**
 *@project   kotlinrest
 *@author    Roman Malyarchuk
 *@since     17/01/20 14:30
 */

@Service
class AboutService(@Autowired private val tenderRepository:TenderRepository){

    fun getTenderInfo(id:String): Tender? {
        val id = UUID.fromString(id)
        return tenderRepository.findAllById(id)
    }

    fun save(tender: Tender){
        tenderRepository.save(tender)
    }
}