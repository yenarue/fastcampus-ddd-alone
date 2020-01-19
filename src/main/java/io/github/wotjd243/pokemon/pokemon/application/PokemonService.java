package io.github.wotjd243.pokemon.pokemon.application;

import io.github.wotjd243.pokemon.pokemon.domain.Pokemon;
import io.github.wotjd243.pokemon.pokemon.domain.PokemonRepository;
import org.springframework.stereotype.Service;

// ApplicationService
@Service
public class PokemonService {
    private final PokemonRepository pokemonRepository;

    public PokemonService(final PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    public Pokemon find(final int number) {
        return pokemonRepository.findById(number);
    }
}
