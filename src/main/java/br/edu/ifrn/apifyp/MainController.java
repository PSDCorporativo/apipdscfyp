package br.edu.ifrn.apifyp;

import br.edu.ifrn.apifyp.repository.ProfissionalRepository;
import java.util.Set;
import java.util.TreeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mateus
 */
@RestController
public class MainController {

    @Autowired
    ProfissionalRepository repository;

    @RequestMapping(value = "/ListProfissionais", method = RequestMethod.GET, produces = "application/json")
    public Set<Profissional> listProfissionais() {
        Set<Profissional> setPro = new TreeSet();
        Iterable<Profissional> profissionais = repository.findAll();

        for (Profissional p : profissionais) {
            setPro.add(p);
        }

        return setPro;
    }

    @RequestMapping(value = "/AdicionarProfissional", method = RequestMethod.GET, produces = "application/json")
    public Object adicionarProfissional() {
        Profissional p;
        p = new Profissional("Mat", "mat@gmail", "matocb", "123", 12, "lindo", "pedreiro", 1, 1, 10);

        repository.save(p);
        
        return "Ok";
    }
}
