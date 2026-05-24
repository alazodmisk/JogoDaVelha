package br.com.jogovelha.model;

public class Tabuleiro {

    private Simbolo[][] tabuleiro = {
            {Simbolo.N, Simbolo.N, Simbolo.N},
            {Simbolo.N, Simbolo.N, Simbolo.N},
            {Simbolo.N, Simbolo.N, Simbolo.N}
    };

    //se a posição foi inserida retora true, caso contrario false
    public boolean trocarSimbolo(int posicao, Jogador jogador){

        switch (posicao){
            case 1:
                if (tabuleiro[1][1] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[1][1] = jogador.getSimbolo();
                    return true;
                }
            case 2:
                if (tabuleiro[1][2] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[1][2] = jogador.getSimbolo();
                    return true;
                }

            case 3:
                if (tabuleiro[1][3] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[1][3] = jogador.getSimbolo(); 
                    return true;
                }
            case 4:
                if (tabuleiro[2][1] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[2][1] = jogador.getSimbolo();
                    return true;
                }
            case 5:
                if (tabuleiro[2][2] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[2][2] = jogador.getSimbolo();
                    return true;
                }
            case 6:
                if (tabuleiro[2][3] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[2][3] = jogador.getSimbolo();
                    return true;
                }
            case 7:
                if (tabuleiro[3][1] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[3][1] = jogador.getSimbolo();
                    return true;
                }
            case 8:
                if (tabuleiro[3][2] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[3][2] = jogador.getSimbolo();
                    return true;
                }
            case 9:
                if (tabuleiro[3][3] != Simbolo.N){
                    return false;
                }else{
                    tabuleiro[3][3] = jogador.getSimbolo();
                    return true;
                }
            default:
                return false;
        }
    }
}
