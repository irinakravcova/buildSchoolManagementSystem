package schoolSystem;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame (){
        this.setTitle("School Management System");
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
        this.getContentPane().setBackground(new Color(204, 229, 255));
    }
}
