/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 55649
 */
class Plataforma {
    private List<Usuario> usuarios;
    private List<Conteudo> conteudos;

    public Plataforma() {
        this.usuarios = new ArrayList<>();
        this.conteudos = new ArrayList<>();
    }

    public void inscreverUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void adicionarFilmeSerie(Conteudo conteudo) {
        conteudos.add(conteudo);
        notificarUsuarios(conteudo);
    }

    private void notificarUsuarios(Conteudo conteudo) {
        for (Usuario usuario : usuarios) {
            usuario.update(conteudo);
        }
    }
}

