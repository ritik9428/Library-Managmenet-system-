package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class admin_login {

	JFrame frmAdminLogin;
	private JTextField username;
	private JPasswordField password;
	protected Object frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					admin_login window = new admin_login();
					window.frmAdminLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public admin_login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdminLogin = new JFrame();
		frmAdminLogin.setResizable(false);
		frmAdminLogin.getContentPane().setBackground(new Color(0, 255, 127));
		frmAdminLogin.setTitle("Admin Login");
		frmAdminLogin.setBounds(100, 100, 450, 376);
		frmAdminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdminLogin.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(null);
		panel.setBounds(10, 63, 414, 263);
		frmAdminLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		password = new JPasswordField();
		password.setBackground(new Color(211, 211, 211));
		password.setBounds(105, 91, 144, 29);
		panel.add(password);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(10, 31, 86, 26);
		panel.add(lblUsername);
		lblUsername.setFont(new Font("Garamond", Font.BOLD, 20));
		
		username = new JTextField();
		username.setFont(new Font("Lucida Bright", Font.PLAIN, 18));
		username.setBackground(new Color(211, 211, 211));
		username.setBounds(105, 33, 148, 26);
		panel.add(username);
		username.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(259, -12, 183, 171);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\manth\\Desktop\\library_system\\src\\icons\\new2.png"));
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(50, 205, 50));
		btnNewButton.setBounds(10, 157, 394, 39);
		panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(username.getText().equals("admin") && password.getText().equals("admin123")) {
					frmAdminLogin.setVisible(false);
					adminaki adm=new adminaki();
					adm.frmAdmin.setVisible(true);
					JOptionPane.showMessageDialog(null,"Successfully Logged In");

				}
				else
					JOptionPane.showMessageDialog(null,"Some error Please try again");

			}
		});
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 22));
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(10, 90, 86, 26);
		panel.add(lblPassword);
		lblPassword.setFont(new Font("Garamond", Font.BOLD, 20));
		
		JButton back = new JButton("BACK");
		back.setForeground(new Color(255, 255, 255));
		back.setBackground(new Color(50, 205, 50));
		back.setBounds(10, 213, 394, 39);
		panel.add(back);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmAdminLogin.setVisible(false);
				firstpage fp=new firstpage();
				fp.frmLibrarySystem.setVisible(true);
			}
		});
		back.setFont(new Font("Sylfaen", Font.BOLD, 22));
		
		JLabel lblReadingAGood = new JLabel("\"Reading a good book is like taking a journey.\"");
		lblReadingAGood.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 20));
		lblReadingAGood.setBounds(10, 11, 414, 27);
		frmAdminLogin.getContentPane().add(lblReadingAGood);
	}

}
