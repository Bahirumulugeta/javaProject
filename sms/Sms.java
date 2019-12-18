
package sms;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Sms extends JFrame {
    JButton exiti;
    JPanel contentPane;
    static JPanel mainpanel, addstud, temppanel, homestud, help, newstud;
    JLabel title, imagelabel;
    public Sms() {
        addimage();
        add(imagelabel);
        addtitlelabel();
        add(title);
        mainMethod();
       
        homstudButton();
        newstudButton();
        helpButton();

        add(contentPane);
        addExiticn();
        add(exiti);
    }
    public void addtitlelabel() {
        title = new JLabel("        Cassio - SMS");
        title.setBounds(250, 0, 600, 50);
        title.setForeground(Color.gray);
        title.setFont(new Font("Comic Sans MS", Font.BOLD + Font.ITALIC, 40));
    }

    public void mainMethod() {
        contentPane = new JPanel();
        contentPane.setLayout(null);
        contentPane.setBounds(0, 50, 1100, 700);
        contentPane.setBackground(Color.cyan);
        addtemppanel();
        addpanel();
        contentPane.add(temppanel);
        contentPane.add(mainpanel);
    }
    public void addtemppanel() {
        temppanel = new JPanel();
        temppanel.setSize(1000, 50);
        temppanel.setBounds(50, 20, 1000, 70);
        temppanel.setLayout(null);
        temppanel.setBackground(Color.blue);
        JLabel come = new JLabel("                     Welcome to Cassio-school management system");
        come.setBounds(50, 0, 780, 70);
        come.setForeground(Color.WHITE);
        come.setFont(new Font("Serif", Font.BOLD, 30));
        temppanel.add(come);

    }

    public void addpanel() {
        mainpanel = new JPanel();
        mainpanel.setSize(1000, 500);
        mainpanel.setBounds(50, 100, 1000, 500);
        mainpanel.setLayout(null);
        JLabel cover = new JLabel();
        cover.setBounds(20, 0, 1000, 500);
        cover.setIcon(new ImageIcon(getClass().getResource("/image/as.jpg")));
        mainpanel.add(cover);
    }
   
    public void homstudButton(){
        homestud = new JPanel();
        homestud.setBounds(50, 600, 150, 50);
        homestud.setBackground(Color.gray);
        homestud.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
               // changable(new math());
            }
            public void mousePressed(MouseEvent e) {
              homestud.setBackground(Color.GREEN);
            }
            public void mouseReleased(MouseEvent e) {
                Color release = new Color(217, 217, 255);
                homestud.setBackground(Color.YELLOW);
            }
            public void mouseEntered(MouseEvent e) {
                homestud.setBackground(Color.DARK_GRAY);
            }
            public void mouseExited(MouseEvent e) {
                homestud.setBackground(Color.gray);
            }
        });
        JLabel aboutla = new JLabel("Home");
        aboutla.setBounds(250, 600, 150, 50);
        aboutla.setForeground(Color.BLUE);
        aboutla.setFont(new Font("Nyala", Font.BOLD + Font.ITALIC, 32));
        homestud.add(aboutla);
        contentPane.add(homestud);
    }
  public void newstudButton(){
        newstud = new JPanel();
        newstud.setBounds(480, 600, 150, 50);
        newstud.setBackground(Color.gray);
        newstud.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
               // changable(new math());
            }
            public void mousePressed(MouseEvent e) {
              newstud.setBackground(Color.GREEN);
            }
            public void mouseReleased(MouseEvent e) {
                Color release = new Color(217, 217, 255);
                newstud.setBackground(Color.YELLOW);
            }
            public void mouseEntered(MouseEvent e) {
                newstud.setBackground(Color.DARK_GRAY);
            }
            public void mouseExited(MouseEvent e) {
                newstud.setBackground(Color.gray);
            }
        });
        JLabel aboutla = new JLabel("News");
        aboutla.setBounds(250, 600, 150, 50);
        aboutla.setForeground(Color.BLUE);
        aboutla.setFont(new Font("Nyala", Font.BOLD + Font.ITALIC, 32));
        newstud.add(aboutla);
        contentPane.add(newstud);
    }

    public void helpButton() {
        help = new JPanel();
        help.setBounds(900, 600, 150, 50);
        help.setBackground(Color.gray);
        help.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                //changable(new English());
            }

            public void mousePressed(MouseEvent e) {
                help.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                Color release = new Color(217, 217, 255);
                help.setBackground(Color.red);
            }

            public void mouseEntered(MouseEvent e) {
                help.setBackground(Color.white);
            }

            public void mouseExited(MouseEvent e) {

                help.setBackground(Color.gray);
            }
        });

        help.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                //modification(new AddStudent("top"));
                //changable(new AddStudent());
            }

            public void mousePressed(MouseEvent e) {
                addstud.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                Color release = new Color(217, 217, 255);
                addstud.setBackground(Color.red);
            }

            public void mouseEntered(MouseEvent e) {
                addstud.setBackground(Color.red);
            }

            public void mouseExited(MouseEvent e) {

                addstud.setBackground(Color.gray);
            }
        });
        JLabel helpla = new JLabel("Others");
        helpla.setBounds(700, 600, 150, 50);
        helpla.setForeground(Color.BLUE);
        helpla.setFont(new Font("Elephant", Font.BOLD + Font.ITALIC, 20));
        help.add(helpla);
        contentPane.add(help);
    }

    public static void changable(JPanel anyPanel) {
        mainpanel.removeAll();
        mainpanel.add(anyPanel);
        mainpanel.updateUI();
    }

    public static void modification(JPanel md) {
        temppanel.removeAll();
        temppanel.add(md);
        temppanel.updateUI();
    }

    public void addExiticn() {
        exiti = new JButton();
        exiti.setBounds(1050, 0, 50, 50);
        exiti.setIcon(new ImageIcon(getClass().getResource("/image/exit.png")));
        exiti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evnt) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        Sms st = new Sms();
        st.setSize(1100, 700);
        st.setLayout(null);
        st.setUndecorated(true);
        st.setLocationRelativeTo(null);
        st.setVisible(true);
        st.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void addimage() {
        imagelabel = new JLabel();
        imagelabel.setBounds(0, 0, 60, 65);
        imagelabel.setBackground(Color.blue);
        imagelabel.setIcon(new ImageIcon(getClass().getResource("/image/school.png")));
    }
}
