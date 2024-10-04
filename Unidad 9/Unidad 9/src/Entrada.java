import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Entrada {

    public static void main(String[] args) {

        /*ArrayList<String> miListaAlumnos = new ArrayList<String>();

        miListaAlumnos.add("Jose");
        miListaAlumnos.add("Carlos");
        miListaAlumnos.add("Adri");

        System.out.println(miListaAlumnos);

        if (miListaAlumnos.remove("Adri"))
            System.out.println("Elemento eliminado correctamente");
        else
            System.out.println("No existe el alumno en la lista");

        System.out.println(miListaAlumnos);

        if (miListaAlumnos.contains("Carlos"))
            System.out.println("El alumno esta en la lista");

        else System.out.println("No existe el alumno en la lista");

        System.out.println(miListaAlumnos);

        System.out.println("Numero de alumnos " + miListaAlumnos.size());
    }*/

        Map<String, Integer> palabrasQuijote = new HashMap<String, Integer>();

        palabrasQuijote.put("Quijote", 2174);
        palabrasQuijote.put("Sancho", 274);
        palabrasQuijote.put("Dulcinea",1899);

        System.out.println("Veces que aparece 'Sancho' "+ palabrasQuijote.get("Sancho"));

    }}