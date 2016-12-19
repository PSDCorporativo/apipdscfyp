package br.edu.ifrn.apifyp.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;
import lombok.EqualsAndHashCode;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mateus
 */
@Getter
@Setter
@Entity
@EqualsAndHashCode(of = {"login", "email"})
@SequenceGenerator(sequenceName = "seq_lancamento", name = "ID_SEQUENCE", allocationSize = 1)
public class Usuario implements Serializable, Comparable<Usuario> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
    private Long id;
    private String nome;
    private String email;
    private String login;
    private String senha;

    private boolean isProfissional;

    @OneToOne
    private Endereco endereco;

    public Usuario() {
    }

    public Usuario(String nome, String email, String login, String senha,
            boolean isProfissional, String rua, String cep, String numero,
            String complemento, String cidade, String estado) {
        this.senha = senha;
        this.email = email;
        this.login = login;
        this.nome = nome;
        this.endereco = new Endereco(rua, cep, numero, complemento, cidade, estado, "0.0", "0.0");
    }

    @Override
    public int compareTo(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
