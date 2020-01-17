package org.romanchi.kotlinrest.models

import lombok.NoArgsConstructor
import java.util.*
import javax.persistence.*

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
                  var id: UUID?,

                  @Column(name="n_bid")
                  var documentNumber: String,

                  @OneToOne(fetch = FetchType.LAZY)
                  @JoinColumns(JoinColumn(name = "id_object", referencedColumnName = "id", insertable = false, updatable = false))
                  var organization: Organization? = null
                  )