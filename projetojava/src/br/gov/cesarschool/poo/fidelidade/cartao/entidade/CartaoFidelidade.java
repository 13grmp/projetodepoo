package br.gov.cesarschool.poo.fidelidade.cartao.entidade;

import java.util.Date;

public class CartaoFidelidade {
    
    private long numero;
    private double saldo;
    private Date dataHoraAtualizacao = new Date();

    public CartaoFidelidade(long numero){
        this.numero = numero;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Date getDataHoraAtualizacao() {
        return dataHoraAtualizacao;
    }

    private void setDataHoraAtualizacao(Date dataHoraAtualizacao) {
        this.dataHoraAtualizacao = dataHoraAtualizacao;
    }

    public void Creditar(double valor){
        this.saldo += valor;
        setDataHoraAtualizacao(new Date(dataHoraAtualizacao.getTime()));
    }
    public void Debitar(double valor){
        this.saldo -= valor;
        setDataHoraAtualizacao(new Date(dataHoraAtualizacao.getTime()));
    }
    
}