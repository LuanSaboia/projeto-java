package backend.com.backend.model;

import jakarta.persistence.*;

@Entity
public class Conta extends Pessoa {
    @GeneratedValue
    @Id
    private int numeroConta;

    public Conta(String name, int cpf, String address, int numeroConta) {
        super(name, cpf, address);
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
}

