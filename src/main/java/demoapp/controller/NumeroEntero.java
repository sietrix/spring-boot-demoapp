package demoapp.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class NumeroEntero {
    @NotNull
    @Positive
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
