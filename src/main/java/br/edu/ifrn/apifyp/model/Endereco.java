package br.edu.ifrn.apifyp.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
public class Endereco implements Serializable, Comparable<Endereco> {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_SEQUENCE")
    private Long id;
    private String rua;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String estado;
    private BigDecimal longintude;
    private BigDecimal latitude;

    public Endereco() {
        super();
    }

    public Endereco(String rua, String cep, String numero, String complemento,
            String cidade, String estado, BigDecimal longitude, BigDecimal latitude) {
        super();
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.estado = estado;
        this.longintude = longitude;
        this.latitude = latitude;
    }

    @Override
    public int compareTo(Endereco o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
