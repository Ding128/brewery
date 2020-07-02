package com.brewery.services;

import com.brewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CusterServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .customerID(UUID.randomUUID())
                .name("Edison")
                .build();
    }


}
