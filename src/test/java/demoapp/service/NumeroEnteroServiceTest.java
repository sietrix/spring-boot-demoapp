package demoapp.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class NumeroEnteroServiceTest {

    @Autowired
    NumeroEnteroService service;

    // El método contextLoads() en las pruebas de Spring Boot sirve para comprobar
    // que el contexto de la aplicación se carga correctamente sin errores
    @Test
    public void contexLoads() {
        assertThat(service).isNotNull();
    }

    @Test
    void cuadradoDeUnNumero() {
        assertThat(service.cuadradoDeUnNumero(2)).isEqualTo(4);
    }
}