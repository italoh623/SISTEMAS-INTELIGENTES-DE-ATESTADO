package ufpe.cin.gerenciamento.atestados.model;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioMVCController {

    private IRepositorioFuncionario repositorioFuncionario = new RepositorioFuncionarioBDR();
    
    @GetMapping(path = "/{id}")
    public String mostrarFuncionario(@PathVariable("id") Long id, Model model) {
        Optional<Funcionario> funcionario = repositorioFuncionario.findById(id);

        if (funcionario.isPresent()) {
            Funcionario func = funcionario.get();

            model.addAttribute("nome", func.getNome());
            model.addAttribute("cargo", func.getCargo());
        }
        
        return "funcionario";
    }
}
