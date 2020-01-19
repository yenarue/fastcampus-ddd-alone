package io.github.wotjd243.pokemon.pokemon.domain;

import io.github.wotjd243.pokemon.pokemon.infra.DummyPokemonData;
import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepository {
    public Pokemon findById(final int number) {
        return DummyPokemonData.get(NationalPokedexNumber.valueOf(number));
    }
}
