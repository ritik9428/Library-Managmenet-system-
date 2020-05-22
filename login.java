package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.UIManager;

public class login {

	JFrame frmLibrarianLogin;
	private JTextField username;
	private JPasswordField password;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLibrarianLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibrarianLogin = new JFrame();
		frmLibrarianLogin.setResizable(false);
		frmLibrarianLogin.getContentPane().setBackground(new Color(220, 20, 60));
		frmLibrarianLogin.setTitle("Librarian Login");
		frmLibrarianLogin.setBounds(100, 100, 447, 398);
		frmLibrarianLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibrarianLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\manth\\Desktop\\library_system\\src\\library_system\\admin150.png"));
		lblNewLabel.setBounds(329, 58, 46, 14);
		frmLibrarianLogin.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(null);
		panel.setBounds(10, 58, 414, 290);
		frmLibrarianLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton loginbtn = new JButton("Log In");
		loginbtn.setForeground(new Color(255, 255, 255));
		loginbtn.setBackground(new Color(220, 20, 60));
		loginbtn.setBounds(10, 189, 394, 39);
		panel.add(loginbtn);
		loginbtn.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		username = new JTextField();
		username.setFont(new Font("Garamond", Font.PLAIN, 20));
		username.setBounds(10, 50, 189, 29);
		panel.add(username);
		username.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 11, 104, 28);
		panel.add(lblUsername);
		lblUsername.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 93, 104, 28);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Footlight MT Light", Font.BOLD, 20));
		
		password = new JPasswordField();
		password.setFont(new Font("Garamond", Font.PLAIN, 20));
		password.setBounds(10, 132, 189, 29);
		panel.add(password);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(237, 21, 131, 158);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\manth\\Desktop\\library_system\\src\\library_system\\admin150.png"));
		
		JButton btnForgetPassword = new JButton("Forget Password");
		btnForgetPassword.setForeground(new Color(255, 255, 255));
		btnForgetPassword.setBackground(new Color(220, 20, 60));
		btnForgetPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmLibrarianLogin.setVisible(false);
				forget_password fpwd=new forget_password();
				fpwd.frmForgetPassword.setVisible(true);
			}
		});
		btnForgetPassword.setBounds(10, 239, 394, 39);
		panel.add(btnForgetPassword);
		btnForgetPassword.setFont(new Font("Palatino Linotype", Font.BOLD, 24));
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLibrarianLogin.setVisible(false);
				firstpage lib=new firstpage();
				lib.frmLibrarySystem.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Georgia", Font.BOLD, 18));
		btnNewButton.setBounds(10, 11, 92, 34);
		frmLibrarianLogin.getContentPane().add(btnNewButton);
		loginbtn.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent a){  
				
				if (a.getSource()==loginbtn)
				{
					try {
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/library_system","root","thechamp16"); 
					 Statement stmt=con.createStatement();  
				  ResultSet rs=stmt.executeQuery("Select * from librarian where username='"+String.valueOf(username.getText())+"'");  
				  while(rs.next()) {
					  if(rs.getString(3).equals(password.getText())) {
						  JOptionPane.showMessageDialog(null,"Successfully Loged In");
						  frmLibrarianLogin.setVisible(false);
							librarian lib=new librarian();
							lib.frmWelcomeLibrarian.setVisible(true);
						  
					  }
					  if(password.getText().equals("") || username.getText().equals("") || rs.getString(3).equals(password.getText())==false){
						  JOptionPane.showMessageDialog(null,"Log In Failed");
					  }
					  }
				  con.close();
	                
	}catch(Exception e){ JOptionPane.showMessageDialog(null,"Signing In failed .Please Try Again1");}  
	}
      }  
  });  
	}
}
