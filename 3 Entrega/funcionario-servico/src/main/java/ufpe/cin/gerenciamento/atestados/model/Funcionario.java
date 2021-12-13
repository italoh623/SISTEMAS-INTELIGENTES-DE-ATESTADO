package ufpe.cin.gerenciamento.atestados.entidades;

import javax.persistence.*;

@Entity
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String cargo;

    public Funcionario() {

    }

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }
}
