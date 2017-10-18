/*
 * Created by JFormDesigner on Sun Sep 17 21:41:29 AEST 2017
 */

package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author Isswarraj Gopee
 */
public class PersonnelDashboardView extends JFrame {
    public PersonnelDashboardView() {
        initComponents();
        this.setVisible(true);
    }

    private void buttonViewIncidentsActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewIncidentsView viewIncidentsView = new ViewIncidentsView();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        buttonViewIncidents = new JButton();
        label1 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //---- buttonViewIncidents ----
        buttonViewIncidents.setText("View Incidents");
        buttonViewIncidents.addActionListener(e -> buttonViewIncidentsActionPerformed(e));

        //---- label1 ----
        label1.setText("Personnel Dashboard");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(119, Short.MAX_VALUE)
                    .addComponent(buttonViewIncidents, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
                    .addGap(115, 115, 115))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(label1)
                    .addContainerGap(145, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addComponent(buttonViewIncidents)
                    .addContainerGap(164, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JButton buttonViewIncidents;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
