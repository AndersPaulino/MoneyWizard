package com.MoneyWizard.app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Entity
@Table(name = "tb_conta", schema = "public")
public class Conta extends AbstractEntity{

    @Getter @Setter
    @OneToOne
    @JoinColumn(name = "cl_usuarios")
    private Usuario usuario;

    @Getter @Setter
    @Column(name = "cl_numero_conta", unique = true)
    private String numeroConta;

    @Getter @Setter
    @OneToMany
    @JoinColumn(name = "cl_investimentos")
    private List<Investimento> investimento = new ArrayList<>();


    // Função para gerar um número aleatório com letras e números
    private String gerarNumeroContaAleatorio(int tamanho) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(caracteres.length());
            char caractere = caracteres.charAt(index);
            sb.append(caractere);
        }

        return sb.toString();
    }

    // Setter que gera um número aleatório para a variável 'numeroConta'
    public void setNumeroContaAleatorio(int tamanho) {
        this.numeroConta = gerarNumeroContaAleatorio(tamanho);
    }

    // Getter para obter o número da conta
    public String getNumeroConta() {
        return numeroConta;
    }
}
