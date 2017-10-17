/*
 * Created by JFormDesigner on Fri Sep 15 00:03:53 AEST 2017
 */

package view;

import utils.DbConnection;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class WelcomeView extends JPanel {
    private JFrame f = new JFrame();

    public WelcomeView() {
        initComponents();

        //f.add(pnl);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                try {
                    DbConnection.getConnection().close();
                }
                catch (Exception exp){
                    exp.printStackTrace();
                }
                System.exit(0);
            }
        });
        f.setContentPane(this);
        f.setSize(400, 500);
        f.setVisible(true);
    }

    private void loginButtonActionPerformed(ActionEvent e) {
        // TODO add your code here
        LoginView loginView = new LoginView();
        f.setVisible(false);
    }

    private void viewPersonnelsBtnActionPerformed(ActionEvent e) {
        // TODO add your code here
        ViewPersonnelsView viewPersonnelsView = new ViewPersonnelsView();
        f.setVisible(false);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
        loginButton = new JButton();
        button1 = new JButton();
        button2 = new JButton();
        viewPersonnelsBtn = new JButton();
        label1 = new JLabel();

        //======== this ========

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


        //---- loginButton ----
        loginButton.setText("Login");
        loginButton.addActionListener(e -> loginButtonActionPerformed(e));

        //---- button1 ----
        button1.setText("Report Incident");

        //---- button2 ----
        button2.setText("View Places");

        //---- viewPersonnelsBtn ----
        viewPersonnelsBtn.setText("View Personnels");
        viewPersonnelsBtn.addActionListener(e -> viewPersonnelsBtnActionPerformed(e));

        //---- label1 ----
        label1.setText("Hyde Park Incident Reporting System");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(button1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(viewPersonnelsBtn, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(button2, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(loginButton, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(97, 97, 97)
                            .addComponent(label1)))
                    .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(label1)
                    .addGap(18, 18, 18)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(viewPersonnelsBtn)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(button2)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                    .addComponent(loginButton)
                    .addGap(29, 29, 29))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Isswarraj Gopee
    private JButton loginButton;
    private JButton button1;
    private JButton button2;
    private JButton viewPersonnelsBtn;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
