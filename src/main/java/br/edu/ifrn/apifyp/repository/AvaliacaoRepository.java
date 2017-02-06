/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apifyp.repository;

import br.edu.ifrn.apifyp.model.Avaliacao;
import br.edu.ifrn.apifyp.model.Profissional;
import br.edu.ifrn.apifyp.model.Usuario;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mateus
 */
public interface AvaliacaoRepository extends CrudRepository<Avaliacao, Long> {
    List<Avaliacao> findByUsuario(Usuario usuario);
    List<Avaliacao> findByProfissional(Profissional profissional);
    Avaliacao findByProfissionalAndUsuario(Profissional profissional, Usuario usuario);
}
