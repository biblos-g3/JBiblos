/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VistaGLogin.java
 *
 * Created on 23-nov-2011, 18:55:38
 */
package Vista;

import Controlador.Controlador;
import Controlador.Evento;
import Controlador.Observador;
import Controlador.TipoEvento;
import Modelo.Login;
import Modelo.Usuario;
import java.beans.PropertyChangeEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author nanohp
 */
public class VistaGLogin extends javax.swing.JFrame implements Observador {

    private Controlador controlador;
    private Observador padre;

    /** Creates new form VistaGLogin */
    public VistaGLogin(Observador padre, Controlador controlador) {
        this.padre = padre;
        this.controlador = controlador;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jTFClave = new javax.swing.JPasswordField();
        jBotonLoginAceptar = new javax.swing.JButton();
        jBotonLoginCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JBiblos - Login");

        jLabel1.setText("Usuario");

        jLabel2.setText("Clave");

        jTFUsuario.setColumns(10);

        jTFClave.setColumns(10);

        jBotonLoginAceptar.setText("Aceptar");
        jBotonLoginAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonLoginAceptarActionPerformed(evt);
            }
        });

        jBotonLoginCancelar.setText("Cancelar");
        jBotonLoginCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonLoginCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jBotonLoginAceptar)
                        .addGap(40, 40, 40)
                        .addComponent(jBotonLoginCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(56, 56, 56)
                        .addComponent(jTFClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonLoginAceptar)
                    .addComponent(jBotonLoginCancelar))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonLoginAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonLoginAceptarActionPerformed
        Login login = new Login(jTFUsuario.getText().trim(), jTFClave.getText().trim());
        controlador.gestionarEvento(new Evento(TipoEvento.LOGIN, login, this));
    }//GEN-LAST:event_jBotonLoginAceptarActionPerformed

    private void jBotonLoginCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonLoginCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBotonLoginCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaGLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                //new VistaGLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonLoginAceptar;
    private javax.swing.JButton jBotonLoginCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jTFClave;
    private javax.swing.JTextField jTFUsuario;
    // End of variables declaration//GEN-END:variables

    @Override
    public void modelPropertyChange(PropertyChangeEvent evt) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eventoRespuesta(Evento evento) {
        Object info = evento.getInfo();

        switch (evento.getTipoEvento()) {

            case LOGIN_OK:
                if (info.getClass().getName().startsWith("Modelo.Usuario")) {
                    setVisible(false);
                    padre.eventoRespuesta(new Evento(TipoEvento.LOGIN_OK, info));
                } else {
                    assert false : info.getClass().getName() + " clase no valida";
                }
                break;
            case LOGIN_FALLO:
                JOptionPane.showMessageDialog(this,
                        "Fallo en el usuario / clave.",
                        "Error de acceso",
                        JOptionPane.ERROR_MESSAGE);
                break;
            default:
                throw new AssertionError();
        }

    }
}
