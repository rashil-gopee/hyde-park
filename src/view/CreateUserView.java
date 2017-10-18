/*
 * Created by JFormDesigner on Wed Oct 18 14:00:43 AEDT 2017
 */

package view;

import controller.PersonnelController;
import controller.UserController;
import model.PersonnelModel;
import model.UserModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Isswarraj Gopee
 */
public class CreateUserView extends JFrame {
    public CreateUserView() {
        initComponents();

        super.setVisible(true);

        comboBoxUserType.addItem("Admin");
        comboBoxUserType.addItem("Personnel");

        comboBoxPersonnelType.addItem("Law Enforcement");
        comboBoxPersonnelType.addItem("Health Care");

        panelPersonnel.setVisible(false);
    }

    private void buttonSaveActionPerformed(ActionEvent e) {
        String firstname = textFieldFirstName.getText();
        String lastname = textFieldLastName.getText();
        String password = new String(passwordField.getPassword());
        String userType = (String)comboBoxUserType.getSelectedItem();
        System.out.println(userType);
        String personnelType = (String)comboBoxPersonnelType.getSelectedItem();

        if (userType.equals("Personnel"))
        {
            PersonnelModel personnelModel = new PersonnelModel(firstname, lastname, password, personnelType);
            PersonnelController personnelController = new PersonnelController();
            personnelController.createPersonnel(personnelModel);
        }
        else
        {
            UserModel userModel = new UserModel(firstname, lastname, password, userType);
            UserController userController = new UserController();
           userController.createUser(userModel);
        }

        super.setVisible(false);
    }

    private void comboBoxUserTypeItemStateChanged(ItemEvent e) {
        // TODO add your code here
        if ((comboBoxUserType.getSelectedItem()).equals("Personnel"))
            panelPersonnel.setVisible(true);
        else
            panelPersonnel.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        label1 = new JLabel();
        textFieldFirstName = new JTextField();
        label2 = new JLabel();
        label3 = new JLabel();
        textFieldLastName = new JTextField();
        passwordField = new JPasswordField();
        label4 = new JLabel();
        comboBoxUserType = new JComboBox();
        label5 = new JLabel();
        panelPersonnel = new JPanel();
        comboBoxPersonnelType = new JComboBox();
        label6 = new JLabel();
        buttonSave = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Firstname");

        //---- label2 ----
        label2.setText("Create User");

        //---- label3 ----
        label3.setText("Lastname");

        //---- label4 ----
        label4.setText("Password");

        //---- comboBoxUserType ----
        comboBoxUserType.addItemListener(e -> comboBoxUserTypeItemStateChanged(e));

        //---- label5 ----
        label5.setText("User type");

        //======== panelPersonnel ========
        {

            // JFormDesigner evaluation mark
            panelPersonnel.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), panelPersonnel.getBorder())); panelPersonnel.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //---- label6 ----
            label6.setText("Personnel Type");

            GroupLayout panelPersonnelLayout = new GroupLayout(panelPersonnel);
            panelPersonnel.setLayout(panelPersonnelLayout);
            panelPersonnelLayout.setHorizontalGroup(
                panelPersonnelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, panelPersonnelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(label6)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(comboBoxPersonnelType, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))
            );
            panelPersonnelLayout.setVerticalGroup(
                panelPersonnelLayout.createParallelGroup()
                    .addGroup(panelPersonnelLayout.createSequentialGroup()
                        .addContainerGap(28, Short.MAX_VALUE)
                        .addGroup(panelPersonnelLayout.createParallelGroup()
                            .addComponent(comboBoxPersonnelType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6)))
            );
        }

        //---- buttonSave ----
        buttonSave.setText("Save");
        buttonSave.addActionListener(e -> buttonSaveActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(62, 62, 62)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(125, 125, 125)
                            .addComponent(label2))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3)
                                .addComponent(label4)
                                .addComponent(label5))
                            .addGap(43, 43, 43)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBoxUserType, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(passwordField, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(textFieldFirstName, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addComponent(textFieldLastName, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                    .addContainerGap(71, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelPersonnel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(244, Short.MAX_VALUE)
                    .addComponent(buttonSave)
                    .addGap(190, 190, 190))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(label5)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2)
                            .addGap(8, 8, 8)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(textFieldFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label3)
                                .addComponent(textFieldLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4))
                            .addGap(18, 18, 18)
                            .addComponent(comboBoxUserType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panelPersonnel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(buttonSave)
                    .addContainerGap(15, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JLabel label1;
    private JTextField textFieldFirstName;
    private JLabel label2;
    private JLabel label3;
    private JTextField textFieldLastName;
    private JPasswordField passwordField;
    private JLabel label4;
    private JComboBox comboBoxUserType;
    private JLabel label5;
    private JPanel panelPersonnel;
    private JComboBox comboBoxPersonnelType;
    private JLabel label6;
    private JButton buttonSave;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
