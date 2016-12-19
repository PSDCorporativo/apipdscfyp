/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apifyp.model;

import java.util.Set;
import java.util.TreeSet;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author mateus
 */
public class UsuarioTests {

    @Test
    public void compararUsuariosIguais() {
        Usuario u1 = new Usuario();
        u1.setNome("Mateus Oliveira");
        u1.setLogin("mateusocb");
        u1.setEmail("mateusocb@gmail.com");

        Usuario u2 = new Usuario();
        u2.setNome("Lucas Oliveira");
        u2.setLogin("mateusocb");
        u2.setEmail("mateusocb@gmail.com");

        Assert.assertEquals(u1, u2);
    }

    @Test
    public void compararUsuariosDiferentes() {
        Usuario u1 = new Usuario();
        u1.setNome("Mateus Oliveira");
        u1.setLogin("mateusocb");
        u1.setEmail("mateusocb@gmail.com");

        Usuario u2 = new Usuario();
        u2.setNome("Lucas Oliveira");
        u2.setLogin("lucasocb");
        u2.setEmail("lucasocb@gmail.com");

        Assert.assertNotEquals(u1, u2);
    }

    @Test
    public void compararUsuariosOrdenados() {
        Set<Usuario> userSet = new TreeSet();

        Usuario u1 = new Usuario();
        u1.setNome("Mateus Oliveira");
        u1.setLogin("mateusocb");
        u1.setEmail("mateusocb@gmail.com");

        Usuario u2 = new Usuario();
        u2.setNome("Lucas Oliveira");
        u2.setLogin("lucasocb");
        u2.setEmail("lucasocb@gmail.com");

        userSet.add(u2);
        userSet.add(u1);

        Assert.assertEquals(userSet.iterator().next(), u2);
    }

    @Test
    public void compararUsuariosDesordenados() {
        Set<Usuario> userSet = new TreeSet();

        Usuario u1 = new Usuario();
        u1.setNome("Mateus Oliveira");
        u1.setLogin("mateusocb");
        u1.setEmail("mateusocb@gmail.com");

        Usuario u2 = new Usuario();
        u2.setNome("Lucas Oliveira");
        u2.setLogin("lucasocb");
        u2.setEmail("lucasocb@gmail.com");

        userSet.add(u1);
        userSet.add(u2);

        Assert.assertNotEquals(userSet.iterator().next(), u1);
    }
}
