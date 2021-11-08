package ufpe.cin.gerenciamento.atestados.entidades;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PedidoAbono {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne()
    private Funcionario funcionario;
    private String date;
    private String inicio;
    private String fim;
    private String justificativa;

    PedidoAbono() {

    }

    public PedidoAbono(Funcionario funcionario, String date, String inicio, String fim, String justificativa) {
        this.funcionario = funcionario;
        this.date = date;
        this.inicio = inicio;
        this.fim = fim;
        this.justificativa = justificativa;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInicio() {
        return this.inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFim() {
        return this.fim;
    }

    public void setFim(String fim) {
        this.fim = fim;
    }

    public String getJustificativa() {
        return this.justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }
}
