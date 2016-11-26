package br.edu.ifrn.apifyp.model;

import java.io.Serializable;
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
@SequenceGenerator(sequenceName = "seq_lancamento", name = "ID_SEQUENCE", allocationSize = 1)
public class Profissional implements Serializable, Comparable<Profissional> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
    private Long id;

    @OneToOne
    private Usuario usuario;

    private String descricao;
    private String profissao;

    private int pontuacao;

    public Profissional() {
    }

    public Profissional(String nome, String email, String login, String senha,
            boolean isProfissional, String rua, String cep, String numero,
            String complemento, String cidade, String estado,
            String descricao, String profissao) {

        this.usuario = new Usuario(nome, email, login, senha, isProfissional,
                rua, cep, numero, complemento, cidade, estado);
        this.profissao = profissao;
        this.descricao = descricao;
        this.pontuacao = 0;
    }

    @Override
    public int compareTo(Profissional p) {
        return 1;
    }
}
