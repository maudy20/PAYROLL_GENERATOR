/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Maudy
 */
public class searchPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form settings
     */
    public searchPage() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
       Color navcolor = new Color(102,0,51);
     Color headcolor = new Color(102,0,51);
      Color bodycolor = new Color(255,0,165);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        searchEmp = new javax.swing.JTextField();
        design = new javax.swing.JTextField();
        stat = new javax.swing.JTextField();
        dhired = new javax.swing.JTextField();
        jtitle = new javax.swing.JTextField();
        bsal = new javax.swing.JTextField();
        id1 = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        dbirth1 = new javax.swing.JTextField();
        percentage = new javax.swing.JRadioButton();
        amt = new javax.swing.JRadioButton();
        dept1 = new javax.swing.JTextField();
        reason = new javax.swing.JTextField();
        prctg = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        search = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 204, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchEmp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchEmp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(searchEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 610, 30));

        design.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        design.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(design, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 240, 30));

        stat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        stat.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(stat, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 240, 30));

        dhired.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dhired.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(dhired, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 240, 30));

        jtitle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(jtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 240, 30));

        bsal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bsal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(bsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 240, 30));

        id1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 250, 30));

        fname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 250, 30));

        lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 250, 30));

        amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        jPanel5.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, 140, 30));

        dbirth1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dbirth1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel5.add(dbirth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 250, 30));

        percentage.setBackground(new java.awt.Color(0, 204, 153));
        percentage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        percentage.setText("Percentage (%)");
        jPanel5.add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        amt.setBackground(new java.awt.Color(0, 204, 153));
        amt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amt.setText("Amount");
        jPanel5.add(amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 100, -1));

        dept1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dept1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dept1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dept1ActionPerformed(evt);
            }
        });
        jPanel5.add(dept1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 250, 30));

        reason.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reason.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        reason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reasonActionPerformed(evt);
            }
        });
        jPanel5.add(reason, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 260, 30));

        prctg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        prctg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        prctg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prctgActionPerformed(evt);
            }
        });
        jPanel5.add(prctg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 140, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Reason");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Basic Salary");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 120, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Employee ID");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("First Name");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Last Name");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 120, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Date of Birth");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Search Employee");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Designation");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 120, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Status");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 90, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Date Hired");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 120, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Job Title");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 100, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Department");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Updated Salary by");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Percentage");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, 50));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Amount");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, 50));

        jButton1.setBackground(new java.awt.Color(102, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 90, 30));

        jButton2.setBackground(new java.awt.Color(102, 0, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 90, 30));

        jButton3.setBackground(new java.awt.Color(102, 0, 51));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 580, 90, 30));

        jButton4.setBackground(new java.awt.Color(102, 0, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Calculate");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 90, 30));

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-search-32.png"))); // NOI18N
        jPanel5.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("SEARCH PAYROLL");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 200, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("___________________________________________________");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 9, 800, 90));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("SEARCH PAYROLL");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 200, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void dept1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dept1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dept1ActionPerformed

    private void reasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reasonActionPerformed

    private void prctgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prctgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prctgActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(bodycolor);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
       jButton2.setBackground(headcolor);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jButton4.setBackground(bodycolor);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
       jButton4.setBackground(headcolor);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(bodycolor);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
      jButton1.setBackground(headcolor);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
       jButton3.setBackground(bodycolor);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
    jButton3.setBackground(headcolor);
    }//GEN-LAST:event_jButton3MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JRadioButton amt;
    private javax.swing.JTextField bsal;
    private javax.swing.JTextField dbirth1;
    private javax.swing.JTextField dept1;
    private javax.swing.JTextField design;
    private javax.swing.JTextField dhired;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jtitle;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton percentage;
    private javax.swing.JTextField prctg;
    private javax.swing.JTextField reason;
    private javax.swing.JLabel search;
    private javax.swing.JTextField searchEmp;
    private javax.swing.JTextField stat;
    // End of variables declaration//GEN-END:variables
}
