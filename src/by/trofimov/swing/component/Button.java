package by.trofimov.swing.component;

import javax.swing.*;
import java.awt.*;

public class Button extends JButton {

    public Button(String text, int x, int y) {
        this.setText(text);
        this.setBounds(x, y, 150, 50);
        this.setBackground(Color.BLACK);
        this.setForeground(Color.GREEN);
    }

}
