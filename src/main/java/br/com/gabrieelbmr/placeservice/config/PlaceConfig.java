package br.com.gabrieelbmr.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.gabrieelbmr.placeservice.domain.PlaceRepository;
import br.com.gabrieelbmr.placeservice.domain.PlaceService;

@Configuration
public class PlaceConfig {
    
    @Bean
    PlaceService placeService(PlaceRepository placeRepository) {
        return new PlaceService(placeRepository);
    }
}
