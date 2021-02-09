/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.address;

/**
 *
 * @author rocha
 */
public class AddressViewPanel extends javax.swing.JPanel {

     address var;
    /**
     * Creates new form address
     */
    public AddressViewPanel() {
        initComponents();
    }

    public AddressViewPanel(address a) {
        initComponents();
        var=a;
        txtStreetAddress.setText(var.getStreetAddress());
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
        txtStreetAddress = new javax.swing.JTextField();
        Textstate = new javax.swing.JTextField();
        Textzipcode = new javax.swing.JTextField();

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("Address");

        streetaddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        streetaddress.setText("Street address :");

        state.setText("State :");

        zipcode.setText("Zip Code :");

        city.setText("City :");

        Textcity.setEnabled(false);
        Textcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextcityActionPerformed(evt);
            }
        });

        txtStreetAddress.setEnabled(false);

        Textstate.setEnabled(false);

        Textzipcode.setEnabled(false);
        Textzipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextzipcodeActionPerformed(evt);
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
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(Textcity)
                    .addComponent(Textstate)
                    .addComponent(Textzipcode))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(address)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(82, 82, 82))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TextzipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextzipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextzipcodeActionPerformed

    private void TextcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextcityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Textcity;
    private javax.swing.JTextField Textstate;
    private javax.swing.JTextField Textzipcode;
    private javax.swing.JLabel address;
    private javax.swing.JLabel city;
    private javax.swing.JLabel state;
    private javax.swing.JLabel streetaddress;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JLabel zipcode;
    // End of variables declaration//GEN-END:variables
}
