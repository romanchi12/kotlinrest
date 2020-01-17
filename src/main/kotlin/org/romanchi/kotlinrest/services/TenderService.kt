package org.romanchi.kotlinrest.services

import org.romanchi.kotlinrest.models.Organization
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
class TenderService(@Autowired private val tenderRepository:TenderRepository){

    fun getTenderInfo(id:String): Tender? {
        val id = UUID.fromString(id)
        return tenderRepository.findAllById(id)
    }

    fun save(tender: Tender):Tender{
        tender.id = tender.id ?: UUID.randomUUID()
        tender.organization = Organization(UUID.fromString("f8910f89-7f2a-43bc-9cbd-712da06615a2"), "")
        return tenderRepository.save(tender)
    }
}