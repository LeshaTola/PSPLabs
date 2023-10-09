package Sixth.demo;

import java.awt.*;
import java.awt.event.*;

public class Frame1 extends Frame
        implements ActionListener, WindowListener {
    Menu file;
    MenuItem item1;

    public Frame1() {
        super("Фреймовое окно с меню");
        setSize(500, 300);
        // создать строку главного меню и добавить его во фрейм
        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);
        // создать элемент меню
        file = new Menu("File");
        mbar.add(file);
        file.add(item1 = new MenuItem("DemoDialog"));
        item1.addActionListener(this);
        setVisible(true);
        addWindowListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        new DemoDialog(this, "Диалоговое окно", true);
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
        new Frame1();
    }

    class DemoDialog extends Dialog implements ActionListener {
        Button btn;

        public DemoDialog(Frame1 ff, String title, boolean b) {
            super(ff, title, b);
            setLayout(new FlowLayout(FlowLayout.LEFT));
            btn = new Button("Закрыть");
            setSize(300, 200);
            add(btn);
            btn.addActionListener(this);
            setVisible(true);
        }

        public void actionPerformed(ActionEvent ae) {
            this.dispose();
        }
    }
}
