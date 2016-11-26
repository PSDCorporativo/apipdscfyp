/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
// */
//package br.edu.ifrn.apifyp;
//
//import java.util.Set;
//import java.util.TreeSet;
//
//import org.junit.Test;
//
//import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 * @author johan
 */
//public class ProfissionalTests {
//    private static final String NOME1 = "Johann";
//    private static final String NOME2 = "Mateus";
//    private static final String EMAIL1 = "johann@gmail.com";
//    private static final String EMAIL2 = "mateus@gmail.com";
//    private static final String LOGIN1 = "johann";
//    private static final String LOGIN2 = "mateus";
//
//    private Profissional prof(String nome, String email, String login){
//        Profissional profissional =new Profissional(nome, email, login, "",0, "", "", 0,0, 0);
//        return profissional;
//    }
//    
//    
//    @Test
//    public void nomeEmailELoginIguais() {
//        assertThat(prof(NOME1,EMAIL1,LOGIN1))
//                .isEqualTo(prof(NOME1,EMAIL1,LOGIN1));
//    }
//    
//    @Test
//    public void loginEEmailIguaisNomeDiferente() {
//        assertThat(this.prof(NOME1,EMAIL1,LOGIN1))
//                .isEqualTo(this.prof(NOME2,EMAIL1,LOGIN1));
//    }
//    
//    @Test
//    public void nomeEmailELoginDiferentes() {
//        assertThat(this.prof(NOME1,EMAIL1,LOGIN1))
//                .isNotEqualTo(this.prof(NOME2,EMAIL2,LOGIN2));
//    }
//    
//    @Test
//    public void loginEEmailDiferentesNomeIguais() {
//        assertThat(this.prof(NOME1,EMAIL1,LOGIN1))
//                .isNotEqualTo(this.prof(NOME1,EMAIL2,LOGIN2));
//    }
//    
//    @Test
//    public void loginDiferenteEmailENomeIguais() {
//        assertThat(this.prof(NOME1,EMAIL1,LOGIN1))
//                .isNotEqualTo(this.prof(NOME1,EMAIL1,LOGIN2));
//    }
//    
//    @Test
//    public void loginENomeIguaisEmailDiferente() {
//        assertThat(this.prof(NOME1,EMAIL1,LOGIN1))
//                .isNotEqualTo(this.prof(NOME1,EMAIL2,LOGIN1));
//    }
//
//    @Test
//    public void compareToNomeDiferente() {
//        Set<Profissional> profissionais = new TreeSet<>();
//
//        Profissional profissional1 = this.prof(NOME1,EMAIL1,LOGIN1);
//        profissionais.add(profissional1);
//        Profissional profissional2 = this.prof(NOME2,EMAIL1,LOGIN1);
//        profissionais.add(profissional2);
//
//        assertThat(profissionais.iterator().next()).isEqualTo(profissional1);
//    }
//    
//    @Test
//    public void compareToEmailDiferente() {
//        Set<Profissional> profissionais = new TreeSet<>();
//
//        Profissional profissional1 = this.prof(NOME1,EMAIL1,LOGIN1);
//        profissionais.add(profissional1);
//        Profissional profissional2 = this.prof(NOME1,EMAIL2,LOGIN1);
//        profissionais.add(profissional2);
//
//        assertThat(profissionais.iterator().next()).isEqualTo(profissional1);
//    }
//    
//    @Test
//    public void compareToLoginDiferente() {
//        Set<Profissional> profissionais = new TreeSet<>();
//
//        Profissional profissional1 = this.prof(NOME1,EMAIL1,LOGIN1);
//        profissionais.add(profissional1);
//        Profissional profissional2 = this.prof(NOME1,EMAIL1,LOGIN2);
//        profissionais.add(profissional2);
//
//        assertThat(profissionais.iterator().next()).isEqualTo(profissional1);
//    }
//    
//    @Test
//    public void compareTo() {
//        Set<Profissional> profissionais = new TreeSet<>();
//
//        Profissional profissional1 = this.prof(NOME1,EMAIL1,LOGIN1);
//        profissionais.add(profissional1);
//        Profissional profissional2 = this.prof(NOME2,EMAIL2,LOGIN2);
//        profissionais.add(profissional2);
//
//        assertThat(profissionais.iterator().next()).isEqualTo(profissional1);
//    }
//}
