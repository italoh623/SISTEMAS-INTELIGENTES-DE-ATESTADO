package ufpe.cin.gerenciamento.atestados.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import ufpe.cin.gerenciamento.atestados.entidades.Conta;
import ufpe.cin.gerenciamento.atestados.entidades.Funcionario;

public interface IRepositorioConta {

    public Conta inserir(Conta conta);

    public Iterable<Conta> getAll();

}
