package com.blu.mapstruct.dto

import java.io.Serializable

/**
 * DTO for {@link com.blu.mapstruct.entity.TempEntity}
 */
data class TempDto(val name: String = "", val age: Int = 0, val id: Long = 0) : Serializable