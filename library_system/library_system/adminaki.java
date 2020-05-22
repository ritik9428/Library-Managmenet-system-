package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Window.Type;

public class adminaki {

JFrame frmAdmin;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
adminaki window = new adminaki();
window.frmAdmin.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public adminaki() {
initialize();
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frmAdmin = new JFrame();
frmAdmin.setResizable(false);
frmAdmin.setBackground(new Color(255, 255, 255));
frmAdmin.getContentPane().setBackground(new Color(250, 235, 215));
frmAdmin.setTitle("Admin");
frmAdmin.setBounds(100, 100, 654, 491);
frmAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frmAdmin.getContentPane().setLayout(null);

JPanel panel = new JPanel();
panel.setBackground(new Color(204, 204, 204));
panel.setForeground(new Color(0, 0, 0));
panel.setBorder(new LineBorder(new Color(255, 0, 0), 5, true));
panel.setBounds(10, 159, 618, 282);
frmAdmin.getContentPane().add(panel);
panel.setLayout(null);

JList id = new JList();
id.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
id.setFont(new Font("Garamond", Font.BOLD, 19));
id.setBackground(new Color(255, 51, 51));
id.setForeground(new Color(0, 0, 0));
id.setBounds(24, 45, 140, 215);
panel.add(id);

JList name = new JList();
name.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
name.setFont(new Font("Garamond", Font.BOLD, 19));
name.setBackground(new Color(255, 51, 51));
name.setForeground(new Color(0, 0, 0));
name.setBounds(188, 45, 170, 215);
panel.add(name);

JList email = new JList();
email.setBorder(new LineBorder(new Color(255, 255, 255), 2, true));
email.setFont(new Font("Garamond", Font.BOLD, 19));
email.setBackground(new Color(255, 51, 51));
email.setForeground(new Color(0, 0, 0));
email.setBounds(380, 45, 202, 215);
panel.add(email);

JLabel var3 = new JLabel("Email");
var3.setForeground(new Color(51, 51, 51));
var3.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 18));
var3.setBounds(446, 15, 108, 22);
panel.add(var3);
JPanel panel_3 = new JPanel();
panel_3.setBackground(new Color(255, 255, 255));
panel_3.setBounds(26, 11, 556, 26);
panel.add(panel_3);
panel_3.setLayout(null);

JLabel var2 = new JLabel("Name");
var2.setBounds(167, 0, 170, 25);
panel_3.add(var2);
var2.setForeground(new Color(51, 51, 51));
var2.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 17));

JLabel var1 = new JLabel("ID");
var1.setBounds(10, 3, 127, 19);
panel_3.add(var1);
var1.setForeground(new Color(51, 51, 51));
var1.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 18));

JLabel lblWelcomeAdmin = new JLabel("Welcome Admin!");
lblWelcomeAdmin.setBounds(213, 64, 228, 37);
frmAdmin.getContentPane().add(lblWelcomeAdmin);
lblWelcomeAdmin.setForeground(new Color(255, 51, 0));
lblWelcomeAdmin.setBackground(new Color(255, 0, 0));
lblWelcomeAdmin.setFont(new Font("Elephant", Font.PLAIN, 26));

JButton logout = new JButton("Log Out");
logout.setForeground(new Color(255, 255, 204));
logout.setBackground(new Color(255, 51, 0));
logout.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		frmAdmin.setVisible(false);
		firstpage fp=new firstpage();
		fp.frmLibrarySystem.setVisible(true);
	}
});
logout.setFont(new Font("Copperplate Gothic Bold", Font.BOLD, 18));
logout.setBounds(489, 16, 125, 37);
frmAdmin.getContentPane().add(logout);
JPanel panel_2 = new JPanel();
panel_2.setBackground(new Color(204, 204, 204));
panel_2.setBounds(10, 103, 616, 45);
frmAdmin.getContentPane().add(panel_2);
panel_2.setLayout(null);

JButton deletelibrarian = new JButton("DELETE LIBRARIAN");
deletelibrarian.setForeground(new Color(255, 255, 255));
deletelibrarian.setBackground(new Color(102, 102, 102));
deletelibrarian.setBounds(10, 11, 182, 27);
panel_2.add(deletelibrarian);
deletelibrarian.setFont(new Font("Georgia", Font.PLAIN, 14));
JButton addlibrarian = new JButton("ADD LIBRARIAN");
addlibrarian.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		frmAdmin.setVisible(false);
		signup sup=new signup();
		sup.frmNewAccount.setVisible(true);
	}
});
addlibrarian.setBounds(202, 10, 222, 26);
panel_2.add(addlibrarian);
addlibrarian.setForeground(new Color(255, 255, 204));
addlibrarian.setFont(new Font("Georgia", Font.PLAIN, 18));
addlibrarian.setBackground(new Color(102, 102, 102));

JButton viewlibrarian = new JButton("VIEW LIBRARIAN");
viewlibrarian.setBounds(437, 11, 169, 27);
panel_2.add(viewlibrarian);
viewlibrarian.setForeground(new Color(255, 255, 255));
viewlibrarian.setBackground(new Color(102, 102, 102));
viewlibrarian.setFont(new Font("Georgia", Font.PLAIN, 15));

JButton viewstudent = new JButton("VIEW STUDENT");
viewstudent.setBounds(451, 64, 177, 27);
frmAdmin.getContentPane().add(viewstudent);
viewstudent.setForeground(new Color(255, 255, 255));
viewstudent.setBackground(new Color(102, 102, 102));
viewstudent.setFont(new Font("Georgia", Font.PLAIN, 16));

JButton deletestudent = new JButton("DELETE STUDENT");
deletestudent.setBounds(10, 64, 193, 27);
frmAdmin.getContentPane().add(deletestudent);
deletestudent.setBackground(new Color(102, 102, 102));
deletestudent.setForeground(new Color(255, 255, 255));
deletestudent.setFont(new Font("Georgia", Font.PLAIN, 16));
JLabel lblNewLabel = new JLabel("\"There is no friend as loyal as a book..\"");
lblNewLabel.setForeground(new Color(255, 0, 0));
lblNewLabel.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 18));
lblNewLabel.setBounds(27, 11, 420, 37);
frmAdmin.getContentPane().add(lblNewLabel);
JPanel panel_1 = new JPanel();
panel_1.setBackground(new Color(255, 0, 0));
panel_1.setBounds(0, 0, 638, 10);
frmAdmin.getContentPane().add(panel_1);

deletestudent.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent a){  

if (a.getSource()==deletestudent)
{
try {
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/library_system","root","thechamp16");
if(!id.isSelectionEmpty()) {
 
        Statement st5 = con.createStatement();  
        PreparedStatement stat6 = con.prepareStatement("delete from student where id= ?;");
        String selected1 = String.valueOf(id.getSelectedValue());
        stat6.setString(1, selected1);
        stat6.executeUpdate();
        Statement st6 = con.createStatement();  
        PreparedStatement stat7 = con.prepareStatement("delete from issue_details where student_id= ?;");
        String selected2 = String.valueOf(id.getSelectedValue());
        stat7.setString(1, selected2);
        stat7.executeUpdate();
        Statement st7 = con.createStatement();  
        PreparedStatement stat8 = con.prepareStatement("delete from return_details where student_id= ?;");
        String selected3 = String.valueOf(id.getSelectedValue());
        stat8.setString(1, selected3);
        stat8.executeUpdate();
}
       
 
        con.close();
        JOptionPane.showMessageDialog(null,"Successfully Deleted");

}catch(Exception e){ System.out.println(e);}  
}
      }  
  });

viewstudent.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent a){  

if (a.getSource()==viewstudent)
{
	var1.setText("ID");
	var3.setText("Email ID");
	email.setVisible(true);
try {
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/library_system","root","thechamp16");
String SQL = "select id from student";  
        Statement st = con.createStatement();  
        ResultSet rs = st.executeQuery(SQL);  
        DefaultListModel listModel2 = new DefaultListModel();
        while (rs.next()) {
        listModel2.addElement(rs.getString(1));}
        id.setModel(listModel2);
       
       
        String SQL1 = "select name from student";  
        Statement st1 = con.createStatement();  
        ResultSet rs1 = st.executeQuery(SQL1);  
        DefaultListModel listModel3 = new DefaultListModel();
        while (rs1.next()) {
        listModel3.addElement(rs1.getString(1));}
        name.setModel(listModel3);

        String SQL2 = "select email from student";  
        Statement st2 = con.createStatement();  
        ResultSet rs2 = st.executeQuery(SQL2);  
        DefaultListModel listModel4 = new DefaultListModel();
        while (rs2.next()) {
        listModel4.addElement(rs2.getString(1));}
        email.setModel(listModel4);
 
        con.close();

}catch(Exception e){ System.out.println(e);}  
}
      }  
  });




viewlibrarian.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent a){  
int sc=0;
if (a.getSource()==viewlibrarian)
{
	var1.setText("Username");
	var3.setText("");
	email.setVisible(false);
try {
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/library_system","root","thechamp16");
String SQL = "select * from librarian";  
        Statement st = con.createStatement();  
        ResultSet rs = st.executeQuery(SQL);

        DefaultListModel listModel1 = new DefaultListModel();
        while (rs.next()) {
        listModel1.addElement(rs.getString(1));}

        id.setModel(listModel1);
       
        String SQL4 = "select * from librarian";  
        Statement st4 = con.createStatement();  
        ResultSet rs4 = st4.executeQuery(SQL4);  
        DefaultListModel listModel5 = new DefaultListModel();
        while (rs4.next()) {
        listModel5.addElement(rs4.getString(2));}
        name.setModel(listModel5);
     
        con.close();

}catch(Exception e){ System.out.println(e);}  
}
      }  
  });  

deletelibrarian.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent a){  

if (a.getSource()==deletelibrarian)
{
try {
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/library_system","root","thechamp16");
if(!id.isSelectionEmpty()) {
String SQL5 = "select id from student";  
        Statement st5 = con.createStatement();  
        PreparedStatement stat5 = con.prepareStatement("delete from librarian where username= ?;");
        String selected = String.valueOf(id.getSelectedValue());
        stat5.setString(1, selected);
        stat5.executeUpdate();
}
       
 
        con.close();
        JOptionPane.showMessageDialog(null,"Successfully Deleted");

}catch(Exception e){ System.out.println(e);}  
}
      }  
  });
}
}