package ufpe.cin.gerenciamento.atestados.model;

public interface IRepositorioConta {

    public Conta inserir(Conta conta);

    public Iterable<Conta> getAll();

}
