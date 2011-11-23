/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Biblioteca;
import Modelo.Login;
import Modelo.Usuario;
import Vista.IVista;
import Vista.JButtonPersonalizado;
import Vista.JMenuItemPersonalizado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nanohp
 */
public class Controlador implements ActionListener {

    private IVista vista;
    private Biblioteca biblioteca;

    public Controlador(IVista vista, Biblioteca biblioteca) {
        this.vista = vista;
        this.biblioteca = biblioteca;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        TipoEvento evento = null;
        Login login = null;

        System.err.println(ae);

        // Obtenemos el TipoEvento dependiendo de la fuente del mismo
        Object fuente = ae.getSource();
        if (fuente.getClass().getName().equals("Vista.JMenuItemPersonalizado")) {
            JMenuItemPersonalizado menu = (JMenuItemPersonalizado) fuente;
            evento = menu.getmItem().getEvento();
        }

        if (fuente.getClass().getName().equals("Controlador.TipoEvento")) {
            evento = (TipoEvento) fuente;
        }

        if (fuente.getClass().getName().equals("Vista.JButtonPersonalizado")) {
            evento = TipoEvento.LOGIN;
            login = (Login) ((JButtonPersonalizado) fuente).getPaquete();

        }

        System.err.println("ActionEvent:" + ae + ", \nevento:" + evento);

        String cadAux;

        switch (evento) {
            case SALIR:
                System.out.println("Saliendo");
                System.exit(1);
                break;
            case LOGIN:
                System.out.println(login);
                Usuario usuario;
                try {
                    usuario = biblioteca.login(login.getNombre(), login.getClave());
                    vista.arranca(usuario);
                } catch (Exception ex) {
                    Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                    vista.login();
                }

                break;
            case LOGOUT:
                System.err.println("Controlador->LOGOUT: No implementado.");
                break;
            case CONSULTA_CATALOGO_GENERAL:
                System.err.println("Controlador->CONSULTA_CATALOGO_GENERAL: No implementado");
                break;
        }
    }
}
