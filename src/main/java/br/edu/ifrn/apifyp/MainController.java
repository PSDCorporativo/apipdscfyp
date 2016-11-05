package br.edu.ifrn.apifyp;

import br.edu.ifrn.apifyp.repository.ProfissionalRepository;
import com.google.gson.Gson;
import java.util.Set;
import java.util.TreeSet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "/GetProfissionalByLogin", method = RequestMethod.GET, produces = "application/json")
    public Profissional getProfissionalByLogin(@RequestParam("login") String login) {
        Profissional p = repository.findByLogin(login);

        return p;
    }

    @RequestMapping(value = "/AdicionarProfissional", method = RequestMethod.POST) 
    public Object adicionarProfissional(@RequestBody String rb) {
        Gson gson = new Gson();
        
        Profissional p = gson.fromJson(rb, Profissional.class);
        
        repository.save(p);
        
        return null;
    }
}
