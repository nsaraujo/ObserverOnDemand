/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 55649
 */
public class Usuario implements iObserver {
    private String nome;
    private Map<String, Boolean> preferenciasGeneros;

    public Usuario(String nome) {
        this.nome = nome;
        this.preferenciasGeneros = new HashMap<>();
    }

    public void ativarNotificacao(String genero) {
        preferenciasGeneros.put(genero, true);
    }

    public void desativarNotificacao(String genero) {
        preferenciasGeneros.put(genero, false);
    }

    @Override
    public void update(Conteudo conteudo) {
        Boolean inscrito = preferenciasGeneros.get(conteudo.getGenero());
        if (inscrito != null && inscrito) {
            System.out.println(nome + " foi notificado sobre o novo " + conteudo.getGenero() + ": " + conteudo.getTitulo() + "\n");
        }
    }

    public String getNome() {
        return nome;
    }
}

