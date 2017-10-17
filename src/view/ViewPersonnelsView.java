/*
 * Created by JFormDesigner on Tue Oct 17 02:33:28 AEDT 2017
 */

package view;

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
        PersonnelController personnelController = new PersonnelController();
        personnels = personnelController.getPersonnels("Health Care");

        initComponents();

        super.setVisible(true);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        scrollPane1 = new JScrollPane();
        personnelsTbl = new JTable();

        //======== this ========
        Container contentPane = getContentPane();

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(personnelsTbl);
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        DefaultTableModel model = new DefaultTableModel();
        personnelsTbl.setModel(model);
        model.setColumnIdentifiers(new String[] {"First name", "Last name"});

// Populate the JTable (TableModel) with data from ArrayList
        for (PersonnelModel p : personnels)
        {
            if (p.checkAvailability())
                model.addRow(new String[] {p.getFirstName(), p.getLastName()});
        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JScrollPane scrollPane1;
    private JTable personnelsTbl;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
