/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apifyp.model;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author mateus
 */
public class EnderecoTests {

    @Test
    public void enderecoIguais() {
        Endereco e1 = new Endereco();
        Endereco e2 = new Endereco();

        e1.setNumero("123");
        e1.setRua("Rua Jacaranda");
        e1.setComplemento("Ap 1002");

        e2.setNumero("123");
        e2.setRua("Rua Jacaranda");
        e2.setComplemento("Ap 1002");

        Assert.assertEquals(e1, e2);
    }

    @Test
    public void enderecoDiferentes1() {
        Endereco e1 = new Endereco();
        Endereco e2 = new Endereco();

        e1.setNumero("123");
        e1.setRua("Rua Jacaranda");
        e1.setComplemento("Ap 1002");

        e2.setNumero("1234");
        e2.setRua("Rua Jacaranda");
        e2.setComplemento("Ap 1002");

        Assert.assertNotEquals(e1, e2);
    }

    @Test
    public void enderecoDiferentes2() {
        Endereco e1 = new Endereco();
        Endereco e2 = new Endereco();

        e1.setNumero("123");
        e1.setRua("Rua Jacaranda2");
        e1.setComplemento("Ap 1002");

        e2.setNumero("123");
        e2.setRua("Rua Jacaranda");
        e2.setComplemento("Ap 1002");

        //apenas um comentário
        Assert.assertNotEquals(e1, e2);
    }
    
    @Test
    public void enderecoDiferentes3() {
        Endereco e1 = new Endereco();
        Endereco e2 = new Endereco();

        e1.setNumero("123");
        e1.setRua("Rua Jacaranda");
        e1.setComplemento("Ap 1002");

        e2.setNumero("123");
        e2.setRua("Rua Jacaranda");
        e2.setComplemento("Ap 10024");

        Assert.assertNotEquals(e1, e2);
    }
}
