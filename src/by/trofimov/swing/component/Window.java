package by.trofimov.swing.component;

import javax.swing.*;

import static by.trofimov.swing.util.Constant.BUTTON_TEXT;

public class Window extends JFrame {

    public Window(String title) {
        //Variables
        Field field1;
        Field field2;
        Button button;
        Label label;
        ButtonListener buttonListener;
        //Window
        this.setBounds(300, 200, 300, 300);
        this.setTitle(title);
        this.setLayout(null);
        this.setResizable(false);
        //TextFields
        field1 = new Field(5, 5);
        field2 = new Field(5, 65);
        this.add(field1);
        this.add(field2);
        //Button
        button = new Button(BUTTON_TEXT, 5, 125);
        this.add(button);
        //Label
        label = new Label(20, 170);
        this.add(label);
        //ActionListener
        buttonListener = new ButtonListener(field1, field2, label);
        button.addActionListener(buttonListener);
        //Window
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
