package Sixth.SecondPart;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.google.gson.Gson;

public class FoodShopUI {

    public static final String FILE_NAME = "SaveFile.json";

    private FoodShop shop;

    private Button addFoodButton;
    private Button removeFoodButton;

    private JTextField nameField;
    private JTextField caloriesField;
    private JTextField fatField;
    private JTextField proteinField;
    private JTextField carbohydratesField;
    private JTextField deliveryDate;

    List list;
    JFrame frame;

    public static void main(String[] args) {
        FoodShop shop = new FoodShop();
        shop.addFood(new Food("asda", 0, 0, 0, 0, null));

        new FoodShopUI(shop);
    }

    FoodShopUI(FoodShop foodShop) {
        shop = foodShop;

        frame = new JFrame("Food shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setSize(800, 600);
        frame.add(mainPanel);

        JPanel topPanel = new JPanel();
        mainPanel.add(topPanel);

        getNewFood(topPanel);
        showFoodShop(shop, topPanel);

        JPanel buttonsPanel = new JPanel();
        mainPanel.add(buttonsPanel);

        showAddButton(buttonsPanel);

        showRemoveButton(buttonsPanel);

        showLoadButton(buttonsPanel);

        showSaveButton(buttonsPanel);

        frame.setVisible(true);
    }

    private void showSaveButton(JPanel buttonsPanel) {
        Button saveButton = new Button("Save");
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gson gson = new Gson();
                String json = gson.toJson(shop);
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
                    writer.write(json);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

                Dialog dialog = new Dialog(frame, "Saved");
                dialog.setSize(200, 100);
                // dialog.setDefaultCloseOperation(3);
                dialog.setLayout(new BoxLayout(dialog, BoxLayout.Y_AXIS));

                Label savedlable = new Label("Saved");
                dialog.add(savedlable);

                Button exitButton = new Button("Exit");
                exitButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose();
                    }

                });
                exitButton.setSize(150, 50);
                dialog.add(exitButton);
                dialog.setVisible(true);
            }
        });
        buttonsPanel.add(saveButton);
    }

    private void showLoadButton(JPanel buttonsPanel) {
        Button loadButton = new Button("Load");
        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
                    String json = reader.readLine();
                    Gson converter = new Gson();
                    shop = converter.fromJson(json, FoodShop.class);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }

                list.removeAll();
                for (Food food : shop.getFoodList()) {
                    list.add(food.toString());
                }

                Dialog dialog = new Dialog(frame, "Loaded");
                dialog.setSize(200, 100);
                // dialog.setDefaultCloseOperation(3);
                dialog.setLayout(new BoxLayout(dialog, BoxLayout.Y_AXIS));

                Label savedlable = new Label("Loaded");
                dialog.add(savedlable);

                Button exitButton = new Button("Exit");
                exitButton.addActionListener(new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dialog.dispose();
                    }

                });
                exitButton.setSize(150, 50);
                dialog.add(exitButton);
                dialog.setVisible(true);

            }
        });
        buttonsPanel.add(loadButton);
    }

    private void showRemoveButton(JPanel buttonsPanel) {
        removeFoodButton = new Button("Remove Food");
        removeFoodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                var index = list.getSelectedIndex();
                if (index == -1) {
                    return;
                }
                list.remove(index);
                shop.removeFood(index);
            }
        });
        buttonsPanel.add(removeFoodButton);
    }

    private void showAddButton(JPanel buttonsPanel) {
        addFoodButton = new Button("Add Food");
        addFoodButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
                String name = nameField.getText();
                int calories = Integer.parseInt(caloriesField.getText());
                int fat = Integer.parseInt(fatField.getText());
                int protein = Integer.parseInt(proteinField.getText());
                int carbohydrates = Integer.parseInt(carbohydratesField.getText());
                String date = deliveryDate.getText();
                Food newFood = new Food(name, calories, fat, protein, carbohydrates, date);
                shop.addFood(newFood);
                list.add(newFood.toString());
            }
        });
        buttonsPanel.add(addFoodButton);
    }

    private void showFoodShop(FoodShop shop, JPanel panel) {
        list = new List();
        for (Food food : shop.getFoodList()) {
            list.add(food.toString());
        }
        panel.add(list);
    }

    private void getNewFood(JPanel panel) {
        JPanel newFoodPanel = new JPanel();
        newFoodPanel.setSize(400, 300);
        panel.add(newFoodPanel);
        newFoodPanel.setLayout(new BoxLayout(newFoodPanel, BoxLayout.PAGE_AXIS));

        nameField = new JTextField("name");
        caloriesField = new JTextField("calories");
        fatField = new JTextField("fat");
        proteinField = new JTextField("protein");
        carbohydratesField = new JTextField("carbohydrates");
        deliveryDate = new JTextField(LocalDate.now().toString());

        newFoodPanel.add(nameField);
        newFoodPanel.add(caloriesField);
        newFoodPanel.add(fatField);
        newFoodPanel.add(proteinField);
        newFoodPanel.add(carbohydratesField);
        newFoodPanel.add(deliveryDate);

        for (Component component : newFoodPanel.getComponents()) {
            component.setSize(new Dimension(1000, 30));
        }
    }

}
