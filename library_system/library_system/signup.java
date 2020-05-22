package library_system;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;    
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import java.awt.Rectangle;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class signup extends JFrame implements ActionListener {

	JFrame frmNewAccount;
	private JTextField uname;
	private JTextField full_name;
	private JTextField ans;
	private JPasswordField pwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signup window = new signup();
					window.frmNewAccount.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public signup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNewAccount = new JFrame();
		frmNewAccount.setResizable(false);
		frmNewAccount.setSize(437,436);
		frmNewAccount.setFont(new Font("Century", Font.BOLD, 13));
		frmNewAccount.setForeground(Color.WHITE);
		frmNewAccount.setTitle("New Account");
		frmNewAccount.setBackground(new Color(0, 0, 0));
		frmNewAccount.getContentPane().setBackground(new Color(255, 0, 51));
		frmNewAccount.getContentPane().setLayout(null);
		
		String questions[]={"What is your birth place?","What is favourite color?","What is your favorite movie?","What is your mothers name?"};        
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(0, 94, 450, 360);
		frmNewAccount.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 11, 126, 36);
		panel.add(lblUsername);
		lblUsername.setFont(new Font("Georgia", Font.BOLD, 18));
		
		uname = new JTextField();
		uname.setFont(new Font("Garamond", Font.PLAIN, 18));
		uname.setBounds(10, 42, 231, 27);
		panel.add(uname);
		uname.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 71, 76, 22);
		panel.add(lblName);
		lblName.setFont(new Font("Georgia", Font.BOLD, 18));
		
		full_name = new JTextField();
		full_name.setFont(new Font("Garamond", Font.PLAIN, 18));
		full_name.setBounds(10, 96, 231, 27);
		panel.add(full_name);
		full_name.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 124, 100, 22);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Georgia", Font.BOLD, 18));
		
		pwd = new JPasswordField();
		pwd.setFont(new Font("Garamond", Font.PLAIN, 18));
		pwd.setBounds(10, 147, 231, 27);
		panel.add(pwd);
		
		JLabel lblSecurityQuestion = new JLabel("Security Question");
		lblSecurityQuestion.setBounds(10, 176, 178, 22);
		panel.add(lblSecurityQuestion);
		lblSecurityQuestion.setFont(new Font("Georgia", Font.BOLD, 18));
		final JComboBox ques=new JComboBox(questions);    
		ques.setBounds(10, 209, 231, 27);
		panel.add(ques);
		ques.setFont(new Font("Cambria", Font.PLAIN, 16));
		ques.setBackground(Color.WHITE);
		
		ans = new JTextField();
		ans.setFont(new Font("Garamond", Font.PLAIN, 18));
		ans.setBounds(10, 266, 231, 27);
		panel.add(ans);
		ans.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(10, 242, 89, 22);
		panel.add(lblAnswer);
		lblAnswer.setFont(new Font("Georgia", Font.BOLD, 18));
		

		JButton back = new JButton("Back");
		back.setBackground(new Color(220, 20, 60));
		back.setForeground(new Color(255, 255, 255));
		back.setBounds(284, 246, 123, 47);
		panel.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmNewAccount.setVisible(false);
				adminaki aki=new adminaki();
				aki.frmAdmin.setVisible(true);
			}
		});
		back.setFont(new Font("Georgia", Font.BOLD, 18));
		
		JButton create = new JButton("Create");
		create.setForeground(new Color(255, 255, 255));
		create.setBackground(new Color(220, 20, 60));
		create.setBounds(284, 194, 123, 42);
		panel.add(create);
		create.setFont(new Font("Georgia", Font.BOLD, 18));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("images/download-removebg-preview.png"));
		lblNewLabel_2.setBounds(284, 18, 123, 156);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Librarian Sign Up");
		lblNewLabel.setFont(new Font("Century", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 11, 229, 32);
		frmNewAccount.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Be a part of our rich library ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 43, 221, 25);
		frmNewAccount.getContentPane().add(lblNewLabel_1);
		create.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent a){  
				
				if (a.getSource()==create)
				{
					try {
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/library_system","root","thechamp16");  
					String str1 ="insert into librarian values (?, ?, ?, ?, ?);";
					PreparedStatement stat = (PreparedStatement) con.prepareStatement(str1);
					 
				                String username = uname.getText();
				                String name = full_name.getText();
				                String password=pwd.getText();
				                String question=String.valueOf(ques.getSelectedItem());
				                String answer=ans.getText();
				  //stat.setString(1,id);
				                if(name.equals("")==false) {
				                stat.setString(1,username);
				                stat.setString(2, name);
				                stat.setString(3, password);
				                stat.setString(4, question);
				                stat.setString(5, answer);
				                stat.executeUpdate();  
				  //executeupdate -used for doing dml (insert,delete,update)
				                con.close();
				                JOptionPane.showMessageDialog(null,"Account created successfully");
				                }
				                else
				                	 JOptionPane.showMessageDialog(null,"Blank entries not allowed ");
				}catch(Exception e){ JOptionPane.showMessageDialog(null,"Signing Up failed .Please Try Again");}  
				}
			        }  
			    });  
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
