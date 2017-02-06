/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
@EqualsAndHashCode(of = "usuario")
@SequenceGenerator(sequenceName = "seq_lancamento", name = "ID_SEQUENCE", allocationSize = 1)
public class Avaliacao implements Serializable, Comparable<Avaliacao> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
    private Long id;

    @OneToOne
    private Usuario usuario;

    @OneToOne
    private Profissional profissional;

    private int nota;

    public Avaliacao() {
    }

    public Avaliacao(Usuario usuario, Profissional profissional, int nota) {
        this.usuario = usuario;
        this.profissional = profissional;
        this.nota = nota;
    }

    @Override
    public int compareTo(Avaliacao a) {
        if (this.usuario.compareTo(a.getUsuario()) == 0
                && this.profissional.compareTo(a.getProfissional()) == 0) {
            return 0;
        }
        
        return 1;
    }
}
