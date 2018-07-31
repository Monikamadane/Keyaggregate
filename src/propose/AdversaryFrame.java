 

package propose;

import Cloudme.CloudmeException;
import Cloudme.CloudmeFolder;
import Cloudme.CloudmeUser;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import sun.misc.BASE64Encoder;

 
public class AdversaryFrame extends javax.swing.JFrame {
  DBConnection dbn=new DBConnection();
    Statement st=dbn.stt;
    String cipfile,sign,clserv,tag,ind;
    public AdversaryFrame() {
        initComponents();
        viewKeyRequest();
    }
 
   
    public final void viewKeyRequest()
    {
        try
        {
          
            ResultSet rs=st.executeQuery("select * from keygeneration  ");
        
           if(rs.next())
            {
            String  em=rs.getString(2);
                 jTextField1.setText(em);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
      
      
    }

        
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Andalus", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Attacker");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(166, 166, 166)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 204));
        jLabel3.setText("StringSymmatricKey");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(54, 54, 54)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Key Generation", jPanel2);

        jLabel4.setText("Enter the Document Name:");

        jLabel5.setText("Enter the Document:");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton3.setText("Encrypt Document");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("Upload");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Clear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Browse");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter Keys (0 to 6 length):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(8, 8, 8))
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Upload Document", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String document=jTextArea1.getText().trim().replaceAll("[^A-Za-z0-9\\s\\.\\,]", "");
        try
        {
            
                  String stringsymmetrickey=jTextField4.getText().trim()+jTextField1.getText().trim();
     //   String stringsymmetrickey=jTextField1.getText().trim();
            System.out.println("stringsymmetrickey nn = "+stringsymmetrickey);
        {

            String cipherText = Encrypt(document, stringsymmetrickey);
  
             
// Key Aggregate Cryptosystem
              JOptionPane.showMessageDialog(this,"Document Encrypted Successfully!");
            jTextArea1.setText(cipherText.trim());
           

        }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_jButton3ActionPerformed
      
       public void cloudupload(File f)
{
    System.out.println("call");
      System.out.println("f = "+f);
       CloudmeFolder newfolder=null;
     try {
 CloudmeUser user = new CloudmeUser("priyanka77","priyanka777$*");
         System.out.println("login 1");
       
           
            if(user.getFolderManager().getFolder("/priyanka")==null)
            {
                
            }
            else     
            {
               newfolder = user.getFolderManager().getFolder("/priyanka");
            }
         
          user.getFileManager().uploadFile(f.getAbsolutePath(), "/priyanka/");
            user.killUser();
            
           //  CloudmeFile file = user.getFileManager().getFile("/"+f.getName());

           // file.deleteFile();
        } catch (CloudmeException ex) {
       try {
             
      CloudmeUser user = new CloudmeUser("priyanka77","priyanka777$*");
            System.out.println("login 2");
           newfolder = user.getFolderManager().getFolder("/priyanka");
          // newfolder.uploadFile(f.getAbsolutePath());
          user.getFileManager().uploadFile(f.getAbsolutePath(), "/priyanka/");
           user.killUser();
          
 //CloudmeFile file = user.getFileManager().getFile("/"+f.getName());

          //  file.deleteFile();
       } catch (CloudmeException ex1) {
           Logger.getLogger(DataOwnerFrame.class.getName()).log(Level.SEVERE, null, ex1);
       }
        }
                      
}
   
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String documentname=jTextField3.getText().trim();
        String encrypteddocument=jTextArea1.getText().trim();
         
        System.err.println("documentname = "+documentname);
                System.err.println("encrypteddocument = "+encrypteddocument);
        try
        {
 
 
                               file_handling.File_handling.upload("upload\\"+documentname.trim(), encrypteddocument.trim());
           //           file_handling.File_handling.upload(".upload/"+documentname, encrypteddocument);
                 
                    JOptionPane.showMessageDialog(this, "Uploaded Successfully!");
              
                  cloudupload(new File("upload\\"+documentname.trim()));
                        JOptionPane.showMessageDialog(this, "Uploaded Cloud Successfully!");
              
                }
                catch(Exception e)
                {
                Thread.currentThread().getStackTrace()[2].getLineNumber();
                   //   e.getStackTrace()[2].getLineNumber();
                }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField3.setText("");
      //  jTextField4.setText("");
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed
File ff=null; String fn=""; String filename="",h;
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    JFileChooser jf=new JFileChooser("./");
    
            int v=jf.showOpenDialog(this);
            
             ff=jf.getSelectedFile();
           
        try {
            FileInputStream ff1=new FileInputStream(ff);
            jTextField3.setText(ff.getName());
            filename=ff.getName();
            
   if(filename.endsWith(".txt"))
                {
   
            byte data[]= new byte[ff1.available()];
            ff1.read(data);
            String PText=new String(data);
            jTextArea1.setText(PText);
                }
   
        else    if(filename.endsWith(".docx"))
                {
                  
                         FileInputStream fis = new FileInputStream(filename);

                XWPFDocument document = new XWPFDocument(fis);

                List<XWPFParagraph> paragraphs = document.getParagraphs();


                for (XWPFParagraph para : paragraphs) {
                      h=para.getText();
                   
                }
             
                    jTextArea1.setText(h);
              
            if(jTextArea1.getText().equals(""))  
            {
                
                
                   byte data[]= new byte[ff1.available()];
            ff1.read(data);
            String PText=new String(data);
            jTextArea1.setText(PText);
            }
         
                }
   
   else
        {
       
             byte data[]= new byte[ff1.available()];
            ff1.read(data);
            String PText=new String(data);
            jTextArea1.setText(PText);
        }
        } catch (Exception ex) {
            Logger.getLogger(DataOwnerFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                 
            
             

                 
         
    
                try
        {
          
            ResultSet rs=st.executeQuery("select * from upload where DocumentName='"+filename.trim()+"'  ");
        
           if(rs.next())
            {
            String  ind=rs.getString(4);
                 
                   jTextField4.setText(ind);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
             
             
             
             
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
String ownername;
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
            java.util.logging.Logger.getLogger(AdversaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdversaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdversaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdversaryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdversaryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

   private String Encrypt(String file, String ownerid) throws Exception{        
	String key1 = ownerid;
         System.out.println("file cl "+file);  
         System.out.println("ownerid cl"+ownerid);    
         System.out.println("key use in cncryption function = "+key1);
	String key=convertFlexibleKeysize(key1);
	 System.out.println("Key is "+key);      
	byte[] ciphertext = encrypt(key, file);
	  
        //Convert byte array to String
        BASE64Encoder encoder = new BASE64Encoder();
	String cipherstring = encoder.encode(ciphertext);
        return cipherstring;
    }
    
    public static byte[] encrypt(String key, String value)
      throws GeneralSecurityException {
System.out.println("key fn "+key);  
         System.out.println("valuefn "+value);  
         
    byte[] raw = key.getBytes(Charset.forName("US-ASCII"));
    if (raw.length != 16) {
      throw new IllegalArgumentException("Invalid key size.");
    }

    SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
    Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    cipher.init(Cipher.ENCRYPT_MODE, skeySpec,
        new IvParameterSpec(new byte[16]));
    return cipher.doFinal(value.getBytes(Charset.forName("US-ASCII")));
  }
    
      public static String convertFlexibleKeysize(String key) throws Exception 
  {
      System.out.println("convertFlexibleKeysize call");
             String validKey="";
		if(key.length()==16)
		{
			validKey=key;
		}
		else
		{			
			if(key.length()<16)
			{
				String te="1234567890123456";
				char ch[]=te.toCharArray();
				for(int i=key.length();i<ch.length;i++)
				{
					key=key+ch[i];
				}
				validKey=key;
			}
			else
			{
				char ch1[]=key.toCharArray();
				String key1="";
				for(int i=0;i<16;i++)
				{
					key1=key1+ch1[i];
				}
				validKey=key1;
			}
		}
		return validKey;
  }
}
