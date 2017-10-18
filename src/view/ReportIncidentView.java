/*
 * Created by JFormDesigner on Wed Oct 18 14:39:03 AEDT 2017
 */

package view;

import controller.IncidentController;
import model.IncidentModel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Isswarraj Gopee
 */
public class ReportIncidentView extends JFrame {
    public ReportIncidentView() {
        initComponents();

        comboBoxLocation.addItem("Zone 1");
        comboBoxLocation.addItem("Zone 2");
        comboBoxLocation.addItem("Zone 3");
        comboBoxLocation.addItem("Zone 4");
        comboBoxLocation.addItem("Zone 5");
        comboBoxLocation.addItem("Zone 6");

        super.setVisible(true);
    }

    private void buttonSaveActionPerformed(ActionEvent e) {
        // TODO add your code here
        String reporterName = textFieldName.getText();
        String reporterContactNo = textFieldContactNo.getText();
        String location = (String)comboBoxLocation.getSelectedItem();
        String type = textFieldtype.getText();

        IncidentModel incidentModel= new IncidentModel(type, reporterName, reporterContactNo, location);
        IncidentController incidentController = new IncidentController();
        incidentController.createIncident(incidentModel);

        this.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        label1 = new JLabel();
        label2 = new JLabel();
        textFieldName = new JTextField();
        label3 = new JLabel();
        textFieldContactNo = new JTextField();
        label4 = new JLabel();
        textFieldtype = new JTextField();
        label5 = new JLabel();
        comboBoxLocation = new JComboBox();
        buttonSave = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("Report Incident");

        //---- label2 ----
        label2.setText("Name");

        //---- label3 ----
        label3.setText("Contact Number");

        //---- label4 ----
        label4.setText("Short description");

        //---- label5 ----
        label5.setText("Location");

        //---- buttonSave ----
        buttonSave.setText("Save");
        buttonSave.addActionListener(e -> buttonSaveActionPerformed(e));

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(312, Short.MAX_VALUE)
                            .addComponent(buttonSave))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(label2)
                                .addComponent(label3)
                                .addComponent(label4)
                                .addComponent(label5))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label1)
                                .addComponent(textFieldName, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(textFieldContactNo, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(textFieldtype, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                .addComponent(comboBoxLocation, GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))))
                    .addGap(32, 32, 32))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(label1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label2)
                        .addComponent(textFieldName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label3)
                        .addComponent(textFieldContactNo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(label4)
                        .addComponent(textFieldtype, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(comboBoxLocation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label5))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                    .addComponent(buttonSave)
                    .addGap(24, 24, 24))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JLabel label1;
    private JLabel label2;
    private JTextField textFieldName;
    private JLabel label3;
    private JTextField textFieldContactNo;
    private JLabel label4;
    private JTextField textFieldtype;
    private JLabel label5;
    private JComboBox comboBoxLocation;
    private JButton buttonSave;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
