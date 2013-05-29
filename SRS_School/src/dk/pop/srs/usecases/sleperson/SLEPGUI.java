/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.usecases.sleperson;

import dk.pop.srs.person.Person;
import dk.pop.srs.sag.Sag;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Patrick
 */
public class SLEPGUI extends javax.swing.JDialog {

    private SLEPHandler sLEPHandler;
    private String[] columnNames = {"CPR", "Fornavn", "Mellemnavn", "Efternavn"};

    /**
     * Constructor
     * @param parent
     * @param modal
     * @param sLEPHandler 
     */
    public SLEPGUI(java.awt.Frame parent, boolean modal, SLEPHandler sLEPHandler) {
        super(parent, modal);
        this.sLEPHandler = sLEPHandler;
        setLookAndFeel();
        initComponents();
        setFrame();
        setTableRules();
    }

    /**
     * Sets jDialog location to middle of the screen
     */
    private void setFrame() {
        setLocationRelativeTo(null);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SLEPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>>
    }

    /**
     * Set table rules
     */
    public void setTableRules() {
        personer_table.getTableHeader().setReorderingAllowed(false);

    }
    
    /**
     * Get personer and set them to the table model
     * @param ignoreError 
     */
    private void hentPersoner(boolean ignoreError) {
        String value = person_textField.getText();
        ArrayList<Person> personer;
        if (!value.isEmpty()) {
            personer = sLEPHandler.getPersonV2(value);



            if (!personer.isEmpty()) {
                personer_table.setEnabled(true);
                DefaultTableModel dtm = new DefaultTableModel();
                for (String s : columnNames) {
                    dtm.addColumn(s);
                }

                for (Person p : personer) {
                    String[] a = {p.getCpr(), p.getFornavn(), p.getMellemnavn(), p.getEfternavn()};
                    dtm.addRow(a);
                }
                personer_table.setModel(dtm);
            } else {
                DefaultTableModel dtm = new DefaultTableModel();
                for (String s : columnNames) {
                    dtm.addColumn(s);

                }
                personer_table.setModel(dtm);
                if (!ignoreError) {
                    JOptionPane.showMessageDialog(this, "Personen blev ikke fundet\nHar du tastet rigtigt?", "Fejl", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        else{
            personer = sLEPHandler.getAllePersoner();
            personer_table.setEnabled(true);
                DefaultTableModel dtm = new DefaultTableModel();
                for (String s : columnNames) {
                    dtm.addColumn(s);
                }

                for (Person p : personer) {
                    String[] a = {p.getCpr(), p.getFornavn(), p.getMellemnavn(), p.getEfternavn()};
                    dtm.addRow(a);
                }
                personer_table.setModel(dtm);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_pane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        person_textField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        personer_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        hentPersoner_button = new javax.swing.JButton();
        luk_button = new javax.swing.JButton();
        sletPerson_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CPR");

        person_textField.setToolTipText("CPR skal være på 10 tegn");
        person_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                person_textFieldActionPerformed(evt);
            }
        });
        person_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                person_textFieldKeyReleased(evt);
            }
        });

        personer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        personer_table.setEnabled(false);
        personer_table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                personer_tableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(personer_table);

        jLabel2.setText("Personer");

        hentPersoner_button.setText("Find person");
        hentPersoner_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hentPersoner_buttonActionPerformed(evt);
            }
        });

        luk_button.setText("Luk");
        luk_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luk_buttonActionPerformed(evt);
            }
        });

        sletPerson_button.setText("Slet person");
        sletPerson_button.setEnabled(false);
        sletPerson_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sletPerson_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_paneLayout = new javax.swing.GroupLayout(main_pane);
        main_pane.setLayout(main_paneLayout);
        main_paneLayout.setHorizontalGroup(
            main_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_paneLayout.createSequentialGroup()
                        .addComponent(luk_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sletPerson_button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(main_paneLayout.createSequentialGroup()
                        .addComponent(person_textField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hentPersoner_button))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addContainerGap())
        );
        main_paneLayout.setVerticalGroup(
            main_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(person_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hentPersoner_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_paneLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 206, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sletPerson_button)
                    .addComponent(luk_button))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void person_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_person_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_person_textFieldActionPerformed

    private void person_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_person_textFieldKeyReleased
    }//GEN-LAST:event_person_textFieldKeyReleased

    private void personer_tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_personer_tableFocusGained
        sletPerson_button.setEnabled(true);
    }//GEN-LAST:event_personer_tableFocusGained

    private void hentPersoner_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hentPersoner_buttonActionPerformed
        hentPersoner(false);
    }//GEN-LAST:event_hentPersoner_buttonActionPerformed

    private void luk_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luk_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_luk_buttonActionPerformed

    private void sletPerson_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sletPerson_buttonActionPerformed
        int selection = personer_table.getSelectedRow();
        String value = person_textField.getText();
        ArrayList<Person> personer = sLEPHandler.getPersonV2(value);

        Person toDelete = personer.get(selection);

        int n = JOptionPane.showConfirmDialog(this, "Er du sikker på du vil slette den valgte person?\nADVARSEL, denne handling kan ikke gøres om!", "Slet person?", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            if (sLEPHandler.sletPerson(toDelete)) {
                hentPersoner(true);
                JOptionPane.showMessageDialog(this, "Personen blev slettet!", "Slettet!", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Du skal slette alle personens sager før du kan slette personen", "Fejl", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_sletPerson_buttonActionPerformed
    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(SLEPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SLEPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SLEPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SLEPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                SLEPGUI dialog = new SLEPGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton hentPersoner_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton luk_button;
    private javax.swing.JPanel main_pane;
    private javax.swing.JTextField person_textField;
    private javax.swing.JTable personer_table;
    private javax.swing.JButton sletPerson_button;
    // End of variables declaration//GEN-END:variables
}
