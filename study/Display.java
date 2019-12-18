
package study;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static study.Registration.obj;

public class Display{ 
  static JTable table;
  static int index;
    public Container createContentPane()
    {
       
       
        // The data used as the titles for the table.
        String[] title = {"id","firstName","fatherName","midleName","wereda","kebele",
          "age","sex","phonNumber"};
        
        // The data used in the table, placed as a multi-dimensional array.
          
    String [][] p={{"1","Bahiru","Mulugeta","Mekonnen","Womberma","Yergin","22","male","98765432"}};
       
       
       if(obj.size()==0)
       {
           table=new JTable(p, title);
          JScrollPane scrollPane = new JScrollPane(table);
          scrollPane.setPreferredSize(new Dimension(1000,495));
          JPanel totalGUI = new JPanel();
          totalGUI.add(scrollPane);
        return totalGUI;
       }
       else{
        String[][] player=new String[obj.size()][9];
        for(int i=0;i<obj.size();i++)
        {
           
            player[i][0]=obj.get(i).getId();
            player[i][1]=obj.get(i).getfName();
            player[i][2]=obj.get(i).getFaName();
            player[i][3]= obj.get(i).getMidName();
            player[i][4]=obj.get(i).getWer();
            player[i][5]=obj.get(i).getKebe();
            player[i][6]=obj.get(i).getAgeof();
            player[i][7]=obj.get(i).getSexof();
            player[i][8]=obj.get(i).getPhonNum();
            
            
            
        }
        table=new JTable(player, title);
        table.addMouseListener(new MouseAdapter() {
           public void mouseClicked(MouseEvent e) {
  
          JTable target = (JTable)e.getSource();
            int row = target.getSelectedRow();
            index=row;
           
            }
         });	    
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setPreferredSize(new Dimension(1000,495));
        JPanel totalGUI = new JPanel();
        totalGUI.add(scrollPane);
        return totalGUI;
       }
                
    }
    public static int ret(){
        return index;
    }
   
  }
    
   
