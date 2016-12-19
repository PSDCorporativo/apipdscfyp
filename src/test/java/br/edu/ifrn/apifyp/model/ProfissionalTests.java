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
public class ProfissionalTests {

    @Test
    public void profissionaisIguais() {
        Profissional p1 = new Profissional();
        Profissional p2 = new Profissional();
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.setEmail("mateusocb@gmail.com");
        u1.setLogin("mateusocb");

        u2.setEmail("mateusocb@gmail.com");
        u2.setLogin("mateusocb");

        p1.setUsuario(u1);
        p2.setUsuario(u2);

        Assert.assertEquals(p1, p2);
    }

    @Test
    public void profissionaisDiferentes1() {
        Profissional p1 = new Profissional();
        Profissional p2 = new Profissional();
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.setEmail("mateusocb@gmail.com");
        u1.setLogin("mateusocb123");

        u2.setEmail("mateusocb@gmail.com");
        u2.setLogin("mateusocb");

        p1.setUsuario(u1);
        p2.setUsuario(u2);

        Assert.assertNotEquals(p1, p2);
    }

    @Test
    public void profissionaisDiferentes2() {
        Profissional p1 = new Profissional();
        Profissional p2 = new Profissional();
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.setEmail("mateusocb@gmail21.com");
        u1.setLogin("mateusocb");

        u2.setEmail("mateusocb@gmail.com");
        u2.setLogin("mateusocb");

        p1.setUsuario(u1);
        p2.setUsuario(u2);

        Assert.assertNotEquals(p1, p2);
    }

    @Test
    public void profissionaisOrdenados() {

        Set<Profissional> profissionais = new TreeSet();

        Profissional p1 = new Profissional();
        Profissional p2 = new Profissional();
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.setEmail("mateusocb@gmail21.com");
        u1.setLogin("mateusocb");

        u2.setEmail("mateusocb@gmail.com");
        u2.setLogin("mateusocb");

        p1.setUsuario(u1);
        p2.setUsuario(u2);

        p1.setProfissao("Pedreiro");
        p2.setProfissao("Analista");

        profissionais.add(p1);
        profissionais.add(p2);

        Assert.assertEquals(profissionais.iterator().next(), p2);
    }

    @Test
    public void profissionaisDesordenados() {

        Set<Profissional> profissionais = new TreeSet();

        Profissional p1 = new Profissional();
        Profissional p2 = new Profissional();
        Usuario u1 = new Usuario();
        Usuario u2 = new Usuario();

        u1.setEmail("mateusocb@gmail21.com");
        u1.setLogin("mateusocb");

        u2.setEmail("mateusocb@gmail.com");
        u2.setLogin("mateusocb");

        p1.setUsuario(u1);
        p2.setUsuario(u2);

        p1.setProfissao("Pedreiro");
        p2.setProfissao("Analista");

        profissionais.add(p1);
        profissionais.add(p2);

        Assert.assertNotEquals(profissionais.iterator().next(), p1);
    }
}
