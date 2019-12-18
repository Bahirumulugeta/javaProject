package study;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static study.Study.changable;
public class math extends JPanel{
    public math()
    {
    Font f1=new Font("Colonna MT",Font.BOLD,48);
    setSize(1000,500);
    setVisible(true);
//  JPanel p1=new JPanel();
    setSize(1000,500);
    setLayout(null);
    setBackground(Color.green);
    JButton b1=new JButton("Exercise");
        b1.setBounds(150,400,300,80);
        b1.setForeground(Color.pink);
        b1.setBackground(Color.darkGray);
        b1.setFont(f1);
        b1.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent ae) {
            changable(new matOperation());   
        }
    });
        JButton b2=new JButton("Calculator");
        b2.setBounds(500,400,400,80);
        b2.setForeground(Color.pink);
        b2.setBackground(Color.darkGray);
        b2.setFont(f1);
        b2.addActionListener(new ActionListener()
        {
        public void actionPerformed(ActionEvent a) {
            changable(new Scientific());
        }
    });
        add(b1);add(b2);
        
    
    }}