package model;

import controller.Coche;

public class Deportivo extends Coche {

    private int par;

    public Deportivo() {
    }

    public Deportivo(String marca, String modelo, String matricula, int cv, int cc, int precio, int par) {
        super(marca, modelo, matricula, cv, cc, precio);
        this.par = par;
    }

    @Override
    public void reprogramarMotor() {
        int nuevosCv =(int) (getCv()*1.25);
        System.out.println("El motor del "+getMarca()+" ha sido reprogramado con " +nuevosCv+ " cv");
    }

    @Override
    public String toString() {
        return super.toString() + ", par=" +par;

    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }
}
