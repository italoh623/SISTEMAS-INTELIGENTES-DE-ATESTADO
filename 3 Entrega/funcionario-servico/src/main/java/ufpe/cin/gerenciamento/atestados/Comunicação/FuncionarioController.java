package ufpe.cin.gerenciamento.atestados.comunicação;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufpe.cin.gerenciamento.atestados.model.Funcionario;
import ufpe.cin.gerenciamento.atestados.model.IRepositorioFuncionario;
import ufpe.cin.gerenciamento.atestados.model.RepositorioFuncionarioBDR;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

    private IRepositorioFuncionario repositorioFuncionario = new RepositorioFuncionarioBDR();

    @GetMapping("")
    public Map<String, List<Funcionario>> listarFuncionarios() {
        List<Funcionario> listaFuncionarios = repositorioFuncionario.getAll();
        return Collections.singletonMap("data", listaFuncionarios);
    }

    @PostMapping("")
    public Map<String, Long> criarFuncionario(@RequestBody  Funcionario funcionario) {
        Long id = repositorioFuncionario.inserir(funcionario);
        return Collections.singletonMap("id", id);
    }

}
