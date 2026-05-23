package br.com.jogovelha.controller;

import br.com.jogovelha.model.Jogador;
import br.com.jogovelha.model.Tabuleiro;
import br.com.jogovelha.view.JogoDaVelhaView;

import java.util.ArrayList;
import java.util.Scanner;

public class JogoDaVelhaController {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Jogador> jogadores = new ArrayList<>(2);

    Tabuleiro tabuleiro = new Tabuleiro();
    JogoDaVelhaView jogoDaVelhaView = new JogoDaVelhaView();


    public void jogoDaVelha(){
        int op = 0;
        System.out.println("====Jogo Da Velha====");
        System.out.println("1 = Iniciar Jogo");
        op = Integer.parseInt(scanner.nextLine());
        if (op == 1){
            criarJogo();
        }

        do{
            jogoDaVelhaView.imprimeTabuleiro(tabuleiro);
            char pos;


            if(jogadores.get(0).isTurno()){
                System.out.println("Digite a posição que queira colocar o X");
                pos = scanner.nextLine().charAt(0);
                cadastrarJogada(pos);
            }else{
                System.out.println("Digite a posição que queira colocar o O");
                pos = scanner.nextLine().charAt(0);
                cadastrarJogada(pos);
            }

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

        jogoDaVelhaView.imprimeTabuleiro(tabuleiro);
    }
}
