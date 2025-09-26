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

}