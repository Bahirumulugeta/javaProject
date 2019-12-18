package study;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Scientific extends JPanel implements ActionListener{
    JPanel p;
    JTextField tf,tf2,tf3;
    JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btzero,add,sub,mul,div,clear,point,equal;
    JButton sin,cos,tan,log,sqr,sqrt,cube,pow,fact;
    static double tem,result2,result3,powres;int dig;
    static int op;//used to know which operator is used before 1 for addition,2 for subtraction,3 for multiplication and 4 for division
    public Scientific(){
        setSize(540,580);
        setLayout(null);
      //  setLocationRelativeTo(null);
        setVisible(true);
        p=new JPanel();
        p.setLayout(null);
        p.setBounds(0,0,540,580);
        addtextfield();
        p.add(tf);
        p.setBackground(Color.DARK_GRAY);
       // p.add(tf2);
       // p.add(tf3);
        addbutton();
        
        add(p);
    }
    public void addtextfield(){
        tf=new JTextField();
        tf.setBounds(20,20,350,50);
        tf2=new JTextField();
        tf2.setBounds(240,20,70,50);
        tf.setEditable(false);
        tf2.setEditable(false);
        tf3=new JTextField();
        tf3.setBounds(310,30,60,40);
        tf3.setEditable(false);
    }
    public void addbutton(){
        clear=new JButton("Clear");
        clear.setBounds(430,20,80,50);
        clear.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e){
               tf.setText("");
               tf2.setText("");
               tf3.setText("");
               op=0;
               dig=0;
           } 
        });
        
        sqr=new JButton("sqr");
        sqr.setBounds(20,130,80,50);
        sqr.addActionListener(this);
        
        sqrt=new JButton("sqrt");
        sqrt.setBounds(110,130,80,50);
        sqrt.addActionListener(this);
        
        cube=new JButton("cube");
        cube.setBounds(200,130,80,50);
        cube.addActionListener(this);
        
        pow=new JButton("^");
        pow.setBounds(290,130,80,50);
        pow.addActionListener(this);
        
        fact=new JButton("!");
        fact.setBounds(430,130,80,50);
        fact.addActionListener(this);
        
        bt7=new JButton("7");
        bt7.setBounds(20,200,80,50);
        bt7.addActionListener(this);
        
        bt8=new JButton("8");
        bt8.setBounds(110,200,80,50);
        bt8.addActionListener(this);
        
        bt9=new JButton("9");
        bt9.setBounds(200,200,80,50);
        bt9.addActionListener(this);
        
        div=new JButton("/");
        div.setBounds(290,200,80,50);
        div.addActionListener(this);
        
        sin=new JButton("sin");
        sin.setBounds(430,200,80,50);
        sin.addActionListener(this);
        
        bt4=new JButton("4");
        bt4.setBounds(20,270,80,50);
        bt4.addActionListener(this);
        
        bt5=new JButton("5");
        bt5.setBounds(110,270,80,50);
        bt5.addActionListener(this);
        
        bt6=new JButton("6");
        bt6.setBounds(200,270,80,50);
        bt6.addActionListener(this);
        
        mul=new JButton("*");
        mul.setBounds(290,270,80,50);
        mul.addActionListener(this);
        
        cos=new JButton("cos");
        cos.setBounds(430,270,80,50);
        cos.addActionListener(this);
        
        bt1=new JButton("1");
        bt1.setBounds(20,340,80,50);
        bt1.addActionListener(this);
        
        bt2=new JButton("2");
        bt2.setBounds(110,340,80,50);
        bt2.addActionListener(this);
        
        bt3=new JButton("3");
        bt3.setBounds(200,340,80,50);
        bt3.addActionListener(this);
        
        sub=new JButton("-");
        sub.setBounds(290,340,80,50);
        sub.addActionListener(this);
        
        tan=new JButton("tan");
        tan.setBounds(430,340,80,50);
        tan.addActionListener(this);
        
        point=new JButton(".");
        point.setBounds(20,410,80,50);
        point.addActionListener(this);
        
        btzero=new JButton("0");
        btzero.setBounds(110,410,80,50);
        btzero.addActionListener(this);
        
        equal=new JButton("=");
        equal.setBounds(200,410,80,50);
        equal.addActionListener(this);
        
        add=new JButton("+");
        add.setBounds(290,410,80,50);
        add.addActionListener(this);
        
        log=new JButton("log");
        log.setBounds(430,410,80,50);
        log.addActionListener(this);
        
         p.add(clear);
         p.add(sqr);
         p.add(sqrt);
         p.add(cube);
         p.add(pow);
         p.add(fact);
         p.add(bt7);
         p.add(bt8);
         p.add(bt9);
         p.add(div);
         p.add(sin);
         p.add(bt4);
         p.add(bt5);
         p.add(bt6);
         p.add(mul);
         p.add(cos);
         p.add(bt1);
         p.add(bt2);
         p.add(bt3);
         p.add(sub);
         p.add(tan);
         p.add(point);
         p.add(btzero);
         p.add(equal);
         p.add(add);
         p.add(log);
    }
    public void actionPerformed(ActionEvent e)
    {
        
        if(e.getSource()==bt1)
        {
          tf.setText(tf.getText().concat("1"));
          tf3.setText(tf3.getText().concat("1"));
          dig++;
        }
        if(e.getSource()==bt2)
        {
          tf.setText(tf.getText().concat("2"));
          tf3.setText(tf3.getText().concat("2"));
          dig++;
        }
          
        if(e.getSource()==bt3)
        {
         tf.setText(tf.getText().concat("3"));
         tf3.setText(tf3.getText().concat("3"));
         dig++;
        }
        if(e.getSource()==bt4)
        {
          tf.setText(tf.getText().concat("4"));
          tf3.setText(tf3.getText().concat("4"));
          dig++;
        }
        if(e.getSource()==bt5)
        {
          tf.setText(tf.getText().concat("5"));
          tf3.setText(tf3.getText().concat("5"));
          dig++;
        }
        if(e.getSource()==bt6)
        {
          tf.setText(tf.getText().concat("6"));
          tf3.setText(tf3.getText().concat("6"));
          dig++;
        }
        if(e.getSource()==bt7)
        {
          tf.setText(tf.getText().concat("7"));
          tf3.setText(tf3.getText().concat("7"));
          dig++;
        }
        if(e.getSource()==bt8)
        {
          tf.setText(tf.getText().concat("8"));
          tf3.setText(tf3.getText().concat("8"));
          dig++;
        }
        if(e.getSource()==bt9)
        {
          tf.setText(tf.getText().concat("9"));
          tf3.setText(tf3.getText().concat("9"));
          dig++;
        }
        if(e.getSource()==btzero)
        {
          tf.setText(tf.getText().concat("0"));
          tf3.setText(tf3.getText().concat("0"));
          dig++;
        }
        if(e.getSource()==point)
        {
          if(dig!=0)
          {
           tf.setText(tf.getText().concat("."));
           tf3.setText(tf3.getText().concat("."));
          }
          else
          {
           tf.setText(tf.getText().concat("0."));
           tf3.setText(tf3.getText().concat("0."));
          }
              
        }
        
        if(e.getSource()==sqr)   
        {
          if(tf3.getText().equals(""))
              tf.setText("syntax error");
          else{
              double res=Double.parseDouble(tf3.getText());
              tf.setText(tf.getText()+"^2");
              tf3.setText((Math.pow(res,2))+"");
          }
        }
        if(e.getSource()==sqrt)
        {
         if(tf3.getText().equals(""))
            tf.setText("syntax error");
         else{
              double res=Double.parseDouble(tf3.getText());
              
              tf.setText("√("+tf.getText()+")");
              tf3.setText((Math.sqrt(res))+"");
          }
        }
        if(e.getSource()==cube)
        {
         if(tf3.getText().equals(""))
            tf.setText("syntax error");
         else{
              double res=Double.parseDouble(tf3.getText());
              tf.setText(tf.getText()+"^3");
              tf3.setText((Math.pow(res,3))+"");
          }   
        }
        if(e.getSource()==pow)
        {
         if(tf3.getText().equals(""))
            tf.setText("syntax error");
         else{
              powres=Double.parseDouble(tf3.getText());
              tf.setText(tf.getText()+"^");
              tf3.setText("");         
          }   
        }
        if(e.getSource()==fact)
        {
        if(tf3.getText().equals(""))
              tf.setText("syntax error");
          else{
              int res=Integer.parseInt(tf3.getText());
              int sum=1;
              tf.setText(tf.getText()+"!");
              for(int i=1;i<=res;i++)
              {
                  sum*=i;
              }
              tf3.setText(sum+"");
          }
        }
        if(e.getSource()==sin)
        {
          if(tf3.getText().equals(""))
              tf.setText("syntax error");
          else{
              double res=Double.parseDouble(tf3.getText());
              tf.setText("sin("+tf.getText()+")");
              tf3.setText((Math.sin(res))+"");
          }
        }
        if(e.getSource()==cos)
        {
          if(tf3.getText().equals(""))
              tf.setText("syntax error");
          else{
              double res=Double.parseDouble(tf3.getText());
              tf.setText("cos("+tf.getText()+")");
              tf3.setText((Math.cos(res))+"");
          }
        }
        if(e.getSource()==tan)
        {
          if(tf3.getText().equals(""))
              tf.setText("syntax error");
          else{
              double res=Double.parseDouble(tf3.getText());
              tf.setText("tan("+tf.getText()+")");
              tf3.setText((Math.tan(res))+"");
          }
        }
        if(e.getSource()==log)
        {
          if(tf3.getText().equals(""))
              tf.setText("syntax error");
          else{
              double res=Double.parseDouble(tf3.getText());
              tf.setText("log("+tf.getText()+")");
              tf3.setText((Math.log(res))+"");
          }
        }
        if(e.getSource()==div)
           {
             if(tf2.getText().equals(""))
             {
             result3=Double.parseDouble(tf3.getText());
             tf.setText(tf.getText().concat("/"));
             tf2.setText((result3)+"");
             tf3.setText("");
             }
            else{
             if(powres==0)
              {
             result2=Double.parseDouble(tf2.getText());
             result3=Double.parseDouble(tf3.getText());
             tf.setText(tf.getText().concat("/"));
              if(op==1)
                tf2.setText((result2+result3)+"");
              else if(op==2)
               tf2.setText((result2-result3)+"");
              else if(op==3)
               tf2.setText((result2*result3)+"");
              else if(op==4)
               tf2.setText((result2/result3)+"");
               tf3.setText("");
              }
             else
              {
             result2=Double.parseDouble(tf2.getText());
             result3=Double.parseDouble(tf3.getText());
             result3=Math.pow(powres, result3);
             tf.setText(tf.getText().concat("/"));
              if(op==1)
                tf2.setText((result2+result3)+"");
              else if(op==2)
               tf2.setText((result2-result3)+"");
              else if(op==3)
               tf2.setText((result2*result3)+"");
              else if(op==4)
               tf2.setText((result2/result3)+"");
               tf3.setText("");
              }
             }   
             op=4;
             powres=0;
           }
        if(e.getSource()==mul)
            {
             if(tf2.getText().equals(""))
             {
             result3=Double.parseDouble(tf3.getText());
             tf.setText(tf.getText().concat("*"));
             tf2.setText((result3)+"");
             tf3.setText("");
             }
             else{
             if(powres==0)
              {
             result2=Double.parseDouble(tf2.getText());
             result3=Double.parseDouble(tf3.getText());
             tf.setText(tf.getText().concat("*"));
              if(op==1)
                tf2.setText((result2+result3)+"");
              else if(op==2)
               tf2.setText((result2-result3)+"");
              else if(op==3)
               tf2.setText((result2*result3)+"");
              else if(op==4)
               tf2.setText((result2/result3)+"");
               tf3.setText("");
              }
             else
              {
             result2=Double.parseDouble(tf2.getText());
             result3=Double.parseDouble(tf3.getText());
             result3=Math.pow(powres, result3);
             tf.setText(tf.getText().concat("*"));
              if(op==1)
                tf2.setText((result2+result3)+"");
              else if(op==2)
               tf2.setText((result2-result3)+"");
              else if(op==3)
               tf2.setText((result2*result3)+"");
              else if(op==4)
               tf2.setText((result2/result3)+"");
               tf3.setText("");
              }
             }     
             op=3;
             
            }
        if(e.getSource()==sub) 
           {
             if(tf2.getText().equals(""))
             {
             result3=Double.parseDouble(tf3.getText());
             tf.setText(tf.getText().concat("-"));
             tf2.setText((result3)+"");
             tf3.setText("");
             }
             else{
              if(powres==0)
              {
             result2=Double.parseDouble(tf2.getText());
             result3=Double.parseDouble(tf3.getText());
             tf.setText(tf.getText().concat("-"));
              if(op==1)
                tf2.setText((result2+result3)+"");
              else if(op==2)
               tf2.setText((result2-result3)+"");
              else if(op==3)
               tf2.setText((result2*result3)+"");
              else if(op==4)
               tf2.setText((result2/result3)+"");
               tf3.setText("");
              }
             else
              {
             result2=Double.parseDouble(tf2.getText());
             result3=Double.parseDouble(tf3.getText());
             result3=Math.pow(powres, result3);
             tf.setText(tf.getText().concat("-"));
              if(op==1)
                tf2.setText((result2+result3)+"");
              else if(op==2)
               tf2.setText((result2-result3)+"");
              else if(op==3)
               tf2.setText((result2*result3)+"");
              else if(op==4)
               tf2.setText((result2/result3)+"");
               tf3.setText("");
              }
             }     
             op=2;
             powres=0;
           }
        if(e.getSource()==add)
           {
             if(tf2.getText().equals(""))
             {
             result3=Double.parseDouble(tf3.getText());
             tf.setText(tf.getText().concat("+"));
             tf2.setText((result3)+"");
             tf3.setText("");
             }
             else{
                 
              if(powres==0)
              {
             result2=Double.parseDouble(tf2.getText());
             result3=Double.parseDouble(tf3.getText());
             tf.setText(tf.getText().concat("+"));
              if(op==1)
                tf2.setText((result2+result3)+"");
              else if(op==2)
               tf2.setText((result2-result3)+"");
              else if(op==3)
               tf2.setText((result2*result3)+"");
              else if(op==4)
               tf2.setText((result2/result3)+"");
               tf3.setText("");
              }
             else
              {
             result2=Double.parseDouble(tf2.getText());
             result3=Double.parseDouble(tf3.getText());
             result3=Math.pow(powres, result3);
             tf.setText(tf.getText().concat("+"));
              if(op==1)
                tf2.setText((result2+result3)+"");
              else if(op==2)
               tf2.setText((result2-result3)+"");
              else if(op==3)
               tf2.setText((result2*result3)+"");
              else if(op==4)
               tf2.setText((result2/result3)+"");
               tf3.setText("");
              }
             } 
             op=1;
             powres=0;
           }
        if(e.getSource()==equal)
        { 
          if(tf2.getText().equals("")&&!(powres==0))
          {
              double r=Double.parseDouble(tf3.getText());
              r=Math.pow(powres, r);
              tf.setText(""+r);
          }
          else if(tf2.getText().equals("")&&(powres==0))
              tf.setText(tf3.getText());
          
          else
          {
             if(powres==0)
             {
              result2=Double.parseDouble(tf2.getText());
              result3=Double.parseDouble(tf3.getText());
              if(op==1)
                tf.setText(""+(result2+result3));
              else if(op==2)
                tf.setText(""+(result2-result3));
              else if(op==3)
               tf.setText(""+(result2*result3));
              else if(op==4)
               tf.setText(" "+(result2/result3));
              }
             else
             {
              result2=Double.parseDouble(tf2.getText());
              result3=Double.parseDouble(tf3.getText());
              result3=Math.pow(powres, result3);
              if(op==1)
                tf.setText(" "+(result2+result3));
              else if(op==2)
                tf.setText(" "+(result2-result3));
              else if(op==3)
               tf.setText(" "+(result2*result3));
              else if(op==4)
               tf.setText(" "+(result2/result3));
             }
          }
          tf3.setText("");
        }    
    }
}
