package EjerciciosExamen.Coches;

public class Todoterreno extends Coche{

    private int traccion;

    public Todoterreno(int traccion) {
        this.traccion = traccion;
    }

    public Todoterreno(){

    }
    public Todoterreno(String marca, String modelo, String matricula, int cv, int cc, int precio, int traccion) {
        super(marca, modelo, matricula, cv, cc, precio);
        this.traccion = traccion;
    }

    public void reprogramaMotor(){
        //this.cv +=0 this.cv * 0.25;
    }

}
