package br.com.jogovelha.controller;
import java.util.Scanner;

import br.com.jogovelha.model.Jogador;
import br.com.jogovelha.model.Simbolo;
import br.com.jogovelha.model.StatusPartida;
import br.com.jogovelha.model.Tabuleiro;
import br.com.jogovelha.view.JogoDaVelhaView;

public class JogoDaVelhaController {

    Scanner scanner = new Scanner(System.in);

    Tabuleiro tabuleiro = new Tabuleiro();
    JogoDaVelhaView jogoDaVelhaView = new JogoDaVelhaView();
    Jogador jogador1;
    Jogador jogador2;
    Jogador jogadorVencedor;
    StatusPartida status;

    public Jogador cadastrarJogador(String nome, Simbolo simbolo){
        Jogador jogador = new Jogador(nome, simbolo);
        return jogador;
    }

    public void realizarjogada(int linha, int coluna){
        while (!tabuleiro.validaJogada(linha, coluna)){
            //JogoDaVelhaView.solicitarJogada();
        }

        if(jogador1.isTurno()){
            tabuleiro.trocarSimbolo(linha, coluna, this.jogador1);
        }else{
            tabuleiro.trocarSimbolo(linha, coluna, this.jogador2);
        }

        this.jogador1.trocaTurno();
        this.jogador2.trocaTurno();
    }

    public void jogoDaVelha(){
        //this.jogador1 = jogoDaVelhaView.cadastrarJogador();
        //this.jogador2 = jogoDaVelhaView.cadastrarJogador();

        this.setStatus(StatusPartida.EM_ANDAMENTO);

        while (this.getStatus() == StatusPartida.EM_ANDAMENTO){
            //jogoDaVelhaView.solicitarJogada();

            Simbolo simboloVencedor = tabuleiro.verificaVencedor();

            if(simboloVencedor == jogador1.getSimbolo()){
                this.setJogadorVencedor(this.jogador1);
                this.setStatus(StatusPartida.VITORIA);
            }
                
            if (simboloVencedor == jogador2.getSimbolo()){
                this.setJogadorVencedor(this.jogador1);
                this.setStatus(StatusPartida.VITORIA);
            }

            if (tabuleiro.verificaEmpate()){
                this.setStatus(StatusPartida.EMPATE);
                Jogador velha = new Jogador("VELHA", Simbolo.N);
                this.setJogadorVencedor(velha);;
            }
        }

        //jogoDaVelhaView.exibeResultado(jogadorVencedor);
    }

    public Jogador getJogador1() {
        return jogador1;
    }

    public void setJogador1(Jogador jogador1) {
        this.jogador1 = jogador1;
    }

    public Jogador getJogador2() {
        return jogador2;
    }

    public void setJogador2(Jogador jogador2) {
        this.jogador2 = jogador2;
    }

    public StatusPartida getStatus() {
        return status;
    }

    public void setStatus(StatusPartida status) {
        this.status = status;
    }

    public Jogador getJogadorVencedor() {
        return jogadorVencedor;
    }

    public void setJogadorVencedor(Jogador jogadorVencedor) {
        this.jogadorVencedor = jogadorVencedor;
    }
}
