package net.monga.msscbrewery.web.services;

import lombok.extern.slf4j.Slf4j;
import net.monga.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Moshe")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void update(UUID id, CustomerDto customerDto) {
      log.debug("Update customer " + id);
    }

    public void delete(UUID id){
        log.debug("Delete customer " + id);
    }
}
