/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.address;

/**
 *
 * @author rocha
 */
public class AddressEditPanel extends javax.swing.JPanel {

    address var;
    /**
     * Creates new form address
     */
    public AddressEditPanel() {
        initComponents();
    }

    public AddressEditPanel(address a) {
        initComponents();
        var=a;
        textStreetAddress.setText(var.getStreetAddress());
        Textstate.setText(var.getState());
        Textcity.setText(var.getCity());
        Textzipcode.setText(var.getZipCode());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        address = new javax.swing.JLabel();
        streetaddress = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        zipcode = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        Textcity = new javax.swing.JTextField();
        textStreetAddress = new javax.swing.JTextField();
        Textstate = new javax.swing.JTextField();
        Textzipcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("Address");

        streetaddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        streetaddress.setText("Street address :");

        state.setText("State :");

        zipcode.setText("Zip Code :");

        city.setText("City :");

        Textzipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextzipcodeActionPerformed(evt);
            }
        });

        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(city, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(state, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(zipcode, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(streetaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textStreetAddress)
                    .addComponent(Textcity)
                    .addComponent(Textstate)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Textzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 48, Short.MAX_VALUE)))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(address)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(city)
                    .addComponent(Textcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state)
                    .addComponent(Textstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Textzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipcode))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(41, 41, 41))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextzipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextzipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextzipcodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        var.setStreetAddress(textStreetAddress.getText());
        var.setState(Textstate.getText());
        var.setCity(Textcity.getText());
        var.setZipCode(Textzipcode.getText());
        
        JOptionPane.showMessageDialog(this, "information is saved");
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Textcity;
    private javax.swing.JTextField Textstate;
    private javax.swing.JTextField Textzipcode;
    private javax.swing.JLabel address;
    private javax.swing.JLabel city;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel state;
    private javax.swing.JLabel streetaddress;
    private javax.swing.JTextField textStreetAddress;
    private javax.swing.JLabel zipcode;
    // End of variables declaration//GEN-END:variables
}