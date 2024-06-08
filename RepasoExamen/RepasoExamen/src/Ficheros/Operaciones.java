package Ficheros;

import java.io.*;

public class Operaciones {

    public void leerFichero() {
        File file = new File("src/Ficheros/ejercicio3.txt");

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));

            //Creamos linea.

            String linea;
            String[] palabras = null;
            String letras = null; // no se necesita array, no cuenta los espacios en blanco como en palabras.


            //vamos a leer la linea, hasta que sea diferente de nulo. Solo hay 1 linea, ya no continua el bucle.

            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea); // leemos la linea
                palabras = linea.split(" ");
                System.out.println("El numero de palabras es " + palabras.length);


                letras = linea.replace(" ", "");
                letras = letras.replaceAll("\\.", "");

                System.out.println("El numero de letras es " + letras.length());
            }


        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Error de lectura");
        }


    }
}
