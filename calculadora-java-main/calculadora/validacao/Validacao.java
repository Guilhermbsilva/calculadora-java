package validacao;

public class Validacao {
    private Validacao() {

    }

    public static boolean validarPeso(double peso) {
        if (peso > 0) {
            return true;
            // valido
        } else {
            System.out.println("digite um peso válido");
            // não valido
            return false;
        }

    }

    public static boolean validarAltura(double altura) {
        if (altura > 0) {
            return true;
            // valido
        } else {
            System.out.println("digite uma altura válida");
            // não valido
            return false;
        }

    }

    public static String validarSexo(String genero) {
        if (genero.equals("1")) {
            genero = "masculino";
            return genero;
        } 
        
        else if (genero.equals("2")) {
            genero = "feminino";
            return genero;
        } 

        else{
            System.out.println("Digite um número válido");
            return null;
        }
    }

    public static String validarNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            return nome;
            // valido
        } else {
            System.out.println("sem nome (nulo ou vazio)");
            // não valido
        }

        return nome;
    }
    
}
