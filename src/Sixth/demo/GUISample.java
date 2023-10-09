package Sixth.demo;

import java.awt.*; //импортирование пакета awt 
import java.awt.event.*; //импортирование пакета поддержки событий

public class GUISample extends Frame { // объявление класса GUISample
    Button b1 = new Button("Add"); // создание кнопки с надписью "Add"
    Choice ch1 = new Choice(); // создание раскрывающегося списка
    TextField tf1 = new TextField(); // создание текстового поля (строки
    // ввода)
    Label label1 = new Label("Enter your text here:"); // создание текстовой
    // строки
    List l1 = new List(); // создание списка

    public GUISample() { // объявление конструктора класса
        setLayout(null); // отключение менеджера компоновки
        setSize(600, 400); // установка размеров фрейма
        setTitle("This is my Frame"); // установка заголовка фрейма
        setBackground(Color.cyan); // установка цвета заднего фона фрейма
        add(b1); // добавление кнопки к окну
        b1.setBounds(220, 200, 84, 24); // установка размеров кнопки
        b1.setForeground(Color.black); // установка цвета переднего фона кнопки
        b1.setBackground(Color.magenta); // установка цвета заднего фона кнопки
        add(ch1); // добавление раскрывающегося списка к окну
        ch1.setBounds(50, 120, 120, 20); // установка размеров раскрывающегося
        // списка
        add(tf1); // добавление текстового поля к окну
        tf1.setBounds(200, 80, 120, 20); // установка размеров текстового поля
        add(label1); // добавление текстовой строки к окну
        label1.setBounds(200, 55, 120, 20); // установка размеров текстовой строки
        add(l1); // добавление списка к окну
        l1.setBackground(Color.white); // установка цвета заднего фона списка
        l1.setBounds(350, 120, 200, 216); // установка размеров списка
        /* регистрация блока прослушивания событий типа WindowEvent */
        addWindowListener(new WindowClose());
        /* регистрация блока прослушивания событий типа ActionEvent */
        b1.addActionListener(new ButtonAdd());
    }

    /* объявление класса-адаптера для обработки Window-событий */
    class WindowClose extends WindowAdapter {
        /* метод, который вызывается при закрытии окна */
        public void windowClosing(WindowEvent we) {
            setVisible(false); // фрейм-окно становится невидимым
        }
    }

    /*
     * объявление класса для обработки Action-событий (класс ButtonAdd реализует
     * интерфейс ActionListener)
     */
    class ButtonAdd implements ActionListener {
        /* реализация метода, который вызывается при наступлении action-события */
        public void actionPerformed(ActionEvent event) {
            /* добавление текста из текстового поля в раскрывающийся список */
            ch1.add(tf1.getText());
            /* добавление текста из текстового поля в список */
            l1.add(tf1.getText(), 2);
        }
    }

    static public void main(String args[]) { // объявление метода main()
        GUISample MyFrame = new GUISample(); // создание экземпляра класса GUISample
        MyFrame.setVisible(true); // выведение окна на экран дисплея
    }
}
