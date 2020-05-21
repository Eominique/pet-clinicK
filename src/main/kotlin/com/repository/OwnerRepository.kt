package com.repository

import com.model.Owner
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OwnerRepository: JpaRepository<Owner, Long> {
    fun findByFirstNameAndLastName(firstName: String, lastName: String): Owner
}