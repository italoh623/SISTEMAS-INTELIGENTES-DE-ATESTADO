package ufpe.cin.gerenciamento.atestados.entidades;

public class PedidoAbono {
    private Funcionario funcionario;
    private String date;
    private String inicio;
    private String fim;
    private String justificativa;

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
