package br.com.fiap.meujulius.models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {
    private BigDecimal valor;
    private LocalDate data;
    private String descricao;

    public Despesa(BigDecimal valor, LocalDate data, String descricao) {
        this.valor = valor;
        this.data = data;
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Despesa [valor=" + valor + ", data=" + data + ", descricao=" + descricao + "]";
    }

    

}
