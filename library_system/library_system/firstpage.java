package library_system;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;

public class firstpage {

	JFrame frmLibrarySystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					firstpage window = new firstpage();
					window.frmLibrarySystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public firstpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLibrarySystem = new JFrame();
		frmLibrarySystem.setResizable(false);
		frmLibrarySystem.setTitle("Library system");
		frmLibrarySystem.getContentPane().setBackground(new Color(255, 255, 255));
		frmLibrarySystem.setBounds(100, 100, 641, 439);
		frmLibrarySystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLibrarySystem.getContentPane().setLayout(null);
		
		JButton adminlogin = new JButton("ADMIN LOGIN");
		adminlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				frmLibrarySystem.setVisible(false);
				admin_login admin_log=new admin_login();
				admin_log.frmAdminLogin.setVisible(true);
			}
		});
		adminlogin.setFont(new Font("Cambria", Font.PLAIN, 16));
		adminlogin.setBounds(347, 265, 192, 41);
		frmLibrarySystem.getContentPane().add(adminlogin);
		
		JButton librarianlogin = new JButton("LIBRARIAN LOGIN");
		librarianlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmLibrarySystem.setVisible(false);
				login log=new login();
				log.frmLibrarianLogin.setVisible(true);
			}
		});
		librarianlogin.setFont(new Font("Cambria", Font.PLAIN, 16));
		librarianlogin.setBounds(95, 265, 177, 41);
		frmLibrarySystem.getContentPane().add(librarianlogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("images/adminnew.png"));
		lblNewLabel.setBounds(95, 52, 216, 226);
		frmLibrarySystem.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("images/librarian-removebg-preview.png"));
		lblNewLabel_1.setBounds(374, 67, 177, 211);
		frmLibrarySystem.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("images/open-book-brown-cover_135176-247.jpg"));
		lblNewLabel_2.setBounds(0, 0, 616, 426);
		frmLibrarySystem.getContentPane().add(lblNewLabel_2);
	}

}
