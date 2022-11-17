/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ud1_practica2;

import clases.Hora;
import clases.ListaHoras;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author DAM2Alu5
 */
public class JFrameMain extends javax.swing.JFrame {
    JButton b;
    JDialogAlta jda;
    JDialogLog dlog;
    ArrayList<JButton> botones = new ArrayList<JButton>();
    String[] horas = {"08:25-09:20", "09:20-10:15", "10:15-11:10", "11:40-12:35",
        "12:35-13:30", "13:30-14:45"};
    String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes"};
    ListaHoras lista;
    
    /**
     * Creates new form JFrameMain.
     * 
     * El panel tiene un grid layout de 5 dias x 6 horas
     * por cada uno de esos dias y horas se crea un botón de nombre "jbHora-Dia"
     * añade el botón al jPanel.
     */
    public JFrameMain() {
        initComponents();
        
        lista = new ListaHoras();
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                b = new JButton();
                b.setName("jb"+i+ "-"+j);
                //b.setText("jb"+i+ "-"+j);
                botones.add(b);
                jPanelBotones.add(b);
                
            }
        }
    }
    
    public boolean addHora(int hora, int dia, String modulo, Date fechaAlta) {
        lista.setHora(new Hora(hora, dia, modulo, fechaAlta));
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelHorario = new javax.swing.JLabel();
        jPanelSemana = new javax.swing.JPanel();
        jLabelLunes = new javax.swing.JLabel();
        jLabelMartes = new javax.swing.JLabel();
        jLabelMiercoles = new javax.swing.JLabel();
        jLabelJueves = new javax.swing.JLabel();
        jLabelViernes = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlta = new javax.swing.JMenu();
        jMenuLog = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(689, 426));
        setPreferredSize(new java.awt.Dimension(689, 426));

        jLabelHorario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelHorario.setForeground(new java.awt.Color(255, 51, 51));
        jLabelHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHorario.setText("HORARIO 2º DAM");
        jLabelHorario.setAlignmentY(0.0F);

        jPanelSemana.setBackground(new java.awt.Color(255, 255, 102));
        jPanelSemana.setLayout(new java.awt.GridLayout(1, 0));

        jLabelLunes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLunes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLunes.setText("Lunes");
        jPanelSemana.add(jLabelLunes);

        jLabelMartes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMartes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMartes.setText("Martes");
        jPanelSemana.add(jLabelMartes);

        jLabelMiercoles.setBackground(new java.awt.Color(0, 0, 0));
        jLabelMiercoles.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMiercoles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMiercoles.setText("Miécoles");
        jPanelSemana.add(jLabelMiercoles);

        jLabelJueves.setForeground(new java.awt.Color(0, 0, 0));
        jLabelJueves.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelJueves.setText("Jueves");
        jPanelSemana.add(jLabelJueves);

        jLabelViernes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelViernes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelViernes.setText("Viernes");
        jLabelViernes.setToolTipText("");
        jPanelSemana.add(jLabelViernes);

        jPanelBotones.setLayout(new java.awt.GridLayout(6, 5));

        jMenuAlta.setText("Alta");
        jMenuAlta.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                jMenuAltaMenuSelected(evt);
            }
        });
        jMenuBar1.add(jMenuAlta);

        jMenuLog.setText("Log");
        jMenuLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuLog);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelSemana, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Crea una ventana nueva para dar de alta un horario
     * con el titulo "ALTA HORAS".
     */
    private void jMenuAltaMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_jMenuAltaMenuSelected
        jda = new JDialogAlta(this, true);
        jda.setTitle("ALTA HORAS");
        jda.setVisible(true);
    }//GEN-LAST:event_jMenuAltaMenuSelected

    private void jMenuLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogMouseClicked
        dlog = new JDialogLog(this, false);
        dlog.setVisible(true);
    }//GEN-LAST:event_jMenuLogMouseClicked

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelHorario;
    private javax.swing.JLabel jLabelJueves;
    private javax.swing.JLabel jLabelLunes;
    private javax.swing.JLabel jLabelMartes;
    private javax.swing.JLabel jLabelMiercoles;
    private javax.swing.JLabel jLabelViernes;
    private javax.swing.JMenu jMenuAlta;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuLog;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelSemana;
    // End of variables declaration//GEN-END:variables
}
