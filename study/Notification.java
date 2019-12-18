
package study;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
public class Notification extends JFrame{
    JLabel strlabel;
    JButton okbtn;
    String str;
    public Notification(String type){
        str=type;
        setTitle("Notification");
        setSize(600,350);
        
        addlabel();
        addokbutton();
    }

    private void addlabel() {
      strlabel=new JLabel(str+" Successfully");
      strlabel.setBounds(50,0,500,100);
      strlabel.setForeground(Color.orange);
      strlabel.setBackground(Color.GRAY);
      strlabel.setFont(new Font("Elephant", Font.BOLD, 35));
      add(strlabel);
    }

    private void addokbutton() {
      okbtn=new JButton("OK");
      okbtn.setBounds(210,220,200,70);
      okbtn.setIcon(new ImageIcon(getClass().getResource("/image/ok.png")));
      okbtn.setForeground(Color.cyan);
      okbtn.setBackground(Color.GRAY);
      okbtn.setFont(new Font("Elephant", Font.BOLD,45));
      
      okbtn.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent evt)
          {
            dispose(); 
          }
      });
      add(okbtn);
    }
}
