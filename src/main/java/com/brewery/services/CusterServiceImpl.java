package com.brewery.services;

import com.brewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;


@Slf4j
@Service
public class CusterServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Edison")
                .build();
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID customerId, CustomerDto customerDto) {

    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a bug...");
    }
}
