package com.repository

import com.model.Type
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TypeRepository: JpaRepository<Type, Long> {
    fun findByTypeName(typeName: String): Type
}