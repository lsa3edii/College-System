package view;

import controller.*;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    Repository repo1 = new AdminMethods();
    Repository repo2 = new LecturerMethods();
    Repository repo3 = new StudentMethods();
    DatabaseOperations databaseOperations = new DatabaseOperations();

    public SignUp() {
        initComponents();
        setDisabledButton();
        //lecturerButton.setEnabled(false); studentButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        text3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        backHome = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        createAccount = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        adminButton = new javax.swing.JRadioButton();
        lecturerButton = new javax.swing.JRadioButton();
        studentButton = new javax.swing.JRadioButton();
        text2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        text1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        text3.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        text3.setForeground(new java.awt.Color(255, 153, 0));
        text3.setText("Password");

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("\"College Management System\" ");

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 153, 0));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/student.png"))); // NOI18N

        backHome.setBackground(new java.awt.Color(255, 255, 255));
        backHome.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        backHome.setForeground(new java.awt.Color(255, 153, 0));
        backHome.setText("←");
        backHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backHome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(255, 255, 255))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(backHome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 153, 0));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        createAccount.setBackground(new java.awt.Color(255, 255, 255));
        createAccount.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        createAccount.setForeground(new java.awt.Color(255, 153, 0));
        createAccount.setText("Create Account");
        createAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccountMouseClicked(evt);
            }
        });

        id.setFont(new java.awt.Font("Century Schoolbook", 3, 21)); // NOI18N
        id.setForeground(new java.awt.Color(255, 153, 0));

        jPanel3.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        password.setFont(new java.awt.Font("Century Schoolbook", 3, 21)); // NOI18N
        password.setForeground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("\"SignUp\"");

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );

        adminButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(adminButton);
        adminButton.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        adminButton.setForeground(new java.awt.Color(255, 153, 0));
        adminButton.setText("Admin");
        adminButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminButtonMouseClicked(evt);
            }
        });

        lecturerButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(lecturerButton);
        lecturerButton.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        lecturerButton.setForeground(new java.awt.Color(255, 153, 0));
        lecturerButton.setText("Lecturer");
        lecturerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerButtonMouseClicked(evt);
            }
        });

        studentButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(studentButton);
        studentButton.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        studentButton.setForeground(new java.awt.Color(255, 153, 0));
        studentButton.setText("Student");
        studentButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentButtonMouseClicked(evt);
            }
        });

        text2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 153, 0));
        text2.setText("User ID");

        name.setFont(new java.awt.Font("Century Schoolbook", 3, 21)); // NOI18N
        name.setForeground(new java.awt.Color(255, 153, 0));

        text1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 153, 0));
        text1.setText("Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text3)
                                    .addComponent(text2)
                                    .addComponent(text1))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adminButton)
                                .addGap(18, 18, 18)
                                .addComponent(lecturerButton)
                                .addGap(18, 18, 18)
                                .addComponent(studentButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(createAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminButton)
                    .addComponent(lecturerButton)
                    .addComponent(studentButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccount)
                    .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    boolean checkData() {
        if(!id.getText().isEmpty() && !name.getText().isEmpty() && !password.getText().isEmpty())
            return true;
        return false;
    }
    
    void setData() {
        try {
            repo1.user.setID(Integer.valueOf(id.getText()));
            repo1.user.setName(name.getText());
            repo1.user.setPassword(password.getText());

        }catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void setDisabledButton() {
        name.setEnabled(false); id.setEnabled(false); password.setEnabled(false);
        createAccount.setEnabled(false); clear.setEnabled(false);
        text1.setEnabled(false); text2.setEnabled(false); text3.setEnabled(false);
    }
    
    void setEnabledButton() {
        name.setEnabled(true); id.setEnabled(true); password.setEnabled(true);
        createAccount.setEnabled(true); clear.setEnabled(true);
        text1.setEnabled(true); text2.setEnabled(true); text3.setEnabled(true);
    }
    
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void backHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backHomeMouseClicked
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backHomeMouseClicked

    private void createAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccountMouseClicked
        if(checkData()) {
            setData();
            if(adminButton.isSelected()) {
                databaseOperations.setType(repo1);
                
                if(databaseOperations.insert()) {
                    JOptionPane.showMessageDialog(this, "Successfuly Created!\nGo To Login.");
                    new LoginPage().setVisible(true);
                    this.dispose();
                }
            }
            if(lecturerButton.isSelected()) {
                databaseOperations.setType(repo2);
                
                if(databaseOperations.insert()) {
                    JOptionPane.showMessageDialog(this, "Successfuly Created!\nGo To Login.");
                    new LoginPage().setVisible(true);
                    this.dispose();
                }
            }
            if(studentButton.isSelected()) {
                databaseOperations.setType(repo3);
                
                if(databaseOperations.insert()) {
                    JOptionPane.showMessageDialog(this, "Successfuly Created!\nGo To Login.");
                    new LoginPage().setVisible(true);
                    this.dispose();
                }
            }
            
        } else
            JOptionPane.showMessageDialog(this, "Incomplete Information!");
    }//GEN-LAST:event_createAccountMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        name.setText("");
        id.setText("");
        password.setText("");
    }//GEN-LAST:event_clearMouseClicked

    private void adminButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminButtonMouseClicked
        if(adminButton.isSelected())
            setEnabledButton();
    }//GEN-LAST:event_adminButtonMouseClicked

    private void lecturerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerButtonMouseClicked
        if(lecturerButton.isSelected()) 
            setEnabledButton();
    }//GEN-LAST:event_lecturerButtonMouseClicked

    private void studentButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentButtonMouseClicked
        if(studentButton.isSelected()) 
            setEnabledButton();
    }//GEN-LAST:event_studentButtonMouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new SignUp().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminButton;
    private javax.swing.JButton backHome;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton createAccount;
    private javax.swing.JButton exit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton lecturerButton;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JRadioButton studentButton;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    // End of variables declaration//GEN-END:variables
}
