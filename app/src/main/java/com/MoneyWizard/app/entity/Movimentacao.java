package com.MoneyWizard.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tb_movimentacao", schema = "public")
public class Movimentacao extends AbstractEntity{
    @Getter
    @Setter
    @Column(name = "cl_saldo")
    private BigDecimal saldo;

    @Getter @Setter
    @Column(name = "cl_valor_investido")
    private BigDecimal valorInvestido;

    @Getter @Setter
    @Column(name = "cl_deposito")
    private BigDecimal deposito;

    @Getter @Setter
    @Column(name = "cl_saque")
    private BigDecimal saque;
}
