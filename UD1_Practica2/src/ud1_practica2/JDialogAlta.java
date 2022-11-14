/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ud1_practica2;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

/**
 *
 * @author DAM2Alu5
 */
public class JDialogAlta extends javax.swing.JDialog {
    JFrameMain jfm;
    ArrayList<JCheckBox> checks;
    ArrayList<JRadioButton> radio;
    /**
     * Creates new form JDialogAlta
     */
    public JDialogAlta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jfm = (JFrameMain) parent;
        
        checks = new ArrayList<JCheckBox>();
        radio = new ArrayList<JRadioButton>();
        String horario[] = {"8:25-9:20","9:20-10:15","10:15-11-10:10","11:40-12:35","12:35-13:30","13:30-14:25"};
        String dia[] = {"Lunes","Martes","Miércoles","Jueves","Viernes"};
        
        /**
         * Recorre array horario y crea un checbox nuevo por cada item. 
         * Le asigna un nombre y lo añade al arraylist de Checkboxes
         */
        for (int i = 0; i < horario.length; i++) 
        {
            JCheckBox cb = new JCheckBox(horario[i]);
            cb.setName(String.valueOf(i));
            checks.add(cb);
        }
        
        /**
         * Recorre el array dia y crear un RaiodButton por cada item.
         * Le asigna un nombre y lo añade al arraylist de Radiobuttons
         */
        for (int i = 0; i < dia.length; i++) 
        {
            JRadioButton bu = new JRadioButton(dia[i]);
            bu.setName(String.valueOf(i));
            radio.add(bu);
        }
        
        /**
         * Por cada item en radio añade al panel un botón y lo añades al grupo
         * de botones.
         */
        radio.forEach
        (
                x->
                {
                    jPanelDias.add(x);
                    buttonGroupSemana.add(x);
                }
                
        );
        
        /**
         * Por cada Item en check añade un item checkbox al panel de las horas.
         */
        checks.forEach
        (
                hora->
                {
                    jPanelHoras.add(hora);
                    buttonGroupHoras.add(hora);
                }
        );
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSemana = new javax.swing.ButtonGroup();
        buttonGroupHoras = new javax.swing.ButtonGroup();
        jPanelDias = new javax.swing.JPanel();
        jPanelHoras = new javax.swing.JPanel();
        jLabelMod = new javax.swing.JLabel();
        jTextFieldModulo = new javax.swing.JTextField();
        jButtonAnyadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelDias.setBorder(javax.swing.BorderFactory.createTitledBorder("Día"));
        jPanelDias.setLayout(new java.awt.GridLayout(1, 0));

        jPanelHoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Hora"));
        jPanelHoras.setLayout(new java.awt.GridLayout(2, 3));

        jLabelMod.setText("Módulo");

        jButtonAnyadir.setText("Añadir");
        jButtonAnyadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnyadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelHoras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelDias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldModulo)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jButtonAnyadir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelDias, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMod)
                    .addComponent(jTextFieldModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jButtonAnyadir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * String boton: string que forma el nombre del botón a editar luego.
     * Los stringBuilder permiten sacar datos de la función lambda.
     * 
     * Coge el nombre de cada item en checks que esté seleccionado.
     * Lo añade al string que será nombre del botón.
     * 
     * Coge el nombre de cada item en radio que esté seleccionado.
     * Lo añade al string que será el nombre del botón.
     * 
     * Recoge lo escrito en el módulo y crea dos atomicReferences para poder
     * acceder al día y la hora en la función lambda que recorre todos los
     * botones del jFramePrincipal, busca el botón querido y al encontrarlo le
     * cambia el texto por aquel en módulo.
     */
    private void jButtonAnyadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnyadirActionPerformed
        String boton= "jb";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        checks.forEach(
                x->
                {
                    if(x.isSelected())
                    {
                        sb.append(x.getName());
                    }
                }
        );
        
        boton += sb.toString() + "-";
        
        radio.forEach(
                x->
                {
                    if(x.isSelected())
                    {
                        sb2.append(x.getName());
                    }
                }
        );
        boton += sb2.toString();
        
        
        
        
        String modulo = jTextFieldModulo.getText().toString();
        AtomicReference<String> value = new AtomicReference<>(modulo);
        AtomicReference<String> referencia = new AtomicReference<>(boton);
        jfm.botones.forEach(
                x->
                {
                    if(x.getName().toString().equals(referencia.toString()))
                    {
                        x.setText(value.toString());
                    }
                }
        );
    }//GEN-LAST:event_jButtonAnyadirActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogAlta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogAlta dialog = new JDialogAlta(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupHoras;
    private javax.swing.ButtonGroup buttonGroupSemana;
    private javax.swing.JButton jButtonAnyadir;
    private javax.swing.JLabel jLabelMod;
    private javax.swing.JPanel jPanelDias;
    private javax.swing.JPanel jPanelHoras;
    private javax.swing.JTextField jTextFieldModulo;
    // End of variables declaration//GEN-END:variables
}
