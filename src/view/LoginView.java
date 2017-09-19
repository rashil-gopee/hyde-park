/*
 * Created by JFormDesigner on Sun Sep 17 20:09:50 AEST 2017
 */

package view;

import controller.UserController;
import model.UserModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Isswarraj Gopee
 */
public class LoginView extends JFrame {
    public LoginView() {
        initComponents();
    }

    private void loginButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        int userId = Integer.parseInt(userIdField.getText());

        UserController userController = new UserController();

        UserModel userModel = userController.getUser(userId);

        if (userModel.checkPassword(passwordField.getPassword())) {
            if (userModel.getUserType().equals("Admin")){
                AdminDashboardView adminDashboardView = new AdminDashboardView();
                super.setVisible(false);
            }
            else if (userModel.getUserType().equals("Personnel")){
                PersonnelDashboardView personnelDashboardView = new PersonnelDashboardView();
                super.setVisible(false);
            }
        }
        else
            System.out.println("Wrong Password");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        userIdField = new JTextField();
        loginButton = new JButton();
        label1 = new JLabel();
        label2 = new JLabel();
        passwordField = new JPasswordField();

        //======== this ========
        Container contentPane = getContentPane();

        //---- loginButton ----
        loginButton.setText("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginButtonActionPerformed(e);
            }
        });

        //---- label1 ----
        label1.setText("User Id");

        //---- label2 ----
        label2.setText("Password");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(86, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(loginButton)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label1)
                                .addComponent(label2))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(userIdField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))))
                    .addGap(48, 48, 48))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(userIdField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1))
                    .addGap(32, 32, 32)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(53, 53, 53)
                    .addComponent(loginButton)
                    .addContainerGap(62, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        this.setSize(400, 500);
        this.setVisible(true);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JTextField userIdField;
    private JButton loginButton;
    private JLabel label1;
    private JLabel label2;
    private JPasswordField passwordField;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
