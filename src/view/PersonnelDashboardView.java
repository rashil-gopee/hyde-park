/*
 * Created by JFormDesigner on Sun Sep 17 21:41:29 AEST 2017
 */

package view;

import java.awt.*;
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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        button1 = new JButton();
        label1 = new JLabel();
        button2 = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //---- button1 ----
        button1.setText("View Open Emergies");

        //---- label1 ----
        label1.setText("Personnel Dashboard");

        //---- button2 ----
        button2.setText("View Closed Emergencies");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(119, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2))
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
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button2)
                    .addContainerGap(120, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JButton button1;
    private JLabel label1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
