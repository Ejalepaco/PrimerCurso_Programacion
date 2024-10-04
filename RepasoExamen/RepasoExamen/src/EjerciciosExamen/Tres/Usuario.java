package EjerciciosExamen.Tres;

public class Usuario {

    private String nombre, correo, password;

    public void mostrarDatos(){
        System.out.println("nombre "+nombre);
        System.out.println("correo "+correo);
        System.out.println("password "+password);
    }

    public Usuario() {
    }

    public Usuario(String nombre, String correo, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
