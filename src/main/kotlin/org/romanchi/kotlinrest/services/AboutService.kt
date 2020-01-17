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

    fun getTenderInfo(): Tender {
        val id = UUID.fromString("60733e98-10bf-4b1e-8b44-bf4432a2e36e")
        return tenderRepository.findAllById(id)
    }
}