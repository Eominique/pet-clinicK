package com.model

import javax.persistence.*

@Entity
data class Pet(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var petName: String = ""
) {
}