package by.trofimov.swing.component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static by.trofimov.swing.util.Constant.INCORRECT_NUMBER;

public class ButtonListener implements ActionListener {

    private final Field field1;
    private final Field field2;
    private final Label label;

    public ButtonListener(Field field1, Field field2, Label label) {
        this.field1 = field1;
        this.field2 = field2;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = 0;
        int b = 0;
        int sum = 0;
        try {
            a = Integer.parseInt(field1.getText());
            b = Integer.parseInt(field2.getText());
            sum = a + b;
            label.setText(String.valueOf(sum));
        }
        catch (Exception err) {
            label.setText(INCORRECT_NUMBER);
        };
    }

}
