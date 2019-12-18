
package study;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Help extends JPanel
{
    public Help (){
         //setLayout(null);
         setSize(1000, 500);    
        // As usual, we create our bottom-level panel.
        JPanel totalGUI = new JPanel();
        // This is the story we took from Wikipedia.
        String helping = "    You must run login class firstly.\n\n"+
                       "     After you must choose from list as you want.\n"
                        + "        click either admin or analyst button for your purpose \n"
                        +"        and go to as you want.\n\n"+
                       "        Nb.\n             analyst button is used for only analysts to perform some tasks "+
                       " \n             like \n\tto borrow book, "+
                       " \n\t to get locations of book specially for fresh students, "+
                       "\n\t and to return borrowed book.  "+
                       "\n     But, admin button is used for only librarian to coordinate books"+
                       "\n\n\n       Warnnig:\n\tto log in as an admin you must rememer password"+
                       "\n\n\n\n\n\t\tLIBRARY SYSTEM IN AASTU";
        JTextArea storyArea = new JTextArea(helping);
         storyArea.setEditable(false);
        
         storyArea.setPreferredSize(new Dimension(1000,500));
        //and add it to the GUI.
        totalGUI.add(storyArea);
        add(totalGUI);
        
        
    }
   
    
}
