package demoapp.controller;

import demoapp.service.NumeroEnteroService;
import demoapp.service.SaludoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MockServiceCuadradoTest {

    @Autowired
    private MockMvc mockMvc;

    // Podemos también mockear el servicio
    @MockBean
    private NumeroEnteroService service;

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {

        // Y especificar lo que debe devolver una llamada a uno de sus métodos
        when(service.cuadradoDeUnNumero(2)).thenReturn(4);

        this.mockMvc.perform(get("/cuadrado"))
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Numero")));
    }
}
