package backend.com.backend.model;

import jakarta.persistence.*;

@Entity
public class Movimentacao extends Pessoa {
    @Id
    private Conta conta;
    private double valor;

    public Movimentacao(String name, int cpf, String address, Conta conta, double valor) {
        super(name, cpf, address);
        this.conta = conta;
        this.valor = valor;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getNumeroConta() {
        return conta.getNumeroConta();
    }
}

