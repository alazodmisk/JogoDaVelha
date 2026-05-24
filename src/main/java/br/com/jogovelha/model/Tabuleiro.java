package br.com.jogovelha.model;

public class Tabuleiro {

    private Simbolo[][] tabuleiro = {
            {Simbolo.N, Simbolo.N, Simbolo.N},
            {Simbolo.N, Simbolo.N, Simbolo.N},
            {Simbolo.N, Simbolo.N, Simbolo.N}
    };

    public void trocarSimbolo(char posicao, Jogador jogador){
        switch (posicao){
            case '1':
                tabuleiro[1][1] = jogador.getSimbolo();
            case '2':
                tabuleiro[1][2] = jogador.getSimbolo();
            case '3':
                tabuleiro[1][3] = jogador.getSimbolo();
            case '4':
                tabuleiro[2][1] = jogador.getSimbolo();
            case '5':
                tabuleiro[2][2] = jogador.getSimbolo();
            case'6':
                tabuleiro[2][3] = jogador.getSimbolo();
            case '7':
                tabuleiro[3][1] = jogador.getSimbolo();
            case '8':
                tabuleiro[3][2] = jogador.getSimbolo();
            case '9':
                tabuleiro[3][3] = jogador.getSimbolo();
        }
    }
}
