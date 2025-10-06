package model;

public class Pessoa {

    private String nome;

    private double peso;

    private double altura;

    private String genero;

    public Pessoa() {

    }

    public Pessoa(double peso, double altura, String nome, String genero) {
        this.peso = peso;
        this.altura = altura;
        this.nome = nome;
        this.genero = genero;
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

    public String getGenero() {
        return genero;
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

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
