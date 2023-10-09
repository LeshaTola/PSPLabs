package Sixth.first_part;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Calculator extends JFrame {

    private TextField firstOperandText;
    private TextField secondOperandText;

    private CheckboxGroup operationsGroup;

    private Button calculateButton;
    private TextField resultText;

    private static List<String> operationsList = new ArrayList<String>();

    Calculator() {
        super("Super_Duper Calculator");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 200);

        setLayout(new FlowLayout(FlowLayout.CENTER));

        firstOperandText = new TextField("first operand");
        secondOperandText = new TextField("second operand");

        add(firstOperandText);

        operationsList.add("+");
        operationsList.add("-");
        operationsList.add("*");
        operationsList.add("/");

        operationsGroup = new CheckboxGroup();
        for (String op : operationsList) {
            var box = new Checkbox(op, operationsGroup, true);
            add(box);
        }
        add(secondOperandText);

        calculateButton = new Button("=");
        calculateButton.addActionListener(new calculateButtonAction());

        resultText = new TextField("result");

        add(calculateButton);
        add(resultText);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    class ErrorDialog extends Dialog implements ActionListener {
        Label errorlable;
        Button exitButton;

        public ErrorDialog(Frame owner, String errorMessage) {
            super(owner);
            setSize(200, 100);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new FlowLayout(FlowLayout.CENTER));

            this.errorlable = new Label(errorMessage);
            add(this.errorlable);

            exitButton = new Button("Exit");
            exitButton.addActionListener(this);
            exitButton.setSize(150, 50);
            add(exitButton);
            setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            this.dispose();
        }

    }

    class calculateButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            firstOperandText.getText();
            Double result = 0.0;

            try {
                var first = Double.parseDouble(firstOperandText.getText());
                var second = Double.parseDouble(secondOperandText.getText());

                var selectedBox = operationsGroup.getSelectedCheckbox();
                switch (selectedBox.getLabel()) {
                    case "+":
                        result = first + second;

                        break;
                    case "-":
                        result = first - second;

                        break;
                    case "*":
                        result = first * second;

                        break;
                    case "/":
                        result = first / second;
                        break;
                }

                resultText.setText(result.toString());

            } catch (Exception exception) {
                new ErrorDialog(Calculator.this, exception.getMessage());
            }
        }

    }

}
