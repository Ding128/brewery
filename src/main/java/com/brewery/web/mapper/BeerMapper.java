package com.brewery.web.mapper;

import com.brewery.domain.Beer;
import com.brewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerTdo (Beer beer);
    Beer beerDtoToBeer(BeerDto beerDto);
}
