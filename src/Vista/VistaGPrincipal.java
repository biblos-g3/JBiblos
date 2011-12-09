/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VistaGPrincipal.java
 *
 * Created on 23-nov-2011, 21:59:24
 */
package Vista;

import Controlador.Controlador2;
import Controlador.Evento;
import Controlador.Observador;
import Controlador.TipoEvento;

import java.beans.PropertyChangeEvent;
import javax.swing.JDesktopPane;

// Pruebas para el nuevo MVC
import Vista2.*;
import Controlador2.*;
import Modelo.Catalogo;
import Modelo.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nanohp
 */
public class VistaGPrincipal extends javax.swing.JFrame implements Observador {

    // Pruebas para el nuevo MVC
    private Panel2Modelo panelPrueba;
    MiControlador controladorV2;

    /** Creates new form VistaGPrincipal */
    public VistaGPrincipal() {
        initComponents();

    }

    /*
     * AÑADIDO PARA JBIBLOS
     */
    private Observador padre;
    private Controlador2 controlador;
    private Usuario usuario;
    private JDesktopPane jdpDesktop;
    private VistaGPerfilUsuario vGPerfilUsuario;
    private VistaGCGeneral vGCGeneral;
    private VAcercaDe vAcercaDe;

    public VistaGPrincipal(Observador padre, Controlador2 controlador, Usuario usuario) {
        this.padre = padre;
        this.controlador = controlador;
        this.usuario = usuario;

        initComponents();
        String tipoUsuario = usuario.isAdministrador() ? " (Administrador)" : " (Lector)";
        setTitle("JBiblos - " + usuario.getNombre() + tipoUsuario);
        jdpDesktop = new JDesktopPane();
        setContentPane(jdpDesktop);

        vGPerfilUsuario = new VistaGPerfilUsuario(usuario);
        jdpDesktop.add(vGPerfilUsuario);

        vGCGeneral = new VistaGCGeneral(jdpDesktop);
        jdpDesktop.add(vGCGeneral);

        vAcercaDe = new VAcercaDe();
        jdpDesktop.add(vAcercaDe);

    }

    public void setControladorV2(MiControlador controladorV2) {
        this.controladorV2 = controladorV2;
        panelPrueba = new Panel2Modelo(controladorV2);
    }

    public VistaGCGeneral getvGCGeneral() {
        return vGCGeneral;
    }

    public void setControlador(Controlador2 controlador) {
        this.controlador = controlador;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuPrincipal = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuLector = new javax.swing.JMenu();
        jMenuItemMostrarPerfil = new javax.swing.JMenuItem();
        jMenuItemLectorCGeneral = new javax.swing.JMenuItem();
        jMenuItemLectorCConcreta = new javax.swing.JMenuItem();
        jMenuAdministrador = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();
        jMenuItemPrueba = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JBiblos - ");

        jMenuPrincipal.setText("Principal");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuPrincipal.add(jMenuItemSalir);
        jMenuPrincipal.add(jSeparator1);

        jMenuBar2.add(jMenuPrincipal);

        jMenuLector.setText("Lector");

        jMenuItemMostrarPerfil.setText("Mostrar Perfil");
        jMenuItemMostrarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMostrarPerfilActionPerformed(evt);
            }
        });
        jMenuLector.add(jMenuItemMostrarPerfil);

        jMenuItemLectorCGeneral.setText("Consulta General");
        jMenuItemLectorCGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLectorCGeneralActionPerformed(evt);
            }
        });
        jMenuLector.add(jMenuItemLectorCGeneral);

        jMenuItemLectorCConcreta.setText("Consulta Concreta");
        jMenuLector.add(jMenuItemLectorCConcreta);

        jMenuBar2.add(jMenuLector);

        jMenuAdministrador.setText("Administrador");

        jMenu5.setText("Usuario");

        jMenuItem3.setText("Alta");
        jMenu5.add(jMenuItem3);

        jMenuItem4.setText("Baja");
        jMenu5.add(jMenuItem4);

        jMenuItem5.setText("Modificar");
        jMenu5.add(jMenuItem5);

        jMenuAdministrador.add(jMenu5);

        jMenu6.setText("Catálogo");

        jMenuItem6.setText("Alta");
        jMenu6.add(jMenuItem6);

        jMenuItem7.setText("Baja");
        jMenu6.add(jMenuItem7);

        jMenuItem8.setText("Modificación");
        jMenu6.add(jMenuItem8);

        jMenuAdministrador.add(jMenu6);

        jMenuBar2.add(jMenuAdministrador);

        jMenu3.setText("Ayuda");

        jMenuItemAcercaDe.setText("A cerca de");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemAcercaDe);

        jMenuItemPrueba.setText("Prueba");
        jMenuItemPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPruebaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItemPrueba);

        jMenuBar2.add(jMenu3);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMostrarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMostrarPerfilActionPerformed
        System.out.println(usuario);
        vGPerfilUsuario = new VistaGPerfilUsuario(usuario);
        jdpDesktop.add(vGPerfilUsuario);
        vGPerfilUsuario.setVisible(true);
    }//GEN-LAST:event_jMenuItemMostrarPerfilActionPerformed

    private void jMenuItemLectorCGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLectorCGeneralActionPerformed
        controlador.gestionarEvento(new Evento(TipoEvento.CONSULTA_CATALOGO_GENERAL, null, this));
    }//GEN-LAST:event_jMenuItemLectorCGeneralActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed

        controlador.gestionarEvento(new Evento(TipoEvento.SALIR));     }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        vAcercaDe.setVisible(true);
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jMenuItemPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPruebaActionPerformed
        panelPrueba.setVisible(true);
    }//GEN-LAST:event_jMenuItemPruebaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaGPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new VistaGPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenuAdministrador;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemLectorCConcreta;
    private javax.swing.JMenuItem jMenuItemLectorCGeneral;
    private javax.swing.JMenuItem jMenuItemMostrarPerfil;
    private javax.swing.JMenuItem jMenuItemPrueba;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuLector;
    private javax.swing.JMenu jMenuPrincipal;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eventoRespuesta(Evento evento) {
        switch (evento.getTipoEvento()) {
            case SALIR:
                System.out.println("Saliendo");
                //System.exit(1);
                break;
            case LOGOUT:
                System.err.println("Controlador->LOGOUT: No implementado.");
                break;
            case CONSULTA_CATALOGO_GENERAL:
                Evento eventoAux = null;
                System.out.println("CONSULTA_CATALOGO_GENERAL");
                try {

                    Catalogo catalogo = (Catalogo) evento.getInfo();
                    vGCGeneral.muestraResultado(catalogo.getCatalogo().values());
                    vGCGeneral.setVisible(true);

                }catch (NullPointerException ex) {
                    //Logger.getLogger(VistaGPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    System.err.println("ERROR: Catalogo vacio: evento:"+ex);
                    //eventoAux = new Evento(TipoEvento.ERROR);
                    ex.printStackTrace();

                }
                catch (Exception ex) {
                    Logger.getLogger(VistaGPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    //System.err.println("ERROR");
                    //eventoAux = new Evento(TipoEvento.ERROR);
                }
                break;
        }
    }
}
