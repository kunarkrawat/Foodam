import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ip4.java
 *
 * Created on Aug 30, 2019, 8:22:56 AM
 */

/**
 *
 * @author Home
 */
public class ip4 extends javax.swing.JFrame {

    /** Creates new form ip4 */
    public ip4() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 120, 150, 22);

        jLabel2.setFont(new java.awt.Font("Algerian", 2, 18));
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Username ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 120, 88, 24);

        jLabel3.setFont(new java.awt.Font("Algerian", 2, 18));
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setText("Password ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 180, 90, 24);

        jLabel4.setFont(new java.awt.Font("Castellar", 2, 28));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Authentication ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 30, 190, 37);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(240, 180, 150, 22);

        jButton2.setBackground(new java.awt.Color(204, 51, 0));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SIGN IN ");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(60, 260, 100, 40);

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CANCEL");
        jButton3.setBorder(new javax.swing.border.MatteBorder(null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(270, 260, 100, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capture3.PNG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 430, 340);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-446)/2, (screenSize.height-379)/2, 446, 379);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try {
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ip1","root","mysql");
            String user_id,password,sql;
            user_id=jTextField1.getText();
            password=new String(jPasswordField1.getPassword());
            sql="select * from admin where username='"+user_id+"'and password ='"+password+"'";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next())
            {
                this.setVisible(false);
                new ip6().setVisible(true);
                JOptionPane.showMessageDialog(this,"Welcome\n"+user_id +"\nHave A Nice Day");
            }
         else
            {
               JOptionPane.showMessageDialog(this,"Invalid UserName or Password");
               jPasswordField1.setText("");
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(this,"ERROR"+e.getMessage());
        }
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new ip2().setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ip4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
