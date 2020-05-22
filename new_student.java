package library_system;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.UIManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class new_student {

	JFrame frame;
	private JTextField studentid;
	private JTextField studentname;
	private JTextField email;
	private JTextField mobno;
	private JTextField branch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new_student window = new new_student();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public new_student() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(192, 192, 192));
		frame.setBounds(100, 100, 450, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(105, 105, 105));
		panel.setBounds(0, 0, 434, 73);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton back = new JButton("Back");
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				librarian lib=new librarian();
				lib.frmWelcomeLibrarian.setVisible(true);
			}
		});
		back.setBackground(UIManager.getColor("Button.shadow"));
		back.setFont(new Font("Sitka Subheading", Font.BOLD, 18));
		back.setBounds(10, 23, 89, 31);
		panel.add(back);
		
		JLabel lblNewLabel = new JLabel("Student ID");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		lblNewLabel.setBounds(21, 84, 141, 27);
		frame.getContentPane().add(lblNewLabel);
		
		studentid = new JTextField();
		studentid.setFont(new Font("Cambria", Font.BOLD, 18));
		studentid.setForeground(new Color(255, 255, 255));
		studentid.setBackground(new Color(169, 169, 169));
		studentid.setBounds(20, 120, 176, 30);
		frame.getContentPane().add(studentid);
		studentid.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setForeground(new Color(0, 0, 0));
		lblName.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		lblName.setBounds(21, 161, 105, 22);
		frame.getContentPane().add(lblName);
		
		studentname = new JTextField();
		studentname.setForeground(new Color(255, 255, 255));
		studentname.setFont(new Font("Cambria", Font.BOLD, 18));
		studentname.setColumns(10);
		studentname.setBackground(new Color(169, 169, 169));
		studentname.setBounds(20, 194, 209, 33);
		frame.getContentPane().add(studentname);
		
		JLabel lblBranch = new JLabel("Branch");
		lblBranch.setForeground(new Color(0, 0, 0));
		lblBranch.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		lblBranch.setBounds(21, 238, 105, 22);
		frame.getContentPane().add(lblBranch);
		
		JLabel lblEmailId = new JLabel("Email ID");
		lblEmailId.setForeground(new Color(0, 0, 0));
		lblEmailId.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		lblEmailId.setBounds(21, 317, 105, 22);
		frame.getContentPane().add(lblEmailId);
		
		email = new JTextField();
		email.setForeground(new Color(255, 255, 255));
		email.setFont(new Font("Cambria", Font.BOLD, 18));
		email.setColumns(10);
		email.setBackground(new Color(169, 169, 169));
		email.setBounds(21, 346, 208, 33);
		frame.getContentPane().add(email);
		
		JLabel lblMobileNo = new JLabel("Mobile No.");
		lblMobileNo.setForeground(new Color(0, 0, 0));
		lblMobileNo.setFont(new Font("Lucida Fax", Font.BOLD, 18));
		lblMobileNo.setBounds(21, 381, 105, 22);
		frame.getContentPane().add(lblMobileNo);
		
		mobno = new JTextField();
		mobno.setForeground(new Color(255, 255, 255));
		mobno.setFont(new Font("Cambria", Font.BOLD, 18));
		mobno.setColumns(10);
		mobno.setBackground(new Color(169, 169, 169));
		mobno.setBounds(20, 403, 209, 27);
		frame.getContentPane().add(mobno);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\manth\\Desktop\\library_system\\src\\icons\\images__1_-removebg-preview.png"));
		lblNewLabel_1.setBounds(274, 144, 150, 177);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton add = new JButton("Add Student");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
				    Class.forName("com.mysql.jdbc.Driver");  
				    Connection con=(Connection) DriverManager.getConnection(  
				    "jdbc:mysql://localhost:3306/library_system","root","thechamp16");  
				    String str1 ="insert into student values (?, ?, ?, ?, ?);";
					PreparedStatement stat = (PreparedStatement) con.prepareStatement(str1);
				                String id = String.valueOf(studentid.getText());
				                   String name = String.valueOf(studentname.getText());
				                   String value = String.valueOf(branch.getText());
				                   String emailid = String.valueOf(email.getText());
				                   String mobile = String.valueOf(mobno.getText());
				                  if(name.equals("")!=true || emailid.equals("")!=true || id.equals("")!=true) {
				                  stat.setString(1, id);
				                  stat.setString(2, name);
				                  stat.setString(3, value);
				                  stat.setString(4, emailid);
				                  stat.setString(5, mobile);
				                  stat.executeUpdate();
				     //System.out.println("hello");
				                  con.close();
				                  JOptionPane.showMessageDialog(null,"New Entry Added");
				                  studentid.setText("");
				                  studentname.setText("");
				                  email.setText("");
				                  mobno.setText("");
				                  }
				                  else {
				                	  JOptionPane.showMessageDialog(null,"Blank entries not allowed");
				                  }
				    }catch(Exception e){ JOptionPane.showMessageDialog(null,"Record already exists or Some error please recheck!"); }
			}
		});
		add.setBackground(UIManager.getColor("Button.shadow"));
		add.setFont(new Font("Sitka Heading", Font.BOLD, 20));
		add.setBounds(262, 380, 162, 33);
		frame.getContentPane().add(add);
		
		JButton btnNewButton = new JButton("Search for student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
        			Class.forName("com.mysql.jdbc.Driver");  
					Connection con=(Connection) DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/e_print_system","root","thechamp16"); 
					 Statement stmt=con.createStatement();  
					  ResultSet rs=stmt.executeQuery("Select * from student_rait_data where roll_no='"+String.valueOf(studentid.getText())+"'");  
        		  if(rs.next()) {
        			  
        		  studentname.setText(rs.getString(3));
        		  email.setText(rs.getString(5));
        		  branch.setText(rs.getString(2).substring(2,4));	
        		  mobno.setText(rs.getString(6));
        		  }else {
        			  JOptionPane.showMessageDialog(null,"Record does not exist");
        			  studentname.setText("");
            		  email.setText("");
            		  branch.setText("");
            		  mobno.setText("");
        		  }
        			 con.close();
        		}catch(Exception e){JOptionPane.showMessageDialog(null,"some error!");}  
			}
		});
		btnNewButton.setFont(new Font("Century Schoolbook", Font.PLAIN, 18));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(206, 120, 218, 30);
		frame.getContentPane().add(btnNewButton);
		
		branch = new JTextField();
		branch.setForeground(new Color(255, 255, 255));
		branch.setFont(new Font("Cambria", Font.BOLD, 18));
		branch.setBackground(new Color(169, 169, 169));
		branch.setBounds(21, 271, 86, 32);
		frame.getContentPane().add(branch);
		branch.setColumns(10);
	}
}
