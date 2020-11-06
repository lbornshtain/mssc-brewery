package net.monga.msscbrewery.web.services;

import net.monga.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

    public CustomerDto getCustomerById(UUID id);

    public CustomerDto saveNewCustomer(CustomerDto customerDto);

    public void update(UUID id, CustomerDto customerDto);

    public void delete(UUID id);
}
