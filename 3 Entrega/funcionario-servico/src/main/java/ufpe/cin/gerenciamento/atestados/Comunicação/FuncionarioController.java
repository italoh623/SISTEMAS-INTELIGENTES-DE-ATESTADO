package ufpe.cin.gerenciamento.atestados.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FuncionarioController {

    @GetMapping(path = "/funcionario/{id}")
    public String registrarConta(@PathVariable("id") Long id) {
        return "funcionario";
    }

}
