package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroEnteroService {

    public int cuadradoDeUnNumero(int numero) {
        return numero * numero;
    }
}
