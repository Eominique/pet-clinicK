package com.model

import javax.persistence.*

@Entity
data class Owner(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var firstName: String? = null,
        var lastName: String? = null,
        var address: String? = null,
        var city: String? = null,
        var telephone: String? = null

        //@OneToMany
      //  var pets: Set<Pet>? = null
) {
    constructor(firstName: String?, lastName: String?) : this() {
        this.firstName = firstName
        this.lastName = lastName
    }
}