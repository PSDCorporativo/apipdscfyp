/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apifyp.repository;

import br.edu.ifrn.apifyp.model.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mateus
 */
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
    Usuario findByLogin(String login);
}
