package br.com.fit.services;

import org.springframework.stereotype.Service;

import br.com.fit.models.Person;

@Service
public class ImcCalculatorService {
    public ImcCalculatorService() {
        super();
    }

    public static void calculateImc(Person person) {
        person.setImc(person.getWeight() / Math.pow(person.getHeight(), 2));
    }

    public static void resultIMC(Person person) {
        person.setImcDescription("Obesidade");
        if (person.getImc() < 18.5) person.setImcDescription("Magreza");
        else if (person.getImc() < 24.9) person.setImcDescription("Normal");
        else if (person.getImc() < 30) person.setImcDescription("Sobrepeso");
    }

    public void returnImc(Person person) {
        calculateImc(person);
        resultIMC(person);
    }
}