/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import java.util.Observable;

/**
 *
 * @author nanohp
 */
public interface IVistaMenu {

    public void mostrarMenu(Object destino);

    public void setObservable(Observable observable);

    public void setControlador(Controlador controlador);
}
