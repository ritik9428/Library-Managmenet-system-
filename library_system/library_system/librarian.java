package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class librarian {

	JFrame frmWelcomeLibrarian;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					librarian window = new librarian();
					window.frmWelcomeLibrarian.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public librarian() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWelcomeLibrarian = new JFrame();
		frmWelcomeLibrarian.setResizable(false);
		frmWelcomeLibrarian.getContentPane().setBackground(new Color(255, 255, 255));
		frmWelcomeLibrarian.getContentPane().setLayout(null);
		panel.setBounds(0, 0, 788, 98);
		panel.setBackground(new Color(220, 20, 60));
		frmWelcomeLibrarian.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setIcon(new ImageIcon("images/icons8-library-96.png"));
		lblNewLabel.setBounds(10, 11, 96, 78);
		panel.add(lblNewLabel);
		
		JLabel lblaLibrary = new JLabel("\"A Library is not a luxury but one of the necessitites of life\"");
		lblaLibrary.setForeground(new Color(255, 255, 255));
		lblaLibrary.setFont(new Font("Baskerville Old Face", Font.BOLD | Font.ITALIC, 25));
		lblaLibrary.setBounds(120, 11, 658, 78);
		panel.add(lblaLibrary);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(22, 109, 229, 175);
		panel_1.setBackground(new Color(220, 20, 60));
		frmWelcomeLibrarian.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		panel_7.setBackground(new Color(220, 20, 60));
		panel_7.setBounds(10, 11, 209, 153);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JButton statisticsbtn = new JButton("STATISTICS");
		statisticsbtn.setBackground(UIManager.getColor("Button.shadow"));
		statisticsbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmWelcomeLibrarian.setVisible(false);
				statistics stat=new statistics();
				stat.frmStatistics.setVisible(true);
			}
		});
		statisticsbtn.setBounds(10, 105, 183, 37);
		panel_7.add(statisticsbtn);
		statisticsbtn.setFont(new Font("Sitka Small", Font.BOLD, 18));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(68, 11, 131, 99);
		panel_7.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon("images/icons8-statistics-64.png"));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(270, 109, 249, 175);
		panel_2.setBackground(new Color(220, 20, 60));
		frmWelcomeLibrarian.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		panel_8.setBackground(new Color(220, 20, 60));
		panel_8.setBounds(10, 11, 229, 153);
		panel_2.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("images/new1.png"));
		lblNewLabel_2.setBounds(53, 11, 120, 96);
		panel_8.add(lblNewLabel_2);
		
		JButton newstudentbtn = new JButton("NEW STUDENT");
		newstudentbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmWelcomeLibrarian.setVisible(false);
				new_student newstu=new new_student();
				newstu.frame.setVisible(true);
			}
			
		});
		newstudentbtn.setFont(new Font("Sitka Small", Font.BOLD, 18));
		newstudentbtn.setBounds(10, 107, 209, 35);
		panel_8.add(newstudentbtn);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(541, 107, 224, 177);
		panel_3.setBackground(new Color(220, 20, 60));
		frmWelcomeLibrarian.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		panel_9.setBackground(new Color(220, 20, 60));
		panel_9.setBounds(10, 11, 204, 155);
		panel_3.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("images/icons8-books-100.png"));
		lblNewLabel_3.setBounds(53, 24, 100, 94);
		panel_9.add(lblNewLabel_3);
		
		JButton newbookbtn = new JButton("NEW BOOK");
		newbookbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmWelcomeLibrarian.setVisible(false);
				new_book newbook=new new_book();
				newbook.setVisible(true);
			}
		});
		newbookbtn.setFont(new Font("Sitka Small", Font.BOLD, 18));
		newbookbtn.setBounds(10, 114, 184, 30);
		panel_9.add(newbookbtn);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(22, 296, 229, 158);
		panel_4.setBackground(new Color(220, 20, 60));
		frmWelcomeLibrarian.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		panel_10.setBackground(new Color(220, 20, 60));
		panel_10.setBounds(10, 11, 209, 136);
		panel_4.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("images/nui.png"));
		lblNewLabel_4.setBounds(54, 11, 99, 74);
		panel_10.add(lblNewLabel_4);
		
		JButton searchbookbtn = new JButton("SEARCH BOOK");
		searchbookbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmWelcomeLibrarian.setVisible(false);
				search se=new search();
				se.frmSearchForBooks.setVisible(true);
			}
		});
		searchbookbtn.setFont(new Font("Sitka Small", Font.BOLD, 18));
		searchbookbtn.setBounds(10, 90, 189, 35);
		panel_10.add(searchbookbtn);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(270, 296, 249, 158);
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(220, 20, 60));
		frmWelcomeLibrarian.getContentPane().add(panel_5);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new LineBorder(new Color(255, 255, 255), 4, true));
		panel_11.setBackground(new Color(220, 20, 60));
		panel_11.setBounds(10, 11, 229, 136);
		panel_5.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("images/gey.png"));
		lblNewLabel_5.setBounds(56, 0, 120, 86);
		panel_11.add(lblNewLabel_5);
		
		JButton issuebookbtn = new JButton("ISSUE BOOK");
		issuebookbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmWelcomeLibrarian.setVisible(false);
				issue_book issbook=new issue_book();
				issbook.setVisible(true);
			}
		});
		issuebookbtn.setFont(new Font("Sitka Small", Font.BOLD, 18));
		issuebookbtn.setBounds(10, 90, 209, 35);
		panel_11.add(issuebookbtn);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(541, 296, 224, 158);
		panel_6.setLayout(null);
		panel_6.setBackground(new Color(220, 20, 60));
		frmWelcomeLibrarian.getContentPane().add(panel_6);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new LineBorder(new Color(255, 255, 255), 4));
		panel_12.setBackground(new Color(220, 20, 60));
		panel_12.setBounds(10, 11, 204, 136);
		panel_6.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("images/Things-Book-icon.png"));
		lblNewLabel_6.setBounds(51, 11, 90, 73);
		panel_12.add(lblNewLabel_6);
		
		JButton returnbutton = new JButton("RETURN BOOK");
		returnbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmWelcomeLibrarian.setVisible(false);
				//return_book retbook=new return_book();
				new return_book().setVisible(true);
			}
		});
		returnbutton.setFont(new Font("Sitka Small", Font.BOLD, 17));
		returnbutton.setBounds(10, 91, 184, 34);
		panel_12.add(returnbutton);
		frmWelcomeLibrarian.setTitle("Welcome Librarian");
		frmWelcomeLibrarian.setBounds(100, 100, 804, 504);
		frmWelcomeLibrarian.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
