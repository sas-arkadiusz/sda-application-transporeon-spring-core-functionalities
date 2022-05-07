package com.transporeon.demoapplicaiton.model.dto;

import com.transporeon.demoapplicaiton.model.entity.BaseLocation;
import com.transporeon.demoapplicaiton.model.entity.customer.Customer;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class PackDto {

    private final Long id;
    private final Customer customer;
    private final BaseLocation baseLocation;
}
