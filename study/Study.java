package study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Study extends JFrame {
    JButton exiti;
    JPanel contentPane;
    static JPanel mainpanel, addstud, about, temppanel, homestud, help, simpgame;
    JLabel title, imagelabel;
    public Study() {
        addimage();
        add(imagelabel);
        addtitlelabel();
        add(title);
        mainMethod();
        addstudButton();
        homstudButton();
        simpgamebutton();
        aboutButton();
        helpButton();

        add(contentPane);
        addExiticn();
        add(exiti);
    }
    public void addtitlelabel() {
        title = new JLabel("My School");
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
        JLabel come = new JLabel("Wellcome to My School amazing programe");
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
        cover.setBounds(0, 0, 1000, 500);
        cover.setIcon(new ImageIcon(getClass().getResource("/image/as.jpg")));
        mainpanel.add(cover);
    }
    public void addstudButton(){
        addstud = new JPanel();
        addstud.setBounds(50, 600, 150, 50);
        addstud.setBackground(Color.gray);
        addstud.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                changable(new English());
            }
            public void mousePressed(MouseEvent e) {
              addstud.setBackground(Color.GREEN);
            }
            public void mouseReleased(MouseEvent e) {
                Color release = new Color(217, 217, 255);
                addstud.setBackground(Color.YELLOW);
            }
            public void mouseEntered(MouseEvent e) {
                addstud.setBackground(Color.DARK_GRAY);
            }
            public void mouseExited(MouseEvent e) {
                addstud.setBackground(Color.gray);
            }
        });
        JLabel aboutuslabel = new JLabel("English");
        aboutuslabel.setBounds(0, 0, 80, 25);
        aboutuslabel.setForeground(Color.BLUE);
        aboutuslabel.setFont(new Font("Nyala", Font.BOLD + Font.ITALIC, 32));
        addstud.add(aboutuslabel);
        contentPane.add(addstud);
    }
    public void homstudButton(){
        homestud = new JPanel();
        homestud.setBounds(250, 600, 150, 50);
        homestud.setBackground(Color.gray);
        homestud.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                changable(new math());
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
        JLabel aboutla = new JLabel("Maths");
        aboutla.setBounds(250, 600, 150, 50);
        aboutla.setForeground(Color.BLUE);
        aboutla.setFont(new Font("Nyala", Font.BOLD + Font.ITALIC, 32));
        homestud.add(aboutla);
        contentPane.add(homestud);
    }

    public void simpgamebutton() {
        simpgame = new JPanel();
        simpgame.setBounds(470, 600, 150, 50);
        simpgame.setBackground(Color.gray);
        simpgame.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                changable(new Bounce());
            }
            public void mousePressed(MouseEvent e) {
                simpgame.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                Color release = new Color(217, 217, 255);
                simpgame.setBackground(Color.red);
            }

            public void mouseEntered(MouseEvent e) {
                simpgame.setBackground(Color.red);
            }

            public void mouseExited(MouseEvent e) {

                simpgame.setBackground(Color.gray);
            }
        });
        JLabel bo = new JLabel("Amharic");
        bo.setBounds(470, 600, 150, 50);
        bo.setForeground(Color.BLUE);
        bo.setFont(new Font("Elephant", Font.BOLD + Font.ITALIC, 20));
        simpgame.add(bo);
        //contentPane.add(simpgame);
    }

    public void aboutButton() {
        about = new JPanel();
        about.setBounds(700, 600, 150, 50);
        about.setBackground(Color.gray);
        about.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                //changable(new About());
            }

            public void mousePressed(MouseEvent e) {
                about.setBackground(Color.WHITE);
            }

            public void mouseReleased(MouseEvent e) {
                Color release = new Color(217, 217, 255);
                about.setBackground(Color.red);
            }

            public void mouseEntered(MouseEvent e) {
                about.setBackground(Color.red);
            }

            public void mouseExited(MouseEvent e) {

                about.setBackground(Color.gray);
            }
        });
        JLabel aboutla = new JLabel("About");
        aboutla.setBounds(700, 600, 150, 50);
        aboutla.setForeground(Color.BLUE);
        aboutla.setFont(new Font("Elephant", Font.BOLD + Font.ITALIC, 20));
        about.add(aboutla);
        contentPane.add(about);
    }

    public void helpButton() {
        help = new JPanel();
        help.setBounds(900, 600, 150, 50);
        help.setBackground(Color.gray);
        help.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent e) {
                changable(new English());
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
                modification(new AddStudent("top"));
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
        JLabel helpla = new JLabel("Help");
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
        Study st = new Study();
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
