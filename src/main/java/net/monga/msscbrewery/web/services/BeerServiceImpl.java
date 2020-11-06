package net.monga.msscbrewery.web.services;

import lombok.extern.slf4j.Slf4j;
import net.monga.msscbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("update beer");
    }

    @Override
    public void deleteBeer(UUID beerId) {
      log.debug("deleting beer....");
    }
}
