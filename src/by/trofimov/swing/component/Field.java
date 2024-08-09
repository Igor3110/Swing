package by.trofimov.swing.component;

import javax.swing.*;

import static by.trofimov.swing.util.Constant.START_FIELD_VALUE;

public class Field extends JTextField {

    public Field(int x, int y) {
        super(START_FIELD_VALUE);
        this.setBounds(x, y, 150, 50);
    }

}
