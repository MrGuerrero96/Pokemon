package com.example.Pokemon.controllers;

import com.example.Pokemon.models.PokemonModel;
import com.example.Pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping()
    public Flux<PokemonModel> getAllPokemon(){
        return pokemonService.getAllPokemon();
    }
}
