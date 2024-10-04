package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Operaciones {
    public void leerFichero() {
        File file = new File("src/ejercicio3.txt");

        BufferedReader bufferedReader = null;

        try {
            bufferedReader=new BufferedReader(new FileReader(file));

            String linea = null;

            while ((!)){


        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no encontrado");
        }

    }


}
