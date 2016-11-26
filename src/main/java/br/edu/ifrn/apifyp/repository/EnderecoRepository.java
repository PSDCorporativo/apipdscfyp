/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apifyp.repository;

import br.edu.ifrn.apifyp.model.Endereco;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mateus
 */
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
    Endereco findByCep(String cep);
}
