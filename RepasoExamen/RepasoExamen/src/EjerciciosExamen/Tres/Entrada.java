package EjerciciosExamen.Tres;

public class Entrada {

    public static void main(String[] args) {

        //instancia del sistema
        Sistema sistema = new Sistema();
        sistema.altaUsuario(new Usuario("paco","gmail","casa"));
        sistema.altaUsuario(new Usuario("lucas","hotmail","rm"));
        sistema.altaUsuario(new Usuario("paula","yahoo","volei"));

        for (Usuario item: sistema.getListaUsuarios()){
            item.mostrarDatos();
        }

        if (sistema.loginUsuario("gmail","casa") !=false){
            System.out.println("Login correcto");
        } else {
            System.out.println("Login incorrecto");
        }



    }
}
