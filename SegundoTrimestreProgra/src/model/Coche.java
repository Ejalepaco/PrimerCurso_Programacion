package model;

public class Coche {

    private String marca, modelo, matricula;
    private int cv, cc, velocidad, kilometraje;

    // recomendacion siempre poner constructor vacio caso Hibernate (api, mapeado, etc)
    public Coche() {
    }

    public Coche(String marca, String modelo, String matricula, int cv, int cc, int velocidad) {

        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
        this.cc = cc;
        this.velocidad = velocidad;
        this.kilometraje = 0;

    }

    //funcionalidades del coche: acelerar y mostrar sus datos.


    public void mostrarDatos() {
        System.out.println("Nombre: " + this.marca + " - Modelo: " + this.modelo + " - Matricula: "
                + this.matricula+ " - CV: " + this.cv + " - CC: " + this.cc);
    }

    public void acelerar() {
        int aceleracion = 30;

        if (cv < 100) {
            velocidad += Math.random();

        } else {
            velocidad += (Math.random() * aceleracion) + velocidad;
        }
        kilometraje += (velocidad / 2);
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public String getMatricula() {
        return matricula;
    }
// metodos setter (cambia valor de una variable) y getter (obtengo valor de una variable) para acceder a info privada
    // se hace un metodo por cada variable. Tengo que hacerlo por el metodo, no de forma directa.

}