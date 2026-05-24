package br.com.jogovelha.model;

public class Jogador {
    private String nome;
    private Simbolo simbolo;
    private boolean turno;


    public Jogador(String nome, Simbolo simbolo, boolean turno) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.turno = turno;
    }


    public Simbolo getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(Simbolo simbolo) {
        this.simbolo = simbolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }


    //Ao final de toda jogada válida isso aqui será chamado
    //Depois verifica com o get isTurno para saber turno de qual jogador
    public void trocaTurno(){
        if(isTurno()){
            this.turno = false;
        }else{
            this.turno = true;
        }
    }
}
