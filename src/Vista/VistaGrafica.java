/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Controlador.Evento;
import Controlador.TipoEvento;
import Modelo.Login;
import Modelo.MenuData;
import Modelo.Usuario;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;

/**
 *
 * @author nanohp
 */
public class VistaGrafica implements IVista {

    private int estado;
    private Controlador controlador;
    private VistaGLogin vGLogin;
    private VistaGPrincipal vGPrincipal;
    private VistaGCGeneral vGCGeneral;
    private Observable modelo;

    public VistaGrafica(MenuData menu) {

        vGCGeneral = new VistaGCGeneral();

    }

    @Override
    public void arranca() {
        vGLogin = new VistaGLogin(controlador);
        vGLogin.setVisible(true);
    }

    public void operacion(Usuario usuario) {
        vGPrincipal = new VistaGPrincipal(controlador, usuario);
        vGPrincipal.setVisible(true);
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
        JFrame ventana = new JFrame();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());

        panel1.add(new JLabel(etiqueta));
        panel1.add(new JTextField("etiqueta:"));
        panel2.add(new JButton("Aceptar"));
        FlowLayout flVentana = new FlowLayout();

        ventana.setLayout(flVentana);
        ventana.add(panel1);
        ventana.add(panel2);

        ventana.setBounds(50, 50, 200, 200);
        //ventana.pack();
        ventana.setVisible(true);
        return "1";
    }

    @Override
    public void mostrarMensaje(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void gestionarEvento(Evento evento) {
        Object info = evento.getInfo();

        switch (evento.getTipoEvento()) {

            case LOGIN_OK:
                if (info.getClass().getName().startsWith("Modelo.Usuario")) {
                    vGLogin.setVisible(false);
                    //vGLogin = null;
                    operacion((Usuario) info);
                } else {
                    assert false : info.getClass().getName() + " clase no valida";
                }
                break;
            case LOGIN_FALLO:
                JOptionPane.showMessageDialog(vGLogin,
                        "Fallo en el usuario / clave.",
                        "Error de acceso",
                        JOptionPane.ERROR_MESSAGE);
                break;
            case CONSULTA_CATALOGO_GENERAL:
                
                
                break;
            default:
                throw new AssertionError();
        }
    }
}
