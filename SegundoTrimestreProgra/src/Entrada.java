import model.Coche;
import model.Carrera;

// siete constructores por clase coche
// un constructor por clase carrera
public class Entrada {

    public static void main(String[] args) {

        //Coche coche = new Coche(); //

        // creamos los dos coches con los datos

        Coche coche1 = new Coche("Mazda", "cx30", "6198hwj", 140,
                260, 0);

        Coche coche2 = new Coche("Ford", "gt40", "7109mdm", 135,
                205, 0);

        // creamos una carrera con los datos

        Carrera carrera1 = new Carrera(380, 40);

        // asociamos los coches a la carrera
        carrera1.setCoches(coche1, coche2);


        // iniciamos la carrera

        carrera1.iniciar();

        // comprobar que los datos sean correctos


    }


}
