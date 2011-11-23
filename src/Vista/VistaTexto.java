/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Controlador.TipoEvento;
import Modelo.Login;
import Modelo.MenuData;
import java.awt.event.ActionEvent;
import java.util.Observable;

/**
 *
 * @author nanohp
 */
public class VistaTexto implements IVista {

    private VistaMenuTexto vistaMenu;
    private Controlador controlador;
    private Observable modelo;

    public VistaTexto(MenuData menuData) {
        this.vistaMenu = new VistaMenuTexto(menuData);
    }

    @Override
    public void arranca() {
        Login login  = vistaLogin();
        System.out.println(login);
        
        TipoEvento evento;
        do {
            vistaMenu.mostrarMenu(System.out);
            vistaMenu.mostrarMenuOpciones(System.out);
            evento = vistaMenu.selectorEvento();

            controlador.actionPerformed(new ActionEvent(evento, 1, TipoEvento.SALIR.getTipoEvento()));
            
        } while (true);
    }

    @Override
    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    @Override
    public void setModelo(Observable observable) {
        modelo = observable;
    }

    @Override
    public String getValor(String etiqueta) {
        DialogoPedirCampo pideEtiqueta = new DialogoPedirCampo(etiqueta);
        return pideEtiqueta.ejecuta();
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public Login vistaLogin() {
        System.out.println("ssss");
        DialogoPedirCampo pideUsuario = new DialogoPedirCampo("Usuario:");
        String usuario = pideUsuario.ejecuta();

        DialogoPedirCampo pideClave = new DialogoPedirCampo("Clave:");
        String clave = pideClave.ejecuta();

        return new Login(usuario, clave);
    }
}
