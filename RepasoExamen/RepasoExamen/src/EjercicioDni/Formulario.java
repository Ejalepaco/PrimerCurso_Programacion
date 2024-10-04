package EjercicioDni;

import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {

        System.out.println("Comenzamos el ejercicio del formulario DNI");

        Scanner scanner = new Scanner(System.in);

        String nombre = null;
        String apellido = null;
        String dni = null;
        int opcion = 0;
        boolean datosCompletos = false;

        do {
            try {


                System.out.println("""
                        1. Introduce nombre
                        2. Introduce apellido
                        3. Introduce dni
                        4. Finalizar
                        """);
                System.out.println("Elige una opción");
                opcion = scanner.nextInt();


                switch (opcion) {
                    case 1:
                        System.out.println("introduzca el nombre");
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
                            throw new LongitudDniNoValidaException("Longitud no valida");
                        }

                        if (!Character.isLetter(dni.charAt(dni.length()-1))){
                            throw new UltimoDigitoNoLetraException("El último digito debe ser letra");
                        }
                        break;
                    case 4:
                        if (nombre != null && apellido != null && dni != null) {
                            System.out.println("Saliendo");
                            datosCompletos = true;
                            break;
                        } else {
                            System.out.println("No puedes salir sin rellenar todo");
                        }
                }
            } catch (LongitudDniNoValidaException e) {
                System.err.println(e.getMessage());

            } catch (UltimoDigitoNoLetraException e) {
                System.err.println(e.getMessage());
            }
        } while (!datosCompletos);
        System.out.println("Mostrando los datos del usuario1");
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(dni);

    }
    }


