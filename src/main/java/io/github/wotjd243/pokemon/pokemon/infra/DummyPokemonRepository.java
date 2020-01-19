package io.github.wotjd243.pokemon.pokemon.infra;

import io.github.wotjd243.pokemon.pokemon.domain.NationalPokedexNumber;
import io.github.wotjd243.pokemon.pokemon.domain.Pokemon;
import io.github.wotjd243.pokemon.pokemon.domain.PokemonRepository;
import io.github.wotjd243.pokemon.pokemon.infra.DummyPokemonData;
import org.springframework.stereotype.Repository;

@Repository
public class DummyPokemonRepository implements PokemonRepository {
    @Override
    public Pokemon findById(final int number) {
        return DummyPokemonData.get(NationalPokedexNumber.valueOf(number));
    }
}
