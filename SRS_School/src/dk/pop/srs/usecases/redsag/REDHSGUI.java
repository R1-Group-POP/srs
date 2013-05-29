/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.usecases.redsag;

import dk.pop.srs.HovedGUI;
import dk.pop.srs.sag.Sag;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patrick
 */
public class REDHSGUI extends javax.swing.JDialog {

    private REDHandler rEDHandler;
    private REDGUI rEDGUI;
    private String[] columnNames = {"CPR", "Sagssted", "Paragraf", "Foranstaltningsnavn", "Beskrivelse", "PeriodeFra", "PeriodeTil", "AER", "Sagstype", "BetalingCPR", "BetalingBeløb"};
    
    /**
     * Constructor
     * @param parent
     * @param modal
     * @param rEDHandler
     * @param rEDGUI 
     */
    public REDHSGUI(java.awt.Frame parent, boolean modal, REDHandler rEDHandler, REDGUI rEDGUI) {
        super(parent, modal);
        this.rEDHandler = rEDHandler;
        this.rEDGUI = rEDGUI;
        setLookAndFeel();
        initComponents();
        setFrame();
    }
    
    /**
     * Set look and feel
     */
    private void setLookAndFeel() {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HovedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HovedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HovedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HovedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>>
    }

    /**
     * Set jDialog location to middle of screen
     */
    private void setFrame() {
        setLocationRelativeTo(null);
    }
    
    /**
     * Resets the gui fields
     */
    private void reset() {
        cpr_textField.setText("");
        sager_table.setModel(new DefaultTableModel());
        rediger_button.setEnabled(false);
        sager_table.setEnabled(false);
        hentSager_button.setEnabled(false);
    }
    
    /**
     * Populates the table with sager
     */
    public void hentSager() {
        String cpr = cpr_textField.getText();

        if (cpr.length() == 10) {
            if (rEDHandler.checkPersonExists(cpr)) {
                sager_table.setEnabled(true);
                ArrayList<Sag> sager = rEDHandler.getPersonsSager(cpr, false);
                if (!sager.isEmpty()) {
                    DefaultTableModel dtm = new DefaultTableModel();
                    for (String s : columnNames) {
                        dtm.addColumn(s);
                    }

                    for (Sag s : sager) {
                        String[] a = {s.getPerson().getCpr(), s.getSagsSted(), s.getParagraf(), s.getForanstaltningsnavn(), s.getBeskrivelse(), String.valueOf(s.getPeriodeFra()), String.valueOf(s.getPeriodeTil()), String.valueOf(s.getAer()), String.valueOf(s.getSagstype()), s.getBetaler().getBetalingCPR(), String.valueOf(s.getBetalingBelob())};
                        dtm.addRow(a);
                    }
                    sager_table.setModel(dtm);
                } else {
                    DefaultTableModel dtm = new DefaultTableModel();
                    for (String s : columnNames) {
                        dtm.addColumn(s);
                    }
                    sager_table.setModel(dtm);
                }
            } else {
                JOptionPane.showMessageDialog(this, "CPR nummeret blev ikke fundet\nHar du tastet rigtigt?", "Fejl", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Der er sket en fejl fordi en af følgende ikke er blevet overholdt:\n- CPR nummer skal være på 10 tegn", "Fejl", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Removes everything except 0-9 and returns a new string
     * @param text
     * @return 
     */
    public String removeLetters(String text) {
        return text.replaceAll("[^0-9]", "");
    }

    /**
     * Removes everything except 0-9 , . and returns a new string
     * @param text
     * @return 
     */
    public String removeLettersV2(String text) {
        return text.replaceAll("[^0-9.,]", "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cpr_textField = new javax.swing.JTextField();
        hentSager_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        sager_table = new javax.swing.JTable();
        annuller_button = new javax.swing.JButton();
        rediger_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rediger sag");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("CPR");

        jLabel2.setText("Sager");

        cpr_textField.setToolTipText("CPR skal være på 10 tegn");
        cpr_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpr_textFieldKeyReleased(evt);
            }
        });

        hentSager_button.setText("Hent sager");
        hentSager_button.setEnabled(false);
        hentSager_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hentSager_buttonActionPerformed(evt);
            }
        });

        sager_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sager_table.setEnabled(false);
        sager_table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sager_tableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(sager_table);

        annuller_button.setText("Luk");
        annuller_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annuller_buttonActionPerformed(evt);
            }
        });

        rediger_button.setText("Rediger");
        rediger_button.setEnabled(false);
        rediger_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rediger_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(annuller_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rediger_button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cpr_textField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hentSager_button))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1124, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cpr_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hentSager_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annuller_button)
                    .addComponent(rediger_button))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hentSager_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hentSager_buttonActionPerformed
        hentSager();
    }//GEN-LAST:event_hentSager_buttonActionPerformed

    private void cpr_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpr_textFieldKeyReleased
        cpr_textField.setText(removeLetters(cpr_textField.getText()));

        if (cpr_textField.getText().length() == 0) {
            hentSager_button.setEnabled(false);
        } else {
            hentSager_button.setEnabled(true);
        }
    }//GEN-LAST:event_cpr_textFieldKeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        reset();
    }//GEN-LAST:event_formWindowClosed

    private void annuller_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annuller_buttonActionPerformed
        dispose();
    }//GEN-LAST:event_annuller_buttonActionPerformed

    private void sager_tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sager_tableFocusGained
        rediger_button.setEnabled(true);
    }//GEN-LAST:event_sager_tableFocusGained

    private void rediger_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rediger_buttonActionPerformed
        int selection = sager_table.getSelectedRow();
        String cpr = cpr_textField.getText();

        ArrayList<Sag> sager = rEDHandler.getPersonsSager(cpr.replace("-", ""), false);

        Sag toEdit = sager.get(selection);
        rEDGUI.init(toEdit);
        rEDGUI.setVisible(true);
    }//GEN-LAST:event_rediger_buttonActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(REDHSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(REDHSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(REDHSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(REDHSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                REDHSGUI dialog = new REDHSGUI(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuller_button;
    private javax.swing.JTextField cpr_textField;
    private javax.swing.JButton hentSager_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton rediger_button;
    private javax.swing.JTable sager_table;
    // End of variables declaration//GEN-END:variables
}
