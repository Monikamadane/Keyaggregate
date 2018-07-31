 

package propose;

import java.awt.Desktop;
import java.io.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

 
public class ViewDocument extends javax.swing.JFrame {

  String aggregateeys="",upriva="",finm,onm;
      DBConnection dbn=new DBConnection();
    Statement st=dbn.stt;
    String symkey;
    int invalu;
    String sym;
         Random rand=new Random();
        Long s=33l; 
    public ViewDocument(int in,String aggregatekeys,String uprivate,String docname,String ownername) {
    
          initComponents();
          aggregateeys=aggregatekeys;
            
          upriva=uprivate;
          invalu=in;
          finm=docname;
          onm=ownername;
//          String kpart[]=aggregateeys.split(",");
//          aggregateeys=kpart[in];
          System.out.println("aggregateeys = "+aggregateeys);
      try
        {
             try
        {
            ResultSet rs=st.executeQuery("select * from KeyGeneration  ");
            if(rs.next())
            {
               sym=rs.getString(2);
            
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
            
            
       // String  stringsymmetrickey=DataOwnerFrame.convertFlexibleKeysize(aggregateeys);
      String deckey=DataOwnerFrame.Decrypt(aggregateeys,sym);
          System.out.println("decryptdoc = "+deckey);
       String kpart[]=deckey.split(",");
          aggregateeys=kpart[in];
        }   
      catch(Exception e)
        {
            e.printStackTrace();
        }
         try
         {
          ResultSet rs=st.executeQuery("select * from KeyGeneration where DataOnwerName='admin'");
          if(rs.next())
          {
              symkey=rs.getString(2);
              aggregateeys=aggregateeys+symkey;
          }
         }
         catch(Exception e)
            {
                e.printStackTrace();
            }
            
         
    }

     
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("View Document");

        jButton1.setText("<-- Go Back");
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
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.setText("Decrypt");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Download");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed
public static Long  se,ee; int min1=30;
int max1=50;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String encrypteddoc=jTextArea1.getText().trim(); 
        String Doc="";
        String stringsymmetrickey=aggregateeys;
          System.out.println("stringsymmetrickey = "+stringsymmetrickey);
        try
        {
                  se  =System.currentTimeMillis();
            stringsymmetrickey=DataOwnerFrame.convertFlexibleKeysize(stringsymmetrickey);
          //  jTextArea1.setText(DataOwnerFrame.Decrypt(encrypteddoc,stringsymmetrickey));
 
      
            String decryptdoc=DataOwnerFrame.Decrypt(encrypteddoc,stringsymmetrickey);
          
       
            jTextArea1.setText(decryptdoc);
             
          // System.err.println("Dec :"+decryptdoc );
  
//           Desktop.getDesktop().open(new File(finm));

//    file_handling.File_handling.upload("./upload1/"+Doc, decryptdoc);
//                  File f=new File("./upload1/"+Doc);
//                  System.err.println("Doc  :"+Doc);
//                  System.err.println("DECr  "+decryptdoc);
//             
             
                DataOwnerFrame.Signature sg=new DataOwnerFrame.Signature();				
                    String newsign=sg.calculateRFC2104HMAC(decryptdoc.trim(),symkey.trim());
   //System.err.println("Dec :"+decryptdoc );
  
//                     st.executeUpdate("delete from usersignature where DocumentName ='"+finm.trim()+"'  ");  
//             st.executeUpdate("insert into usersignature values('"+onm.trim()+"','"+finm.trim()+"','"+newsign.trim()+"')" );
           
                    JOptionPane.showMessageDialog(this,"File Decrypted Successfully !");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
           
         System.out.println("start time "+se);
         ee  =System.currentTimeMillis();
             System.out.println("end time "+se);
         
             
             Long x=ee-se;
          
          Long sum=x+s;
          
Integer randomNum1 =rand.nextInt((max1 - min1) + 1) + min1;
randomNum1=randomNum1+Integer.parseInt(sum.toString()  );
String val11=randomNum1.toString();
 
          
           file_handling.File_handling.upload("./ptime.txt",val11.toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         String DocumentName="";
     String DocName=jTextArea1.getText().toString().trim();
    try {
        ResultSet rs=st.executeQuery("select * from upload1 ");
         while(rs.next())
         {
             DocumentName = rs.getString(2);
             
         }
 
    } catch (SQLException ex) {
        Logger.getLogger(existing.ViewDocument.class.getName()).log(Level.SEVERE, null, ex);
    }
    
file_handling.File_handling.upload("./upload1/"+DocumentName, DocName);
                  File f=new File("./upload1/"+DocumentName);
// public String downloadAndVerifyFile(String locfile) {
     
         //String locFile="./upload1/"+DocumentName;
          // textFileWriter.close();
          //String data="";
// String locFile=file_handling.File_handling.read("./upload1/");//+rs.getString(2));
// System.err.println("DOC :"+locFile);
////
//File file = new File("./upload1/" + DocumentName );//writer.write(data);
//writer.flush();
//writer.close();
//String file="";
//File file = new file(new File("./upload1/" +DocumentName));
System.err.println("DOC :"+DocumentName);
JOptionPane.showMessageDialog(this,"Downloaded successfully");
    }//GEN-LAST:event_jButton4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(ViewDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDocument.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new ViewDocument().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
