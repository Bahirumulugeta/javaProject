//package study;
//import java.awt.*;
//import java.awt.Event.*;
//import com.sun.speech.freetts.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import javax.swing.*;
//public class missingWords extends JPanel{
//    private static final String vname="kevin16";
//    public missingWords()
//    {
//         Voice voice;
//           VoiceManager vm=VoiceManager.getInstance();
//           voice=vm.getVoice(vname);
//     voice.allocate();
//    setSize(1350,600);
//    setVisible(true);
//    JPanel p1=new JPanel();
//    p1.setSize(1000, 500);
//    p1.setLayout(null);
//    Font font=new Font("Algerian",Font.BOLD,42);
//    Font f1=new Font("Elephant",Font.BOLD,42);
//    Font f2=new Font("Algerian",Font.BOLD,32);
//    setLayout(null);
//    
//    JLabel l1=new JLabel("Please insert correct latter in specified place!");
//             JLabel l2=new JLabel("");
//             l2.setFont(f1);
//             JLabel l3=new JLabel("");
//             l3.setFont(f1);
//             JLabel l4=new JLabel("");
//             l4.setFont(f1);
//             JLabel l5=new JLabel("");
//             l5.setFont(f1);
//             JLabel l6=new JLabel("");
//             l6.setFont(f1);
//         JTextField t1=new JTextField(2);
//         t1.setFont(f1);
//         t1.setBackground(Color.green);
//         JTextField t2=new JTextField(2);
//         t2.setFont(f1);
//         t2.setBackground(Color.green);
//         JTextField t3=new JTextField(2);
//         t3.setFont(f1);
//         t3.setBackground(Color.green);
//         JTextField t4=new JTextField(2);
//         t4.setFont(f1);
//         t4.setBackground(Color.green);
//         JTextField t5=new JTextField(2);
//         t5.setFont(f1);
//         t5.setBackground(Color.green);
//        l1.setFont(f2);
//        l1.setBounds(50,50,950,50);
//        l1.setForeground(Color.blue);
//        p1.add(l1);
//        t1.setBounds(300,250,50,50);l2.setBounds(350,250,50,50);t2.setBounds(400,250,50,50);l3.setBounds(450,250,50,50);t3.setBounds(500,250,50,50);
//        l4.setBounds(550,250,50,50);t4.setBounds(600,250,50,50);l5.setBounds(650,250,50,50);t5.setBounds(700,250,50,50);l6.setBounds(750,250,50,50);
//        p1.add(t1);p1.add(l2);p1.add(t2);p1.add(l3);p1.add(t3);p1.add(l4);p1.add(t4);p1.add(l5);p1.add(t5);p1.add(l6);
//        JButton b1=new JButton("Play");
//        b1.setBounds(300,400,200,80);
//        b1.setForeground(Color.pink);
//        b1.setBackground(Color.darkGray);
//        b1.setFont(f1);
//        b1.addActionListener(new ActionListener()
//        {
//        public void actionPerformed(ActionEvent ae) {
//            l2.setText("m");
//            l3.setText("r");
//            l4.setText("l");
//            l5.setText("a");
//            try{
//              voice.speak("Umbrella");
//           }
//           catch(Exception e){ }
//        }});
//         JButton b2=new JButton("Check");
//        b2.setBounds(550,400,200,80);
//        b2.setForeground(Color.pink);
//        b2.setBackground(Color.darkGray);
//        b2.setFont(f1);
//        b2.addActionListener(new ActionListener()
//        {
//        public void actionPerformed(ActionEvent aa)
//        {
//       String s=(t1.getText()+l2.getText()+t2.getText()+l3.getText()+t3.getText()+l4.getText()+t4.getText()+l5.getText()+t5.getText()+l6.getText());
//       String se="Umbrella";
//        if(s.equals(se))
//          {
//        try{
//           voice.speak("Corract");
//           }
//           catch(Exception e){ }
//            JOptionPane.showMessageDialog(null,"Correct");
//            l2.setText("");l3.setText("");l4.setText(""); l5.setText(""); t1.setText(""); t2.setText("");  t3.setText("");
//            l2.setText("");l6.setText("");t4.setText("");t5.setText("");
//        }
//        else{
//            try{
//              voice.speak("there is an error, please try again");
//            }
//           catch(Exception e){ }
//            JOptionPane.showMessageDialog(null,"There is an error, please try again");
//            l3.setText(""); l4.setText(""); l5.setText(""); t1.setText("");t2.setText("");t3.setText("");
//            l2.setText("");  l6.setText("");t4.setText("");t5.setText("");
//        }
//        }});
//        p1.add(b2);
//        p1.add(b1);
//        p1.setBackground(Color.green);
//        add(p1);
//    }
//    
//}
