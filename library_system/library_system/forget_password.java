package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class forget_password {

	JFrame frmForgetPassword;
	private JTextField username;
	private JTextField ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					forget_password window = new forget_password();
					window.frmForgetPassword.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public forget_password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmForgetPassword = new JFrame();
		frmForgetPassword.setResizable(false);
		frmForgetPassword.getContentPane().setBackground(new Color(152, 251, 152));
		frmForgetPassword.setTitle("Forget password");
		frmForgetPassword.setBounds(100, 100, 463, 391);
		frmForgetPassword.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmForgetPassword.getContentPane().setLayout(null);
		
		String questions[]={"What is your birth place?","What is favourite color?","What is your favorite movie?","What is your mothers name?"};
		
		
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmForgetPassword.setVisible(false);
				login log=new login();
				log.frmLibrarianLogin.setVisible(true);
			}
		});
		back.setFont(new Font("Rockwell", Font.BOLD, 18));
		back.setBounds(10, 11, 99, 35);
	
		
		frmForgetPassword.getContentPane().add(back);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 59, 427, 282);
		frmForgetPassword.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 11, 93, 18);
		panel.add(lblUsername);
		lblUsername.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 16));
		
		username = new JTextField();
		username.setFont(new Font("Garamond", Font.PLAIN, 20));
		username.setBackground(new Color(220, 220, 220));
		username.setBounds(10, 30, 233, 30);
		panel.add(username);
		username.setColumns(10);
		
		JLabel lblYourSecurityQuestion = new JLabel("Your Security Question");
		lblYourSecurityQuestion.setBounds(10, 71, 233, 21);
		panel.add(lblYourSecurityQuestion);
		lblYourSecurityQuestion.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 16));
		JComboBox comboBox = new JComboBox(questions);
		comboBox.setBounds(10, 92, 233, 30);
		panel.add(comboBox);
		comboBox.setFont(new Font("Century Schoolbook", Font.BOLD, 15));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(235, 55, 182, 145);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("images/JPRS-banner-icon.png"));
		
		ans = new JTextField();
		ans.setFont(new Font("Garamond", Font.PLAIN, 20));
		ans.setBackground(new Color(220, 220, 220));
		ans.setBounds(10, 153, 233, 30);
		panel.add(ans);
		ans.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(10, 127, 111, 26);
		panel.add(lblAnswer);
		lblAnswer.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 15));
		
		JLabel lblYourPassword = new JLabel("Your Password :");
		lblYourPassword.setBounds(10, 194, 151, 21);
		panel.add(lblYourPassword);
		lblYourPassword.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 15));
		
		JButton btnRetrivePassword = new JButton("Retrieve password");
		btnRetrivePassword.setBounds(10, 229, 407, 42);
		panel.add(btnRetrivePassword);
		btnRetrivePassword.setForeground(new Color(34, 139, 34));
		btnRetrivePassword.setBackground(UIManager.getColor("Button.shadow"));
		btnRetrivePassword.setFont(new Font("Castellar", Font.BOLD, 22));
		
		JLabel pwd = new JLabel("");
		pwd.setFont(new Font("Book Antiqua", Font.BOLD, 16));
		pwd.setBounds(171, 198, 122, 21);
		panel.add(pwd);
		
		btnRetrivePassword.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent a){  
				
			/*if(a.getSource()==btn) {
				
			}*/
				
				if (a.getSource()==btnRetrivePassword)
				{
					try {
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/library_system","root","thechamp16");  
					 Statement stmt=con.createStatement();  
					 ResultSet rs=stmt.executeQuery("Select * from librarian where username='"+String.valueOf(username.getText())+"' and question='"+String.valueOf(comboBox.getSelectedItem())+"' and answer='"+String.valueOf(ans.getText())+"'");  
					 if(rs.next()) {
					 pwd.setText(rs.getString(3));
					 }
					 con.close();
		               
		}catch(Exception e){ }  
		}
	        }  
	    });  
		
		
	}
}
