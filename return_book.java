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

public class return_book extends javax.swing.JFrame {

	   
    public return_book() {
    	setResizable(false);
    	getContentPane().setBackground(new Color(105, 105, 105));
    	setTitle("Return Book");
        initComponents();
    }

   
                            
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        popupMenu1 = new java.awt.PopupMenu();
        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new Color(255, 99, 71));
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
        publisher = new javax.swing.JTextField();
        publisher.setFont(new Font("Garamond", Font.PLAIN, 20));
        bookid = new javax.swing.JTextField();
        bookid.setFont(new Font("Garamond", Font.PLAIN, 20));
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setFont(new Font("Century", Font.BOLD, 18));
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setFont(new Font("Century", Font.BOLD, 18));
        searchbook = new javax.swing.JButton();
        searchbook.setBackground(UIManager.getColor("Button.shadow"));
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
        searchbook.setFont(new Font("Constantia", Font.BOLD, 20));
        searchbook.setText("Search");
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(new Color(255, 99, 71));
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
        back.setBackground(UIManager.getColor("Button.light"));
        back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				return_book ret=new return_book();
				ret.setVisible(false);
				librarian lib=new librarian();
				lib.frmWelcomeLibrarian.setVisible(true);
				//new_student newstu=new new_student();
				//newstu.setVisible(true);
			}
			
		});
       
        back.setFont(new Font("Constantia", Font.BOLD, 20));
        back.setText("Back");
        returnbutton = new javax.swing.JButton();
        returnbutton.setBackground(UIManager.getColor("Button.highlight"));
        
        returnbutton.setFont(new Font("Constantia", Font.BOLD, 22));

        jLabel6.setText("jLabel6");

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new LineBorder(new Color(255, 0, 0), 5, true));

        jLabel1.setFont(new Font("Century", Font.BOLD, 17)); // NOI18N
        jLabel1.setText("Book ID");
        jLabel1.setName("");

        jLabel3.setFont(new Font("Century", Font.BOLD, 18)); // NOI18N
        jLabel3.setText("Author");

        jLabel2.setFont(new Font("Century", Font.BOLD, 18)); // NOI18N
        jLabel2.setText("Name");

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
        				.addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(edition, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        				.addComponent(publisher, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        				.addComponent(author, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        				.addComponent(name, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        				.addComponent(bookid, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
        			.addGap(18)
        			.addComponent(searchbook, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGap(24)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        				.addComponent(bookid, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(searchbook, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addGap(20)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(name, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel2))
        			.addGap(23)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel3)
        					.addGap(23, 23, Short.MAX_VALUE))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(author, GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel4)
        				.addComponent(publisher, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(edition, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addGap(128))
        );
        jPanel1.setLayout(jPanel1Layout);

        jPanel2.setBorder(new LineBorder(new Color(255, 0, 0), 5, true)); // NOI18N

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
        button.setFont(new Font("Constantia", Font.BOLD, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel7)
        				.addComponent(jLabel8)
        				.addComponent(jLabel9, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
        			.addGap(52)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(studentid, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(button))
        				.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        					.addComponent(studentname, Alignment.LEADING)
        					.addComponent(studentmail, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
        				.addComponent(studentbranch, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGap(43)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel7)
        				.addComponent(studentid, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        				.addComponent(button, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
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
        			.addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel2.setLayout(jPanel2Layout);

        back.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aniket\\Pictures\\back1.png")); // NOI18N

        returnbutton.setText("RETURN BOOK");
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setFont(new Font("Century", Font.BOLD, 18));
        
                jLabel12.setText("Date of Returning");
        
        JDateChooser returndate = new JDateChooser();

        returnbutton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try {
        		    Class.forName("com.mysql.jdbc.Driver");  
        		    Connection con=DriverManager.getConnection(  
        		    "jdbc:mysql://localhost:3306/library_system","root","thechamp16");  
        		    String str1 ="insert into return_details values (?, ?, ?, ?);";
        			PreparedStatement stat = (PreparedStatement) con.prepareStatement(str1);
        			        String book_id = String.valueOf(bookid.getText());
        		                String student_id=String.valueOf(studentid.getText());
        		                String retdate = String.valueOf(returndate.getDate()); 
        		               String retdate1=retdate.substring(0,10)+ retdate.substring(23);
        		              
        		               Statement stmt=con.createStatement();  
        						  ResultSet rs=stmt.executeQuery("Select * from issue_details where book_id='"+book_id+"'");  
        						  while(rs.next()) {
        							 if( String.valueOf(studentid.getText()).equals(rs.getString(3))==true)
        							 {
        		                Random random = new Random();
        		                int return_id = random.nextInt(3000);
        		                String return_id1 = Integer.toString(return_id);
        		               
        		                stat.setString(1,return_id1);
        		                  stat.setString(2, book_id);
        		                  stat.setString(3, student_id);
        		                  stat.setString(4, retdate1);
        		                  
        		                  stat.executeUpdate();
        		                  String sql = "DELETE FROM issue_details WHERE book_id = '"+String.valueOf(bookid.getText())+"'";
             		             stat.executeUpdate(sql);        		        			 
             		                  con.close();
             		                 JOptionPane.showMessageDialog(null,"Book Returend succesfully");
        							 }
       							  else {
       								  JOptionPane.showMessageDialog(null,"Incorrect entries given."); 
       								  }
        						  }
        						              
        		    }catch(Exception e){  }
        	}
        });
        
        lblNewLabel = new JLabel("Book Details");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
        
        lblStudentDetails = new JLabel("Student Details");
        lblStudentDetails.setForeground(new Color(255, 255, 255));
        lblStudentDetails.setFont(new Font("Times New Roman", Font.BOLD, 23));

        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(25)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(back, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblStudentDetails, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(returnbutton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        								.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        									.addGroup(layout.createSequentialGroup()
        										.addGap(22)
        										.addComponent(jLabel12)
        										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(returndate, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE))
        									.addComponent(jPanel2, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        								.addPreferredGap(ComponentPlacement.UNRELATED)
        								.addComponent(jLabel11)
        								.addGap(14))))
        					.addGap(20))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(back, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(229)
        					.addComponent(jLabel11))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblNewLabel)
        						.addComponent(lblStudentDetails, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 300, Short.MAX_VALUE))))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(returndate, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jLabel12, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(returnbutton, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        			.addContainerGap())
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
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(return_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new return_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                    
    private javax.swing.JButton back;
    private javax.swing.JButton returnbutton;
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