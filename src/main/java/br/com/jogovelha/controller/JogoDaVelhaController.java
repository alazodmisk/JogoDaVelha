package br.com.jogovelha.controller;

import br.com.jogovelha.model.Jogador;
import br.com.jogovelha.model.Tabuleiro;

import java.util.ArrayList;
import java.util.Scanner;

public class JogoDaVelhaController {
    //Cadastra jogador
    //Cadastra jogada
    Scanner scanner = new Scanner(System.in);
    ArrayList<Jogador> jogadores = new ArrayList<>(2);
    Tabuleiro tabuleiro = new Tabuleiro();


    public void jogoDaVelha(){
        int op = 0;

        do{
            System.out.println("====Jogo Da Velha====");

            System.out.println("1 = Iniciar Jogo");
        }while (true);
    }



    public void criarJogo(){
        cadastrarJogador();
        cadastrarJogador();
    }


    public void cadastrarJogador(){
        String nome;
        char simbolo;

        System.out.println("==============");
        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        if(jogadores.isEmpty()){
            System.out.println("Seu símbolo de jogo será o X");
            simbolo = 'X';
            Jogador j1 = new Jogador(nome, simbolo, true);
            jogadores.add(j1);
        }else{
            System.out.println("Seu símbolo de jogo será o O");
            simbolo = 'O';
            Jogador j2 = new Jogador(nome, simbolo, false);
            jogadores.add(j2);
        }
    }


    public void cadastrarJogada(char posicao){
        if(jogadores.get(0).isTurno()){
            tabuleiro.trocarSimbolo(posicao, jogadores.get(0).getSimbolo());
        }else{
            tabuleiro.trocarSimbolo(posicao, jogadores.get(1).getSimbolo());
        }

        for(Jogador i : jogadores){
            i.trocaTurno();
        }
    }
}
