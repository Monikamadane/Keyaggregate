

package existing;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;


public class Main {
    public static void main(String[] args) 
    {        
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        try
        {                    			
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");                                    
            LoginPage hp=new LoginPage();
            hp.setTitle("Home Page");
            hp.setVisible(true);
            hp.setResizable(false);                         
	}
	catch (Exception ex)
	{            
         
	}   
    }
}


