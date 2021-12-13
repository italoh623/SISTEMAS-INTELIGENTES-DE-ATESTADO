package ufpe.cin.gerenciamento.atestados.model;

import javax.persistence.*;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String login;
    private String senha;
    @OneToOne()
    private Long funcionarioId;

    public Conta() {

    }

    public Conta(String login, String senha, Long funcionarioId) {
        this.login = login;
        this.senha = senha;
        this.funcionarioId = funcionarioId;
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