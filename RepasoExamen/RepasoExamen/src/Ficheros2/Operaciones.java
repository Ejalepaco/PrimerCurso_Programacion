package Ficheros2;

import java.io.*;

// leer fichero adjunto, incluyendo numero de letras y palabras.

public class Operaciones {
    public void leerFichero() {

        File file = new File("src/Ficheros2/ejercicio3.txt");
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            String linea = null;
            String[] palabras = null;
            String letras = null;

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea); // leemos la linea
                palabras = linea.split(" ");
                System.out.println("El numero de palabras es " + palabras.length);

                letras = linea.replace(" ", "");
                letras = letras.replaceAll("\\.", "");
                System.out.println(letras);
                System.out.println("El numero de letras es " + letras.length());

            }

        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }


    }
}
