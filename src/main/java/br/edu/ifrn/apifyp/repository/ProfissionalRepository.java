/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apifyp.repository;

import br.edu.ifrn.apifyp.model.Profissional;
import br.edu.ifrn.apifyp.model.Usuario;
import java.util.Set;

import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mateus
 */
public interface ProfissionalRepository extends CrudRepository<Profissional, Long> {
    Profissional findByUsuario(Usuario usuario);
    Set<Profissional> findByProfissao(String profisssao);
}
