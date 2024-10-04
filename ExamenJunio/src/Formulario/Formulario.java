package Formulario;

import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Estas son las opciones");
        System.out.println("1. Rellenar nombre");
        System.out.println("2. Rellenar apellido");
        System.out.println("3. Rellenar dni");
        System.out.println("4. Rellenar email");
        System.out.println("5. Finalizar");

        String nombre = null;
        String apellido = null;
        String dni = null;
        String correo = null;
        int opcion = 0;
        boolean datosCompletos = false;


        do {


            System.out.println("Introduce la opcion deseada");
            opcion = scanner.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("Introduce el nombre");
                    nombre = scanner.next();
                    break;


                case 2:
                    System.out.println("Introduce el apellido");
                    apellido = scanner.next();
                    break;

                case 3:
                    System.out.println("Introduce el dni");
                    dni = scanner.next();
                    if (dni.length() < 9) {
                        try {
                            throw new LongitudDNINoValidaException("Longitud no valida");
                        } catch (LongitudDNINoValidaException e) {
                            System.out.println(e.getMessage());
                        }
                    }

                    if (Character.isDigit(dni.length() - 1)) {
                        try {
                            throw new UltimoDigitoNoLetraException("Ultimo digito no es letra");
                        } catch (UltimoDigitoNoLetraException e) {
                            System.out.println(e.getMessage());
                        }

                    }


                    break;

                case 4:
                    System.out.println("Introduce el correo");
                    correo = scanner.next();
                    break;

                case 5:
                    if (nombre != null && apellido != null && dni != null && correo != null) {
                        System.out.println("Finalizando");
                        break;
                    } else {
                        System.err.println("Es necesario completar todos los datos");
                    }
                    System.out.println("Mostrando los datos del usuario");
                    System.out.println(nombre);
                    System.out.println(apellido);
                    System.out.println(dni);
                    System.out.println(correo);
            }

        } while (!datosCompletos);
    }
}
