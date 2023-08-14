package com.MoneyWizard.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_usuario", schema = "public")
public class Usuario extends AbstractEntity{

    @Getter @Setter
    @Column(name = "cl_nome", length = 50)
    private String nome;

    @Getter @Setter
    @Column(name = "cl_sobrenome", length = 50)
    private String sobrenome;

    @Getter @Setter
    @Column(name = "cl_idade", length = 3)
    private Integer idade;

    @Getter @Setter
    @Column(name = "cl_cpf", length = 15)
    private String cpf;

}
