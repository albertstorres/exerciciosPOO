package br.com.cubosacademy.exerciciosPOO.classeCarro;

public class Carro {
    private int ano;
    private String cor;
    private String modelo;

    public Carro (int ano, String cor, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void setCor (String novaCor) {
        this.cor = novaCor;
    }
    public String getModelo () {
        return this.modelo;
    }
    public String getCor () {
        return this.cor;
    }
}
