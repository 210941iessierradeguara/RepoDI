/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ud1_practica3;

import clases.Cliente;
import java.util.ListIterator;

/**
 *
 * @author DAM2Alu5
 */
public class ModificarClientDialog extends javax.swing.JDialog {
    ClientesDialog clientesDialog;
    String telfN, nomN, apeN, telfV;
    /**
     * Creates new form MedificarClientDialog
     */
    public ModificarClientDialog(java.awt.Dialog parent, boolean modal) {
        super(parent, modal);
        clientesDialog = (ClientesDialog) parent;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitleMod = new javax.swing.JLabel();
        jLabelTelfV = new javax.swing.JLabel();
        jTextFieldTelfV = new javax.swing.JTextField();
        jLabelNomN = new javax.swing.JLabel();
        jTextFieldNomN = new javax.swing.JTextField();
        jLabelApeN = new javax.swing.JLabel();
        jTextFieldApeN = new javax.swing.JTextField();
        jLabelTelfN = new javax.swing.JLabel();
        jTextFieldTelfN = new javax.swing.JTextField();
        jButtonMod = new javax.swing.JButton();
        jButtonCance = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitleMod.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelTitleMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitleMod.setText("Modifique el cliente en los campos deseados");

        jLabelTelfV.setText("NºTelf a modificar:");

        jLabelNomN.setText("Nuevo Nombre:");

        jLabelApeN.setText("Nuevos Apellidos:");

        jLabelTelfN.setText("Nuevo telefono:");

        jButtonMod.setText("Modificar");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        jButtonCance.setText("Cacelar");
        jButtonCance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCanceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitleMod, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTelfV)
                            .addComponent(jLabelNomN)
                            .addComponent(jLabelApeN)
                            .addComponent(jLabelTelfN))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldApeN)
                            .addComponent(jTextFieldTelfV)
                            .addComponent(jTextFieldNomN)
                            .addComponent(jTextFieldTelfN, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonCance)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabelTitleMod, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelfV)
                    .addComponent(jTextFieldTelfV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomN)
                    .addComponent(jTextFieldNomN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApeN)
                    .addComponent(jTextFieldApeN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelfN)
                    .addComponent(jTextFieldTelfN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMod)
                    .addComponent(jButtonCance))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        telfV = jTextFieldTelfV.getText().toString();
        telfN = jTextFieldTelfN.getText().toString();
        nomN = jTextFieldNomN.getText().toString();
        apeN = jTextFieldApeN.getText().toString();
        
        ListIterator<Cliente> it = clientesDialog.clientes.listIterator();
        while(it.hasNext())
        {
            Cliente client = it.next();
            if(client.getTelefono().equals(telfV))
            {
                if(telfN.matches(clientesDialog.regexTelf))
                {
                    client.setTelefono(telfN);
                }
                if(nomN.matches(clientesDialog.regexNomApe))
                {
                    client.setName(nomN);
                }
                if(apeN.matches(clientesDialog.regexNomApe))
                {
                    client.setApellidos(apeN);
                }
            }
        }
        
        clientesDialog.jComboBoxClientes.removeAllItems();
        clientesDialog.anyadirCombo();
        clientesDialog.principal.datos.setClientes(clientesDialog.clientes);
        this.dispose();
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonCanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCanceActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCanceActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarClientDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ModificarClientDialog dialog = new ModificarClientDialog(new javax.swing.JDialog(), true);
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
    private javax.swing.JButton jButtonCance;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JLabel jLabelApeN;
    private javax.swing.JLabel jLabelNomN;
    private javax.swing.JLabel jLabelTelfN;
    private javax.swing.JLabel jLabelTelfV;
    private javax.swing.JLabel jLabelTitleMod;
    private javax.swing.JTextField jTextFieldApeN;
    private javax.swing.JTextField jTextFieldNomN;
    private javax.swing.JTextField jTextFieldTelfN;
    private javax.swing.JTextField jTextFieldTelfV;
    // End of variables declaration//GEN-END:variables
}
