package br.com.fit.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fit.models.Person;
import br.com.fit.services.ImcCalculatorService;

@RestController
@RequestMapping("/imc")
public class ImcController {
    @Autowired
    private ImcCalculatorService imcService;
    
    @PostMapping("/calculate")
    public Person calculateImc(@RequestBody Person person) {
        imcService.returnImc(person);

        return person;
    }
}
