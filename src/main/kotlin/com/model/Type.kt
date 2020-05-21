package com.model

import javax.persistence.*

@Entity
data class Type(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long? = null,
        var typeName: String = " "
) {
    constructor(typeName: String) : this() {
        this.typeName = typeName
    }
}