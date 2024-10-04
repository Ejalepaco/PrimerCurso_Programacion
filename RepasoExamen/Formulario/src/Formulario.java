import java.sql.SQLOutput;
import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombre = null;
        String apellido = null;
        String dni = null;
        int opcion = 0;
        boolean datosCompletos = false;

        do {
            try {


                System.out.println("1. Rellenar nombre");
                System.out.println("2. Rellenar apellido");
                System.out.println("3. Rellenar dni");
                System.out.println("4. Finalizar");

                System.out.println("Introduce la opción ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("1. Introduce el nombre");
                        nombre = scanner.next();
                        break;
                    case 2:
                        System.out.println("2. Introduce el apellido");
                        apellido = scanner.next();
                        break;
                    case 3:
                        System.out.println("3. Introduce el dni");
                        dni = scanner.next();

                        if (dni.length() != 9) {
                            throw new LongitudDNINoValidaException("Longitud no valida");
                        }

                        //if (dni.charAt())

                        break;
                    case 4:
                        if (nombre != null && apellido != null && dni != null) {
                            System.out.println("Saliendo");
                            datosCompletos = true;

                        } else {
                            System.err.println("No puedes salir sin rellenar todo");
                        }
                        break;
                }
            } catch (LongitudDNINoValidaException e) {
                System.out.println(e.getMessage());
            }
            ;
        } while (!datosCompletos);
        System.out.println("Mostrando los datos del usuario");
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(dni);
    }

}
