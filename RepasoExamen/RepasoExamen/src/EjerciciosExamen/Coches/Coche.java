package EjerciciosExamen.Coches;

public class Coche {

    private String marca, modelo, matricula;

    private int cv, cc, precio;

    public void mostrarDatos(){
        System.out.println("La marca es "+marca);
        System.out.println("El modelo es "+modelo);
        System.out.println("La matrícula es "+matricula);
        System.out.println("Los caballos son "+cv);
        System.out.println("Los centrimetros cúbicos son "+cc);
        System.out.println("El precio es "+precio);
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", cv=" + cv +
                ", cc=" + cc +
                ", precio=" + precio +
                '}';
    }

    public void reprogramMotor(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, int cv, int cc, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.precio = precio;
    }
}
