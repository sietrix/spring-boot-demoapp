package demoapp.controller;

import demoapp.service.NumeroEnteroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class NumeroEnteroControllerForm {

    @Autowired
    private NumeroEnteroService service;

    @GetMapping("/cuadrado")
    public String cuadradoForm(NumeroEntero numeroEntero) {
        return "cuadrado";
    }

    @PostMapping("/cuadrado")
    public String checkPersonInfo(@ModelAttribute @Valid NumeroEntero numeroEntero, Model model) {
//        if (bindingResult.hasErrors()) {
//            return "formRegistro";
//        }
        model.addAttribute("numero", numeroEntero.getNumero());
        model.addAttribute("resultado", service.cuadradoDeUnNumero(numeroEntero.getNumero()));
        return "resultadocuadrado";
    }



}
