/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.observer;

/**
 *
 * @author 55649
 */
public class Observer {

    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();

        Usuario usuario1 = new Usuario("Amanda");
        Usuario usuario2 = new Usuario("Alice");
        Usuario usuario3 = new Usuario("Nicolas");
        Usuario usuario4 = new Usuario("Maria Eduarda");
        Usuario usuario5 = new Usuario("Luciana");

        usuario1.ativarNotificacao("Acao");
        usuario1.ativarNotificacao("Comedia");

        usuario2.ativarNotificacao("Comedia");
        usuario2.ativarNotificacao("Terror");

        usuario3.ativarNotificacao("Terror");
        usuario3.ativarNotificacao("Acao");
        usuario3.ativarNotificacao("Anime");
        
        usuario4.ativarNotificacao("Anime");
        usuario4.ativarNotificacao("Ficcao Cientifica");

        usuario5.ativarNotificacao("Ficcao Cientifica");
        usuario5.ativarNotificacao("Acao");

        usuario2.desativarNotificacao("Terror");
        usuario1.desativarNotificacao("Acao");
        usuario3.desativarNotificacao("Anime");
        

        plataforma.inscreverUsuario(usuario1);
        plataforma.inscreverUsuario(usuario2);
        plataforma.inscreverUsuario(usuario3);
        plataforma.inscreverUsuario(usuario4);
        plataforma.inscreverUsuario(usuario5);

        plataforma.adicionarFilmeSerie(new Conteudo("Mad Max", "Acao"));
        plataforma.adicionarFilmeSerie(new Conteudo("La casa de papel", "Acao"));
        plataforma.adicionarFilmeSerie(new Conteudo("Trocando os pes", "Comedia"));
        plataforma.adicionarFilmeSerie(new Conteudo("Dois carecas e um pente 2", "Comedia"));
        plataforma.adicionarFilmeSerie(new Conteudo("Panico na floresta", "Terror"));
        plataforma.adicionarFilmeSerie(new Conteudo("Naruto", "Anime"));
        plataforma.adicionarFilmeSerie(new Conteudo("A origem", "Ficcao Cientifica"));
        plataforma.adicionarFilmeSerie(new Conteudo("Velozes e Furiosos", "Acao"));
        plataforma.adicionarFilmeSerie(new Conteudo("Deadpool", "Comedia"));
        plataforma.adicionarFilmeSerie(new Conteudo("Um maluco no pedaco", "Comedia"));
    }
}
