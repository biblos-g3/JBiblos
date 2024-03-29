/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VistaGPerfilUsuario.java
 *
 * Created on 23-nov-2011, 22:25:51
 */
package Vista;

import Modelo.Usuario;
import javax.swing.JDesktopPane;

/**
 *
 * @author nanohp
 */
public class VistaGPerfilUsuario extends javax.swing.JInternalFrame implements GestionarModelo {

    private Usuario usuario;

    /** Creates new form VistaGPerfilUsuario */
    public VistaGPerfilUsuario() {
        initComponents();
    }

    /*
     * AÑADIDO PARA JBIBLOS
     */
    public void setModo(String modo) {
        if (modo.equals("mostrar")) {
            this.setEditable(false);
        } else if (modo.equals("alta")) {
            limpiarModelo();
            setEditable(true);
            setTitle("Alta de usuario");
            this.jBAceptar.setText("Alta");
        } else if (modo.equals("modificar")) {
            setEditable(true);
            setTitle("Modificación de usuario");
            this.jTextFieldDNI.setEditable(fa2lse);
        }
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido1 = new javax.swing.JTextField();
        jTextFieldApellido2 = new javax.swing.JTextField();
        jBAceptar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldClave = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jCheckBoxAdministrador = new javax.swing.JCheckBox();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Perfil usuario");
        setToolTipText("Información sobre el perfil actual");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/images/User_info_16.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(511, 394));

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido 1");

        jLabel3.setText("Apellido 2");

        jTextFieldNombre.setColumns(30);
        jTextFieldNombre.setEditable(false);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

        jTextFieldApellido1.setColumns(30);

        jTextFieldApellido2.setColumns(30);

        jBAceptar.setText("Aceptar");
        jBAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAceptarActionPerformed(evt);
            }
        });

        jLabel4.setText("DNI");

        jTextFieldDNI.setColumns(8);

        jTextFieldClave.setColumns(8);
        jTextFieldClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldClaveActionPerformed(evt);
            }
        });

        jLabel5.setText("Clave");

        jLabel6.setText("email");

        jTextFieldEmail.setColumns(17);

        jLabel7.setText("Teléfono");

        jTextFieldTelefono.setColumns(8);

        jLabel8.setText("Dirección");

        jTextFieldDireccion.setColumns(30);

        jCheckBoxAdministrador.setText("Administrador");
        jCheckBoxAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxAdministrador))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jBAceptar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel4))
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel5))
                    .addComponent(jTextFieldClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jCheckBoxAdministrador)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel2))
                    .addComponent(jTextFieldApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3))
                    .addComponent(jTextFieldApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel8))
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel6))
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel7))
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jBAceptar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jBAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAceptarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jBAceptarActionPerformed

    private void jTextFieldClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldClaveActionPerformed

    private void jCheckBoxAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxAdministradorActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAceptar;
    private javax.swing.JCheckBox jCheckBoxAdministrador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldApellido1;
    private javax.swing.JTextField jTextFieldApellido2;
    private javax.swing.JTextField jTextFieldClave;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables

    @Override
    public void fijarModelo(Object object) {
        usuario = (Usuario) object;

        jTextFieldNombre.setText(usuario.getNombre());
        jTextFieldApellido1.setText(usuario.getApellido1());
        jTextFieldApellido2.setText(usuario.getApellido2());

        jTextFieldDNI.setText(new Integer(usuario.getDni()).toString());
        jTextFieldClave.setText(usuario.getClave());
        jTextFieldDireccion.setText(usuario.getDireccion());
        jTextFieldTelefono.setText(new Integer(usuario.getTelefono()).toString());
        jTextFieldEmail.setText(usuario.getEmail());
        jCheckBoxAdministrador.setSelected(usuario.isIsAdministrador());

        setTitle("Perfil usuario (" + usuario.getDni() + ")");
    }

    @Override
    public Object obtenerModelo() {
        return usuario;
    }

    @Override
    public void limpiarModelo() {
        jTextFieldNombre.setText("");
        jTextFieldApellido1.setText("");
        jTextFieldApellido2.setText("");

        jTextFieldDNI.setText("");
        jTextFieldClave.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldEmail.setText("");
        jCheckBoxAdministrador.setSelected(false);
        usuario = null;
    }

    @Override
    public void setEditable(boolean esEditable) {
        jTextFieldApellido1.setEditable(esEditable);
        jTextFieldApellido2.setEditable(esEditable);
        jTextFieldClave.setEditable(esEditable);
        jTextFieldDNI.setEditable(esEditable);
        jTextFieldDireccion.setEditable(esEditable);
        jTextFieldEmail.setEditable(esEditable);
        jTextFieldNombre.setEditable(esEditable);
        jTextFieldTelefono.setEditable(esEditable);
        jCheckBoxAdministrador.setEnabled(esEditable);
    }
}
