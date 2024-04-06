package com.tinnova.fatorial.fatorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tinnova.fatorial.fatorial.model.Fatorial;

@SpringBootApplication
public class FatorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FatorialApplication.class, args);

		Fatorial fatorial = new Fatorial();

		int numero = 6;
		System.out.println("O fatorial de " + numero + " é: " + fatorial.calculate(numero));
	}

}
