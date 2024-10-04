package EjerciciosExamen.Tres;

import java.util.ArrayList;

public class Sistema {

    //creo arraylist
    private ArrayList<Usuario> listaUsuarios;

    // inicializo arraylist en constructor vacio

    public Sistema() {
        listaUsuarios = new ArrayList<>();
    }

    public void altaUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public boolean loginUsuario (String correo, String password) { // enunciado dice retorno un boolean

        for ( Usuario usuario : listaUsuarios ){
            if (usuario.getCorreo().equalsIgnoreCase(correo) && usuario.getPassword().equalsIgnoreCase(password));
            return true;
        }

        return false;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
}
