/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.Biblioteca;
import Modelo.Login;
import Modelo.Usuario;
import java.util.Observable;

/**
 *
 * @author nanohp
 */
public interface IVista {

    public void arranca(Usuario usuario);

    public void setControlador(Controlador controlador);

    public void setModelo(Observable observable);

    public String getValor(String etiqueta);

    public void mostrarMensaje(String mensaje);
    
    public Login login();
    
}
