package by.trofimov.swing.component;

import javax.swing.*;

import static by.trofimov.swing.util.Constant.HERE_WILL_BE_THE_SUM;

public class Label extends JLabel {

    public Label(int x, int y) {
        this.setBounds(x, y, 250, 50);
        this.setText(HERE_WILL_BE_THE_SUM);
    }

}
