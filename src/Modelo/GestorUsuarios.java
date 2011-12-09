package Modelo;

import java.util.*;

/**
 * @author nanohp
 */
public class GestorUsuarios {

    private HashMap<Integer, Usuario> listadoUsuarios;

    public GestorUsuarios() {
        listadoUsuarios = new HashMap<Integer, Usuario>();
    }

    /**
     * 
     * @param usuario
     */
    public void alta(Usuario usuario) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param dni
     */
    public void baja(int dni) {
        throw new UnsupportedOperationException();
    }

    /**
     * 
     * @param dni
     */
    public void modificar(int dni) {
        throw new UnsupportedOperationException();
    }

    public Map<Integer, Usuario> getListaUsuarios() {
        throw new UnsupportedOperationException();
    }

    public void init(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            listadoUsuarios.put(usuario.getDni(), usuario);
        }
    }
    public Map<Integer, Usuario> getMapa() {
        return listadoUsuarios;
    }
}