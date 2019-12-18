//
//package study;
//import com.mysql.jdbc.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//public class Database{
//    public static Connection connectDb(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");//used to load the driver database
//            //the following line of code is used to connect the database and the application
//            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/question", "root", "0343");
//            return conn;
//        } catch (ClassNotFoundException | SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//            return null;
//        }
//    }
//
//   
//}
