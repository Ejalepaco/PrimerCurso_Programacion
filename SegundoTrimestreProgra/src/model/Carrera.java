package model;

public class Carrera {


    private int kmTotales, numeroVueltas;

    private Coche ganador;

    private Coche coche1, coche2;


    public Carrera(int kmTotales, int numeroVueltas) {

        this.kmTotales = kmTotales;
        this.numeroVueltas = numeroVueltas;

    }

    public Carrera() {
    }


    public void setCoches(Coche coche1, Coche coche2) {
        this.coche1 = coche1;
        this.coche2 = coche2;

    }

    public void iniciar() {
        // mostrar datos de los participantes
        coche1.mostrarDatos();
        coche2.mostrarDatos();

        // cada coche realizara tantas aceleraciones como vueltas indique el circuito
        for (int i = 0; i < numeroVueltas; i++) {
            coche1.acelerar();
            coche2.acelerar();
        }

        // Si alguno de los participantes ha completado el total de km, la carrera finaliza.
        // cuando km sea igual o mayor >= a kilometros totales, la carrera finaliza

        if (coche1.getKilometraje() >= kmTotales) {
            ganador = coche1;
        } else if (coche2.getKilometraje() >= kmTotales) {
            ganador = coche2;
        }

        // Si ningun participante ha completado los kmTotales en el numero de vueltas, habra vueltas extras hasta completar.

        while (ganador == null) {
            coche1.acelerar();
            coche2.acelerar();
            if (coche1.getKilometraje() >= kmTotales) {
                ganador = coche1;
            } else if (coche2.getKilometraje() >= kmTotales) {
                ganador = coche2;
            }
        }

        // Finalizada la carrera, se mostrara el mensaje "el ganador ha sido el coche con matricula xxx"
        System.out.println("El ganador ha sido el coche " + ganador.getMatricula());


    }

}
