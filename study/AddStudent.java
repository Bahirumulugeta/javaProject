
package study;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import static study.Registration.obj;
import static study.Study.addstud;
public class AddStudent extends JPanel 
{
    
    static JPanel newregistration;
    JButton editstudinfo,deletestudinfo;
    
    
   public AddStudent(String texts)
   {
       setBackground(Color.white);
		setSize(1000,70);
		setLayout(null);
                
       addnewstudents();
       addedits();
       adddelets();
   }
   public AddStudent()
   {
       setBackground(Color.white);
		setSize(1000,500);
		//setLayout(null);
                
       Display d=new Display();
        add(new JScrollPane(d.createContentPane()));
    
   }
   private void addnewstudents()
   {
   
        newregistration = new JPanel();
        newregistration.setBounds(150, 5, 150, 60);
        newregistration.setBackground(Color.gray);
        newregistration.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                Study.changable(new Registration());
            }

            public void mousePressed(MouseEvent e) {
                newregistration.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                Color release = new Color(217, 217, 255);
                newregistration.setBackground(Color.red);
            }

            public void mouseEntered(MouseEvent e) {
                newregistration.setBackground(Color.red);
            }

            public void mouseExited(MouseEvent e) {

                newregistration.setBackground(Color.gray);
            }
        });
        JLabel aboutuslabel = new JLabel("AddStud");
        aboutuslabel.setBounds(0,0,150,60);
        aboutuslabel.setFont(new Font("Elephant", Font.BOLD + Font.ITALIC, 20));
        newregistration.add(aboutuslabel);
       add(newregistration);
   }
   private void addedits()
   {
       editstudinfo=new JButton("Edit");
       editstudinfo.setBounds(400, 5, 150, 60);
       editstudinfo.setBackground(Color.GRAY);
       editstudinfo.setFont(new Font("Elephant", Font.BOLD + Font.ITALIC, 20));
       editstudinfo.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent evt)
          {
            Study.changable(new DispforEdit());
          }
       }) ;
       add(editstudinfo);
   }
   private void adddelets()
   {
       deletestudinfo=new JButton("Delete");
       deletestudinfo.setBounds(650, 5, 150, 60);
       deletestudinfo.setBackground(Color.GRAY);
       deletestudinfo.setFont(new Font("Elephant", Font.BOLD + Font.ITALIC, 20));
       deletestudinfo.addActionListener(new ActionListener()
       {
          public void actionPerformed(ActionEvent evt)
          {
            int index=Display.ret();
            obj.remove(index);
            Study.changable(new AddStudent());
          }
       }) ;      

       add(deletestudinfo);
   }
  

}
