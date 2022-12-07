package pl.dmuszynski.deliverycompany.mapper.annotation;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Mappings({
        @Mapping(source = "person.name", target = "name"),
        @Mapping(source = "person.lastname", target = "lastname"),
        @Mapping(source = "person.phone", target = "phone"),
        @Mapping(source = "person.address.street", target = "street"),
        @Mapping(source = "person.address.city", target = "city"),
        @Mapping(source = "person.address.buildingNumber", target = "buildingNumber")})
public @interface PersonMapping { }
