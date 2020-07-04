package com.brewery.web.mapper;

import com.brewery.domain.Customer;
import com.brewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer (CustomerDto customerDto);
}
