
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Razvan
 */
public class MyAccount extends javax.swing.JFrame {

    /**
     * Creates new form MyAccount
     */
    public MyAccount() {
        initComponents();
        setTitle("My account");
        getContentPane().setBackground(new Color(204, 204, 255));
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        try {
            String info = DataBase.showAccDet(Login.getIDAcc());
            String[] cuv = info.split(" ");
            name.setText(cuv[1] + " " + cuv[2]);
            email.setText(cuv[3]);
            city.setText(cuv[7]);
            birthday.setText(cuv[6]);

            String addr = "";
            for (int i = 8; i < cuv.length - 1; i++) {
                addr += cuv[i] + " ";
            }
            addr += cuv[cuv.length - 1];
            address.setText(addr);
        } catch (SQLException ex) {
            Logger.getLogger(MyAccount.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        birthdayLabel = new javax.swing.JLabel();
        birthday = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        titleLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(59, 36, 93));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("My account");

        nameLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(59, 36, 93));
        nameLabel.setText("Name:");

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(59, 36, 93));
        name.setText("Name:");

        emailLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(59, 36, 93));
        emailLabel.setText("Email:");

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        email.setForeground(new java.awt.Color(59, 36, 93));
        email.setText("Name:");

        genderLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(59, 36, 93));
        genderLabel.setText("Gender:");

        gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gender.setForeground(new java.awt.Color(59, 36, 93));
        gender.setText("Gender:");

        birthdayLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        birthdayLabel.setForeground(new java.awt.Color(59, 36, 93));
        birthdayLabel.setText("Birthday:");

        birthday.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        birthday.setForeground(new java.awt.Color(59, 36, 93));
        birthday.setText("Gender:");

        cityLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(59, 36, 93));
        cityLabel.setText("City:");

        city.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        city.setForeground(new java.awt.Color(59, 36, 93));
        city.setText("Gender:");

        addressLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(59, 36, 93));
        addressLabel.setText("Address:");

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        address.setForeground(new java.awt.Color(59, 36, 93));
        address.setText("Gender:");

        backButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backButton.setForeground(new java.awt.Color(59, 36, 93));
        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emailLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(genderLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(birthdayLabel)
                            .addComponent(cityLabel)
                            .addComponent(addressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(birthday, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(city, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(address))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 156, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthdayLabel)
                    .addComponent(birthday))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(city))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(address))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

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
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel birthday;
    private javax.swing.JLabel birthdayLabel;
    private javax.swing.JLabel city;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JLabel email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
