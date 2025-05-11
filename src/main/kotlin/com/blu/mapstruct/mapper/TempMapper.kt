package com.blu.mapstruct.mapper

import com.blu.mapstruct.dto.TempDto
import com.blu.mapstruct.entity.TempEntity
import org.mapstruct.*

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
abstract class TempMapper {

    abstract fun toEntity(tempDto: TempDto): TempEntity

    abstract fun toDto(tempEntity: TempEntity): TempDto

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    abstract fun partialUpdate(tempDto: TempDto, @MappingTarget tempEntity: TempEntity): TempEntity
}