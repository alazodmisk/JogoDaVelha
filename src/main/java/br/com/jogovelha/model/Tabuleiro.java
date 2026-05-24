package br.com.jogovelha.model;

public class Tabuleiro {

    private Simbolo[][] tabuleiro = {
            {Simbolo.N, Simbolo.N, Simbolo.N},
            {Simbolo.N, Simbolo.N, Simbolo.N},
            {Simbolo.N, Simbolo.N, Simbolo.N}
    };

    public boolean validaJogada(int linha, int coluna){
        return this.tabuleiro[linha][coluna] == Simbolo.N;
        //verifica se a jogada é valida
    }

    public void trocarSimbolo(int linha, int coluna, Jogador jogador){
        this.tabuleiro[linha][coluna] = jogador.getSimbolo();
    }

    public Simbolo verificaVencedor(){
        if(this.tabuleiro[1][1] == this.tabuleiro[1][2] && this.tabuleiro[1][1] == this.tabuleiro[1][3]){
            return this.tabuleiro[1][1]; // primeira linha
        }else if(this.tabuleiro[2][1] == this.tabuleiro[2][2] && this.tabuleiro[2][1] == this.tabuleiro[2][3]){
            return this.tabuleiro[2][1]; // segunda linha
        }else if (this.tabuleiro[3][1] == this.tabuleiro[3][2] && this.tabuleiro[3][1] == this.tabuleiro[3][3]) {
            return this.tabuleiro[3][1]; // terceira linha
        }else if (this.tabuleiro[1][1] == this.tabuleiro[2][1] && this.tabuleiro[1][1] == this.tabuleiro[3][1]) {
            return this.tabuleiro[1][1]; // primeira coluna
        }else if (this.tabuleiro[1][2] == this.tabuleiro[2][2] && this.tabuleiro[1][2] == this.tabuleiro[3][2]) {
            return this.tabuleiro[1][2]; // segunda coluna
        }else if (this.tabuleiro[1][3] == this.tabuleiro[2][3] && this.tabuleiro[1][3] == this.tabuleiro[3][3]) {
            return this.tabuleiro[1][3]; // terceira coluna
        }else if (this.tabuleiro[1][1] == this.tabuleiro[2][2] && this.tabuleiro[1][1] == this.tabuleiro[3][3]) {
            return this.tabuleiro[1][1]; // diagonal da esquerda coluna
        }else if (this.tabuleiro[1][3] == this.tabuleiro[2][2] && this.tabuleiro[1][3] == this.tabuleiro[3][1]) {
            return this.tabuleiro[1][3]; // diagonal da direita coluna
        }
        return Simbolo.N;
    }

    public boolean verificaEmpate(){

        boolean posicoesValida = false; //se ainda existe alguma posicao valida

        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if(this.tabuleiro[i][j] == Simbolo.N){
                    posicoesValida = true;
                }
            }
        }
        
        return this.verificaVencedor() == Simbolo.N && posicoesValida;
    }

    public Simbolo[][] getTabuleiro() {
        return this.tabuleiro;
    }
}
