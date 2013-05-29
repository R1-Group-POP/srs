/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.pop.srs.usecases.regsag;

import dk.pop.srs.exception.MonthException;
import dk.pop.srs.HovedGUI;
import dk.pop.srs.betaler.Betaler;
import dk.pop.srs.person.Person;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Oliverbærbar
 */
public class REGGUI extends javax.swing.JDialog {

    private REGHandler rEGSHandler;
    private ButtonGroup aer_Bg;
    private ButtonGroup sagsType_Bg;

    /**
     * Constructor
     * @param parent
     * @param modal
     * @param rEGSHandler 
     */
    public REGGUI(java.awt.Frame parent, boolean modal, REGHandler rEGSHandler) {
        super(parent, modal);
        this.rEGSHandler = rEGSHandler;
        setLookAndFeel();
        initComponents();
        setFrame();
        setRadioButtonGroups();
    }

    /**
     * Set look and field
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
     * Set jDialog location to middle of the screen
     */
    private void setFrame() {
        setLocationRelativeTo(null);
    }

    /**
     * Creates radio button groups
     */
    private void setRadioButtonGroups() {
        aer_Bg = new ButtonGroup();
        aer_Bg.add(aerJa_radioButton);
        aer_Bg.add(aerNej_radioButton);

        sagsType_Bg = new ButtonGroup();
        sagsType_Bg.add(sagstypeSocialsag_radioButton);
        sagsType_Bg.add(sagstypeHandicapsag_radioButton);
        sagsType_Bg.add(sagstypeFlygtningerefusion_radioButton);
        sagsType_Bg.add(sagstypeMellmkommunal_radioButton);
    }

    /**
     * Resets gui fields
     */
    public void resetFields() {
        cpr_textField.setText("");
        sagssted_textField.setText("");
        fornavn_textField.setForeground(new Color(153, 153, 153));
        fornavn_textField.setText("Fornavn");
        mellemnavn_textField.setForeground(new Color(153, 153, 153));
        mellemnavn_textField.setText("Mellemnavn");
        efternavn_textField.setForeground(new Color(153, 153, 153));
        efternavn_textField.setText("Efternavn");
        paragraf_textField.setForeground(new Color(153, 153, 153));
        paragraf_textField.setText("§");
        foranstaltningsnavn_textField.setText("");
        beskrivelse_textArea.setText("");
        periodeFra_textField.setForeground(new Color(153, 153, 153));
        periodeFra_textField.setText("Fra");
        periodeTil_textField.setForeground(new Color(153, 153, 153));
        periodeTil_textField.setText("Til");
        aerJa_radioButton.setSelected(false);
        aerNej_radioButton.setSelected(true);
        sagstypeSocialsag_radioButton.setSelected(true);
        sagstypeHandicapsag_radioButton.setSelected(false);
        sagstypeFlygtningerefusion_radioButton.setSelected(false);
        sagstypeMellmkommunal_radioButton.setSelected(false);
        betalingNavn_textField.setText("");
        betalingBelob_textField.setText("");
        betalingCPR_textField.setText("");
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
     * Checks if the periode is valid.
     * A month cant be below 1 and above 12.
     * The periodeFra cant be higher than periodeTil
     * @param periodeFra
     * @param periodeTil
     * @return
     * @throws MonthException 
     */
    public boolean tjekPeriode(int periodeFra, int periodeTil) throws MonthException {
        if (periodeFra < 1 || periodeFra > 12 || periodeTil < 1 || periodeTil > 12) {
            throw new MonthException();
        } else {
            if (periodeFra > periodeTil) {
                throw new MonthException();
            } else {
                return true;
            }
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sagssted_textField = new javax.swing.JTextField();
        fornavn_textField = new javax.swing.JTextField();
        mellemnavn_textField = new javax.swing.JTextField();
        efternavn_textField = new javax.swing.JTextField();
        paragraf_textField = new javax.swing.JTextField();
        foranstaltningsnavn_textField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        beskrivelse_textArea = new javax.swing.JTextArea();
        periodeFra_textField = new javax.swing.JTextField();
        periodeTil_textField = new javax.swing.JTextField();
        annuller_Button = new javax.swing.JButton();
        registrer_button = new javax.swing.JButton();
        aerJa_radioButton = new javax.swing.JRadioButton();
        aerNej_radioButton = new javax.swing.JRadioButton();
        sagstypeSocialsag_radioButton = new javax.swing.JRadioButton();
        sagstypeHandicapsag_radioButton = new javax.swing.JRadioButton();
        sagstypeFlygtningerefusion_radioButton = new javax.swing.JRadioButton();
        sagstypeMellmkommunal_radioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        betalingNavn_textField = new javax.swing.JTextField();
        betalingCPR_textField = new javax.swing.JTextField();
        betalingBelob_textField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cpr_textField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrer sag");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Sagssted");

        jLabel2.setText("Personens navn");

        jLabel3.setText("Servicelovens");

        jLabel4.setText("Foranstaltningsnavn");

        jLabel5.setText("Beskrivelse af bevilling");

        jLabel6.setText("Periode (MM)");

        jLabel7.setText("Afventer elektronisk regning");

        jLabel9.setText("Sagstype");

        sagssted_textField.setToolTipText("Sagssted");
        sagssted_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sagssted_textFieldActionPerformed(evt);
            }
        });

        fornavn_textField.setForeground(new java.awt.Color(153, 153, 153));
        fornavn_textField.setText("Fornavn");
        fornavn_textField.setToolTipText("Fornavn");
        fornavn_textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fornavn_textFieldFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                fornavn_textFieldFocusGained(evt);
            }
        });

        mellemnavn_textField.setForeground(new java.awt.Color(153, 153, 153));
        mellemnavn_textField.setText("Mellemnavn");
        mellemnavn_textField.setToolTipText("Mellemnavn");
        mellemnavn_textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mellemnavn_textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mellemnavn_textFieldFocusLost(evt);
            }
        });

        efternavn_textField.setForeground(new java.awt.Color(153, 153, 153));
        efternavn_textField.setText("Efternavn");
        efternavn_textField.setToolTipText("Efternavn");
        efternavn_textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                efternavn_textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                efternavn_textFieldFocusLost(evt);
            }
        });

        paragraf_textField.setForeground(new java.awt.Color(153, 153, 153));
        paragraf_textField.setText("§");
        paragraf_textField.setToolTipText("Paragraf");
        paragraf_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paragraf_textFieldActionPerformed(evt);
            }
        });
        paragraf_textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                paragraf_textFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                paragraf_textFieldFocusLost(evt);
            }
        });

        foranstaltningsnavn_textField.setToolTipText("Foranstaltningsnavn");

        beskrivelse_textArea.setColumns(20);
        beskrivelse_textArea.setRows(2);
        beskrivelse_textArea.setToolTipText("Beskrivelse af bevilling");
        jScrollPane1.setViewportView(beskrivelse_textArea);

        periodeFra_textField.setForeground(new java.awt.Color(153, 153, 153));
        periodeFra_textField.setText("Fra");
        periodeFra_textField.setToolTipText("Måned fra skal være i formatet MM");
        periodeFra_textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                periodeFra_textFieldFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                periodeFra_textFieldFocusGained(evt);
            }
        });
        periodeFra_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                periodeFra_textFieldKeyReleased(evt);
            }
        });

        periodeTil_textField.setForeground(new java.awt.Color(153, 153, 153));
        periodeTil_textField.setText("Til");
        periodeTil_textField.setToolTipText("Måned til skal være i formatet MM");
        periodeTil_textField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                periodeTil_textFieldFocusLost(evt);
            }
            public void focusGained(java.awt.event.FocusEvent evt) {
                periodeTil_textFieldFocusGained(evt);
            }
        });
        periodeTil_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                periodeTil_textFieldKeyReleased(evt);
            }
        });

        annuller_Button.setText("Annuller");
        annuller_Button.setToolTipText("Annuller");
        annuller_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annuller_ButtonActionPerformed(evt);
            }
        });

        registrer_button.setText("Registrer");
        registrer_button.setToolTipText("Registrer sagen");
        registrer_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrer_buttonActionPerformed(evt);
            }
        });

        aerJa_radioButton.setText("Ja");
        aerJa_radioButton.setToolTipText("Afventer elektronisk regning: ja");
        aerJa_radioButton.setFocusable(false);
        aerJa_radioButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        aerJa_radioButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        aerNej_radioButton.setSelected(true);
        aerNej_radioButton.setText("Nej");
        aerNej_radioButton.setToolTipText("Afventer elektronisk regning: nej");
        aerNej_radioButton.setFocusable(false);
        aerNej_radioButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        aerNej_radioButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        sagstypeSocialsag_radioButton.setSelected(true);
        sagstypeSocialsag_radioButton.setText("Socialsag");
        sagstypeSocialsag_radioButton.setToolTipText("Sagstype: socialsag");
        sagstypeSocialsag_radioButton.setFocusable(false);
        sagstypeSocialsag_radioButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sagstypeSocialsag_radioButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        sagstypeHandicapsag_radioButton.setText("Handicapsag");
        sagstypeHandicapsag_radioButton.setToolTipText("Sagstype: handicapsag");
        sagstypeHandicapsag_radioButton.setFocusable(false);
        sagstypeHandicapsag_radioButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sagstypeHandicapsag_radioButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        sagstypeFlygtningerefusion_radioButton.setText("Flygtningerefusion");
        sagstypeFlygtningerefusion_radioButton.setToolTipText("Sagstype: flygtningerefusion");
        sagstypeFlygtningerefusion_radioButton.setFocusable(false);
        sagstypeFlygtningerefusion_radioButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sagstypeFlygtningerefusion_radioButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        sagstypeMellmkommunal_radioButton.setText("Mellemkommunal");
        sagstypeMellmkommunal_radioButton.setToolTipText("Sagstype: Mellemkommunal");
        sagstypeMellmkommunal_radioButton.setFocusable(false);
        sagstypeMellmkommunal_radioButton.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        sagstypeMellmkommunal_radioButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Betalings informationer"));

        betalingNavn_textField.setToolTipText("Betaler navn");

        betalingCPR_textField.setToolTipText("CPR skal være på 10 tegn. CVR skal være på 8 tegn");
        betalingCPR_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                betalingCPR_textFieldKeyReleased(evt);
            }
        });

        betalingBelob_textField.setToolTipText("Betaler beløb");
        betalingBelob_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                betalingBelob_textFieldActionPerformed(evt);
            }
        });
        betalingBelob_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                betalingBelob_textFieldKeyReleased(evt);
            }
        });

        jLabel11.setText("Beløb");

        jLabel10.setText("CPR/SE");

        jLabel8.setText("Navn");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addGap(89, 89, 89)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(betalingNavn_textField, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(betalingBelob_textField))
                    .addComponent(betalingCPR_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betalingCPR_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(betalingNavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(betalingBelob_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("CPR");

        cpr_textField.setToolTipText("CPR skal være på 10 tegn");
        cpr_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpr_textFieldActionPerformed(evt);
            }
        });
        cpr_textField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpr_textFieldKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpr_textFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(annuller_Button)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registrer_button))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sagssted_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cpr_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(paragraf_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(fornavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(mellemnavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(efternavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(aerJa_radioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(aerNej_radioButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(periodeFra_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(periodeTil_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foranstaltningsnavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(sagstypeSocialsag_radioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sagstypeHandicapsag_radioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sagstypeFlygtningerefusion_radioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sagstypeMellmkommunal_radioButton)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cpr_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sagssted_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fornavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mellemnavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(efternavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(paragraf_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(foranstaltningsnavn_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(periodeFra_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodeTil_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aerJa_radioButton)
                            .addComponent(aerNej_radioButton))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sagstypeHandicapsag_radioButton)
                            .addComponent(sagstypeSocialsag_radioButton)
                            .addComponent(sagstypeFlygtningerefusion_radioButton)
                            .addComponent(sagstypeMellmkommunal_radioButton)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annuller_Button)
                    .addComponent(registrer_button))
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

    private void paragraf_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paragraf_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paragraf_textFieldActionPerformed

    private void sagssted_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sagssted_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sagssted_textFieldActionPerformed

    private void registrer_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrer_buttonActionPerformed
        String cpr = cpr_textField.getText();

        if (!cpr.isEmpty()) {
            if (cpr.length() == 10) {
                
            } else {
                cpr = "";
            }
        }

        String sagssted = sagssted_textField.getText();
        String fornavn = fornavn_textField.getText();
        String mellemnavn = mellemnavn_textField.getText();
        String efternavn = efternavn_textField.getText();
        String paragraf = paragraf_textField.getText();
        String foranstaltningsnavn = foranstaltningsnavn_textField.getText();
        String beskrivelse = beskrivelse_textArea.getText();
        boolean periodeOK = true;

        String periodeFraString = periodeFra_textField.getText();
        String periodeTilString = periodeTil_textField.getText();
        int periodeFra = 0;
        int periodeTil = 0;

        if (!periodeFraString.isEmpty()) {
            if (periodeFraString.equalsIgnoreCase("FRA")) {
            } else {
                periodeFra = Integer.valueOf(periodeFra_textField.getText());
            }
        }

        if (!periodeTilString.isEmpty()) {
            if (periodeTilString.equalsIgnoreCase("TIL")) {
            } else {
                periodeTil = Integer.valueOf(periodeTil_textField.getText());
            }
        }

        try {
            tjekPeriode(periodeFra, periodeTil);
            periodeOK = true;
        } catch (MonthException ex) {
            periodeOK = false;
        }

        int aer = -1;

        if (aerJa_radioButton.isSelected()) {
            aer = 1;
        } else if (aerNej_radioButton.isSelected()) {
            aer = 0;
        }

        int sagstype = 0;

        if (sagstypeSocialsag_radioButton.isSelected()) {
            sagstype = 1;
        } else if (sagstypeHandicapsag_radioButton.isSelected()) {
            sagstype = 2;
        } else if (sagstypeFlygtningerefusion_radioButton.isSelected()) {
            sagstype = 3;
        } else if (sagstypeMellmkommunal_radioButton.isSelected()) {
            sagstype = 4;
        }

        String betalingNavn = betalingNavn_textField.getText();
        String betalingCPR = betalingCPR_textField.getText();
        String betalingBelobString = betalingBelob_textField.getText();
        double betalingBelob = 0;

        if (!betalingCPR.isEmpty()) {
            if (betalingCPR.length() == 8 || betalingCPR.length() == 10) {
                
            } else {
                betalingCPR = "";
            }
        }

        if (!betalingBelobString.isEmpty()) {
            betalingBelob = Double.valueOf(betalingBelob_textField.getText());
        }

//        System.out.println("CPR: " + cpr);
//        System.out.println("Sagssted: " + sagssted);
//        System.out.println("Fornavn: " + fornavn);
//        System.out.println("Mellemnavn: " + mellemnavn);
//        System.out.println("Efternavn: " + efternavn);
//        System.out.println("Paragraf: " + paragraf);
//        System.out.println("Foranstaltningsnavn: " + foranstaltningsnavn);
//        System.out.println("Beskrivelse: " + beskrivelse);
//        System.out.println("PeriodeFra: " + periodeFra);
//        System.out.println("PeriodeTil: " + periodeTil);
//        System.out.println("AER: " + aer);
//        System.out.println("Sagstype: " + sagstype);
//        System.out.println("BetalingNavn: " + betalingNavn);
//        System.out.println("BetalingCPR: " + betalingCPR);
//        System.out.println("BetalingBeløb: " + betalingBelob);

        if (cpr.isEmpty() || sagssted.isEmpty() || fornavn.isEmpty() || efternavn.isEmpty() || paragraf.isEmpty() || paragraf.equalsIgnoreCase("§") || foranstaltningsnavn.isEmpty() || beskrivelse.isEmpty() || periodeFra == 0 || periodeTil == 0 || aer == -1 || sagstype == 0 || betalingNavn.isEmpty() || betalingCPR.isEmpty() || betalingBelob == 0) {
            JOptionPane.showMessageDialog(this, "Der er sket en fejl, og en af følgende kan være årsagen:\n- Du har ikke udfyldt alle felter\n- CPR nummeret indeholder ikke 10 tegn\n- BetalingCPR indeholder ikke 10 eller 8 tegn", "Udfyldnings fejl", JOptionPane.ERROR_MESSAGE);
        } else {
            
            if (periodeOK) {
                if(mellemnavn.equalsIgnoreCase("MELLEMNAVN")) {
                    mellemnavn = "";
                }
                rEGSHandler.registrerSag(sagssted, fornavn, mellemnavn, efternavn, paragraf, foranstaltningsnavn, beskrivelse, periodeFra, periodeTil, aer, sagstype, betalingNavn, betalingCPR, betalingBelob, cpr);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Der er sket en fejl, og en af følgende kan være årsagen:\n- Den angivne måned findes ikke\n- Fra og Til er samme måned\n- Fra er større end Til", "Udfyldnings fejl", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_registrer_buttonActionPerformed

    private void annuller_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annuller_ButtonActionPerformed
        dispose();
        resetFields();
    }//GEN-LAST:event_annuller_ButtonActionPerformed

    private void cpr_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpr_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpr_textFieldActionPerformed

    private void cpr_textFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpr_textFieldKeyTyped
    }//GEN-LAST:event_cpr_textFieldKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        resetFields();
    }//GEN-LAST:event_formWindowClosed

    private void fornavn_textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fornavn_textFieldFocusGained
        if (fornavn_textField.getText().equalsIgnoreCase("FORNAVN")) {
            fornavn_textField.setForeground(new Color(0, 0, 0));
            fornavn_textField.setText("");
        }
    }//GEN-LAST:event_fornavn_textFieldFocusGained

    private void mellemnavn_textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mellemnavn_textFieldFocusGained
        if (mellemnavn_textField.getText().equalsIgnoreCase("MELLEMNAVN")) {
            mellemnavn_textField.setForeground(new Color(0, 0, 0));
            mellemnavn_textField.setText("");
        }
    }//GEN-LAST:event_mellemnavn_textFieldFocusGained

    private void efternavn_textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efternavn_textFieldFocusGained
        if (efternavn_textField.getText().equalsIgnoreCase("EFTERNAVN")) {
            efternavn_textField.setForeground(new Color(0, 0, 0));
            efternavn_textField.setText("");
        }
    }//GEN-LAST:event_efternavn_textFieldFocusGained

    private void paragraf_textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paragraf_textFieldFocusGained
        if (paragraf_textField.getText().equalsIgnoreCase("§")) {
            paragraf_textField.setForeground(new Color(0, 0, 0));
            paragraf_textField.setText("");
        }
    }//GEN-LAST:event_paragraf_textFieldFocusGained

    private void periodeFra_textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_periodeFra_textFieldFocusGained
        if (periodeFra_textField.getText().equalsIgnoreCase("FRA")) {
            periodeFra_textField.setForeground(new Color(0, 0, 0));
            periodeFra_textField.setText("");
        }
    }//GEN-LAST:event_periodeFra_textFieldFocusGained

    private void periodeTil_textFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_periodeTil_textFieldFocusGained
        if (periodeTil_textField.getText().equalsIgnoreCase("TIL")) {
            periodeTil_textField.setForeground(new Color(0, 0, 0));
            periodeTil_textField.setText("");
        }
    }//GEN-LAST:event_periodeTil_textFieldFocusGained

    private void cpr_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpr_textFieldKeyReleased

        cpr_textField.setText(removeLetters(cpr_textField.getText()));

        if (cpr_textField.getText().length() == 10) {
            Person p = rEGSHandler.getPerson(cpr_textField.getText());
            if (p != null) {
                String fornavn, mellemnavn, efternavn;
                fornavn = p.getFornavn();
                mellemnavn = p.getMellemnavn();
                efternavn = p.getEfternavn();
                fornavn_textField.setText(fornavn);
                fornavn_textField.setEnabled(false);
                fornavn_textField.setForeground(Color.black);
                mellemnavn_textField.setText(mellemnavn);
                mellemnavn_textField.setEnabled(false);
                mellemnavn_textField.setForeground(Color.BLACK);
                efternavn_textField.setText(efternavn);
                efternavn_textField.setEnabled(false);
                efternavn_textField.setForeground(Color.black);
            }
        } else {
            if (!fornavn_textField.isEnabled()) {
                fornavn_textField.setForeground(new Color(153, 153, 153));
                fornavn_textField.setText("Fornavn");
                fornavn_textField.setEnabled(true);
                mellemnavn_textField.setForeground(new Color(153, 153, 153));
                mellemnavn_textField.setText("mellemnavn");
                mellemnavn_textField.setEnabled(true);
                efternavn_textField.setForeground(new Color(153, 153, 153));
                efternavn_textField.setText("efternavn");
                efternavn_textField.setEnabled(true);
            }
        }

    }//GEN-LAST:event_cpr_textFieldKeyReleased

    private void betalingCPR_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_betalingCPR_textFieldKeyReleased

        betalingCPR_textField.setText(removeLetters(betalingCPR_textField.getText()));

        if (betalingCPR_textField.getText().length() == 8 || betalingCPR_textField.getText().length() == 10) {
            Betaler b = rEGSHandler.getBetaler(betalingCPR_textField.getText());
            if (b != null) {
                String betalingNavn = b.getBetalingNavn();
                betalingNavn_textField.setText(betalingNavn);
                betalingNavn_textField.setEnabled(false);
            }
        } else {
            if (!betalingNavn_textField.isEnabled()) {
                betalingNavn_textField.setEnabled(true);
                betalingNavn_textField.setText("");
            }
        }

    }//GEN-LAST:event_betalingCPR_textFieldKeyReleased

    private void fornavn_textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fornavn_textFieldFocusLost
        if (fornavn_textField.getText().length() == 0) {
            fornavn_textField.setForeground(new Color(153, 153, 153));
            fornavn_textField.setText("Fornavn");
        }
    }//GEN-LAST:event_fornavn_textFieldFocusLost

    private void mellemnavn_textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mellemnavn_textFieldFocusLost
        if (mellemnavn_textField.getText().length() == 0) {
            mellemnavn_textField.setForeground(new Color(153, 153, 153));
            mellemnavn_textField.setText("Mellemnavn");
        }
    }//GEN-LAST:event_mellemnavn_textFieldFocusLost

    private void efternavn_textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_efternavn_textFieldFocusLost
        if (efternavn_textField.getText().length() == 0) {
            efternavn_textField.setForeground(new Color(153, 153, 153));
            efternavn_textField.setText("Efternavn");
        }
    }//GEN-LAST:event_efternavn_textFieldFocusLost

    private void paragraf_textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paragraf_textFieldFocusLost
        if (paragraf_textField.getText().length() == 0) {
            paragraf_textField.setForeground(new Color(153, 153, 153));
            paragraf_textField.setText("§");
        }
    }//GEN-LAST:event_paragraf_textFieldFocusLost

    private void periodeFra_textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_periodeFra_textFieldFocusLost
        if (periodeFra_textField.getText().length() == 0) {
            periodeFra_textField.setForeground(new Color(153, 153, 153));
            periodeFra_textField.setText("Fra");
        }
    }//GEN-LAST:event_periodeFra_textFieldFocusLost

    private void periodeTil_textFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_periodeTil_textFieldFocusLost
        if (periodeTil_textField.getText().length() == 0) {
            periodeTil_textField.setForeground(new Color(153, 153, 153));
            periodeTil_textField.setText("Til");
        }
    }//GEN-LAST:event_periodeTil_textFieldFocusLost

    private void betalingBelob_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_betalingBelob_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_betalingBelob_textFieldActionPerformed

    private void betalingBelob_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_betalingBelob_textFieldKeyReleased
        betalingBelob_textField.setText(removeLettersV2(betalingBelob_textField.getText()));
    }//GEN-LAST:event_betalingBelob_textFieldKeyReleased

    private void periodeFra_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_periodeFra_textFieldKeyReleased
        periodeFra_textField.setText(removeLetters(periodeFra_textField.getText()));
    }//GEN-LAST:event_periodeFra_textFieldKeyReleased

    private void periodeTil_textFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_periodeTil_textFieldKeyReleased
        periodeTil_textField.setText(removeLetters(periodeTil_textField.getText()));
    }//GEN-LAST:event_periodeTil_textFieldKeyReleased
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
//            java.util.logging.Logger.getLogger(REGSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(REGSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(REGSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(REGSGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                REGSGUI dialog = new REGSGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JRadioButton aerJa_radioButton;
    private javax.swing.JRadioButton aerNej_radioButton;
    private javax.swing.JButton annuller_Button;
    private javax.swing.JTextArea beskrivelse_textArea;
    private javax.swing.JTextField betalingBelob_textField;
    private javax.swing.JTextField betalingCPR_textField;
    private javax.swing.JTextField betalingNavn_textField;
    private javax.swing.JTextField cpr_textField;
    private javax.swing.JTextField efternavn_textField;
    private javax.swing.JTextField foranstaltningsnavn_textField;
    private javax.swing.JTextField fornavn_textField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mellemnavn_textField;
    private javax.swing.JTextField paragraf_textField;
    private javax.swing.JTextField periodeFra_textField;
    private javax.swing.JTextField periodeTil_textField;
    private javax.swing.JButton registrer_button;
    private javax.swing.JTextField sagssted_textField;
    private javax.swing.JRadioButton sagstypeFlygtningerefusion_radioButton;
    private javax.swing.JRadioButton sagstypeHandicapsag_radioButton;
    private javax.swing.JRadioButton sagstypeMellmkommunal_radioButton;
    private javax.swing.JRadioButton sagstypeSocialsag_radioButton;
    // End of variables declaration//GEN-END:variables
}
