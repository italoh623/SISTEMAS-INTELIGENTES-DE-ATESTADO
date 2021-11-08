package ufpe.cin.gerenciamento.atestados.entidades;

import javax.persistence.*;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String senha;
    @OneToOne()
    private Funcionario funcionario;

    public Conta() {

    }

    public Conta(String login, String senha, Funcionario funcionario) {
        this.login = login;
        this.senha = senha;
        this.funcionario = funcionario;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha; 
    }

    public Long getId() {
        return this.id;
    }
}