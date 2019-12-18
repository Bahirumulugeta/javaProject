
package study;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Registration extends JPanel
{
    JButton regbutton,calcelbutton;
    JLabel titlelabel,regpage,sex,schpic;
    JTextField idfield,finame,laname,midname,wereda,kebele,age,pno;
    JRadioButton male,female;
     static ArrayList<Registration>obj= new ArrayList<>();
      private String id,fName,faName,midName;
      private String wer,kebe;
      private String ageof,sexof,phonNum;
   public Registration(String id,String fName,String faName,String midName,String wer,String kebe,
           String ageof,String sexof,String phonNum)
   {
       this.id=id;
       this.fName=fName;
       this.faName=faName;
       this.midName=midName;
       this.wer=wer;
       this.kebe=kebe;
       this.ageof=ageof;
       this.sexof=sexof;
       this.phonNum=phonNum;
   }
   public Registration()
   {
       
        setBackground(Color.white);
		setSize(1000,500);
		setLayout(null);

       
          addregpagelabel();
       addtitlelabel();
          addidfield();
          addfinamefield();
          addlanamefield();
          addmidnamefield();
       addsexlabel();
          addradiobutton();
       addweredafield();
       addkebelefield();
       addagelabel();
       addphonnum();
       addokbutton();
       addphoto();
   }
  public Registration(int i)
  {
      
  }

 private void addphoto(){
        schpic=new JLabel();
        schpic.setBounds(0, 0, 1000, 500);
        schpic.setIcon(new ImageIcon(getClass().getResource("/image/bahi.jpg")));
        add(schpic);
    }
    private void addregpagelabel() {
        regpage=new JLabel();
        regpage.setBounds(0, 0, 70, 60);
        regpage.setBackground(Color.black);
        regpage.setIcon(new ImageIcon(getClass().getResource("/image/students.png")));
        add(regpage);
    }

    private void addtitlelabel() {
        titlelabel=new JLabel("Student registration form");
        titlelabel.setForeground(Color.BLUE);
        titlelabel.setBounds(200, 0, 800, 60);
	titlelabel.setFont(new Font("Elephant",Font.BOLD+Font.ITALIC,40));
        add(titlelabel);
    }
   private void addidfield(){
       idfield=new JTextField("idNumber");
       idfield.setBounds(400, 70, 140, 40);
       idfield.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               idfield.setText("");
           }
       });
       add(idfield);
   }
    private void addfinamefield() {
        finame=new JTextField("FirstName");
        finame.setBounds(20,100,140,40);
        finame.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               finame.setText("");
           }
       });
        add(finame);
    }

    private void addlanamefield() {
        laname=new JTextField("LastName");
        laname.setBounds(20,200,140,40);
        laname.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               laname.setText("");
           }
       });
        add(laname);
    }

    private void addmidnamefield() {
         midname=new JTextField("MiddleName");
         midname.setBounds(20,300,140,40);
         midname.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               midname.setText("");
           }
       });
         add(midname);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getFaName() {
        return faName;
    }

    public void setFaName(String faName) {
        this.faName = faName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getWer() {
        return wer;
    }

    public void setWer(String wer) {
        this.wer = wer;
    }

    public String getKebe() {
        return kebe;
    }

    public void setKebe(String kebe) {
        this.kebe = kebe;
    }

    public String getAgeof() {
        return ageof;
    }

    public void setAgeof(String ageof) {
        this.ageof = ageof;
    }

    public String getSexof() {
        return sexof;
    }

    public void setSexof(String sexof) {
        this.sexof = sexof;
    }

    public String getPhonNum() {
        return phonNum;
    }

    public void setPhonNum(String phonNum) {
        this.phonNum = phonNum;
    }
    private void addsexlabel() {
       sex=new JLabel("Sex:");
       sex.setBounds(10,370,50,50);
       sex.setFont(new Font("Elephant",Font.BOLD,15));
       add(sex);
    }
   private void addradiobutton(){
        male=new JRadioButton("Male");
        female=new JRadioButton("Femal");
        male.setBounds(60, 370, 80, 40);
        female.setBounds(60, 420,80, 40);
        ButtonGroup bg=new ButtonGroup();    
         bg.add(male);
         bg.add(female);  
         add(male);
         add(female);
    }

  
    private void addweredafield() {
        wereda=new JTextField("Wereda");
        wereda.setBounds(850,100,140,40);
        wereda.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               wereda.setText("");
           }
       });
        add(wereda);
    }

    private void addkebelefield() {
        kebele=new JTextField("Kebele");
        kebele.setBounds(850,200,140,40);
        kebele.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               kebele.setText("");
           }
       });
        add(kebele);
    }
     private void addagelabel() {
        age=new JTextField("Age");
        age.setBounds(850,300,140,40);
        age.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               age.setText("");
           }
       });
        add(age);
    }
    private void addphonnum() {
       pno=new JTextField("phone number");
       pno.setBounds(850,400,140,40);
       pno.addMouseListener(new MouseAdapter(){
           @Override
           public void mouseClicked(MouseEvent e)
           {
               pno.setText("");
           }
       });
       add(pno);
       
    }
    private void addokbutton() {
       regbutton=new JButton("Register");
       regbutton.setBounds(400,400,170,60);
       regbutton.setFont(new Font("Elephant",Font.BOLD+Font.ITALIC,25));
       regbutton.setBackground(Color.gray);
       regbutton.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent evt)
           {
               if(idfield.getText().isEmpty()||finame.getText().isEmpty()||laname.getText().isEmpty()||
                       midname.getText().isEmpty()||wereda.getText().isEmpty()||kebele.getText().isEmpty()||
                       age.getText().isEmpty()||pno.getText().isEmpty()||
                       (!(male.isSelected())&&!(female.isSelected())))
               {
                   JOptionPane.showMessageDialog(null,"Please must fill all information","important idea", JOptionPane.ERROR_MESSAGE);
               }
               else 
               {
                   id=idfield.getText();
                   fName=finame.getText();
                   faName=laname.getText();
                   midName=midname.getText();
                   wer=wereda.getText();
                   kebe=kebele.getText();
                   ageof=age.getText();
                   phonNum=pno.getText();
                   
                   if(male.isSelected())
                       sexof=male.getText();
                   else
                       sexof=female.getText();
                   
                   obj.add(new Registration(id,fName,faName,midName,wer,kebe,ageof,sexof,phonNum));
                           
                   Notification not=new Notification("Registered");
                   not.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                   not.setLocationRelativeTo(null);
                   not.setLayout(null);
                   not.setVisible(true);
               }
                   
           }
       });
       add(regbutton); 
    }
}
