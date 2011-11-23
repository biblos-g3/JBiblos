/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Biblioteca;
import Modelo.Catalogo;
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

    public void gestionarEvento(Evento evento) {

        switch (evento.getTipoEvento()) {
            case SALIR:
                System.out.println("Saliendo");
                System.exit(1);
                break;
            case LOGIN:
                if (!evento.getInfo().getClass().getName().equals("Modelo.Login")) {
                    assert false : evento.getInfo().getClass().getName() + " clase invalida";
                } else {
                    Login login = (Login) evento.getInfo();
                    Evento eventoAux;
                    System.out.println("Intento acceso para: "+login.toString());
                    Usuario usuario;
                    try {
                        usuario = biblioteca.login(login.getNombre(), login.getClave());
                        //System.out.println("---"+usuario.getClass().getSimpleName()+"-");
                        eventoAux = new Evento(TipoEvento.LOGIN_OK, usuario);
                    } catch (Exception ex) {
                        //Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        System.err.println("ERROR");
                        eventoAux = new Evento(TipoEvento.LOGIN_FALLO);
                    }
                    vista.gestionarEvento(eventoAux);
                }

                break;
            case LOGOUT:
                System.err.println("Controlador->LOGOUT: No implementado.");
                break;
            case CONSULTA_CATALOGO_GENERAL:
                Evento eventoAux = null;
                    System.out.println("CONSULTA_CATALOGO_GENERAL");
                    try {
                        
                        Catalogo catalogo = biblioteca.getAlberga();
                        eventoAux = new Evento(TipoEvento.CONSULTA_CATALOGO_GENERAL, catalogo);
                        
                    } catch (Exception ex) {
                        //Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
                        System.err.println("ERROR");
                        eventoAux = new Evento(TipoEvento.ERROR);
                    }
                    vista.gestionarEvento(eventoAux);
                break;
        }
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
              case LOGOUT:
                System.err.println("Controlador->LOGOUT: No implementado.");
                break;
            case CONSULTA_CATALOGO_GENERAL:
                System.err.println("Controlador->CONSULTA_CATALOGO_GENERAL: No implementado");
                break;
        }
    }
}
