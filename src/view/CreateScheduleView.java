/*
 * Created by JFormDesigner on Wed Oct 18 18:51:07 AEDT 2017
 */

package view;

import controller.PersonnelController;
import controller.PersonnelScheduleController;
import model.PersonnelModel;
import model.PersonnelScheduleModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Isswarraj Gopee
 */
public class CreateScheduleView extends JFrame {
    public CreateScheduleView() {
        initComponents();

        comboBoxDay.addItem("Monday");
        comboBoxDay.addItem("Tuesday");
        comboBoxDay.addItem("Wednesday");
        comboBoxDay.addItem("Thursday");
        comboBoxDay.addItem("Friday");
        comboBoxDay.addItem("Saturday");
        comboBoxDay.addItem("Sunday");

        super.setVisible(true);
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        int personnelId = Integer.parseInt(textFieldPersonnelId.getText());
        String day = comboBoxDay.getSelectedItem().toString();
        int timeInHour = Integer.parseInt(textFieldTimeInHour.getText());
        int timeInMinutes = Integer.parseInt(textFieldTimeInMinutes.getText());
        int timeOutHour = Integer.parseInt(textFieldTimeOutHour.getText());
        int timeOutMinutes = Integer.parseInt(textFieldTimeOutMinutes.getText());

        PersonnelScheduleModel personnelScheduleModel= new PersonnelScheduleModel(personnelId, day, timeInHour, timeInMinutes, timeOutHour, timeOutMinutes);
        PersonnelScheduleController personnelScheduleController = new PersonnelScheduleController();
        personnelScheduleController.createPersonnelSchedule(personnelScheduleModel);

        super.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        label1 = new JLabel();
        label2 = new JLabel();
        textFieldPersonnelId = new JTextField();
        label3 = new JLabel();
        comboBoxDay = new JComboBox();
        label4 = new JLabel();
        textFieldTimeInHour = new JTextField();
        textFieldTimeInMinutes = new JTextField();
        textFieldTimeOutHour = new JTextField();
        textFieldTimeOutMinutes = new JTextField();
        label5 = new JLabel();
        button1 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Create Personnel Schedule");

        //---- label2 ----
        label2.setText("Personnel Id");

        //---- label3 ----
        label3.setText("Day");

        //---- label4 ----
        label4.setText("Time In");

        //---- label5 ----
        label5.setText("Time Out");

        //---- button1 ----
        button1.setText("Save");
        button1.addActionListener(e -> button1ActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label3)
                                .addComponent(label4)
                                .addComponent(label5))
                            .addGap(49, 49, 49)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFieldPersonnelId, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                    .addComponent(comboBoxDay, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(button1)
                                    .addGroup(contentPaneLayout.createSequentialGroup()
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(textFieldTimeOutHour, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(textFieldTimeInHour, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textFieldTimeInMinutes, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                            .addComponent(textFieldTimeOutMinutes, GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)))))))
                    .addContainerGap(83, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(textFieldPersonnelId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3)
                        .addComponent(comboBoxDay, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(label4))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(textFieldTimeInHour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFieldTimeInMinutes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                    .addGap(19, 19, 19)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldTimeOutHour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldTimeOutMinutes, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                    .addComponent(button1)
                    .addGap(20, 20, 20))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JLabel label1;
    private JLabel label2;
    private JTextField textFieldPersonnelId;
    private JLabel label3;
    private JComboBox comboBoxDay;
    private JLabel label4;
    private JTextField textFieldTimeInHour;
    private JTextField textFieldTimeInMinutes;
    private JTextField textFieldTimeOutHour;
    private JTextField textFieldTimeOutMinutes;
    private JLabel label5;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
