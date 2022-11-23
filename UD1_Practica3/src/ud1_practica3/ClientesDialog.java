/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ud1_practica3;

import clases.Cliente;
import java.util.ArrayList;

/**
 *
 * @author DAM2Alu5
 */
public class ClientesDialog extends javax.swing.JDialog {
    Principal principal;
    ArrayList<Cliente> clientes;
    private String nombre, ape, telf;
    
    public String regexTelf, regexNomApe;
    
    /**
     * Creates new form ClienteesDialog, asigna como padre la clase Principal,
     * de la misma recoge el arrayList Clientes y hace una copia, inicia los
     * componentes del dialog, añade los clientes al combobox y asigna los 
     * regex correspondientes.
     */
    public ClientesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        principal = (Principal) parent;
        clientes = principal.datos.getClientes();
        initComponents();
        anyadirCombo();
        
        regexTelf = "(\\+34|0034|34)?(6|7|8|9)([0-9]){8}";
        regexNomApe = "^[^0-9]*$";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelApe = new javax.swing.JLabel();
        jTextFieldApe = new javax.swing.JTextField();
        jLabelTelf = new javax.swing.JLabel();
        jTextFieldTelf = new javax.swing.JTextField();
        jButtonAnya = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jComboBoxClientes = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Clientes");

        jLabelNome.setText("Nombre:");

        jLabelApe.setText("Apellidos");

        jLabelTelf.setText("Telefono");

        jButtonAnya.setText("Añadir");
        jButtonAnya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnyaActionPerformed(evt);
            }
        });

        jButtonMod.setText("Modificar");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("Eliminar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelNome)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelApe)
                            .addGap(10, 10, 10)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTelf)
                        .addGap(13, 13, 13)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jTextFieldApe)
                    .addComponent(jTextFieldTelf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAnya, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
            .addComponent(jComboBoxClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnya))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApe)
                    .addComponent(jTextFieldApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBorrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelf)
                    .addComponent(jTextFieldTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMod))
                .addGap(0, 75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Añade los cleintes de la lista al comboBox cuando se llama.
     */
    public void anyadirCombo()
    {
        clientes.forEach(x -> 
            {
                jComboBoxClientes.addItem(x.toString());
            });
    }
    
    /**
     * Coge lo escrito en los TextField, comprueba si coinciden con el regex 
     * asignado al principio del programa. De coincidir crea un nuevo cliente
     * con esos datos, borra todos los elementos del ComboBox llama a 
     * anyadirCombo para que rellene el comboBox con los clientes
     * actualizados y vacía los campos de texto alguno.
     * Al final actualiza el ArrayList de la clase datos creada en la clase 
     * principal con los clientes nuevos.
     * 
     * @param evt 
     */
    private void jButtonAnyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnyaActionPerformed
        nombre = jTextFieldNome.getText().toString();
        ape = jTextFieldApe.getText().toString();
        telf = jTextFieldTelf.getText().toString();
        
        if(telf.matches(regexTelf)
           && nombre.matches(regexNomApe)
           && ape.matches(regexNomApe))
        {
            clientes.add(new Cliente(nombre, ape, telf));
            jComboBoxClientes.removeAllItems();
            anyadirCombo();
            jTextFieldNome.setText("");
            jTextFieldApe.setText("");
            jTextFieldTelf.setText("");
        }
        principal.datos.setClientes(clientes);
    }//GEN-LAST:event_jButtonAnyaActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        BorrarClientDialog borrarClientDialog = new BorrarClientDialog(this, false);
        borrarClientDialog.setTitle("Eliminar cliente");
        borrarClientDialog.setVisible(true);
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        ModificarClientDialog modificarClientDialog = new ModificarClientDialog(this, false);
        modificarClientDialog.setTitle("Modificar Cliente");
        modificarClientDialog.setVisible(true);
    }//GEN-LAST:event_jButtonModActionPerformed

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
            java.util.logging.Logger.getLogger(ClientesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClientesDialog dialog = new ClientesDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnya;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonMod;
    public javax.swing.JComboBox<String> jComboBoxClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApe;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTelf;
    private javax.swing.JTextField jTextFieldApe;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTelf;
    // End of variables declaration//GEN-END:variables
}
