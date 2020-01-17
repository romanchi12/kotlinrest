package org.romanchi.kotlinrest.repositories

import org.romanchi.kotlinrest.models.Tender
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 *@project   kotlinrest
 *@author    Roman Malyarchuk
 *@since     17/01/20 14:50
 */
@Repository
interface TenderRepository:JpaRepository<Tender, UUID>{
    fun findAllById(id:UUID):Tender?
}