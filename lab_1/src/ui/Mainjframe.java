/*
 * To change this LicenseEdit header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.*;

/**
 *
 * @author rocha
 */
public class Mainjframe extends javax.swing.JFrame {

    /**
     * Creates new form Mainjframe
     * 
     * 
     * 
     * 
     */
    
    Personal person;
    address add;
    account acc;
    savings sav;
    medical med;
    license lic;
    
    public Mainjframe() {
        initComponents();
        
        person = new Personal();
        add= new address();
        acc= new account();
        sav= new savings();
        med= new medical();
        lic= new license();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        splitPanel = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        viewaddres = new javax.swing.JButton();
        editpersonal = new javax.swing.JButton();
        viewpersonal = new javax.swing.JButton();
        viewchecking = new javax.swing.JButton();
        editchecking = new javax.swing.JButton();
        editsavings = new javax.swing.JButton();
        viewsavings = new javax.swing.JButton();
        editlicense = new javax.swing.JButton();
        viewlicense = new javax.swing.JButton();
        editmedical = new javax.swing.JButton();
        viewmedical = new javax.swing.JButton();
        viewall = new javax.swing.JButton();

        jButton5.setText("jButton5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Edit Address");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAddressActionPerformed(evt);
            }
        });

        viewaddres.setText("View Address");
        viewaddres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewaddresActionPerformed(evt);
            }
        });

        editpersonal.setText("Edit Personal ");
        editpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editpersonalActionPerformed(evt);
            }
        });

        viewpersonal.setText("view personal");
        viewpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpersonalActionPerformed(evt);
            }
        });

        viewchecking.setText("View checking account");
        viewchecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewcheckingActionPerformed(evt);
            }
        });

        editchecking.setText("Edit Checking Acc");
        editchecking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editcheckingeditAddressActionPerformed(evt);
            }
        });

        editsavings.setText("Edit Savings account");
        editsavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editsavingseditAddressActionPerformed(evt);
            }
        });

        viewsavings.setText("View Savings account");
        viewsavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewsavingsActionPerformed(evt);
            }
        });

        editlicense.setText("Edit license ");
        editlicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editlicenseActionPerformed(evt);
            }
        });

        viewlicense.setText("view license");
        viewlicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewlicenseActionPerformed(evt);
            }
        });

        editmedical.setText("Edit Medical");
        editmedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editmedicalActionPerformed(evt);
            }
        });

        viewmedical.setText("view Medical");
        viewmedical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmedicalActionPerformed(evt);
            }
        });

        viewall.setText("View all");
        viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewaddres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewchecking, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(editsavings, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewsavings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(editchecking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(viewlicense)
                                    .addComponent(editlicense)
                                    .addComponent(editmedical, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(viewmedical)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(editpersonal)
                                    .addComponent(viewpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(viewall, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(editpersonal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewpersonal)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewaddres)
                .addGap(13, 13, 13)
                .addComponent(editchecking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewchecking)
                .addGap(16, 16, 16)
                .addComponent(editsavings)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewsavings)
                .addGap(11, 11, 11)
                .addComponent(editlicense)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewlicense)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editmedical)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewmedical)
                .addGap(18, 18, 18)
                .addComponent(viewall)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        splitPanel.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewallActionPerformed
        // TODO add your handling code here:
        AllInfoView viewPanel= new AllInfoView(person, add,acc,sav,lic,med);
        splitPanel.setRightComponent(viewPanel);

    }//GEN-LAST:event_viewallActionPerformed

    private void viewmedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmedicalActionPerformed
        // TODO add your handling code here:
        MedicalView medicalPanel = new MedicalView(med);
        splitPanel.setRightComponent(medicalPanel);

    }//GEN-LAST:event_viewmedicalActionPerformed

    private void editmedicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editmedicalActionPerformed
        // TODO add your handling code here:
        MedicalEdit medicalPanel = new MedicalEdit(med);
        splitPanel.setRightComponent(medicalPanel);

    }//GEN-LAST:event_editmedicalActionPerformed

    private void viewlicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewlicenseActionPerformed
        // TODO add your handling code here:
        LicenseView licensePanel= new LicenseView(lic);
        splitPanel.setRightComponent(licensePanel);

    }//GEN-LAST:event_viewlicenseActionPerformed

    private void editlicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editlicenseActionPerformed
        // TODO add your handling code here:
        LicenseEdit licensePanel= new LicenseEdit(lic);
        splitPanel.setRightComponent(licensePanel);

    }//GEN-LAST:event_editlicenseActionPerformed

    private void viewsavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewsavingsActionPerformed
        // TODO add your handling code here:
        SavingView savingPanel= new SavingView(sav);
        splitPanel.setRightComponent(savingPanel);
    }//GEN-LAST:event_viewsavingsActionPerformed

    private void editsavingseditAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editsavingseditAddressActionPerformed
        // TODO add your handling code here:
        SavingEdit savingPanel= new SavingEdit(sav);
        splitPanel.setRightComponent(savingPanel);
    }//GEN-LAST:event_editsavingseditAddressActionPerformed

    private void editcheckingeditAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editcheckingeditAddressActionPerformed
        // TODO add your handling code here:
        CheckinsavingsEdit checkinsavingPanel= new CheckinsavingsEdit(acc);
        splitPanel.setRightComponent(checkinsavingPanel);
    }//GEN-LAST:event_editcheckingeditAddressActionPerformed

    private void viewcheckingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewcheckingActionPerformed
        // TODO add your handling code here:
        CheckinsavingsView checkinsavingPanel= new CheckinsavingsView(acc);
        splitPanel.setRightComponent(checkinsavingPanel);
    }//GEN-LAST:event_viewcheckingActionPerformed

    private void viewpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpersonalActionPerformed
        // TODO add your handling code here:
        personalView  personalPanel = new personalView(person);
        splitPanel.setRightComponent(personalPanel);

    }//GEN-LAST:event_viewpersonalActionPerformed

    private void editpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editpersonalActionPerformed
        // TODO add your handling code here:
        personalEdit  personalPanel = new personalEdit(person);
        splitPanel.setRightComponent(personalPanel);
    }//GEN-LAST:event_editpersonalActionPerformed

    private void viewaddresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewaddresActionPerformed
        // TODO add your handling code here:
        AddressViewPanel addressPanel = new AddressViewPanel(add);
        splitPanel.setRightComponent(addressPanel);
    }//GEN-LAST:event_viewaddresActionPerformed

    private void editAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAddressActionPerformed
        // TODO add your handling code here:
        AddressEditPanel addressPanel = new AddressEditPanel(add);
        splitPanel.setRightComponent(addressPanel);

    }//GEN-LAST:event_editAddressActionPerformed

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
            java.util.logging.Logger.getLogger(Mainjframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainjframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainjframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainjframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainjframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editchecking;
    private javax.swing.JButton editlicense;
    private javax.swing.JButton editmedical;
    private javax.swing.JButton editpersonal;
    private javax.swing.JButton editsavings;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JButton viewaddres;
    private javax.swing.JButton viewall;
    private javax.swing.JButton viewchecking;
    private javax.swing.JButton viewlicense;
    private javax.swing.JButton viewmedical;
    private javax.swing.JButton viewpersonal;
    private javax.swing.JButton viewsavings;
    // End of variables declaration//GEN-END:variables
}