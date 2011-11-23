/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Controlador.TipoEvento;
import Modelo.Login;
import Modelo.MenuData;
import Modelo.Usuario;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JWindow;

/**
 *
 * @author nanohp
 */
public class VistaGrafica implements IVista {

    private VistaMenuGrafico vistaMenu;
    private Controlador controlador;
    private Observable modelo;
    private JFrame f;
    private JMenuBar barraMenu;
    private MenuData menu;

    public VistaGrafica(MenuData menu) {
        this.menu = menu;

        f = new JFrame("JBiblos");


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void arranca(Usuario usuario) {
        this.vistaMenu = new VistaMenuGrafico(menu);
        vistaMenu.setControlador(controlador);
        vistaMenu.setObservable(modelo);

        vistaMenu.mostrarMenu(f);

        f.add(new JTextField("Bienvenido " + usuario.getNombre() + ", admin?" + usuario.isAdministrador()));
        String tipoUsuario = usuario.isAdministrador() ? " (Administrador)" : " (Lector)";
        f.setTitle("JBiblos - " + usuario.getNombre() + tipoUsuario);

        f.setSize(400, 200);
        f.setVisible(true);
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
        //flVentana.


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
    public Login login() {
        String usuario;
        String clave;
        final Login login = new Login("1", "clave1");

        final JFrame ventana = new JFrame("JBiblos - Login");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());
        panel3.setLayout(new FlowLayout());

        panel1.add(new JLabel("Usuario:"));
        final JTextField tFUsuario = new JTextField();
        tFUsuario.setColumns(10);
        panel1.add(tFUsuario);

        panel2.add(new JLabel("Clave:"));
        final JPasswordField tFClave = new JPasswordField();
        tFClave.setColumns(10);
        panel2.add(tFClave);

        final JButtonPersonalizado bAceptar = new JButtonPersonalizado("Aceptar");
        bAceptar.setPaquete(login);
        panel3.add(bAceptar);

        bAceptar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                login.setNombre(tFUsuario.getText());
                login.setClave(tFClave.getText());
                ventana.setVisible(false);
                controlador.actionPerformed(ae);
                controlador.actionPerformed(new ActionEvent(bAceptar, 1, TipoEvento.LOGIN.getTipoEvento()));
                //arranca();
            }
        });
        FlowLayout flVentana = new FlowLayout();
        //flVentana.


        ventana.setLayout(flVentana);
        ventana.add(panel1);
        ventana.add(panel2);
        ventana.add(panel3);

        ventana.setBounds(50, 50, 200, 200);
        //ventana.pack();
        ventana.setVisible(true);
        return login;
    }
}
