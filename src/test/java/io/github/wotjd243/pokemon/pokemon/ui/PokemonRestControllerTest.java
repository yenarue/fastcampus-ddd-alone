package io.github.wotjd243.pokemon.pokemon.ui;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PokemonRestControllerTest {
    @Autowired
    private MockMvc mockMvc;

//    @BeforeEach
//    public void setup(){
//        this.mockMvc = MockMvcBuilders.standaloneSetup(new PokemonRestController(new PokemonService(new DummyPokemonRepository()))).build();
//    }

    @Test
    void find() throws Exception {
        this.mockMvc.perform(get("/api/pokemons/{number}", 1))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.number").value(1))
                .andExpect(jsonPath("$.name").isString())
                .andExpect(jsonPath("$.captureRate").isNumber())
        ;
    }
}