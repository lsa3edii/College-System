package view;

import controller.*;
import view_admin.*;
import view_lecturer.*;
import view_student.*;
import javax.swing.JOptionPane;

public class LoginPage extends javax.swing.JFrame {

    Repository repo1 = new AdminMethods();
    Repository repo2 = new LecturerMethods();
    Repository repo3 = new StudentMethods();
    DatabaseOperations databaseOperations = new DatabaseOperations();
    String response;
    
    public LoginPage() {
        initComponents();
        setDisableButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        adminButton = new javax.swing.JRadioButton();
        lecturerButton = new javax.swing.JRadioButton();
        studentButton = new javax.swing.JRadioButton();
        text1 = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("\"College Management System\" ");

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
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-college-100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

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

        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("\"Login\" ");

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

        text1.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 153, 0));
        text1.setText("User ID");

        text2.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 153, 0));
        text2.setText("Password");

        login.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 153, 0));
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });

        clear.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(255, 153, 0));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });

        signUp.setBackground(new java.awt.Color(255, 153, 0));
        signUp.setFont(new java.awt.Font("Century Schoolbook", 3, 24)); // NOI18N
        signUp.setForeground(new java.awt.Color(255, 255, 255));
        signUp.setText("Sign Up");
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });

        id.setFont(new java.awt.Font("Century Schoolbook", 3, 21)); // NOI18N
        id.setForeground(new java.awt.Color(255, 153, 0));

        jPanel4.setBackground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        password.setFont(new java.awt.Font("Century Schoolbook", 3, 21)); // NOI18N
        password.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(text2)
                                    .addComponent(text1))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                                    .addComponent(password)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(adminButton)
                                        .addGap(18, 18, 18)
                                        .addComponent(lecturerButton))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addComponent(studentButton)))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(signUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear)))
                        .addGap(176, 176, 176))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminButton)
                    .addComponent(lecturerButton)
                    .addComponent(studentButton))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(text1)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(password))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUp)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    boolean checkData() {
        if(!id.getText().isEmpty() && !password.getText().isEmpty())
            return true;
        return false;
    }
    
    void setData() {
        try {
            repo1.user.setID(Integer.valueOf(id.getText()));
            repo1.user.setPassword(password.getText());
        
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    void setDisableButton() {
        id.setEnabled(false); password.setEnabled(false);
        login.setEnabled(false); clear.setEnabled(false);
        text1.setEnabled(false); text2.setEnabled(false);
    }
    
    void setEnabledButton() {
        id.setEnabled(true); password.setEnabled(true);
        login.setEnabled(true); clear.setEnabled(true);
        text1.setEnabled(true); text2.setEnabled(true);
    }
    
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
//        if(checkData()) {
//            setData();
            
            if(adminButton.isSelected()) {
//                databaseOperations.setType(repo1);
//                
//                if(databaseOperations.checkLogin()) {
                    JOptionPane.showMessageDialog(this, "Successfuly Login");
                    new Home_Admin().setVisible(true);
                    this.dispose();

//                } else
//                    JOptionPane.showMessageDialog(this, "Wrong ID & Password!!");
            }
            
            if(lecturerButton.isSelected()) {
//                databaseOperations.setType(repo2);
//                        
//                if(databaseOperations.checkLogin()) {
                    JOptionPane.showMessageDialog(this, "Successfuly Login");
                    new Home_Lecturer().setVisible(true);
                    this.dispose();

//                } else
//                    JOptionPane.showMessageDialog(this, "Wrong ID & Password!!");
            }
            
            if(studentButton.isSelected()) {
//                databaseOperations.setType(repo3);
//
//                if(databaseOperations.checkLogin()) {
                    JOptionPane.showMessageDialog(this, "Successfuly Login");
                    new Home_Student().setVisible(true);
                    this.dispose();

//                } else
//                    JOptionPane.showMessageDialog(this, "Wrong ID & Password!!");
            }
            
//        } else
//            JOptionPane.showMessageDialog(this, "Incomplete Information!");
    }//GEN-LAST:event_loginMouseClicked

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        response = JOptionPane.showInputDialog(this, "Enter Password?", "Sign Up", JOptionPane.QUESTION_MESSAGE);
        // handle by try - catch
        try {
            if(response.equals("0000")) {
                new SignUp().setVisible(true);
                this.dispose();
            } 
            else
                JOptionPane.showMessageDialog(null, "Wrong Password!");
        } catch(Exception ex) {
            //
        }
    }//GEN-LAST:event_signUpMouseClicked

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new LoginPage().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton adminButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton exit;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton lecturerButton;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signUp;
    private javax.swing.JRadioButton studentButton;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
