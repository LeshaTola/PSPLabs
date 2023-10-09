package Sixth.demo;

import java.awt.*;
import java.awt.event.*;

public class ListDemo extends Frame implements ItemListener {
    List lst;
    Checkbox chb;
    Choice ch;

    public ListDemo() {
        super("Фреймовое окно");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setSize(300, 200);
        lst = new List(2, false);
        lst.add("1 BSUIR");
        lst.add("2 BSEU");
        lst.add("3 BSU");
        chb = new Checkbox("Кнопка с независимой фиксацией");
        ch = new Choice();
        ch.add("Сюда переносятся строки со списка");
        add(lst);
        add(ch);
        add(chb);
        setVisible(true);
        lst.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent ie) {
        ch.addItem(lst.getSelectedItem());
    }

    public static void main(String args[]) {
        new ListDemo();
    }
}
