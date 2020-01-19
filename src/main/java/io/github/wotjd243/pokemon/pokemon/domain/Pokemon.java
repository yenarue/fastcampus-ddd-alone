package io.github.wotjd243.pokemon.pokemon.domain;

import java.util.Objects;

public class Pokemon {
    private final NationalPokedexNumber number;
    private final String name;
    private final int captureRate;

    public Pokemon(final int number, final String name, final int captureRate) {
        this(NationalPokedexNumber.valueOf(number), name, captureRate);
    }

    public Pokemon(final NationalPokedexNumber number, final String name, final int captureRate) {
        this.number = number;
        this.name = name;
        this.captureRate = captureRate;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Pokemon pokemon = (Pokemon) o;
        return Objects.equals(number, pokemon.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
