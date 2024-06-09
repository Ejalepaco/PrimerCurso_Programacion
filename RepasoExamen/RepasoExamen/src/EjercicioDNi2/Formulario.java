package EjercicioDNi2;

import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {

        System.out.println("Comenzamos el ejercicio del Formulario");

        Scanner scanner = new Scanner(System.in);

        String nombre = null;
        String apellido = null;
        String dni = null;
        int opcion = 0;
        boolean datosCompletos = false;

        do {

            try {


                System.out.println("1. Introduce el nombre");
                System.out.println("2. Introduce el apellido");
                System.out.println("3. Introduce el dni");
                System.out.println("4. Finalizar");
                System.out.println("Elige una opcion");
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
                        if (dni.length() != 9) {
                            throw new LongitudDNINoValidaException("Longitud no valida");
                        }

                        if (!Character.isLetter(dni.charAt(dni.length()-1))){
                            throw new UltimoDigitoNoLetraException("Ultimo digito debe ser letra");
                        }

                        break;

                    case 4:
                        if (nombre != null && apellido != null && dni != null) {
                            datosCompletos = true;
                            System.out.println("Terminando");
                        } else {
                            System.err.println("No puedes salir sin completar todo");
                        }

                }
            } catch (LongitudDNINoValidaException e) {
                System.out.println(e.getMessage());
            } catch (UltimoDigitoNoLetraException e) {
                System.out.println(e.getMessage());
            }

        } while (!datosCompletos);

        System.out.println("El nombre es " + nombre);
        System.out.println("El apellido es " + apellido);
        System.out.println("El dni es " + dni);
    }
}
