package pl.dmuszynski.deliverycompany.mapper.annotation;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.CLASS)
@Mappings({
        @Mapping(source = "address.street", target = "street"),
        @Mapping(source = "address.city", target = "city"),
        @Mapping(source = "address.buildingNumber", target = "buildingNumber")})
public @interface AddressMapping { }
