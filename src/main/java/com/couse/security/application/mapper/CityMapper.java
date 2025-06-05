package com.couse.security.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.couse.security.application.api.request.CreateCityRequest;
import com.couse.security.application.api.response.CityDetailResponse;
import com.couse.security.application.entity.City;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CityMapper {

    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);

    @Mapping(target = "countryCode", source = "country.countryCode")
    @Mapping(target = "countryName", source = "country.countryName")
    @Mapping(target = "code", source = "cityCode")
    @Mapping(target = "name", source = "cityName")
    @Mapping(target = "phoneCode", source = "cityPhoneCode")
    CityDetailResponse toResponse(City city);

    List<CityDetailResponse> toResponseList(List<City> cities);

    @Mapping(target = "cityUuid", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    @Mapping(target = "createdBy", ignore = true)
    @Mapping(target = "updatedBy", ignore = true)
    @Mapping(target = "deleted", ignore = true)
    @Mapping(target = "deletedAt", ignore = true)
    @Mapping(target = "country", ignore = true)
    @Mapping(target = "cityCode", source = "code")
    @Mapping(target = "cityName", source = "name")
    @Mapping(target = "cityPhoneCode", source = "phoneCode")
    City toEntity(CreateCityRequest request);

}