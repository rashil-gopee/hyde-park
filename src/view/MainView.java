package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import controller.*;
import model.*;
import utils.DbConnection;

public class MainView {

    public MainView() {
        JFrame f = new JFrame();

        Panel pnl = new Panel();          // Panel is a container
        Button btn = new Button("Press"); // Button is a component
        pnl.add(btn);

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
        f.setContentPane(pnl);
        f.setSize(800, 800);
        f.setVisible(true);

//        UserModel userModel = new UserModel("Rashill","Gopee","Hello");
//        UserController userController = new UserController();
//        userController.createUser(userModel);

    }
}
