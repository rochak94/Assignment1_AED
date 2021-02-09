/*
 * To change this LicenseEdit header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.license;

/**
 *
 * @author rocha
 */
public class LicenseEdit extends javax.swing.JPanel {
    
    license var;
    

    /**
     * Creates new form license
     */
    public LicenseEdit() {
        initComponents();
    }
    
     public LicenseEdit(license a) {
        initComponents();
        var=a;
        licensenumber.setText(var.getLicenseNumber());
        issuedate.setText(var.getDateOfIssue());
        expirationdate.setText(var.getDateOfExpiry());
        bloodtype.setText(var.getBloodType());
        lblImagePath.setText(var.getImgPath());
        
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        licensenumber = new javax.swing.JTextField();
        issuedate = new javax.swing.JTextField();
        expirationdate = new javax.swing.JTextField();
        bloodtype = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        UploadBtn = new javax.swing.JButton();
        lblImagePath = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("License");

        jLabel3.setText("License number");

        jLabel4.setText("Issue date");

        jLabel5.setText("expiration date");

        jLabel6.setText("blood type");

        licensenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licensenumberActionPerformed(evt);
            }
        });

        bloodtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodtypeActionPerformed(evt);
            }
        });

        save.setText("save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel7.setText("Image");

        UploadBtn.setText("Upload");
        UploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadBtnActionPerformed(evt);
            }
        });

        lblImagePath.setText("Image Path");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(save)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel7))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UploadBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImagePath)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bloodtype)
                    .addComponent(issuedate, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(licensenumber, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(expirationdate))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(licensenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(issuedate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(expirationdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bloodtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UploadBtn)
                    .addComponent(lblImagePath))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(save)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bloodtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodtypeActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
        var.setLicenseNumber(licensenumber.getText());
        var.setIssuedate(issuedate.getText());
        var.setExpirydate(expirationdate.getText());
        var.setBloodType(bloodtype.getText());
        var.setImgPath(lblImagePath.getText());
        
        JOptionPane.showMessageDialog(this, "information is saved");
    }//GEN-LAST:event_saveActionPerformed

    private void UploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadBtnActionPerformed
        // TODO add your handling code here:
      
        String path = null;
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        FileNameExtensionFilter f = new FileNameExtensionFilter("*Images",".jpg",".png",".jpeg");
        chooser.addChoosableFileFilter(f);
                
        int fileSt = chooser.showSaveDialog(null);
        
        if(fileSt == JFileChooser.APPROVE_OPTION)
        {
            File img = chooser.getSelectedFile();
            path = img.getAbsolutePath();
            lblImagePath.setText(path);
        }
        
        
    }//GEN-LAST:event_UploadBtnActionPerformed

    private void licensenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licensenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licensenumberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UploadBtn;
    private javax.swing.JTextField bloodtype;
    private javax.swing.JTextField expirationdate;
    private javax.swing.JTextField issuedate;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblImagePath;
    private javax.swing.JTextField licensenumber;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}