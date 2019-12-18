package study;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import static study.Study.changable;
public class Calculator2 extends JPanel {
      static int a,b,c,mul;
    Calculator2(){
        setLayout(null);
     // setTitle("simple calculator");
      setSize(1450,750);
       setVisible(true);
        Font font= new Font("Book Antiqua",Font.BOLD,72);
        Font font2= new Font("Book Antiqua",Font.BOLD,36);
        //JPanel p= new JPanel();
        setBounds(0,0,1450,800);
            JLabel l2=new JLabel("Advanse on four Mathimathical");
        l2.setFont(font);
        l2.setBounds(100,50,900,80);
        l2.setForeground(Color.blue);
        JLabel l3=new JLabel("operation");
        l3.setFont(font);
        l3.setBounds(400,160,900,80);
        l3.setForeground(Color.blue);
         JTextField txt5= new JTextField(8);
         txt5.setBounds(200,300,100,80);
        JLabel si =new JLabel("sign");
            si.setBounds(350,300,150,80);
        JTextField txt4= new JTextField(8);
        txt4.setToolTipText("Can not edit");
        txt4.setEditable(false);
        txt4.setBounds(500,300,100,80);
        JLabel l1=new JLabel("=");
        l1.setBounds(600,300,100,80);
         JTextField txt3= new JTextField(8);
         txt3.setToolTipText("Can not edit");
         txt3.setEditable(false);
         txt3.setBounds(750,300,100,80);
        JButton plbtn= new JButton("PLAY");
        plbtn.setBounds(400,420,150,50);
        JButton btnCheck= new JButton("check");
          btnCheck.setBounds(700,420,150,50);
        plbtn.addActionListener((ActionEvent e) -> {
 
            c= (int)(Math.random()*20);
            b= (int)(Math.random()*20);
            a=(int)(Math.random()*(4)+1);
                      switch (a)
                      {
                          case 1:
                              mul=c-b;
                              si.setText("+");
                               break;
                          case 2:
                              mul=b+c;
                               si.setText("-");
                              break;
                          case 3:
                              mul=c/b;
                               si.setText("*");
                              break;
                          case 4:
                               si.setText("/");
                              mul=c*b;
                              break;
                      }
                String st1= String.valueOf(c);
                String st2=String.valueOf(b);
            txt3.setText(st1);
            txt4.setText(st2);
        });
        btnCheck.addActionListener((ActionEvent e) -> {
           
            int x1 = Integer.parseInt(txt5.getText());
            if (mul == x1) {
                JOptionPane.showMessageDialog(null,"CORRECT");
            } else if(mul !=x1) {
                JOptionPane.showMessageDialog(null,"IN CORRECT");
            }
            else if( txt5.getText().isEmpty()){
                 JOptionPane.showMessageDialog(null,"please enetr value");
            }
             txt5.setText("");
            txt4.setText("");
            si.setText("");
           txt3.setText("");
           if (mul == x1) {
               changable(new Calculator3());
            }  
        });
         si.setFont(font);
         txt3.setFont(font);
         txt4.setFont(font);
         txt5.setFont(font);
         l1.setFont(font);
         plbtn.setFont(font2);
         btnCheck.setFont(font2);
         //setBackground(Color.green);
        add(l2);add(l3);add(txt5);add(si); add(txt4);add(l1);add(txt3);add(plbtn);add(btnCheck);
      
    }
    /*
    public static void main(String [] args){
        Calculator2 obj= new Calculator2();
       obj.setTitle("simple calculator");
      obj. setSize(1450,750);
       obj. setVisible(true);

    }*/
    }


