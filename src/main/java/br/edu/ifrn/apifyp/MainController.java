package br.edu.ifrn.apifyp;

import br.edu.ifrn.apifyp.model.Profissional;
import br.edu.ifrn.apifyp.model.Usuario;
import br.edu.ifrn.apifyp.repository.EnderecoRepository;
import br.edu.ifrn.apifyp.repository.ProfissionalRepository;
import br.edu.ifrn.apifyp.repository.UsuarioRepository;
import com.google.gson.Gson;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.servlet.http.HttpSession;
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
    ProfissionalRepository profissionalRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    EnderecoRepository enderecoRepository;

    @RequestMapping(value = "/GetFuncionarioById", method = RequestMethod.GET, produces = "application/json")
    public Profissional getProfissional(@RequestParam("idProfissional") String idProfissional) {
        
        Profissional profissional = profissionalRepository.findOne(Long.getLong(idProfissional));

        return profissional;
    }

    @RequestMapping(value = "/ListProfissionais", method = RequestMethod.GET, produces = "application/json")
    public Set<Profissional> listProfissionais() {
        Set<Profissional> setPro = new TreeSet();
        Iterable<Profissional> profissionais = profissionalRepository.findAll();

        for (Profissional p : profissionais) {
            setPro.add(p);
        }

        return setPro;
    }

    @RequestMapping(value = "/ListProfissionaisByProfissao", method = RequestMethod.GET, produces = "application/json")
    public Set<Profissional> listProfissionaisByProfissao(@RequestParam("profissao") String profissao) {
        Set<Profissional> setPro = new TreeSet();

        Iterable<Profissional> profissionais = profissionalRepository.findByProfissao(profissao);

        for (Profissional p : profissionais) {
            setPro.add(p);
        }

        return setPro;
    }

    @RequestMapping(value = "/AdicionarProfissional", method = RequestMethod.POST)
    public void adicionarProfissional(@RequestBody String rb) {
        Gson gson = new Gson();

        Profissional p = gson.fromJson(rb, Profissional.class);
        p.getUsuario().setProfissional(true);
        enderecoRepository.save(p.getUsuario().getEndereco());
        usuarioRepository.save(p.getUsuario());
        profissionalRepository.save(p);
    }

    @RequestMapping(value = "/AdicionarUsuario", method = RequestMethod.POST)
    public void adicionarUsuario(@RequestBody String rb) {
        Gson gson = new Gson();

        Usuario u = gson.fromJson(rb, Usuario.class);

        u.setProfissional(false);
        enderecoRepository.save(u.getEndereco());
        usuarioRepository.save(u);
    }

    @RequestMapping(value = "/Login", method = RequestMethod.GET, produces = "application/json")
    public Usuario login(@RequestParam("login") String login, @RequestParam("senha") String senha) {

        Usuario u = usuarioRepository.findByLogin(login);

        if (u != null && u.getSenha().equals(senha)) {
            return u;
        } else {
            return null;
        }
    }
}