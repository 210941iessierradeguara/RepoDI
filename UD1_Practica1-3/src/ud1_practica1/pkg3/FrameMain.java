/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ud1_practica1.pkg3;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DAM2Alu5
 */
public class FrameMain extends javax.swing.JFrame {
    JDialogBalance jdb;
    DefaultTableModel dtm;
    String titulo[] = {"Fecha", "Concepto", "Ingreso", "Gasto"};
    TableRowSorter<TableModel> trs;
    ArrayList<SortKey> claves;
    /**
     * Creates new form FrameMain
     */
    public FrameMain() {
        super("Programa de Gestión de Ingresos y Gastos");
        initComponents();
        
        dtm = new DefaultTableModel(titulo, 0);
        jTabla.setModel(dtm);
        
        claves = new ArrayList<SortKey>();
        claves.add(new SortKey(0, SortOrder.ASCENDING));
        
        trs = new TableRowSorter<TableModel>(dtm);
        jTabla.setRowSorter(trs);
        trs.setSortKeys(claves);
    }
    
    public void anyade(String s1,String s2,String s3, String s4){
        String[] balance = {s1,s2,s3,s4};
        dtm.addRow(balance);
        jTabla.setModel(dtm);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        jLabelBalance = new javax.swing.JLabel();
        jTextFieldBalance = new javax.swing.JTextField();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuAlta = new javax.swing.JMenu();
        jMenuItemIngre = new javax.swing.JMenuItem();
        jMenuItemGast = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        jLabelBalance.setText("Balance:");

        jTextFieldBalance.setEditable(false);

        jMenuAlta.setText("Alta");

        jMenuItemIngre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemIngre.setText("Ingreso");
        jMenuItemIngre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngreActionPerformed(evt);
            }
        });
        jMenuAlta.add(jMenuItemIngre);

        jMenuItemGast.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemGast.setText("Gasto");
        jMenuItemGast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGastActionPerformed(evt);
            }
        });
        jMenuAlta.add(jMenuItemGast);

        jMenuBar.add(jMenuAlta);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBalance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBalance)
                    .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void calc(){
        double balance = 0;
        double gastos = 0;
        double ingresos= 0;
        
        DecimalFormat df = new DecimalFormat (String.valueOf("0.00"));
        
        try 
        {
            for (int i = 0; i < dtm.getRowCount()-1; i++) {
                if(!dtm.getValueAt(i, 2).equals(""))
                {
                    ingresos += Double.parseDouble(dtm.getValueAt(i, 2).toString().replace(",", "."));
                }
                if(!dtm.getValueAt(i, 3).equals(""))
                {
                    ingresos += Double.parseDouble(dtm.getValueAt(i, 3).toString().replace(",", "."));
                }
                balance = ingresos - gastos;
                jTextFieldBalance.setText(df.format(balance));
                if(balance>=0)
                {
                    jTextFieldBalance.setForeground(Color.GREEN);
                } 
                else 
                {
                    jTextFieldBalance.setForeground(Color.RED);
                }
            }
        }
        catch (Exception e) 
        {
            System.err.println("Error");
        }
    }
    
    private void jMenuItemIngreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngreActionPerformed
        jdb = new JDialogBalance(this, true);
        jdb.setTitle("Alta de ingresos");
        jdb.setVisible(true);
    }//GEN-LAST:event_jMenuItemIngreActionPerformed

    private void jMenuItemGastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGastActionPerformed
        jdb = new JDialogBalance(this, true);
        jdb.setTitle("Alta de gastos");
        jdb.setVisible(true);
    }//GEN-LAST:event_jMenuItemGastActionPerformed

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
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JMenu jMenuAlta;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItemGast;
    private javax.swing.JMenuItem jMenuItemIngre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabla;
    private javax.swing.JTextField jTextFieldBalance;
    // End of variables declaration//GEN-END:variables
}
