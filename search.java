package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class search {

	JFrame frmSearchForBooks;
	private JTextField search;
	protected ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					search window = new search();
					window.frmSearchForBooks.setVisible(true);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public search() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSearchForBooks = new JFrame();
		frmSearchForBooks.setResizable(false);
		frmSearchForBooks.setTitle("Search for books");
		frmSearchForBooks.setBounds(100, 100, 708, 411);
		frmSearchForBooks.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSearchForBooks.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 3, true));
		panel.setBounds(10, 36, 672, 325);
		frmSearchForBooks.getContentPane().add(panel);
		panel.setLayout(null);
		
		search = new JTextField();
		search.setHorizontalAlignment(SwingConstants.CENTER);
		search.setFont(new Font("Cambria", Font.PLAIN, 16));
		search.setBounds(10, 11, 366, 30);
		panel.add(search);
		search.setColumns(10);
		
		String s1[] = { "Author" ,"Book Name","Publisher","All"};
		JComboBox choose = new JComboBox(s1);
		choose.setFont(new Font("Bookman Old Style", Font.PLAIN, 18));
		choose.setBounds(389, 11, 143, 30);
		panel.add(choose);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 204, 255));
		panel_1.setBounds(21, 60, 628, 253);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JList booklist = new JList();
		booklist.setBorder(new LineBorder(new Color(0, 0, 255), 3, true));
		booklist.setBackground(SystemColor.controlHighlight);
		booklist.setFont(new Font("Cambria", Font.PLAIN, 18));
		booklist.setBounds(10, 11, 399, 231);
		panel_1.add(booklist);
		
		
		JButton searchbutton = new JButton("");
		
		searchbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String select=(String)choose.getSelectedItem();
				try {
        			Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/library_system","root","thechamp16"); 
					 Statement stmt=con.createStatement();  
					 DefaultListModel listModel1 = new DefaultListModel();
					 if(select.equals("Author")) {
					 ResultSet rs=stmt.executeQuery("Select * from books where author='"+search.getText()+"'");
					 while (rs.next()) {
					        listModel1.addElement(rs.getString(1)+"	   "+rs.getString(2)+"    "+rs.getString(4));}

					        booklist.setModel(listModel1);
					 }
					 else if(select.equals("Publisher")) {
						 ResultSet rs=stmt.executeQuery("Select * from books where publisher='"+search.getText()+"'"); 
						 while (rs.next()) {
						        listModel1.addElement(rs.getString(1)+"	   "+rs.getString(2)+"    "+rs.getString(4));}

						        booklist.setModel(listModel1);
						        }
					 else if(select=="Book Name") {
						 ResultSet rs=stmt.executeQuery("Select * from books where book_name='"+search.getText()+"'");  
						 while (rs.next()) {
						        listModel1.addElement(rs.getString(1)+"	   "+rs.getString(2)+"    "+rs.getString(4));}

						        booklist.setModel(listModel1);
						        }
					 else if(select=="All") {
						 ResultSet rs=stmt.executeQuery("Select * from books");  
						 while (rs.next()) {
						        listModel1.addElement(rs.getString(1)+"	   "+rs.getString(2)+"    "+rs.getString(4));}

						        booklist.setModel(listModel1);
						        }
					
			/*	if(rs.next()) {
					listModel1.addElement(rs.getString(1));}
        		 
        		  }else {
        			  JOptionPane.showMessageDialog(null,"There is no such book in library");
        		  }*/
     			 con.close();
     		}catch(Exception e){JOptionPane.showMessageDialog(null,"some error!");}  
				
			}
		});
		
		searchbutton.setIcon(new ImageIcon("C:\\Users\\manth\\Desktop\\library_system\\src\\icons\\nuy.png"));
		searchbutton.setBounds(559, 11, 103, 38);
		panel.add(searchbutton);
		
		
		JList list = new JList();
		list.setBounds(314, 5, 0, 0);
		panel_1.add(list);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\manth\\Desktop\\library_system\\src\\icons\\stick_figure_carrying_books_md_wm_v2.gif"));
		lblNewLabel_1.setBounds(428, 23, 172, 208);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Search for a book here..");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 211, 25);
		frmSearchForBooks.getContentPane().add(lblNewLabel);
		
		JButton backbtn = new JButton("BACK");
		backbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmSearchForBooks.setVisible(false);
				librarian lib=new librarian();
				lib.frmWelcomeLibrarian.setVisible(true);
			}
		});
		backbtn.setBackground(UIManager.getColor("Button.shadow"));
		backbtn.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
		backbtn.setBounds(576, 0, 106, 34);
		frmSearchForBooks.getContentPane().add(backbtn);
	}
}
