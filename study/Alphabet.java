//
//package study;
//import javax.swing.*;
//import java.awt.*;
//import java.io.*;
//import com.sun.speech.freetts.*;
//import java.awt.Event.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//public class Alphabet extends JPanel{
//    private static final String vname="kevin16";
//    static JLabel l1=new JLabel("");
//    static JLabel l2=new JLabel("");
//    static JPanel b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,p3;
//    static JPanel pa =new JPanel();
//    static JPanel pb =new JPanel();
//    static JPanel pc =new JPanel();
//    static JPanel pd =new JPanel();
//    static JPanel pe =new JPanel();
//    static JPanel pf =new JPanel();
//    static JPanel pg =new JPanel();
//    static JPanel ph =new JPanel();
//    static JPanel pi =new JPanel();
//    static JPanel pj =new JPanel();
//    static JPanel pk =new JPanel();
//    static JPanel pl =new JPanel();
//    static JPanel pm =new JPanel();
//    static JPanel pn =new JPanel();
//    static JPanel po =new JPanel();
//    static JPanel pp =new JPanel();
//    static JPanel pq =new JPanel();
//    static JPanel pr =new JPanel();
//    static JPanel ps =new JPanel();
//    static JPanel pt =new JPanel();
//    static JPanel pu =new JPanel();
//    static JPanel pv =new JPanel();
//    static JPanel pw =new JPanel();
//    static JPanel px =new JPanel();
//    static JPanel py =new JPanel();
//    static JPanel pz =new JPanel();
//    public Alphabet()
//    {
//        Voice voice;
//           VoiceManager vm=VoiceManager.getInstance();
//           voice=vm.getVoice(vname);
//           voice.allocate();
//     JFrame fram=new JFrame();
//     Font font=new Font("Colonna MT",Font.BOLD,50);
//     Font f=new Font("Colonna MT",Font.BOLD,200);
//     Font f2=new Font("Colonna MT",Font.BOLD,34);
//      fram.setLayout(null);
//      fram.setVisible(true);
//      fram.setSize(1400,780);
//   // JPanel p1=new JPanel();
//    JPanel p2=new JPanel();
//    p2.setLayout(null);
//     p2.setBounds(50,0,1300,750);
//   //  p1.setBounds(50,400,1300,410);
//   //  p1.setFont(font);
//     p2.setBackground(Color.pink);
//  //  p1.setBackground(Color.pink);
//   // p1.setLayout(null);
//    p3=new JPanel();
//    p3.setLayout(null);
//    p3.setBounds(600,100,650,375);
//    p3.setBackground(Color.pink);
//    l1.setBounds(400,300,200,200);
//    l1.setForeground(Color.blue);
//    l1.setFont(f);
//   l2.setForeground(Color.blue);
//   l2.setBounds(700,480,400,45);
//   l2.setFont(f2);
//     b1=new JPanel();
//     b1.setBounds(10,525,90,100);
//     b1.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pa);
//                aa();
//                try{
//              voice.speak("A  for apple");
//           }
//           catch(Exception a)
//           { }
//            }
//            public void mousePressed(MouseEvent e) {
//                b1.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b1.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b1.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//
//                b1.setBackground(Color.WHITE);
//            }
//        });
//        JLabel aboutla = new JLabel("A");
//        aboutla.setBounds(10,125,90,100);
//        aboutla.setForeground(Color.BLACK);
//        aboutla.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b1.add(aboutla);
//        p2.add(b1);
//       b2=new JPanel();
//       b2.setBounds(110,525,90,100);
//       b2.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pb);
//                bb();
//                  try{
//              voice.speak("B for Bowl");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b2.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b2.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b2.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b2.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lb = new JLabel("B");
//        lb.setBounds(110,525,90,100);
//        lb.setForeground(Color.BLACK);
//        lb.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b2.add(lb);
//        p2.add(b2);
//        
//       b3=new JPanel();
//       b3.setBounds(210,525,90,100);
//       b3.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pc);
//                cc();
//                  try{
//              voice.speak("C for Cat");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b3.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b3.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b3.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b3.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lc = new JLabel("C");
//        lc.setBounds(210,525,90,100);
//        lc.setForeground(Color.BLACK);
//        lc.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b3.add(lc);
//        p2.add(b3);
//     
//       b4=new JPanel();
//       b4.setBounds(310,525,90,100);
//       b4.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pd);
//                dd();
//                  try{
//              voice.speak("D for Dog");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b4.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b4.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b4.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b4.setBackground(Color.WHITE);
//            }
//        });
//        JLabel ld = new JLabel("D");
//        ld.setBounds(310,125,90,100);
//        ld.setForeground(Color.BLACK);
//        ld.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b4.add(ld);
//        p2.add(b4);
//     
//       b5=new JPanel();
//       b5.setBounds(410,525,90,100);
//       b5.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pe);
//                ee();
//                  try{
//              voice.speak("E for Elephant");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b5.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b5.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b5.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b5.setBackground(Color.WHITE);
//            }
//        });
//        JLabel le = new JLabel("E");
//        le.setBounds(410,525,90,100);
//        le.setForeground(Color.BLACK);
//        le.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b5.add(le);
//        p2.add(b5);
//     
//       b6=new JPanel();
//       b6.setBounds(510,525,90,100);
//       b6.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pf);
//                ff();
//                 try{
//              voice.speak("F for food");
//           }
//           catch(Exception a)
//           { }
//            }
//          public void mousePressed(MouseEvent e) {
//                b6.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b6.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b6.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b6.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lf = new JLabel("F");
//        lf.setBounds(510,525,90,100);
//        lf.setForeground(Color.BLACK);
//        lf.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b6.add(lf);
//        p2.add(b6);
//      
//       b7=new JPanel();
//       b7.setBounds(610,525,90,100);
//       b7.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pg);
//                gg();
//                 try{
//              voice.speak("G for Grapes");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b7.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b7.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b7.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b7.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lg = new JLabel("G");
//        lg.setBounds(610,525,90,100);
//        lg.setForeground(Color.BLACK);
//        lg.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b7.add(lg);
//        p2.add(b7);
//      
//       b8=new JPanel();
//       b8.setBounds(710,525,90,100);
//       b8.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(ph);
//                hh();
//                 try{
//              voice.speak("H for House");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b8.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b8.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b8.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b8.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lh = new JLabel("H");
//        lh.setBounds(710,525,90,100);
//        lh.setForeground(Color.BLACK);
//        lh.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b8.add(lh);
//        p2.add(b8);
//      
//       b9=new JPanel();
//       b9.setBounds(810,525,90,100);
//       b9.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pi);
//                ii();
//                 try{
//              voice.speak("I for Icecream");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b9.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b9.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b9.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b9.setBackground(Color.WHITE);
//            }
//        });
//        JLabel li = new JLabel("I");
//        li.setBounds(810,525,90,100);
//        li.setForeground(Color.BLACK);
//        li.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b9.add(li);
//        p2.add(b9);
//     
//       b10=new JPanel();
//       b10.setBounds(910,525,90,100);
//       b10.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pj);
//                jj();
//                 try{
//              voice.speak("J for Jacket");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b10.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b10.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b10.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b10.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lj = new JLabel("J");
//        lj.setBounds(910,525,90,100);
//        lj.setForeground(Color.BLACK);
//        lj.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b10.add(lj);
//        p2.add(b10);
//     
//       b11=new JPanel();
//       b11.setBounds(1010,525,90,100);
//       b11.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pk);
//                kk();
//                 try{
//              voice.speak("K for Key");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b11.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b11.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b11.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b11.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lk = new JLabel("K");
//        lk.setBounds(1010,525,90,100);
//        lk.setForeground(Color.BLACK);
//        lk.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b11.add(lk);
//        p2.add(b11);
//    
//       b12=new JPanel();
//       b12.setBounds(1110,525,90,100);
//       b12.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pl);
//                ll();
//                 try{
//              voice.speak("L for Lemon");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b12.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b12.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b12.setBackground(Color.white);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b12.setBackground(Color.white);
//            }
//        });
//        JLabel ll = new JLabel("L");
//        ll.setBounds(1110,525,90,100);
//        ll.setForeground(Color.BLACK);
//        ll.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b12.add(ll);
//        p2.add(b12);
//
//       b13=new JPanel();
//       b13.setBounds(1210,525,90,100);
//       b13.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pm);
//                mm();
//                 try{
//              voice.speak("M for Motorcycle");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b13.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b13.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b13.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b13.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lm = new JLabel("M");
//        lm.setBounds(1210,525,90,100);
//        lm.setForeground(Color.BLACK);
//        lm.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b13.add(lm);
//        p2.add(b13);
//   
//       b14=new JPanel();
//       b14.setBounds(10,640,90,100);
//       b14.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pn);
//                nn();
//                 try{
//              voice.speak("N for Nest");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b14.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b14.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b14.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b14.setBackground(Color.WHITE);
//            }
//        });
//        JLabel ln = new JLabel("N");
//        ln.setBounds(10,640,90,100);
//        ln.setForeground(Color.BLACK);
//        ln.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b14.add(ln);
//        p2.add(b14);
//  
//       b15=new JPanel();
//       b15.setBounds(110,640,90,100);
//       b15.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(po);
//                oo();
//                 try{
//              voice.speak("O for Orange");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b15.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b15.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b15.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b15.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lo = new JLabel("O");
//        lo.setBounds(110,640,90,100);
//        lo.setForeground(Color.BLACK);
//        lo.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b15.add(lo);
//        p2.add(b15);
//        b16=new JPanel();
//        b16.setBounds(210,640,90,100);
//        b16.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pp);
//                pp();
//                 try{
//              voice.speak("P for Parrot");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b16.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b16.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b16.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b16.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lp = new JLabel("P");
//        lp.setBounds(210,640,90,100);
//        lp.setForeground(Color.BLACK);
//        lp.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b16.add(lp);
//        p2.add(b16);
//    
//    
//       b17=new JPanel();
//       b17.setBounds(310,640,90,100);
//       b17.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pq);
//                qq();
//                 try{
//              voice.speak("Q for Queen");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b17.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b17.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b17.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b17.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lq = new JLabel("Q");
//        lq.setBounds(310,640,90,100);
//        lq.setForeground(Color.BLACK);
//        lq.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b17.add(lq);
//        p2.add(b17);
//    
//       b18=new JPanel();
//       b18.setBounds(410,640,90,100);
//       b18.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pr);
//                rr();
//                 try{
//              voice.speak("R  for Radio");
//           }
//           catch(Exception a)
//           { }
//            }
//
//          public void mousePressed(MouseEvent e) {
//                b18.setBackground(Color.GRAY);
//            }
//
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b18.setBackground(Color.red);
//            }
//
//            public void mouseEntered(MouseEvent e) {
//                b18.setBackground(Color.red);
//            }
//
//            public void mouseExited(MouseEvent e) {
//
//                b18.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lr = new JLabel("R");
//        lr.setBounds(410,640,90,100);
//        lr.setForeground(Color.BLACK);
//        lr.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b18.add(lr);
//        p2.add(b18);
//       b19=new JPanel();
//       b19.setBounds(510,640,90,100);
//       b19.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(ps);
//                ss();
//                 try{
//              voice.speak("S for Shoes");
//           }
//           catch(Exception a)
//           { }
//            }
//          public void mousePressed(MouseEvent e) {
//                b19.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b19.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b19.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b19.setBackground(Color.WHITE);
//            }
//        });
//        JLabel ls = new JLabel("S");
//        ls.setBounds(510,640,90,100);
//        ls.setForeground(Color.BLACK);
//        ls.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b19.add(ls);
//        p2.add(b19);
//       b20=new JPanel();
//       b20.setBounds(610,640,90,100);
//       b20.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pt);
//                tt();
//                 try{
//              voice.speak("T for T-shirt");
//           }
//           catch(Exception a)
//           { }
//            }
//          public void mousePressed(MouseEvent e) {
//                b20.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b20.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b20.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b20.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lt = new JLabel("T");
//        lt.setBounds(610,640,90,100);
//        lt.setForeground(Color.BLACK);
//        lt.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b20.add(lt);
//        p2.add(b20);
//       b21=new JPanel();
//       b21.setBounds(710,640,90,100);
//       b21.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pu);
//                uu();
//                 try{
//              voice.speak("U for Umbrella");
//           }
//           catch(Exception a)
//           { }
//            }
//          public void mousePressed(MouseEvent e) {
//                b21.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b21.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b21.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b21.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lu = new JLabel("U");
//        lu.setBounds(710,640,90,100);
//        lu.setForeground(Color.BLACK);
//        lu.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b21.add(lu);
//        p2.add(b21);
//       b22=new JPanel();
//       b22.setBounds(810,640,90,100);
//       b22.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pv);
//                vv();
//                 try{
//              voice.speak("V for Violin");
//           }
//           catch(Exception a)
//           { }    
//            }
//          public void mousePressed(MouseEvent e) {
//                b22.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b22.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b22.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b22.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lv = new JLabel("V");
//        lv.setBounds(810,640,90,100);
//        lv.setForeground(Color.BLACK);
//        lv.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b22.add(lv);
//        p2.add(b22);
//       b23=new JPanel();
//       b23.setBounds(910,640,90,100);
//       b23.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pw);
//                ww();
//                 try{
//              voice.speak("W for Wood");
//           }
//           catch(Exception a)
//           { }
//            }
//          public void mousePressed(MouseEvent e) {
//                b23.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b23.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b23.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b23.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lw = new JLabel("W");
//        lw.setBounds(910,640,90,100);
//        lw.setForeground(Color.BLACK);
//        lw.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b23.add(lw);
//        p2.add(b23);
//       b24=new JPanel();
//       b24.setBounds(1010,640,90,100);
//       b24.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(px);
//                xx();
//                 try{
//              voice.speak("X for Xylaphon");
//           }
//           catch(Exception a)
//           { }
//            }
//          public void mousePressed(MouseEvent e) {
//                b24.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b24.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b24.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b24.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lx = new JLabel("X");
//        lx.setBounds(1010,640,90,100);
//        lx.setForeground(Color.BLACK);
//        lx.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b24.add(lx);
//        p2.add(b24);
//       b25=new JPanel();
//       b25.setBounds(1110,640,90,100);
//       b25.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(py);
//                yy();
//                 try{
//              voice.speak("Y for Yak");
//           }
//           catch(Exception a)
//           { }
//            }
//          public void mousePressed(MouseEvent e) {
//                b25.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b25.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b25.setBackground(Color.red);
//            }
//            public void mouseExited(MouseEvent e) {
//                b25.setBackground(Color.WHITE);
//            }
//        });
//        JLabel ly = new JLabel("Y");
//        ly.setBounds(1110,640,90,100);
//        ly.setForeground(Color.BLACK);
//        ly.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b25.add(ly);
//        p2.add(b25);
//       b26=new JPanel();
//       b26.setBounds(1210,640,90,100);
//       b26.addMouseListener(new MouseListener() {
//            public void mouseClicked(MouseEvent e) {
//                changepic(pz);
//                zz();
//                 try{
//              voice.speak("Z for Zebra");
//           }
//           catch(Exception a)
//           { }
//            }
//          public void mousePressed(MouseEvent e) {
//                b26.setBackground(Color.GRAY);
//            }
//            public void mouseReleased(MouseEvent e) {
//                Color release = new Color(217, 217, 255);
//                b26.setBackground(Color.red);
//            }
//            public void mouseEntered(MouseEvent e) {
//                b26.setBackground(Color.RED);
//            }
//            public void mouseExited(MouseEvent e) {
//                b26.setBackground(Color.WHITE);
//            }
//        });
//        JLabel lz = new JLabel("Z");
//        lz.setBounds(1210,640,90,100);
//        lz.setForeground(Color.BLACK);
//        lz.setFont(new Font("Colonna MT",Font.BOLD,50));
//        b26.add(lz);
//        p2.add(b26);
//    JLabel lbl2=new JLabel("Please press a letter and listen it's pronunciation");
//    lbl2.setBounds(100,20,1300,70);
//    lbl2.setFont(font);
//    lbl2.setForeground(Color.blue);
//    p2.add(lbl2);
//    p2.add(l1);
//    p2.add(p3);
//    p2.add(l2);
//    fram.add(p2);
//   // fram.add(p1);
//    }
//    public static void changepic(JPanel md)
//    {
//        p3.removeAll();
//        p3.add(md);
//        p3.updateUI();
//    }
//     public void aa(){
//        l1.setText("A");
//        l2.setText("For Apple");
//        pa=new JPanel();
//        pa.setBounds(0,0,650,375);
//        pa.setBackground(Color.pink);
//        JLabel aaa = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/apple.jpg")));
//	aaa.setBounds(0,0,650,375);
//	pa.add(aaa);
//        p3.add(pa);
//     }
//       public void bb(){
//        l1.setText("B");
//        l2.setText("For Bowl");
//        pb=new JPanel();
//        pb.setBounds(0,0,650,375);
//        pb.setBackground(Color.pink);
//        JLabel bbb = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/bowl.jpg")));
//	bbb.setBounds(0,0,650,375);
//	pb.add(bbb);
//        p3.add(pb);
//     }
//     public void cc(){
//        l1.setText("C");
//        l2.setText("For Cat");
//        pc=new JPanel();
//        pc.setBounds(0,0,650,375);
//        pc.setBackground(Color.pink);
//        JLabel ccc = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/cat.jpg")));
//	ccc.setBounds(0,0,650,375);
//	pc.add(ccc);
//        p3.add(pc);
//     }
//     public void dd(){
//        l1.setText("D");
//        l2.setText("For Dog");
//        pd=new JPanel();
//        pd.setBounds(0,0,650,375);
//        pd.setBackground(Color.pink);
//        JLabel ddd = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/dog.jpg")));
//	ddd.setBounds(0,0,650,375);
//	pd.add(ddd);
//        p3.add(pd);
//     }
//     public void ee(){
//        l1.setText("E");
//        l2.setText("For Elephant");
//        pe=new JPanel();
//        pe.setBounds(0,0,650,375);
//        pe.setBackground(Color.pink);
//        JLabel eee = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/elephant3.png")));
//	eee.setBounds(0,0,650,375);
//	pe.add(eee);
//        p3.add(pe);
//     }
//     public void ff(){
//        l1.setText("F");
//        l2.setText("For Food");
//        pf=new JPanel();
//        pf.setBounds(0,0,650,375);
//        pf.setBackground(Color.pink);
//        JLabel fff = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/enjera.png")));
//	fff.setBounds(0,0,650,375);
//	pf.add(fff);
//        p3.add(pf);
//     }
//     public void gg(){
//        l1.setText("G");
//        l2.setText("For Grapes");
//        pg=new JPanel();
//        pg.setBounds(0,0,650,375);
//        pg.setBackground(Color.pink);
//        JLabel ggg = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/grapes1.jpg")));
//	ggg.setBounds(0,0,650,375);
//	pg.add(ggg);
//        p3.add(pg);
//     }
//     public void hh(){
//        l1.setText("H");
//        l2.setText("For House");
//        ph=new JPanel();
//        ph.setBounds(0,0,650,375);
//        ph.setBackground(Color.pink);
//        JLabel hhh = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/house.jpg")));
//	hhh.setBounds(0, 0, 400, 250);
//	ph.add(hhh);
//        p3.add(ph);
//     }
//     public void ii(){
//        l1.setText("I");
//        l2.setText("For Icecream");
//        pi=new JPanel();
//        pi.setBounds(0,0,650,375);
//        pi.setBackground(Color.pink);
//        JLabel iii = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/ice_cream.jpg")));
//	iii.setBounds(0,0,650,375);
//	pi.add(iii);
//        p3.add(pi);
//     }
//     public void jj(){
//        l1.setText("J");
//        l2.setText("For Jacket");
//        pj=new JPanel();
//        pj.setBounds(0,0,650,375);
//        pj.setBackground(Color.pink);
//        JLabel jjj = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/jacket.jpg")));
//	jjj.setBounds(0,0,650,375);
//	pj.add(jjj);
//        p3.add(pj);
//     }
//     public void kk(){
//        l1.setText("K");
//        l2.setText("For Key");
//        pk=new JPanel();
//        pk.setBounds(0,0,650,375);
//        pk.setBackground(Color.pink);
//        JLabel kkk = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/key1.jpg")));
//	kkk.setBounds(0,0,650,375);
//	pk.add(kkk);
//        p3.add(pk);
//     }
//     public void ll(){
//        l1.setText("L");
//        l2.setText("For Lemon");
//        pl=new JPanel();
//        pl.setBounds(0,0,650,375);
//        pl.setBackground(Color.pink);
//        JLabel lll = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/lemon.jpg")));
//	lll.setBounds(0,0,650,375);
//	pl.add(lll);
//        p3.add(pl);
//     }
//     public void mm(){
//        l1.setText("M");
//        l2.setText("For Motorcycle");
//        pm=new JPanel();
//        pm.setBounds(0,0,650,375);
//        pm.setBackground(Color.pink);
//        JLabel mmm = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/motorcycle.jpg")));
//	mmm.setBounds(0,0,650,375);
//	pm.add(mmm);
//        p3.add(pm);
//     }
//     public void nn(){
//        l1.setText("N");
//        l2.setText("For Nest");
//        pn=new JPanel();
//        pn.setBounds(0,0,650,375);
//        pn.setBackground(Color.pink);
//        JLabel nnn = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/nest.jpg")));
//	nnn.setBounds(0,0,650,375);
//	pn.add(nnn);
//        p3.add(pn);
//     }
//     public void oo(){
//        l1.setText("O");
//        l2.setText("For Orange");
//        po=new JPanel();
//        po.setBounds(0,0,650,375);
//        po.setBackground(Color.pink);
//        JLabel ooo = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/orange.jpg")));
//	ooo.setBounds(0,0,650,375);
//	po.add(ooo);
//        p3.add(po);
//     }
//     public void pp(){
//        l1.setText("P");
//        l2.setText("For Parrot");
//        pp=new JPanel();
//        pp.setBounds(0,0,650,375);
//        pp.setBackground(Color.pink);
//        JLabel ppp = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/parrot1.jpg")));
//	ppp.setBounds(0,0,650,375);
//	pp.add(ppp);
//        p3.add(pp);
//     }
//     public void qq(){
//        l1.setText("Q");
//        l2.setText("For Queen");
//        pq=new JPanel();
//        pq.setBounds(0,0,650,375);
//        pq.setBackground(Color.pink);
//        JLabel qqq = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/queen.jpg")));
//	qqq.setBounds(0,0,650,375);
//	pq.add(qqq);
//        p3.add(pq);
//     }
//     public void rr(){
//        l1.setText("R");
//        l2.setText("For Radio");
//        pr=new JPanel();
//        pr.setBounds(0,0,650,375);
//        pr.setBackground(Color.pink);
//        JLabel rrr = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/radio.jpeg")));
//	rrr.setBounds(0,0,650,375);
//	pr.add(rrr);
//        p3.add(pr);
//     }
//     public void ss(){
//        l1.setText("S");
//        l2.setText("For Shoes");
//        ps=new JPanel();
//        ps.setBounds(0,0,650,375);
//        ps.setBackground(Color.pink);
//        JLabel sss = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/shoes.png")));
//	sss.setBounds(0,0,650,375);
//	ps.add(sss);
//        p3.add(ps);
//     }
//     public void tt(){
//        l1.setText("T");
//        l2.setText("For T-shirt");
//        pt=new JPanel();
//        pt.setBounds(0,0,650,375);
//        pt.setBackground(Color.pink);
//        JLabel ttt = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/t-shirt.jpg")));
//	ttt.setBounds(0,0,650,375);
//	pt.add(ttt);
//        p3.add(pt);
//     }
//     public void uu(){
//        l1.setText("U");
//        l2.setText("For Umbrela");
//        pu=new JPanel();
//        pu.setBounds(0,0,650,375);
//        pu.setBackground(Color.pink);
//        JLabel uuu = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/Umbrela.png")));
//	uuu.setBounds(0,0,650,375);
//	pu.add(uuu);
//        p3.add(pu);
//     }
//     public void vv(){
//        l1.setText("V");
//        l2.setText("For Violin");
//        pv=new JPanel();
//        pv.setBounds(0,0,650,375);
//        pv.setBackground(Color.pink);
//        JLabel vvv = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/violin2.png")));
//	vvv.setBounds(0,0,650,375);
//	pv.add(vvv);
//        p3.add(pv);
//     }
//     public void ww(){
//        l1.setText("W");
//        l2.setText("For Wood");
//        pw=new JPanel();
//        pw.setBounds(0,0,650,375);
//        pw.setBackground(Color.pink);
//        JLabel www = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/wood.jpg")));
//	www.setBounds(0,0,650,375);
//	pw.add(www);
//        p3.add(pw);
//     }
//     public void xx(){
//        l1.setText("X");
//        l2.setText("For Xylaphon");
//        px=new JPanel();
//        px.setBounds(0,0,650,375);
//        px.setBackground(Color.pink);
//        JLabel xxx = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/xylaphon.jpg")));
//	xxx.setBounds(0,0,650,375);
//	px.add(xxx);
//        p3.add(px);
//     }
//      public void yy(){
//        l1.setText("Y");
//        l2.setText("For Yak");
//        py=new JPanel();
//        py.setBounds(0,0,650,375);
//        py.setBackground(Color.pink);
//        JLabel yyy = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/yak1.jpg")));
//	yyy.setBounds(0,0,650,375);
//	py.add(yyy);
//        p3.add(py);
//     }
//     public void zz(){
//        l1.setText("Z");
//        l2.setText("For Zebra");
//        pz=new JPanel();
//        pz.setBounds(0,0,650,375);
//        pz.setBackground(Color.pink);
//        JLabel zzz = new JLabel(new ImageIcon(Alphabet.class.getResource("/image/zebra.jpg")));
//	zzz.setBounds(0,0,650,375);
//	pz.add(zzz);
//        p3.add(pz);
//     }
//     
//}
