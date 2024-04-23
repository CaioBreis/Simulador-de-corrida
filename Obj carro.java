package enti;

import java.util.Random;

public class carro {
    private int velocidade;
    private String nome;


    public carro(String nome) {

        this.velocidade = 0;
        this.nome = nome;
    }

    public void acelerar() {
        Random rand = new Random();
        int acelerador = rand.nextInt(3)+1;
        velocidade += acelerador;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getNome() {
        return nome;
    }
}
