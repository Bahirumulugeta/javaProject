//
//package study;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//public class Question extends JPanel{
//    String question,ans1,ans2,ans3,ans4,corre;
//    static ArrayList<Question>quesobj= new ArrayList<>();
//    static int i;
//    static String cor,getans;
//    static int befo;
//   JTextArea area;
//   JButton next;
//   JTextField ans;
//    JTextField f1,f2,f3; 
//    JRadioButton bt1,bt2,bt3,bt4,hid;
//    
//      Connection conn = null;
//      ResultSet rs = null;
//      PreparedStatement ps = null;
//     public Question(String question, String ans1, String ans2, String ans3, String ans4, String corre) 
//           {
//               this.question=question;
//               this.ans1=ans1;
//               this.ans2=ans2;
//               this.ans2=ans2;
//               this.ans3=ans3;
//               this.ans4=ans4;
//               this.corre=corre;
//           }
//
//    public String getQuestion() {
//        return question;
//    }
//
//    public void setQuestion(String question) {
//        this.question = question;
//    }
//
//    public String getAns1() {
//        return ans1;
//    }
//
//    public void setAns1(String ans1) {
//        this.ans1 = ans1;
//    }
//
//    public String getAns2() {
//        return ans2;
//    }
//
//    public void setAns2(String ans2) {
//        this.ans2 = ans2;
//    }
//
//    public String getAns3() {
//        return ans3;
//    }
//
//    public void setAns3(String ans3) {
//        this.ans3 = ans3;
//    }
//
//    public String getAns4() {
//        return ans4;
//    }
//
//    public void setAns4(String ans4) {
//        this.ans4 = ans4;
//    }
//
//    public String getCorre() {
//        return corre;
//    }
//
//    public void setCorre(String corre) {
//        this.corre = corre;
//    }
//    public Question()
//    {
//      conn=Database.connectDb();
//      setSize(1000,500);
//      setLayout(null);
//            int index=0;
//            addquestion();
//            area=new JTextArea();
//            area.setBounds(20, 10, 950, 90);
//            area.setText(quesobj.get(index).getQuestion());
//            
//            add(area);
//             
//            bt1=new JRadioButton(quesobj.get(index).getAns1());
//             bt1.setBounds(20,120,230,60);
//            bt2=new JRadioButton(quesobj.get(index).getAns2());
//             bt2.setBounds(270,120,230,60);
//            bt3=new JRadioButton(quesobj.get(index).getAns3());
//             bt3.setBounds(520,120,230,60);
//            bt4=new JRadioButton(quesobj.get(index).getAns4());
//            bt4.setBounds(770,120,230,60);
//            hid=new JRadioButton();
//           ButtonGroup bp=new ButtonGroup();
//            bp.add(bt1);
//            bp.add(bt2);
//            bp.add(bt3);
//            bp.add(bt4);
//            bp.add(hid);
//            add(bt1);
//            add(bt2);
//            add(bt3);
//            add(bt4);  
//             
//            next=new JButton("Next");
//            next.setBounds(100,300,120,50);
//            next.addActionListener(new ActionListener(){
//                public void actionPerformed(ActionEvent e){
//                    if(bt1.isSelected())
//                    {
//                         getans=quesobj.get(i).getAns1();
//                         cor=quesobj.get(i).getCorre();
//                        if(getans.equalsIgnoreCase(cor))
//                        {
//                            
//                             befo=Integer.parseInt(ans.getText());
//                            ans.setText(++befo+"");
//                        }    
//                    }
//                    else if(bt2.isSelected())
//                    {
//                        getans=quesobj.get(i).getAns2();
//                         cor=quesobj.get(i).getCorre();
//                        if(getans.equalsIgnoreCase(cor))
//                        {
//                            
//                             befo=Integer.parseInt(ans.getText());
//                            ans.setText(++befo+"");
//                        }    
//                    }
//                    else if(bt3.isSelected())
//                    {
//                       getans=quesobj.get(i).getAns3();
//                         cor=quesobj.get(i).getCorre();
//                        if(getans.equalsIgnoreCase(cor))
//                        {
//                            
//                             befo=Integer.parseInt(ans.getText());
//                            ans.setText(++befo+"");
//                        }    
//                    }
//                    else if(bt4.isSelected())
//                    {
//                        getans=quesobj.get(i).getAns4();
//                        cor=quesobj.get(i).getCorre();
//                        if(getans.equalsIgnoreCase(cor))
//                        {
//                            
//                             befo=Integer.parseInt(ans.getText());
//                            ans.setText(++befo+"");
//                        }    
//                    }
//                    hid.setSelected(true);
//                    i=(int) (Math.random()*4);
//                    
//                        area.setText(quesobj.get(i).getQuestion());
//                        bt1.setText(quesobj.get(i).getAns1());
//                        bt2.setText(quesobj.get(i).getAns2());
//                        bt3.setText(quesobj.get(i).getAns3());
//                        bt4.setText(quesobj.get(i).getAns4());
//                      
//                }
//            });
//            ans=new JTextField("0");
//            ans.setBounds(700,300,120,50);
//            ans.setEditable(false);
//            add(next);
//            add(ans);
//    }
//    public void addquestion(){
//        try{
//            String data="select *from quesandanswe";
//            ps = conn.prepareStatement(data);
//            rs = ps.executeQuery(data);
//            while(rs.next())
//            {
//                quesobj.add(new Question(rs.getString("ques"),rs.getString("ans1"),rs.getString("ans2"),
//                rs.getString("ans3"),rs.getString("ans4"),rs.getString("correct")));
//            }
//            conn.close();
//        }
//        catch(SQLException e){
//             JOptionPane.showMessageDialog(null, e);
//        }
//      
//    }
//}
