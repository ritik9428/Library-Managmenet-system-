package library_system;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import com.toedter.calendar.JDateChooser;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class issue_book extends javax.swing.JFrame {

	   
    public issue_book() {
    	setResizable(false);
    	getContentPane().setBackground(new Color(176, 224, 230));
    	setTitle("Issue Details");
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        popupMenu1 = new java.awt.PopupMenu();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new Color(144, 238, 144));
        jPanel1.setForeground(Color.YELLOW);
        name = new javax.swing.JTextField();
        name.setFont(new Font("Garamond", Font.PLAIN, 20));
        jLabel1 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        author.setFont(new Font("Garamond", Font.PLAIN, 20));
        edition = new javax.swing.JTextField();
        edition.setFont(new Font("Garamond", Font.PLAIN, 20));
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setFont(new Font("Century", Font.BOLD, 18));
        publisher = new javax.swing.JTextField();
        publisher.setFont(new Font("Garamond", Font.PLAIN, 20));
        bookid = new javax.swing.JTextField();
        bookid.setFont(new Font("Garamond", Font.PLAIN, 20));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Century", Font.BOLD, 18));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Century", Font.BOLD, 18));
        searchbook = new javax.swing.JButton();
        searchbook.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
        			Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/library_system","root","thechamp16"); 
					 Statement stmt=con.createStatement();  
					  ResultSet rs=stmt.executeQuery("Select * from books where bookid='"+bookid.getText()+"'");  
        		  if(rs.next()) {
        		  name.setText(rs.getString(2));
        		  author.setText(rs.getString(4));
        		  publisher.setText(rs.getString(5));
        		  name.setText(rs.getString(2));
        		  edition.setText(rs.getString(3));
        		  }else {
        			  JOptionPane.showMessageDialog(null,"There is no such book in library");
        			  name.setText("");
            		  author.setText("");
            		  publisher.setText("");
            		  name.setText("");
            		  edition.setText("");
        		  }
        			 con.close();
        		}catch(Exception e){JOptionPane.showMessageDialog(null,"some error!");}  
        	}
        });
        searchbook.setFont(new Font("Constantia", Font.BOLD, 18));
        searchbook.setText("Search");
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(new Color(144, 238, 144));
        jLabel7 = new javax.swing.JLabel();
        jLabel7.setFont(new Font("Century", Font.BOLD, 18));
        studentname = new javax.swing.JTextField();
        studentname.setFont(new Font("Garamond", Font.PLAIN, 20));
        studentbranch = new javax.swing.JTextField();
        studentbranch.setFont(new Font("Garamond", Font.PLAIN, 20));
        jLabel8 = new javax.swing.JLabel();
        jLabel8.setFont(new Font("Century", Font.BOLD, 18));
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setFont(new Font("Century", Font.BOLD, 18));
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setFont(new Font("Century", Font.BOLD, 18));
        studentid = new javax.swing.JTextField();
        studentid.setFont(new Font("Garamond", Font.PLAIN, 20));
        studentmail = new javax.swing.JTextField();
        studentmail.setFont(new Font("Garamond", Font.PLAIN, 20));
        back = new javax.swing.JButton();
        back.setBackground(UIManager.getColor("Button.highlight"));
        back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new issue_book().setVisible(false);
				librarian lib=new librarian();
				lib.frmWelcomeLibrarian.setVisible(true);
				//new_student newstu=new new_student();
				//newstu.setVisible(true);
			}
			
		});
       
        back.setFont(new Font("Javanese Text", Font.BOLD, 18));
        back.setText("Back");
        jButton2 = new javax.swing.JButton();
        
        jButton2.setFont(new Font("Constantia", Font.BOLD, 23));

        jLabel6.setText("jLabel6");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new LineBorder(new Color(46, 139, 87), 4, true));

        jLabel1.setFont(new Font("Century", Font.BOLD, 17)); // NOI18N
        jLabel1.setText("Book ID");
        jLabel1.setName("");

        jLabel3.setFont(new Font("Century", Font.BOLD, 18)); // NOI18N
        jLabel3.setText("Author");

        jLabel2.setFont(new Font("Century", Font.BOLD, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel12.setText("Date of Issuing");

        publisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_publisherActionPerformed(evt);
            }
        });

        bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_bookidActionPerformed(evt);
            }
        });

        jLabel4.setText("Publisher");

        jLabel5.setText("Edition");

        searchbook.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aniket\\Pictures\\search1.jpg")); // NOI18N
        
        JDateChooser issuedate = new JDateChooser();
        
        //JDateChooser returndate = new JDateChooser();
        
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
        		    Class.forName("com.mysql.jdbc.Driver");  
        		    Connection con=DriverManager.getConnection(  
        		    "jdbc:mysql://localhost:3306/library_system","root","thechamp16");  
        		    String str1 ="insert into issue_details values (?, ?, ?, ?);";
        			PreparedStatement stat = (PreparedStatement) con.prepareStatement(str1);
        		              String book_id = String.valueOf(bookid.getText());
        		                String student_id=String.valueOf(studentid.getText());
        		                String issdate = String.valueOf(issuedate.getDate());
        		               
        		                String issdate1=new String(issdate);
        		                
        		               String issdate2=issdate1.substring(0,10)+ issdate1.substring(23);
        		             
        		                Random random = new Random();
        		                int issue_id = random.nextInt(5000);
        		                String issue_id1 = Integer.toString(issue_id);
        		              
        		                stat.setString(1,issue_id1);
        		                  stat.setString(2, book_id);
        		                  stat.setString(3, student_id);
        		                  stat.setString(4, issdate2);
        		                 
        		                  stat.executeUpdate();
        		               
        		     
        		                  con.close();
        		                  JOptionPane.showMessageDialog(null,"Book Issued succesfully");
        		    }catch(Exception e){ JOptionPane.showMessageDialog(null,"Wrong data entered please recheck!"); }
        	}
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
        				.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(jLabel2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addComponent(jLabel3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        				.addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel12))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(edition, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        						.addComponent(bookid, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        						.addComponent(name, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        						.addComponent(author, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        						.addComponent(publisher, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
        					.addGap(18)
        					.addComponent(searchbook, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
        				.addComponent(issuedate, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bookid, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(searchbook, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGap(20)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(name, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(23)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel3)
        				.addComponent(author, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel4)
        				.addComponent(publisher, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(edition, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(23)
        					.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(24)
        					.addComponent(issuedate, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(new LineBorder(new Color(46, 139, 87), 4, true)); // NOI18N

        jLabel7.setText("Student ID");

        jLabel8.setText("Name");

        jLabel10.setText("Branch");

        jLabel9.setText("Email");
        
        button = new JButton();
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
        			Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/library_system","root","thechamp16"); 
					 Statement stmt=con.createStatement();  
					  ResultSet rs=stmt.executeQuery("Select * from student where id='"+String.valueOf(studentid.getText())+"'");  
        		  if(rs.next()) {
        		  studentname.setText(rs.getString(2));
        		  studentmail.setText(rs.getString(4));
        		  studentbranch.setText(rs.getString(3));				
        		  }else {
        			  JOptionPane.showMessageDialog(null,"Record does not exist");
        			  studentname.setText("");
            		  studentmail.setText("");
            		  studentbranch.setText("");
        		  }
        			 con.close();
        		}catch(Exception e){JOptionPane.showMessageDialog(null,"some error!");}  
        	}
        });
        button.setText("Search");
        button.setFont(new Font("Constantia", Font.BOLD, 18));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel8)
        				.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7))
        			.addGap(52)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(studentid, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(button))
        				.addComponent(studentname, 102, 102, 102)
        				.addComponent(studentmail)
        				.addComponent(studentbranch, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(43)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(studentid, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
        				.addComponent(button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel7))
        			.addGap(20)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel8)
        				.addComponent(studentname, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(23)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel9)
        				.addComponent(studentmail, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addGap(21)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel10)
        				.addComponent(studentbranch, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aniket\\Pictures\\back1.png")); // NOI18N

        jButton2.setText("ISSUE BOOK");
        
        lblNewLabel = new JLabel("Book Details");
        lblNewLabel.setForeground(new Color(255, 0, 0));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        
        lblStudentDetails = new JLabel("Student Details");
        lblStudentDetails.setForeground(new Color(255, 140, 0));
        lblStudentDetails.setFont(new Font("Times New Roman", Font.BOLD, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(25)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(back, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
        					.addGap(28)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(jButton2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
        								.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(jLabel11)
        							.addGap(20))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(lblStudentDetails, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
        							.addContainerGap())))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(270)
        					.addComponent(jLabel11))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(5)
        					.addComponent(back, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        					.addGap(11)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblNewLabel)
        						.addComponent(lblStudentDetails, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        					.addGap(4)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 339, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(20, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void tf_bookidActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                        

    private void tf_publisherActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issue_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                    
    private javax.swing.JButton back;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton searchbook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField studentmail;
    private javax.swing.JTextField studentbranch;
    private javax.swing.JTextField studentid;
    private javax.swing.JTextField studentname;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField author;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField name;
    private javax.swing.JTextField edition;
    private javax.swing.JTextField publisher;
    private JButton button;
    private JLabel lblNewLabel;
    private JLabel lblStudentDetails;
}
