/*
 * Created by JFormDesigner on Tue Oct 17 02:33:28 AEDT 2017
 */

package view;

import java.awt.event.*;
import controller.PersonnelController;
import model.PersonnelModel;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;

/**
 * @author Isswarraj Gopee
 */
public class ViewPersonnelsView extends JFrame {
    private ArrayList<PersonnelModel> personnels = new ArrayList<>();

    public ViewPersonnelsView() {
        initComponents();

//        String[] types = new String[] {"Law Enforcement","Health Care"};
//        typeJComboBox = new JComboBox<>(types);

        typeJComboBox.addItem("Law Enforcement");
        typeJComboBox.addItem("Health Care");

        loadPersonnel((String)typeJComboBox.getSelectedItem());

        super.setVisible(true);
    }

    private void typeJComboBoxItemStateChanged(ItemEvent e) {
        // TODO add your code here
        System.out.println((String)typeJComboBox.getSelectedItem());
        loadPersonnel((String)typeJComboBox.getSelectedItem());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        scrollPane1 = new JScrollPane();
        personnelsTbl = new JTable();
        label1 = new JLabel();
        typeJComboBox = new JComboBox();
        label2 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(personnelsTbl);
        }

        //---- label1 ----
        label1.setText("View Personnels");

        //---- typeJComboBox ----
        typeJComboBox.addItemListener(e -> typeJComboBoxItemStateChanged(e));

        //---- label2 ----
        label2.setText("Personnel Type");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(label2)
                    .addGap(39, 39, 39)
                    .addComponent(typeJComboBox, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(148, 148, 148)
                            .addComponent(label1))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 357, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1)
                    .addGap(12, 12, 12)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(typeJComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JScrollPane scrollPane1;
    private JTable personnelsTbl;
    private JLabel label1;
    private JComboBox typeJComboBox;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private void loadPersonnel(String type){
        personnels.clear();
        PersonnelController personnelController = new PersonnelController();
        personnels = personnelController.getPersonnels(type);
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        personnelsTbl.setModel(model);
        model.setColumnIdentifiers(new String[] {"First name", "Last name"});

// Populate the JTable (TableModel) with data from ArrayList
        for (PersonnelModel p : personnels)
        {
            if (p.checkAvailability())
                model.addRow(new String[] {p.getFirstName(), p.getLastName()});
        }
    }
}
