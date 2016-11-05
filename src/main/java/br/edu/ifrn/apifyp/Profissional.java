package br.edu.ifrn.apifyp;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

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
    private String nome;
    private String email;
    private String login;
    private String senha;
    private int idNacional;
    private String descricao;
    private String profissao;
    private float logintude;
    private float latitude;
    private int pontuacao;

    public Profissional() {
    }

    public Profissional(String nome, String email, String login, String senha,
            int idNacional, String descricao, String profissao, float latitude,
            float logintude, int pontuacao) {
        this.senha = senha;
        this.profissao = profissao;
        this.email = email;
        this.idNacional = idNacional;
        this.profissao = profissao;
        this.login = login;
        this.nome = nome;
        this.latitude = latitude;
        this.logintude = logintude;
        this.pontuacao = pontuacao;
    }

    @Override
    public int compareTo(Profissional p) {
        return this.nome.compareTo(p.nome);
    }
}
