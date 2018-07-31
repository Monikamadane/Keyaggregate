 
package Main;

 
//import proposed.*;
import java.awt.Color;
import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
 
//import provablemulticopy.DBConnection;
//import proposed.DBConnection;

public class DualAxisDemo1 extends ApplicationFrame {

  existing.DBConnection dbn=new existing.DBConnection();
    Statement st1=dbn.stt;
    //DBConnection dbn=new DBConnection();
    
    
    propose.DBConnection dbn1=new propose.DBConnection();
    Statement st=dbn1.stt;
    public DualAxisDemo1(final String title) {

        super(title);

        final CategoryDataset dataset1 = createDataset1();

        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            "Performance analysis (  Encryption Time)",        // chart title
            "No. of servers",               // domain axis label
            "IBE Encryption Time IN MILLISECONDS",                  // range axis label
            dataset1,                 // data
            PlotOrientation.VERTICAL,
            true,                     // include legend
            true,                     // tooltips?
            false                     // URL generator?  Not required...
        );

     
        chart.setBackgroundPaint(Color.white);
 
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(0xEE, 0xEE, 0xFF));
        plot.setDomainAxisLocation(AxisLocation.BOTTOM_OR_RIGHT);
 

        final LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();
        renderer2.setToolTipGenerator(new StandardCategoryToolTipGenerator());
        plot.setRenderer(1, renderer2);
        plot.setDatasetRenderingOrder(DatasetRenderingOrder.REVERSE);
      
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        setContentPane(chartPanel);

    }

   
    private CategoryDataset createDataset1() {
  final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        
        
    
        final String series1 = "EXISTING SYSTEM";
        final String series2 = "PROPOSED SYSTEM";
        String pcategory="";
        String pindexdata="";
        Integer pstorage=0;
        String filename="";
        String Etime="";
        String Ptime="";
        try
        {   
            int count=0;
            ResultSet rs=st1.executeQuery("SELECT * FROM existing");
         //  st1.executeUpdate("insert into existing  values('"+filename.trim()+"','"+Etime.trim()+"')");
            while(rs.next())
            {
             dataset.addValue(Double.parseDouble(rs.getString(2)), series1, rs.getString(1));  
              dataset.addValue(Double.parseDouble(rs.getString(2)), series2, rs.getString(1));
            }
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
 try
 {     // String filename="";
        
      int count=0;
            ResultSet rs=st.executeQuery("SELECT * FROM propose");
            
             
               // st.executeUpdate("insert into proposed values('"+filename.trim()+"','"+Ptime.trim()+"')");       
                  
            while(rs.next())
            {
                 //dataset.addValue(Double.parseDouble(rs.getString(2)), series1, rs.getString(1));  
             dataset.addValue(Double.parseDouble(rs.getString(2)), series2,rs.getString(1));
            }
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
           
        return dataset;

    }

 
  
    
//    int min1=30;
//int max1=50;  
//
 
//   Integer randomNum1 =rand.nextInt((max1 - min1) + 1) + min1;
//        
//    randomNum1=randomNum1+Integer.parseInt(file_handling.File_handling.read("etime.txt"));
//    String val11=randomNum1.toString();
//    
//      dataset.addValue( Double.parseDouble(val1) , series2, series2);//proposed
//      dataset.addValue(Double.parseDouble( val11) , series1 ,series1 );//existing
// 
//           dataset.addValue( Double.parseDouble(file_handling.File_handling.read("etime.txt")) , series1, series1);//proposed
//      dataset.addValue(Double.parseDouble( file_handling.File_handling.read("ptime.txt")) , series2 ,series2 );//existing
//     
//        return dataset;

    

   
    public static void main(final String[] args) {

        final DualAxisDemo1 demo = new DualAxisDemo1("Secure data Sharing Performance analysis (IBS Genration Time vs No. of Server)");
        demo.pack();
        RefineryUtilities.centerFrameOnScreen(demo);
        demo.setVisible(true);

    }

}