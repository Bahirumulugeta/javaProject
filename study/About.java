
package study;
import javax.swing.*;
import java.awt.*;
public class About extends JPanel{
    public About()
    {
       setLayout(null);
       setSize(1000, 500);    
	        
	JLabel Image_Bahiru = new JLabel(new ImageIcon(About.class.getResource("/image/Bahiru.jpg")));
	        Image_Bahiru.setBounds(0, 0, 200, 250);
	        add(Image_Bahiru);
	        String txt = "NAME:-Bahiru Mulugeta\n"
	                + "Sex:Male\n"
	                + "Age:20\n"
	                + "Status:2nd Year Software Enginner\n"
	                + "Contact:+251948750343\n"
	                + "email:bahirumuugeta1@gmail.com";
	        
	        JTextArea bahiru_info = new JTextArea(txt);
	        bahiru_info.setBackground(new Color(217, 217, 255));
	        bahiru_info.setBounds(210, 20, 200, 130);
	        bahiru_info.setEditable(false);
	        add(bahiru_info);
         JLabel Image_Belete = new JLabel(new ImageIcon(About.class.getResource("/image/belete.jpg")));
	        Image_Belete.setBounds(0, 250, 200, 250);
	        add(Image_Belete);
	        String txt1 = "NAME:-Belete Alehegn\n"
	                + "Sex:Male\n"
	                + "Age:20\n"
	                + "Status:2nd Year Software Enginner\n"
	                + "Contact:+251948750343\n"
	                + "email:bahirumuugeta1@gmail.com";
	        
	        JTextArea belete_info = new JTextArea(txt1);
	        belete_info.setBackground(new Color(217, 217, 255));
	        belete_info.setBounds(210, 270, 200, 130);
	        belete_info.setEditable(false);
	        add(belete_info);
        JLabel Image_Bekau = new JLabel(new ImageIcon(About.class.getResource("/image/bekalu.jpg")));
	        Image_Bekau.setBounds(590, 0, 200, 250);
	        add(Image_Bekau);
	        String txt2 = "NAME:-Bekalu Getnet\n"
	                + "Sex:Male\n"
	                + "Age:20\n"
	                + "Status:2nd Year Software Enginner\n"
	                + "Contact:+251948750343\n"
	                + "email:bahirumuugeta1@gmail.com";
	        
	        JTextArea bekalu_info = new JTextArea(txt2);
	        bekalu_info.setBackground(new Color(217, 217, 255));
	        bekalu_info.setBounds(800, 20, 200, 130);
	        bekalu_info.setEditable(false);
	        add(bekalu_info);
        JLabel Image_Bereket = new JLabel(new ImageIcon(About.class.getResource("/image/beki.jpg")));
	        Image_Bereket.setBounds(580, 250, 200, 250);
	        add(Image_Bereket);
	        String txt3 = "NAME:-Bereket weldesillase\n"
	                + "Sex:Male\n"
	                + "Age:20\n"
	                + "Status:2nd Year Software Enginner\n"
	                + "Contact:+251948750343\n"
	                + "email:bahirumuugeta1@gmail.com";
	        
	        JTextArea beki_info = new JTextArea(txt3);
	        beki_info.setBackground(new Color(217, 217, 255));
	        beki_info.setBounds(800, 270, 200, 130);
	        beki_info.setEditable(false);
	        add(beki_info);

	      
	        setVisible(true);

    }
}
