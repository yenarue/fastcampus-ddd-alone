package io.github.wotjd243.pokemon.pokemon.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PokemonTest {
    @Test
    void constructor() {
        // given
        // when
        // then
        new Pokemon(1, "이상해씨", 45);
    }

    @DisplayName("일정 포획률 이상일 때 포켓몬은 잡힌다")
    @Test
    void capture() {
        // given
        final Pokemon pokemon = new Pokemon(1, "이상해씨", 45);
        // when
        final boolean capture = pokemon.capture(50);
        // then
        assertThat(capture).isTrue();
    }
}