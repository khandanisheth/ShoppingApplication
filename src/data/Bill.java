/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danish
 */
public class Bill extends javax.swing.JFrame {

    /**
     * Creates new form Bill
     */
    public Bill() {
        initComponents();
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
        txtbill = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnbill = new javax.swing.JButton();
        btnor = new javax.swing.JButton();
        btnbill1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        txtbill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Total Amount");

        btnbill.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbill.setForeground(new java.awt.Color(102, 102, 255));
        btnbill.setText("Bill");
        btnbill.setToolTipText("");
        btnbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbillActionPerformed(evt);
            }
        });

        btnor.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnor.setForeground(new java.awt.Color(102, 102, 255));
        btnor.setText("More Order");
        btnor.setToolTipText("");
        btnor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorActionPerformed(evt);
            }
        });

        btnbill1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbill1.setForeground(new java.awt.Color(102, 102, 255));
        btnbill1.setText("Exit");
        btnbill1.setToolTipText("");
        btnbill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbill1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtbill, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnbill)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(btnbill1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbill)
                    .addComponent(btnor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbill, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(74, 74, 74)
                .addComponent(btnbill1)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbillActionPerformed
        int x = 0;
try {
    // Load the MySQL JDBC Driver
    Class.forName("com.mysql.cj.jdbc.Driver");
    
    // Establish a connection to the database
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinegra", "root", "6375");
    
    // Create a SQL query
    String query = "SELECT * FROM `order`";  // Backticks around 'order'
    
    // Execute the query and retrieve the data as a ResultSet
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(query);
    
    // Create a TableModel object to store the data
    DefaultTableModel tableModel = new DefaultTableModel();
    
    // Add columns to the TableModel
    ResultSetMetaData rsmd = rs.getMetaData();
    int columnCount = rsmd.getColumnCount();
    for (int i = 1; i <= columnCount; i++) {
        tableModel.addColumn(rsmd.getColumnName(i));
    }
    
    // Add rows to the TableModel
    while (rs.next()) {
        Object[] row = new Object[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            row[i - 1] = rs.getObject(i);
        }
        tableModel.addRow(row);
        
        // Update total bill
        x = rs.getInt(10) + x;
        txtbill.setText(" " + x);
    }
    
    // Create a JTable and set its model to the populated TableModel
    JTable table = new JTable(tableModel);
    
    // Display the JTable in a JFrame
    JFrame frame = new JFrame();
    frame.add(new JScrollPane(table));
    frame.pack();
    frame.setVisible(true);
    
    // Delete all records from 'order' table after displaying data
    String sql = "TRUNCATE TABLE `order`";   // Backticks around 'order'
    stmt.executeUpdate(sql);
    
    // Close the connection and release resources
    rs.close();
    stmt.close();
    conn.close();
    
} catch (Exception e) {
    System.out.print(e);
}

    }//GEN-LAST:event_btnbillActionPerformed

    private void btnbill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbill1ActionPerformed
        JOptionPane.showMessageDialog(null, "Thank For Shoping");
        System.exit(0);
    }//GEN-LAST:event_btnbill1ActionPerformed

    private void btnorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorActionPerformed
        Order or=new Order();
        or.setVisible(true);
    }//GEN-LAST:event_btnorActionPerformed

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
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbill;
    private javax.swing.JButton btnbill1;
    private javax.swing.JButton btnor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtbill;
    // End of variables declaration//GEN-END:variables
}
