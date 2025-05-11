package com.blu.mapstruct.controller

import com.blu.mapstruct.dto.TempDto
import com.blu.mapstruct.entity.TempEntity
import com.blu.mapstruct.mapper.TempMapper
import com.blu.mapstruct.repository.TempRepository
import jakarta.transaction.Transactional
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class TempController @Autowired constructor(
    private val repository: TempRepository,
    private val mapper: TempMapper
){

    @Transactional
    @PostMapping("/temp")
    fun createTemp(@RequestBody temp: TempEntity): Any {
        val saved = repository.save(temp)
        return mapOf(
            "entity" to saved,
            "dto" to mapper.toDto(saved)
        )
    }
}