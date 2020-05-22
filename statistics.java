package library_system;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

import javax.swing.JList;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class statistics {

	JFrame frmStatistics;
	private JTable table;
	private JTable issue;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					statistics window = new statistics();
					window.frmStatistics.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public statistics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStatistics = new JFrame();
		frmStatistics.setResizable(false);
		frmStatistics.setTitle("Statistics");
		frmStatistics.setBounds(100, 100, 860, 510);
		frmStatistics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStatistics.getContentPane().setLayout(null);
		
		
		DefaultTableModel model = new DefaultTableModel();
		DefaultTableModel model1 = new DefaultTableModel();
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(51, 255, 0), 3, true));
		panel.setBounds(10, 36, 824, 193);
		frmStatistics.getContentPane().add(panel);
		panel.setLayout(null);
		issue = new JTable(model);
		issue.setSurrendersFocusOnKeystroke(true);
		issue.setFillsViewportHeight(true);
		issue.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		issue.setBounds(10, 44, 801, 138);
		panel.add(issue);
		issue.setFont(new Font("Georgia", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("ISSUE_ID");
		lblNewLabel.setBounds(30, 19, 64, 14);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 14));
		
		JLabel lblNewLabel_1 = new JLabel("BOOK_ID");
		lblNewLabel_1.setBounds(155, 19, 70, 14);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("STUDENT_ID");
		lblNewLabel_2.setBounds(277, 19, 98, 14);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Cambria", Font.BOLD, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Student_Name");
		lblNewLabel_3.setBounds(409, 20, 105, 13);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Cambria", Font.BOLD, 15));
		
		JLabel lblNewLabel_4 = new JLabel("Email_ID");
		lblNewLabel_4.setBounds(584, 19, 70, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD, 15));
		
		JLabel lblNewLabel_5 = new JLabel("ISSUED_DATE");
		lblNewLabel_5.setBounds(697, 19, 98, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Cambria", Font.BOLD, 15));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 153, 255), 3, true));
		panel_1.setBounds(10, 258, 824, 202);
		frmStatistics.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		table_1 = new JTable(model1);
		table_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		table_1.setFont(new Font("Georgia", Font.PLAIN, 16));
		table_1.setBounds(10, 40, 804, 151);
		panel_1.add(table_1);
		
		
		JLabel lblReturnid = new JLabel("RETURN_ID");
		lblReturnid.setFont(new Font("Cambria", Font.BOLD, 14));
		lblReturnid.setBounds(10, 17, 86, 14);
		panel_1.add(lblReturnid);
		
		JLabel label_1 = new JLabel("BOOK_ID");
		label_1.setFont(new Font("Cambria", Font.BOLD, 15));
		label_1.setBounds(153, 18, 70, 14);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("STUDENT_ID");
		label_2.setFont(new Font("Cambria", Font.BOLD, 15));
		label_2.setBounds(281, 17, 98, 14);
		panel_1.add(label_2);
		
		JLabel label_3 = new JLabel("Student_Name");
		label_3.setFont(new Font("Cambria", Font.BOLD, 15));
		label_3.setBounds(413, 18, 105, 13);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Email_ID");
		label_4.setFont(new Font("Cambria", Font.BOLD, 15));
		label_4.setBounds(586, 18, 70, 14);
		panel_1.add(label_4);
		
		JLabel lblReturneddate = new JLabel("RETURNED_DATE");
		lblReturneddate.setFont(new Font("Cambria", Font.BOLD, 15));
		lblReturneddate.setBounds(682, 18, 132, 14);
		panel_1.add(lblReturneddate);
		
		JLabel lblNewLabel_6 = new JLabel("ISSUE Details");
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setBounds(10, 0, 153, 25);
		frmStatistics.getContentPane().add(lblNewLabel_6);
		lblNewLabel_6.setFont(new Font("Georgia", Font.BOLD, 18));
		
		JLabel lblReturnDetails = new JLabel("RETURN Details");
		lblReturnDetails.setForeground(Color.RED);
		lblReturnDetails.setFont(new Font("Georgia", Font.BOLD, 18));
		lblReturnDetails.setBounds(10, 234, 153, 25);
		frmStatistics.getContentPane().add(lblReturnDetails);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setBackground(UIManager.getColor("Button.shadow"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frmStatistics.setVisible(false);
				librarian lib=new librarian();
				lib.frmWelcomeLibrarian.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Cambria", Font.BOLD, 15));
		btnNewButton.setBounds(745, 0, 89, 27);
		frmStatistics.getContentPane().add(btnNewButton);
		
		 model.addColumn("Issue_ID");
	        model.addColumn("Book_ID");
	        model.addColumn("Student_ID");
	        model.addColumn("Student_Name");
	        model.addColumn("Email_ID");
	        model.addColumn("ISSUED_DATE");
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system", "root", "thechamp16");
	            java.sql.PreparedStatement pstm = con.prepareStatement("select * from student ,issue_details where student.id=issue_details.student_id");
	            ResultSet Rs = pstm.executeQuery();
	            while(Rs.next()){
	                model.addRow(new Object[]{Rs.getString(6), Rs.getString(7),Rs.getString(8),Rs.getString(2),Rs.getString(4),Rs.getString(9)});
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	        
	        model1.addColumn("Return_ID");
	        model1.addColumn("Book_ID");
	        model1.addColumn("Student_ID");
	        model1.addColumn("Student_Name");
	        model1.addColumn("Email_ID");
	        model1.addColumn("RETURNED_DATE");
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_system", "root", "thechamp16");
	            java.sql.PreparedStatement pstm = con.prepareStatement("select * from student ,return_details where student.id=return_details.student_id;");
	            ResultSet Rs = pstm.executeQuery();
	            while(Rs.next()){
	                model1.addRow(new Object[]{Rs.getString(6), Rs.getString(7),Rs.getString(8),Rs.getString(2),Rs.getString(4),Rs.getString(9)});
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
		
		
		
	}
}
