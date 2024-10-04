package EjerciciosExamen.Cinco.model;

public class Alumno {

    private String nombre, DNI;
    private int matricula;
    private double calificacion;

    public void mostrarDatos() {
        System.out.println("El nombre es " + nombre);
        System.out.println("El DNI es " + DNI);
        //System.out.println("La calificacion es  " + calificacion);
        // System.out.println("La matricula es  " + matricula); Se da posteriormente en el setter de matricular. Es una
        // funcion del colegio otorgar el numero de matricula, no del alumno.
    }

    public Alumno(String nombre, String DNI) {
    }

    public Alumno(String nombre, String DNI, int matricula, double calificacion) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.matricula = matricula;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
