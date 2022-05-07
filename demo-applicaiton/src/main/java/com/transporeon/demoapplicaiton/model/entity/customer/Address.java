package com.transporeon.demoapplicaiton.model.entity.customer;

import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Validated
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String streetAddress;

    private String postalCode;

    private String cityName;

    private String countryName;
}
