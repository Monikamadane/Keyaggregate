


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package propose;

import Cloudme.CloudmeException;
import Cloudme.CloudmeFolder;
import Cloudme.CloudmeUser;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 *
 * @author Elcot
 */
public class Trusted_Verifier extends javax.swing.JFrame {

    /**
     * Creates new form ProxyFrame
     */
    
    DBConnection dbn=new DBConnection();
    Statement st=dbn.stt;
    String proxyname;
    
    public Trusted_Verifier(String pname) {
        initComponents();
        proxyname=pname;
        
        viewDatabase();
    }
    
    public final void viewDatabase()
    {
        
        
        try
        {
            ResultSet rs1=st.executeQuery("select * from IntegrityCheckingRequest  ");            
            while(rs1.next())
            {
                String origclientname=rs1.getString(1);  
                String filename=rs1.getString(2);  
                 
                String status=rs1.getString(3); 
                
                if(status.trim().equalsIgnoreCase("Pending"))
                {                
                    DefaultTableModel dm=(DefaultTableModel)jTable3.getModel();
                    Vector v=new Vector();
                    v.add(origclientname.trim());
                    v.add(filename.trim());
                    jComboBox2.addItem(filename.trim());
                    
                    v.add(status);
                    dm.addRow(v);
                }
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 0));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Verifier");

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(247, 247, 247)
                .addComponent(jButton1)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client Name", "Filename", "Status"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel4.setText("Choose Filename:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<--Select-->" }));

        jButton4.setText("Check");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Integrity Checking Request", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);             
    }//GEN-LAST:event_jButton1ActionPerformed
 
 
 
 String usersignature,cname,fname;int cou ;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String filename=jComboBox2.getSelectedItem().toString().trim();
       // String privatekey=jTextField1.getText().trim();
        System.out.println("selected filename = "+filename);
        for(int i=0;i<jTable3.getRowCount();i++)
        {
              cname=jTable3.getValueAt(i,0).toString().trim();
            fname=jTable3.getValueAt(i,1).toString().trim();
             
               System.out.println("table filename = "+fname);
        }
            if(filename.trim().equals(fname.trim()))
            {
                System.out.println("Come in loop");
                String signature="";
                try
                {
                    ResultSet rs=st.executeQuery("select * from Upload where DocumentName='"+fname+"' ");// where  and DocumentName='"+filename.trim()+"'
                    if(rs.next())
                    {
                        System.out.println("Come in ulpload signature query");
                        signature=rs.getString(5);
                        System.out.println("signatur = "+signature);
                    }
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
           
 
                try
                {
                    ResultSet rs=st.executeQuery("select * from usersignature where DataOwnerName='"+cname+"' and DocumentName='"+fname+"' ");//where DocumentName='"+fname.trim()+"'
                    if(rs.next())
                    {
                        System.out.println("usersignature queries paass");
                      usersignature=rs.getString(3);
                         System.out.println("usersignature = "+usersignature);
                    }
                 //System.out.println("FINAL CIHETTEXT  "+warrant);
                 
                        
                        if(signature.trim().equals(usersignature.trim()))
                        {
                            JOptionPane.showMessageDialog(this,"This File is Safe!");
                            ResultSet rs1=st.executeQuery("select * from IntegrityCheckingRequest where OriginalClientName='"+cname+"' and FileName='"+fname+"'");            
                                    System.out.println("IntegrityCheckingRequest queries paass");
                         
                                         
                 
                                    DefaultTableModel dm=(DefaultTableModel)jTable3.getModel();
                                     dm.setRowCount(0);
                    Vector v=new Vector();
                    v.add(cname.trim());
                    v.add(fname.trim());
                    
                    v.add("Safe");
                    dm.addRow(v);
                    
                    
                            if(rs1.next())
                            {
                                st.execute("update IntegrityCheckingRequest set Status='"+"Safe"+"'  ");
                            }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"This File is Not Safe!");
                             DefaultTableModel dm=(DefaultTableModel)jTable3.getModel();
                    Vector v=new Vector();
                    v.add(cname.trim());
                    v.add(fname.trim());
                    
                    v.add("Not Safe");
                    dm.addRow(v);
                            ResultSet rs1=st.executeQuery("select * from IntegrityCheckingRequest where OriginalClientName='"+cname+"' and FileName='"+fname+"'  ");            
                                System.out.println("IntegrityCheckingRequest queries paass");
                            if(rs1.next())
                            {
                                st.execute("update IntegrityCheckingRequest set Status='"+"Not Safe"+"'  ");
                               
                         
                            }
                       
                    } 
                }
                catch(Exception e)
                {
                     e.printStackTrace();
                } 
                
            }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Trusted_Verifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trusted_Verifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trusted_Verifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trusted_Verifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ProxyFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

     
}