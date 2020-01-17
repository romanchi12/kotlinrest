package org.romanchi.kotlinrest.models

import com.fasterxml.jackson.annotation.JsonIgnore
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 *@project   kotlinrest
 *@author    Roman Malyarchuk
 *@since     17/01/20 15:54
 */
@Entity
@Table(schema = "bd00", name = "t_bd00_objects")
data class Organization(@JsonIgnore
                        @Id
                        @Column(name="id")
                        val id: UUID,

                        @Column(name="full_name")
                        var fullName:String
                        )