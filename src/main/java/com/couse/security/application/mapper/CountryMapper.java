package com.couse.security.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.couse.security.application.api.request.CreateCountryRequest;
import com.couse.security.application.api.response.CountryDetailResponse;
import com.couse.security.application.entity.Country;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CountryMapper {

    CountryMapper INSTANCE = Mappers.getMapper(CountryMapper.class);

    CountryDetailResponse toResponse(Country country);

    List<CountryDetailResponse> toResponseList(List<Country> countries);

    @Mapping(target = "countryUuid", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "cities", ignore = true)
    @Mapping(target = "countryCode", source = "code")
    @Mapping(target = "countryName", source = "name")
    Country toEntity(CreateCountryRequest request);

}