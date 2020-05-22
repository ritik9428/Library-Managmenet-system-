package library_system;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class new_book extends javax.swing.JFrame {

    /**
     * Creates new form NewBookForm
     */
    public new_book() {
    	setResizable(false);
    	getContentPane().setBackground(new Color(0, 255, 127));
    	setForeground(Color.BLACK);
    	setTitle("Add New Book");
        initComponents();
    }
                  
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(new Color(211, 211, 211));
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(new Color(211, 211, 211));
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        back.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		new new_book().setVisible(false);
				librarian lib=new librarian();
				lib.frmWelcomeLibrarian.setVisible(true);
        	}
        	
        });
        jLabel1 = new javax.swing.JLabel();
        edition = new javax.swing.JComboBox();
        add = new javax.swing.JButton();
        book_name = new javax.swing.JTextField();
        bookid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(new LineBorder(new Color(0, 0, 255), 4, true)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Edition");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Publisher");

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setForeground(Color.WHITE);
        back.setText("Back");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Book Id");

        edition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", " " }));

        add.setBackground(new java.awt.Color(0, 0, 0));
        add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        add.setForeground(Color.WHITE);
        add.setText("Add New Book");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Author");
        
        publisher = new JTextField();
        publisher.setColumns(10);
        
        author = new JTextField();
        author.setColumns(10);

        Random random = new Random();
        int book_id = random.nextInt(5000);
        bookid.setText(Integer.toString(book_id));
        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(jLabel5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)))
        					.addGap(38)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(author, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        						.addComponent(publisher)
        						.addComponent(edition, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(bookid, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
        						.addComponent(book_name, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
        					.addContainerGap())
        				.addGroup(Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(back, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
        						.addComponent(add, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
        					.addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addComponent(bookid, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel2)
        				.addComponent(book_name, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(jLabel3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(edition, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel4)
        				.addComponent(publisher, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel5)
        				.addComponent(author, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
        			.addGap(32)
        			.addComponent(add, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(back)
        			.addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\manth\\Desktop\\library_system\\src\\icons\\download__1_-removebg-preview (1).png"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
        			.addGap(26)
        			.addComponent(lblNewLabel)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
        				.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(31, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	 try {
    		    Class.forName("com.mysql.jdbc.Driver");  
    		    Connection con=DriverManager.getConnection(  
    		    "jdbc:mysql://localhost:3306/library_system","root","thechamp16");  
    		    String str1 ="insert into books values (?, ?, ?, ?, ?);";
    			PreparedStatement stat = (PreparedStatement) con.prepareStatement(str1);
    			 
	                		   String id = bookid.getText();
    		                   String name = String.valueOf(book_name.getText());
    		                   String value = String.valueOf(edition.getSelectedItem());
    		                   String autho = String.valueOf(author.getText());
    		                   String publishe = String.valueOf(publisher.getText());
    		                  if(name.equals("")==false) { 
    		                  stat.setString(1, id);
    		                  stat.setString(2, name);
    		                  stat.setString(3, value);
    		                  stat.setString(4, autho);
    		                  stat.setString(5, publishe);
    		                  stat.executeUpdate();
    		     //System.out.println("hello");
    		                  con.close();
    		                  JOptionPane.showMessageDialog(null,"New Book Added");
    		                  }
    		                  else
    		                	  JOptionPane.showMessageDialog(null,"Blank entries not allowed ");
    		    }catch(Exception e){ JOptionPane.showMessageDialog(null,"Some error please recheck!"); }
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
            java.util.logging.Logger.getLogger(new_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JComboBox edition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField book_name;
    private JTextField publisher;
    private JTextField author;
    private JLabel lblNewLabel;
    // End of variables declaration                   
}
