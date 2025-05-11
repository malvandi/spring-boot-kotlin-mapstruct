package com.blu.mapstruct.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class TempEntity(
    val name: String = "",
    val age: Int = 0,

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0
)
