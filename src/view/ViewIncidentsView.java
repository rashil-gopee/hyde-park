/*
 * Created by JFormDesigner on Wed Oct 18 16:14:38 AEDT 2017
 */

package view;

import controller.IncidentController;
import controller.PersonnelController;
import model.IncidentModel;
import model.PersonnelModel;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

/**
 * @author Isswarraj Gopee
 */
public class ViewIncidentsView extends JFrame {
    ArrayList<IncidentModel> incidentList = new ArrayList<>();

    public ViewIncidentsView() {
        initComponents();

        comboBoxStatus.addItem("Open");
        comboBoxStatus.addItem("Closed");

        loadIncidents(comboBoxStatus.getSelectedItem().toString());

        super.setVisible(true);
    }

    private void comboBoxStatusItemStateChanged(ItemEvent e) {
        // TODO add your code here
        loadIncidents(comboBoxStatus.getSelectedItem().toString());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        label1 = new JLabel();
        comboBoxStatus = new JComboBox();
        label2 = new JLabel();
        scrollPane1 = new JScrollPane();
        tableIncidents = new JTable();

        //======== this ========
        Container contentPane = getContentPane();

        //---- label1 ----
        label1.setText("View Incidents");

        //---- comboBoxStatus ----
        comboBoxStatus.addItemListener(e -> comboBoxStatusItemStateChanged(e));

        //---- label2 ----
        label2.setText("Status");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(tableIncidents);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(141, Short.MAX_VALUE)
                    .addComponent(label2)
                    .addGap(40, 40, 40)
                    .addComponent(comboBoxStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(125, 125, 125))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(label1)
                    .addContainerGap(173, Short.MAX_VALUE))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 401, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(comboBoxStatus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addGap(18, 18, 18)
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JLabel label1;
    private JComboBox comboBoxStatus;
    private JLabel label2;
    private JScrollPane scrollPane1;
    private JTable tableIncidents;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void loadIncidents(String type){
        incidentList.clear();
        IncidentController incidentController = new IncidentController();
        incidentList = incidentController.getIncidents(type);
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        tableIncidents.setModel(model);
        model.setColumnIdentifiers(new String[] {"Reporter Name", "Reporter Contact", "Description", "Date logged"});

// Populate the JTable (TableModel) with data from ArrayList
        for (IncidentModel p : incidentList)
        {
                model.addRow(new String[] {p.getReporterName(), p.getReporterContactNo(), p.getType(), p.getDate().toString()});
        }



    }
}
