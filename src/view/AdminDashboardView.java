/*
 * Created by JFormDesigner on Sun Sep 17 21:34:52 AEST 2017
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Isswarraj Gopee
 */
public class AdminDashboardView extends JFrame {
    public AdminDashboardView() {
        initComponents();
        this.setVisible(true);
    }

    private void buttonCreateUserActionPerformed(ActionEvent e) {
        // TODO add your code here
        CreateUserView createUserView = new CreateUserView();
    }

    private void buttonCreateScheduleActionPerformed(ActionEvent e) {
        // TODO add your code here
        CreateScheduleView createScheduleView = new CreateScheduleView();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        buttonCreateUser = new JButton();
        buttonCreateSchedule = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- buttonCreateUser ----
        buttonCreateUser.setText("Create User");
        buttonCreateUser.addActionListener(e -> buttonCreateUserActionPerformed(e));

        //---- buttonCreateSchedule ----
        buttonCreateSchedule.setText("Add Personnel Schedule");
        buttonCreateSchedule.addActionListener(e -> buttonCreateScheduleActionPerformed(e));

        //---- label1 ----
        label1.setText("Admin Dashboard");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(151, 151, 151)
                    .addComponent(label1)
                    .addContainerGap(151, Short.MAX_VALUE))
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(0, 121, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(buttonCreateSchedule)
                        .addComponent(buttonCreateUser, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE))
                    .addGap(119, 119, 119))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(buttonCreateUser)
                    .addGap(18, 18, 18)
                    .addComponent(buttonCreateSchedule)
                    .addContainerGap(133, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JButton buttonCreateUser;
    private JButton buttonCreateSchedule;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
