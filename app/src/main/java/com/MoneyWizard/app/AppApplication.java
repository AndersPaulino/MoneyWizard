package com.MoneyWizard.app;

import com.MoneyWizard.app.entity.Conta;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
		Conta conta = new Conta();
		conta.setNumeroContaAleatorio(5); // Gera um número de conta aleatório com 10 caracteres
		System.out.println("Número da conta: " + conta.getNumeroConta());
	}

}
