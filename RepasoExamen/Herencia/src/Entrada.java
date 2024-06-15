import controller.Coche;
import model.Deportivo;

import java.util.ArrayList;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Coche> listaCoches = new ArrayList<>();

        Deportivo deportivo1 = new Deportivo("Ford","Z8","1234GTX",100,100,25000,90);
        Deportivo deportivo2 = new Deportivo("Mazda","323","9876GTX",120,120,35000,190);

        listaCoches.add(deportivo1);
        listaCoches.add(deportivo2);


        for (Coche coche : listaCoches){
            System.out.println(coche);
        }

        for (Coche coche : listaCoches){
            coche.reprogramarMotor();
        }

        for (Coche coche : listaCoches){
            coche.toString();
        }



    }
}
