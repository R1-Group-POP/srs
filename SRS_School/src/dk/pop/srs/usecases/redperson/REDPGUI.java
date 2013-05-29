/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.usecases.redperson;

import dk.pop.srs.person.Person;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class REDPGUI extends javax.swing.JDialog {

    /**
     * Creates new form REDPGUI
     */
    
    private REDPHandler rEDPHandler;
    
    public REDPGUI(java.awt.Frame parent, boolean modal, REDPHandler rEDPHandler) {
        super(parent, modal);
        this.rEDPHandler = rEDPHandler;
        setLookAndFeel();
        initComponents();
        setFrame();
    }
    
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
            java.util.logging.Logger.getLogger(REDPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REDPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REDPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REDPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>>
    }

    private void setFrame() {
        setLocationRelativeTo(null);
    }

    public String removeLetters(String text) {
        return text.replaceAll("[^0-9]", "");
    }
    private void resetFields(){
        sog_TextField.setText("");
        fornavn_TextField.setText("");
        mellemnavn_TextField.setText("");
        efternavn_TextField.setText("");
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
        sog_TextField = new javax.swing.JTextField();
        findPerson_JButton = new javax.swing.JButton();
        fornavn_TextField = new javax.swing.JTextField();
        mellemnavn_TextField = new javax.swing.JTextField();
        efternavn_TextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        luk_JButton = new javax.swing.JButton();
        rediger_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("CPR");

        sog_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sog_TextFieldActionPerformed(evt);
            }
        });
        sog_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sog_TextFieldKeyReleased(evt);
            }
        });

        findPerson_JButton.setText("Find person");
        findPerson_JButton.setEnabled(false);
        findPerson_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findPerson_JButtonActionPerformed(evt);
            }
        });

        fornavn_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornavn_TextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Fornavn");

        jLabel3.setText("Mellemnavn");

        jLabel4.setText("Efternavn");

        luk_JButton.setText("Luk");
        luk_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luk_JButtonActionPerformed(evt);
            }
        });

        rediger_JButton.setText("Rediger");
        rediger_JButton.setEnabled(false);
        rediger_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rediger_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sog_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findPerson_JButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(efternavn_TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(mellemnavn_TextField)
                                    .addComponent(fornavn_TextField)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(luk_JButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rediger_JButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sog_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findPerson_JButton))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornavn_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mellemnavn_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(efternavn_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luk_JButton)
                    .addComponent(rediger_JButton))
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

    private void sog_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sog_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sog_TextFieldActionPerformed

    private void fornavn_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornavn_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornavn_TextFieldActionPerformed

    private void luk_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luk_JButtonActionPerformed
        this.dispose();
        resetFields();
    }//GEN-LAST:event_luk_JButtonActionPerformed

    private void findPerson_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findPerson_JButtonActionPerformed
        
        if(rEDPHandler.checkPersonExists(sog_TextField.getText())) {
                    
        Person p = rEDPHandler.getPerson(sog_TextField.getText());
        fornavn_TextField.setText(p.getFornavn());
        mellemnavn_TextField.setText(p.getMellemnavn());
        efternavn_TextField.setText(p.getEfternavn());
        rediger_JButton.setEnabled(true);
        }
        else {
            JOptionPane.showMessageDialog(this, "CPR nummeret blev ikke fundet\nHar du tastet rigtigt?", "Fejl", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_findPerson_JButtonActionPerformed

    private void sog_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sog_TextFieldKeyReleased
        sog_TextField.setText(removeLetters(sog_TextField.getText()));

        if (sog_TextField.getText().length() == 10) {
            findPerson_JButton.setEnabled(true);
        }
        else {
            findPerson_JButton.setEnabled(false);
        }
    }//GEN-LAST:event_sog_TextFieldKeyReleased

    private void rediger_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rediger_JButtonActionPerformed
        rEDPHandler.redigerPerson(sog_TextField.getText(), fornavn_TextField.getText(), mellemnavn_TextField.getText(), efternavn_TextField.getText());
        resetFields();
        JOptionPane.showMessageDialog(this, "Personen blev redigeret!", "Succes!", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_rediger_JButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(REDPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(REDPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(REDPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(REDPGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                REDPGUI dialog = new REDPGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField efternavn_TextField;
    private javax.swing.JButton findPerson_JButton;
    private javax.swing.JTextField fornavn_TextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton luk_JButton;
    private javax.swing.JTextField mellemnavn_TextField;
    private javax.swing.JButton rediger_JButton;
    private javax.swing.JTextField sog_TextField;
    // End of variables declaration//GEN-END:variables
}
