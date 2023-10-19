package br.com.gabrieelbmr.placeservice.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.gabrieelbmr.placeservice.domain.Place;
import br.com.gabrieelbmr.placeservice.domain.PlaceService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {
    private PlaceService placeService;
    
    public PlaceController(PlaceService placeService) {
        this.placeService = placeService;
    }

    @PostMapping
    public ResponseEntity<Mono<Place>> create(@RequestBody Place place){
        var createdPlace = placeService.create(place);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPlace);
    }
}
