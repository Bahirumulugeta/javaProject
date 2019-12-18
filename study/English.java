
package study;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static study.Study.changable;

public class English extends JPanel{
    public English()
    {
      setSize(1000,500);
      setLayout(null);
    Font font=new Font("Colonna MT",Font.BOLD,48);
    JLabel lblenglish=new JLabel("English");
    lblenglish.setBounds(500,100,250,80);
    lblenglish.setFont(font);
    lblenglish.setForeground(Color.blue);
    add(lblenglish);
    JButton btnalphabet=new JButton("Alphabet");
    btnalphabet.setForeground(Color.white);
    btnalphabet.setBounds(100,230,250,80);
    btnalphabet.setFont(font);
    btnalphabet.setBackground(Color.GRAY);
     add(btnalphabet);
    JButton btnmising=new JButton("Mising");
    btnmising.setBounds(500,230,250,80);
    btnmising.setBackground(Color.GRAY);
    btnmising.setFont(font);
    btnmising.setForeground(Color.white);
    add(btnmising);
    btnalphabet.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent e)
            {
            Alphabet al=new Alphabet();
            }

        });
    btnmising.addActionListener(new ActionListener()
            {
            public void actionPerformed(ActionEvent e)
            {
                changable(new missingWords());
          // missingWords missing=new missingWords();
            }

        });
    }
    
    
}
