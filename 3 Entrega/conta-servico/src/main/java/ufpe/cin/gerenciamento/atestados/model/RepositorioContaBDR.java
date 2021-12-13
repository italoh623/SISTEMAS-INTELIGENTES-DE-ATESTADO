package ufpe.cin.gerenciamento.atestados.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ufpe.cin.gerenciamento.atestados.ApplicationContextHolder;
import ufpe.cin.gerenciamento.atestados.model.ContaDAO;

import java.util.List;

@Component
public class RepositorioContaBDR implements IRepositorioConta {

    @Autowired
    private ContaDAO contaDAO;

    public RepositorioContaBDR(){
        this.contaDAO = ApplicationContextHolder.getContext().getBean(ContaDAO.class);
    }

    @Override
    public Conta inserir(Conta conta) {
        return contaDAO.save(conta);
    }

    @Override
    public List<Conta> getAll() {
        return contaDAO.findAll();
    }
}
