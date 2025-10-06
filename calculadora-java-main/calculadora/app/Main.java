package app;

import model.*;
import validacao.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final List<Pessoa> ListaPessoas = new ArrayList<>();

    public static void Main(String[] args) {

    }

    private static void Pessoa() {
        System.out.println("\n--- Bem vindo à calculadora ---");

        Pessoa pessoa = new Pessoa();

        String nome = "";

        if (Validacao.validarNome(nome)) {
            pessoa.setNome(nome);
        }
        else{
            System.out.println("digite um nome valido");
        }

        String genero = "";

        if (genero != null) {
            pessoa.setGenero(genero);
        }

        else {
            System.out.println("digite um numero valido");
        }

        double peso = 0;

        if (Validacao.validarPeso(peso)) {
            pessoa.setPeso(peso);
        } else {
            System.out.println("Digite um peso válido");
        }

        double altura = 0;

        if (Validacao.validarAltura(altura)) {
            pessoa.setAltura(altura);
        } else {
            System.out.println("Digite uma altura valida");
        }
    }

    private static void ListaPessoas() {
        System.out.println("\n=== LISTA DE PESSOAS ===");
        if (ListaPessoas.isEmpty()) {
            System.out.println("Não há pessoas cadastrados.");
            return;
        }
        for (Pessoa pessoas : ListaPessoas) {
            System.out.println(pessoas);
        }
    }
}
