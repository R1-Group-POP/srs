/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs;

import dk.pop.srs.usecases.redsag.REDHSGUI;
import dk.pop.srs.usecases.regsag.REGGUI;
import dk.pop.srs.sag.Sag;
import dk.pop.srs.usecases.redperson.REDPGUI;
import dk.pop.srs.usecases.slebetaler.SLEBGUI;
import dk.pop.srs.usecases.sleperson.SLEPGUI;
import dk.pop.srs.usecases.sleperson.SLEPHandler;
import dk.pop.srs.usecases.slesag.SLEGUI;
import dk.pop.srs.usecases.sogning.SOGNINGSHandler;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oliverbærbar
 */
public class HovedGUI extends javax.swing.JFrame {

    private ButtonGroup category_Bg;
    private REGGUI rEGSGUI;
    private SLEGUI sLEGUI;
    private REDHSGUI rEDHSGUI;
    private SLEPGUI sLEPGUI;
    private SOGNINGSHandler sOGNINGSHandler;
    private REDPGUI rEDPGUI;
    private SLEBGUI sLEBGUI;
    private String[] columnNames = {"CPR", "Sagssted", "Paragraf", "Foranstaltningsnavn", "Beskrivelse", "PeriodeFra", "PeriodeTil", "AER", "Sagstype", "BetalingCPR", "BetalingBeløb"};

    /**
     * Constructor
     *
     * @param rEGSGUI
     * @param sLEGUI
     * @param rEDHSGUI
     * @param sOGNINGSHandler
     * @param sLEPGUI
     */
    public HovedGUI(REGGUI rEGSGUI, SLEGUI sLEGUI, REDHSGUI rEDHSGUI, SOGNINGSHandler sOGNINGSHandler, SLEPGUI sLEPGUI, REDPGUI rEDPGUI, SLEBGUI sLEBGUI) {
        this.rEGSGUI = rEGSGUI;
        this.sLEGUI = sLEGUI;
        this.rEDHSGUI = rEDHSGUI;
        this.sLEPGUI = sLEPGUI;
        this.sOGNINGSHandler = sOGNINGSHandler;
        this.rEDPGUI = rEDPGUI;
        this.sLEBGUI = sLEBGUI;
        setLookAndFeel();
        initComponents();
        setFrame();
        setRadioButtonGroups();
        setTableRules();
    }

    /**
     * Set look and feel on the jDialog
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
     * Set location to middle of screen on the jDialog
     */
    private void setFrame() {
        setLocationRelativeTo(null);
    }

    /**
     * Create radio button groups
     */
    public void setRadioButtonGroups() {
        category_Bg = new ButtonGroup();
        category_Bg.add(cpr_radioButton);
        category_Bg.add(funktion_radioButton);
        category_Bg.add(paragraf_radioButton);
        category_Bg.add(sagstype_radioButton);
    }

    /**
     * Remove everything except 0-9 and return the new string
     *
     * @param text
     * @return
     */
    public String removeLetters(String text) {
        return text.replaceAll("[^0-9]", "");
    }

    /**
     * Remove everything except 0-9 ", and ." and return new string
     *
     * @param text
     * @return
     */
    public String removeLettersV2(String text) {
        return text.replaceAll("[^0-9.,]", "");
    }

    /**
     * Set the table rules
     */
    public void setTableRules() {
        sager_table.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        default_pane = new javax.swing.JPanel();
        search_pane = new javax.swing.JPanel();
        sog_textField = new javax.swing.JTextField();
        sogEfterSager_button = new javax.swing.JButton();
        ui90d_checkBox = new javax.swing.JCheckBox();
        cpr_radioButton = new javax.swing.JRadioButton();
        paragraf_radioButton = new javax.swing.JRadioButton();
        funktion_radioButton = new javax.swing.JRadioButton();
        sagstype_radioButton = new javax.swing.JRadioButton();
        s1_seperator = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        sager_scrollPane = new javax.swing.JScrollPane();
        sager_table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jLabel3 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        default_menuBar = new javax.swing.JMenuBar();
        filer_menu = new javax.swing.JMenu();
        print_menuItem = new javax.swing.JMenuItem();
        logOversigt_menuItem = new javax.swing.JMenuItem();
        luk_menuitem = new javax.swing.JMenuItem();
        administrer_menu = new javax.swing.JMenu();
        sager_menu = new javax.swing.JMenu();
        registrerSag_menuItem = new javax.swing.JMenuItem();
        redigerSag_menuItem = new javax.swing.JMenuItem();
        sletSag_menuItem = new javax.swing.JMenuItem();
        personer_menu = new javax.swing.JMenu();
        redigerPerson_menuItem = new javax.swing.JMenuItem();
        sletPerson_menuItem = new javax.swing.JMenuItem();
        betalere_menu = new javax.swing.JMenu();
        sletBetaler_menuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SRS - Sagsregistreringssystem");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        default_pane.setBackground(new java.awt.Color(255, 255, 255));

        search_pane.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        sog_textField.setToolTipText("Hvis du ikke skriver noget i søgefeltet, vil alle sager blive hentet");
        sog_textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sog_textFieldFocusGained(evt);
            }
        });
        sog_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sog_textFieldKeyReleased(evt);
            }
        });

        sogEfterSager_button.setText("Søg efter sager");
        sogEfterSager_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sogEfterSager_buttonActionPerformed(evt);
            }
        });

        ui90d_checkBox.setText("Søg kun på sager der udløber indenfor 90 dage");

        cpr_radioButton.setSelected(true);
        cpr_radioButton.setText("CPR");
        cpr_radioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cpr_radioButtonItemStateChanged(evt);
            }
        });
        cpr_radioButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cpr_radioButtonPropertyChange(evt);
            }
        });

        paragraf_radioButton.setText("Paragraf");
        paragraf_radioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paragraf_radioButtonItemStateChanged(evt);
            }
        });
        paragraf_radioButton.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                paragraf_radioButtonPropertyChange(evt);
            }
        });

        funktion_radioButton.setText("Funktion");
        funktion_radioButton.setToolTipText("Denne kategori er ikke tilgængelig");
        funktion_radioButton.setEnabled(false);
        funktion_radioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                funktion_radioButtonItemStateChanged(evt);
            }
        });

        sagstype_radioButton.setText("Sagstype");
        sagstype_radioButton.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sagstype_radioButtonItemStateChanged(evt);
            }
        });

        s1_seperator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel1.setText("Søge kategori:");

        sager_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        sager_table.setEnabled(false);
        sager_scrollPane.setViewportView(sager_table);

        javax.swing.GroupLayout search_paneLayout = new javax.swing.GroupLayout(search_pane);
        search_pane.setLayout(search_paneLayout);
        search_paneLayout.setHorizontalGroup(
            search_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sager_scrollPane)
                    .addGroup(search_paneLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpr_radioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paragraf_radioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(funktion_radioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sagstype_radioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(s1_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ui90d_checkBox)
                        .addGap(0, 256, Short.MAX_VALUE))
                    .addGroup(search_paneLayout.createSequentialGroup()
                        .addComponent(sog_textField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sogEfterSager_button)))
                .addContainerGap())
        );
        search_paneLayout.setVerticalGroup(
            search_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(search_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(search_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sog_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sogEfterSager_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(search_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(search_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpr_radioButton)
                        .addComponent(paragraf_radioButton)
                        .addComponent(funktion_radioButton)
                        .addComponent(sagstype_radioButton)
                        .addComponent(jLabel1))
                    .addComponent(s1_seperator, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ui90d_checkBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sager_scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jPanel1.add(filler1);

        jLabel3.setText("Copyright SRS | School projekt group: Patrick kann, Oliver Korfitsen, Patrick Knappmann");
        jPanel1.add(jLabel3);
        jPanel1.add(filler2);

        javax.swing.GroupLayout default_paneLayout = new javax.swing.GroupLayout(default_pane);
        default_pane.setLayout(default_paneLayout);
        default_paneLayout.setHorizontalGroup(
            default_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(default_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(default_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        default_paneLayout.setVerticalGroup(
            default_paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(default_paneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(search_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        filer_menu.setText("Filer");

        print_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        print_menuItem.setText("Print");
        print_menuItem.setEnabled(false);
        filer_menu.add(print_menuItem);

        logOversigt_menuItem.setText("Log oversigt");
        logOversigt_menuItem.setEnabled(false);
        filer_menu.add(logOversigt_menuItem);

        luk_menuitem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        luk_menuitem.setText("Luk");
        luk_menuitem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luk_menuitemActionPerformed(evt);
            }
        });
        filer_menu.add(luk_menuitem);

        default_menuBar.add(filer_menu);

        administrer_menu.setText("Administrer");

        sager_menu.setText("Sager");

        registrerSag_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        registrerSag_menuItem.setText("Registrer sag");
        registrerSag_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrerSag_menuItemActionPerformed(evt);
            }
        });
        sager_menu.add(registrerSag_menuItem);

        redigerSag_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        redigerSag_menuItem.setText("Rediger sag");
        redigerSag_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigerSag_menuItemActionPerformed(evt);
            }
        });
        sager_menu.add(redigerSag_menuItem);

        sletSag_menuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        sletSag_menuItem.setText("Slet Sag");
        sletSag_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sletSag_menuItemActionPerformed(evt);
            }
        });
        sager_menu.add(sletSag_menuItem);

        administrer_menu.add(sager_menu);

        personer_menu.setText("Personer");

        redigerPerson_menuItem.setText("Rediger person");
        redigerPerson_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redigerPerson_menuItemActionPerformed(evt);
            }
        });
        personer_menu.add(redigerPerson_menuItem);

        sletPerson_menuItem.setText("Slet person");
        sletPerson_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sletPerson_menuItemActionPerformed(evt);
            }
        });
        personer_menu.add(sletPerson_menuItem);

        administrer_menu.add(personer_menu);

        betalere_menu.setText("Betalere");

        sletBetaler_menuItem.setText("Slet betaler");
        sletBetaler_menuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sletBetaler_menuItemActionPerformed(evt);
            }
        });
        betalere_menu.add(sletBetaler_menuItem);

        administrer_menu.add(betalere_menu);

        default_menuBar.add(administrer_menu);

        setJMenuBar(default_menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(default_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(default_pane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrerSag_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrerSag_menuItemActionPerformed
        rEGSGUI.setVisible(true);
    }//GEN-LAST:event_registrerSag_menuItemActionPerformed

    private void sog_textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sog_textFieldFocusGained
    }//GEN-LAST:event_sog_textFieldFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void luk_menuitemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luk_menuitemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_luk_menuitemActionPerformed

    private void sogEfterSager_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sogEfterSager_buttonActionPerformed
        boolean cprSearch = cpr_radioButton.isSelected();
        boolean paragrafSearch = paragraf_radioButton.isSelected();
        boolean funktionSearch = funktion_radioButton.isSelected();
        boolean sagsTypeSearch = sagstype_radioButton.isSelected();

        if (!sog_textField.getText().isEmpty()) {

            //CPR
            if (cprSearch) {
                try {
                    ArrayList<Sag> sager = sOGNINGSHandler.sogCPR(sog_textField.getText().replace("-", ""), ui90d_checkBox.isSelected());
                    if (sager != null) {
                        DefaultTableModel dtm = new DefaultTableModel();
                        for (String s : columnNames) {
                            dtm.addColumn(s);
                        }

                        for (Sag s : sager) {
                            String sagstype = null;
                            String aer = null;

                            switch (s.getAer()) {
                                case 0:
                                    aer = "Nej";
                                    break;
                                case 1:
                                    aer = "Ja";
                                    break;
                            }
                            switch (s.getSagstype()) {
                                case 1:
                                    sagstype = "Socialsag";
                                    break;
                                case 2:
                                    sagstype = "Handicapsag";
                                    break;
                                case 3:
                                    sagstype = "Flygtningerefusion";
                                    break;
                                case 4:
                                    sagstype = "Mellemkommunal";
                                    break;
                            }

                            String[] a = {s.getPerson().getCpr(), s.getSagsSted(), s.getParagraf(), s.getForanstaltningsnavn(), s.getBeskrivelse(), String.valueOf(s.getPeriodeFra()), String.valueOf(s.getPeriodeTil()), aer, sagstype, s.getBetaler().getBetalingCPR(), String.valueOf(s.getBetalingBelob())};
                            dtm.addRow(a);
                        }
                        sager_table.setModel(dtm);
                    } else {
                        DefaultTableModel dtm = new DefaultTableModel();
                        sager_table.setModel(dtm);
                    }
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
            }

            //Paragraf
            if (paragrafSearch) {
                ArrayList<Sag> sager = sOGNINGSHandler.sogParagraf(sog_textField.getText(), ui90d_checkBox.isSelected());
                if (sager != null) {
                    DefaultTableModel dtm = new DefaultTableModel();
                    for (String s : columnNames) {
                        dtm.addColumn(s);
                    }

                    for (Sag s : sager) {
                        String sagstype = null;
                        String aer = null;

                        switch (s.getAer()) {
                            case 0:
                                aer = "Nej";
                                break;
                            case 1:
                                aer = "Ja";
                                break;
                        }
                        switch (s.getSagstype()) {
                            case 1:
                                sagstype = "Socialsag";
                                break;
                            case 2:
                                sagstype = "Handicapsag";
                                break;
                            case 3:
                                sagstype = "Flygtningerefusion";
                                break;
                            case 4:
                                sagstype = "Mellemkommunal";
                                break;
                        }

                        String[] a = {s.getPerson().getCpr(), s.getSagsSted(), s.getParagraf(), s.getForanstaltningsnavn(), s.getBeskrivelse(), String.valueOf(s.getPeriodeFra()), String.valueOf(s.getPeriodeTil()), aer, sagstype, s.getBetaler().getBetalingCPR(), String.valueOf(s.getBetalingBelob())};
                        dtm.addRow(a);
                    }
                    sager_table.setModel(dtm);
                } else {
                    DefaultTableModel dtm = new DefaultTableModel();
                    sager_table.setModel(dtm);
                }
            }

            //Funktion
            /**
             * Disabled*
             */
            //SagsType
            if (sagsTypeSearch) {
                ArrayList<Sag> sager = sOGNINGSHandler.sogSagstype(sog_textField.getText(), ui90d_checkBox.isSelected());
                if (sager != null) {
                    DefaultTableModel dtm = new DefaultTableModel();
                    for (String s : columnNames) {
                        dtm.addColumn(s);
                    }

                    for (Sag s : sager) {
                        String sagstype = null;
                        String aer = null;

                        switch (s.getAer()) {
                            case 0:
                                aer = "Nej";
                                break;
                            case 1:
                                aer = "Ja";
                                break;
                        }
                        switch (s.getSagstype()) {
                            case 1:
                                sagstype = "Socialsag";
                                break;
                            case 2:
                                sagstype = "Handicapsag";
                                break;
                            case 3:
                                sagstype = "Flygtningerefusion";
                                break;
                            case 4:
                                sagstype = "Mellemkommunal";
                                break;
                        }

                        String[] a = {s.getPerson().getCpr(), s.getSagsSted(), s.getParagraf(), s.getForanstaltningsnavn(), s.getBeskrivelse(), String.valueOf(s.getPeriodeFra()), String.valueOf(s.getPeriodeTil()), aer, sagstype, s.getBetaler().getBetalingCPR(), String.valueOf(s.getBetalingBelob())};
                        dtm.addRow(a);
                    }
                    sager_table.setModel(dtm);
                } else {
                    DefaultTableModel dtm = new DefaultTableModel();
                    sager_table.setModel(dtm);
                }
            }

        } else {
            try {
                ArrayList<Sag> sager = sOGNINGSHandler.getAlleSager(ui90d_checkBox.isSelected());
                if (sager != null) {
                    DefaultTableModel dtm = new DefaultTableModel();
                    for (String s : columnNames) {
                        dtm.addColumn(s);
                    }
                    for (Sag s : sager) {
                        String sagstype = null;
                        String aer = null;

                        switch (s.getAer()) {
                            case 0:
                                aer = "Nej";
                                break;
                            case 1:
                                aer = "Ja";
                                break;
                        }
                        switch (s.getSagstype()) {
                            case 1:
                                sagstype = "Socialsag";
                                break;
                            case 2:
                                sagstype = "Handicapsag";
                                break;
                            case 3:
                                sagstype = "Flygtningerefusion";
                                break;
                            case 4:
                                sagstype = "Mellemkommunal";
                                break;
                        }

                        String[] a = {s.getPerson().getCpr(), s.getSagsSted(), s.getParagraf(), s.getForanstaltningsnavn(), s.getBeskrivelse(), String.valueOf(s.getPeriodeFra()), String.valueOf(s.getPeriodeTil()), aer, sagstype, s.getBetaler().getBetalingCPR(), String.valueOf(s.getBetalingBelob())};
                        dtm.addRow(a);
                    }
                    sager_table.setModel(dtm);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Søgefeltet kan kun indeholde tal nå der søges efter et cpr nummer", "Fejl", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_sogEfterSager_buttonActionPerformed

    private void sletSag_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sletSag_menuItemActionPerformed
        sLEGUI.setVisible(true);
    }//GEN-LAST:event_sletSag_menuItemActionPerformed

    private void sog_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sog_textFieldKeyReleased
        boolean cprSearch = cpr_radioButton.isSelected();
        boolean paragrafSearch = paragraf_radioButton.isSelected();
        boolean funktionSearch = funktion_radioButton.isSelected();
        boolean sagsTypeSearch = sagstype_radioButton.isSelected();

        if (cprSearch) {
            sog_textField.setText(removeLetters(sog_textField.getText()));
        }
    }//GEN-LAST:event_sog_textFieldKeyReleased

    private void cpr_radioButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cpr_radioButtonPropertyChange
    }//GEN-LAST:event_cpr_radioButtonPropertyChange

    private void paragraf_radioButtonPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_paragraf_radioButtonPropertyChange
    }//GEN-LAST:event_paragraf_radioButtonPropertyChange

    private void paragraf_radioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paragraf_radioButtonItemStateChanged
        sog_textField.setText("");
    }//GEN-LAST:event_paragraf_radioButtonItemStateChanged

    private void cpr_radioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cpr_radioButtonItemStateChanged
        sog_textField.setText("");
    }//GEN-LAST:event_cpr_radioButtonItemStateChanged

    private void funktion_radioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_funktion_radioButtonItemStateChanged
        sog_textField.setText("");
    }//GEN-LAST:event_funktion_radioButtonItemStateChanged

    private void sagstype_radioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sagstype_radioButtonItemStateChanged
        sog_textField.setText("");
    }//GEN-LAST:event_sagstype_radioButtonItemStateChanged

    private void redigerSag_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigerSag_menuItemActionPerformed
        rEDHSGUI.setVisible(true);
    }//GEN-LAST:event_redigerSag_menuItemActionPerformed

    private void sletPerson_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sletPerson_menuItemActionPerformed
        sLEPGUI.setVisible(true);
    }//GEN-LAST:event_sletPerson_menuItemActionPerformed

    private void redigerPerson_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redigerPerson_menuItemActionPerformed
        rEDPGUI.setVisible(true);
    }//GEN-LAST:event_redigerPerson_menuItemActionPerformed

    private void sletBetaler_menuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sletBetaler_menuItemActionPerformed
        sLEBGUI.setVisible(true);
    }//GEN-LAST:event_sletBetaler_menuItemActionPerformed
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
//            java.util.logging.Logger.getLogger(HovedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HovedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HovedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HovedGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HovedGUI().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu administrer_menu;
    private javax.swing.JMenu betalere_menu;
    private javax.swing.JRadioButton cpr_radioButton;
    private javax.swing.JMenuBar default_menuBar;
    private javax.swing.JPanel default_pane;
    private javax.swing.JMenu filer_menu;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JRadioButton funktion_radioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logOversigt_menuItem;
    private javax.swing.JMenuItem luk_menuitem;
    private javax.swing.JRadioButton paragraf_radioButton;
    private javax.swing.JMenu personer_menu;
    private javax.swing.JMenuItem print_menuItem;
    private javax.swing.JMenuItem redigerPerson_menuItem;
    private javax.swing.JMenuItem redigerSag_menuItem;
    private javax.swing.JMenuItem registrerSag_menuItem;
    private javax.swing.JSeparator s1_seperator;
    private javax.swing.JMenu sager_menu;
    private javax.swing.JScrollPane sager_scrollPane;
    private javax.swing.JTable sager_table;
    private javax.swing.JRadioButton sagstype_radioButton;
    private javax.swing.JPanel search_pane;
    private javax.swing.JMenuItem sletBetaler_menuItem;
    private javax.swing.JMenuItem sletPerson_menuItem;
    private javax.swing.JMenuItem sletSag_menuItem;
    private javax.swing.JButton sogEfterSager_button;
    private javax.swing.JTextField sog_textField;
    private javax.swing.JCheckBox ui90d_checkBox;
    // End of variables declaration//GEN-END:variables
}
