/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author nanohp
 */
public enum TipoEvento {

    SALIR("Salir"),
    LOGIN("Login"),
    LOGOUT("Logout"),
    CONSULTA_CATALOGO_GENERAL("Consulta catálogo general");
    private String tipoEvento;

    private TipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }
}
