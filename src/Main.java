import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import model.*;
import utils.DbConnection;
import view.*;

public class Main {

    public static void main(String[] args) {
        WelcomeView welcomeView = new WelcomeView();
    }
}
