package br.com.jogovelha.model;

public class Tabuleiro {

    private char[][] tabuleiro ={
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'}
    };

    public void trocarSimbolo(char posicao, char simbolo){
        switch (posicao){
            case '1':
                tabuleiro[1][1] = simbolo;
            case '2':
                tabuleiro[1][2] = simbolo;
            case '3':
                tabuleiro[1][3] = simbolo;
            case '4':
                tabuleiro[2][1] = simbolo;
            case '5':
                tabuleiro[2][2] = simbolo;
            case'6':
                tabuleiro[2][3] = simbolo;
            case '7':
                tabuleiro[3][1] = simbolo;
            case '8':
                tabuleiro[3][2] = simbolo;
            case '9':
                tabuleiro[3][3] = simbolo;
        }
    }
}
