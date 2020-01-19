package io.github.wotjd243.pokemon.pokemon.application;

import io.github.wotjd243.pokemon.pokemon.domain.PokemonRepository;
import io.github.wotjd243.pokemon.pokemon.infra.DummyPokemonRepository;
import io.github.wotjd243.pokemon.pokemon.domain.Pokemon;
import org.springframework.stereotype.Service;

// ApplicationService
@Service
public class PokemonService {
    private final PokemonRepository pokemonRepository;

    public PokemonService(final DummyPokemonRepository dummyPokemonRepository) {
        this.pokemonRepository = dummyPokemonRepository;
    }

    public Pokemon find(final int number) {
        return pokemonRepository.findById(number);
    }
}
