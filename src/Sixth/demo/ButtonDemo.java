package Sixth.demo;

import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame
        implements ActionListener, WindowListener {
    Button btn;
    Label lb;
    int count;

    public ButtonDemo() {
        super("Фреймовое окно с кнопкой");
        setLayout(new FlowLayout(FlowLayout.LEFT));
        btn = new Button("Нажмите кнопку");
        setSize(300, 200);
        btn.addActionListener(this);
        lb = new Label("Здесь текстовое поле");
        count = 0;
        add(btn);
        add(lb);
        setVisible(true);
        addWindowListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        count++;
        lb.setText("Кнопка нажата  " + count + "  раз");
    }

    public void windowClosing(WindowEvent we) {
        this.dispose();
    }

    public void windowActivated(WindowEvent we) {
    };

    public void windowClosed(WindowEvent we) {
    };

    public void windowDeactivated(WindowEvent we) {
    };

    public void windowDeiconified(WindowEvent we) {
    };

    public void windowIconified(WindowEvent we) {
    };

    public void windowOpened(WindowEvent we) {
    };

    public static void main(String args[]) {
        new ButtonDemo();
    }
}
