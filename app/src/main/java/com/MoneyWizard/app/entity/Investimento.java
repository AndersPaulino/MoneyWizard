package com.MoneyWizard.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_investimentos",schema = "public")
public class Investimento extends AbstractEntity{
    @Getter @Setter
    private Tipo tipo;

    @Getter @Setter
    private TipoPorcentagem tipoPorcentagem;

    @Getter @Setter
    @Column(name = "cl_valorInvestimento")
    private BigDecimal valorInvestimento;

    @Getter @Setter
    @Column(name = "cl_lucro")
    private BigDecimal lucro;

    @Getter @Setter
    @Column(name = "cl_valor_porcentagem")
    private BigDecimal valorPorcentagem;



}
