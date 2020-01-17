package org.romanchi.kotlinrest.models

import lombok.NoArgsConstructor
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 *@project   kotlinrest
 *@author    Roman Malyarchuk
 *@since     17/01/20 14:46
 */
@Entity
@Table(schema = "bd00", name = "t_bd00_bids")
@NoArgsConstructor
data class Tender(@Id
                  @Column(name="id")
                  val id: UUID?,

                  @Column(name="n_bid")
                  val documentNumber: String){
    /*constructor(): this(null, "")*/
}