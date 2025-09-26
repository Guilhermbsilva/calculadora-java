package model;

public class Pessoa {

    private String nome;

    private double peso;

    private double altura;

    public Pessoa() {

    }

    public Pessoa(double peso, double altura, String nome) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
