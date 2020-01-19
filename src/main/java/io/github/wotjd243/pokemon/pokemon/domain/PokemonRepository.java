package io.github.wotjd243.pokemon.pokemon.domain;

import io.github.wotjd243.pokemon.pokemon.infra.DummyPokemonData;

public class PokemonRepository {
    public Pokemon findById(final NationalPokedexNumber number) {
        return DummyPokemonData.get(number);
    }
}
