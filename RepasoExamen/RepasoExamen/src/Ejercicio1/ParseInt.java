package Ejercicio1;

public class ParseInt { // pasar un string a numeros

    public static void main(String[] args) {

        System.out.println("Transformando el texto 123 a entero");
        String numeroComoTexto = "123";

        int numeroEntero = Integer.parseInt(numeroComoTexto);

        int resultado = numeroEntero + 1;

        System.out.println(resultado);
    }
}
