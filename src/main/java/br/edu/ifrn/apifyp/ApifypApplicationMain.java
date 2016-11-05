/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.apifyp;

import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 *
 * @author mateus
 */
public class ApifypApplicationMain {

    protected ApifypApplicationMain() {
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(ApifypApplication.class)
                .run(args);
    }

}
