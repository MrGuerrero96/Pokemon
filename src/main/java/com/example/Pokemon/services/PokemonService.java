package com.example.Pokemon.services;

import com.example.Pokemon.models.PokemonModel;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

@Service
public class PokemonService {

    private final WebClient webClient;

    public PokemonService(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("https://pokeapi.co/api/v2").build();
    }

    public Flux<PokemonModel> getAllPokemon(){
        System.out.println("prueba");
        return this.webClient.get()
                .uri("/pokemon")
                .retrieve()
                .bodyToFlux(PokemonModel.class);
    }

}
