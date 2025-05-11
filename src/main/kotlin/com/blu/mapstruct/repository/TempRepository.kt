package com.blu.mapstruct.repository

import com.blu.mapstruct.entity.TempEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TempRepository : JpaRepository<TempEntity, Long> {
}