package backend.com.backend.model;

import jakarta.persistence.*;

@Entity
public class Pessoa {
    
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int cpf;
    private String address;

    public Pessoa(String name, int cpf, String address) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
