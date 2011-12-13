/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author nanohp
 */
//2 lista de valores posibles.
public enum TipoEvento {

    FIJAR_LYL("Fijar Look And Feel"),
    OBTENER_CAT_DEWEY("Obtener lista categorias Dewey"),
    SALIR("Salir"),
    LOGIN("Login"),
    LOGIN_OK("Login OK"),
    LOGIN_FALLO("Login Fallo"),
    ERROR("Mensaje de Error"),
    LOGOUT("Logout"),
    CONSULTA_CATALOGO_GENERAL("Consulta catálogo general"),
    CONSULTA_CATALOGO_CONCRETA("Consulta catálogo concreta"),
    /*2 */ LISTADO_USUARIOS("Listado de usuarios"),
    LISTADO_USUARIOS_ERROR("Listado de usuarios");
    private String tipoEvento;

    private TipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }
}
