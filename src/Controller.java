import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea info_field;

    @FXML
    private Button show_gift;

    @FXML
    private TextField total_field;

    @FXML
    private Button add_candy;

    @FXML
    private Button show_info;

    @FXML
    private ChoiceBox<String> choice_candy;

    @FXML
    private Button remove_candy;

    @FXML
    void initialize() {
        Gift gift = new Gift();
        Chocolate chocolate = new Chocolate();
        Jellybean jellybean = new Jellybean();
        Marmalade marmalade = new Marmalade();


        ObservableList<Sweets> productList = FXCollections.observableArrayList();
        productList.add(marmalade);
        productList.add(chocolate);
        productList.add(marmalade);
        productList.add(jellybean);

        //Выпадающий список
        choice_candy.setItems(FXCollections.observableArrayList("Конфетка", "Шоколадка", "Мармеладка"));
        choice_candy.setValue("Конфетка");


        add_candy.setOnAction(event -> {
            String choice = choice_candy.getValue();
            if (choice.equals("Конфетка")) {
                gift.addCandy(jellybean);
            } else if (choice.equals("Шоколадка")) {
                gift.addCandy(chocolate);
            } else if (choice.equals("Мармеладка")) {
                gift.addCandy(marmalade);
            }
        });
        show_info.setOnAction(event -> {
            switch (choice_candy.getValue()) {
                case "Конфетка":
                    info_field.setText(jellybean.getName() + "\n" + "Вес: " + jellybean.getWeight() + "\n"
                            + "Цена: " + jellybean.getPrice() + "\n" + jellybean.getUnique());
                    break;

                case "Шоколадка":
                    info_field.setText(chocolate.getName() + "\n" + "Вес: " + chocolate.getWeight() + "\n"
                            + "Цена: " + chocolate.getPrice() + "\n" + chocolate.getUnique());
                    break;
                case "Мармеладка":
                    info_field.setText(marmalade.getName() + "\n" + "Вес: " + marmalade.getWeight() + "\n"
                            + "Цена: " + marmalade.getPrice() + "\n" + marmalade.getUnique());
                    break;
            }
        });

        show_gift.setOnAction(event -> {
            info_field.setText(gift.showGift());
            total_field.setText("Вес: " + gift.getTotalWeight() + " Цена: " + gift.getTotalPrice());
        });

        remove_candy.setOnAction(event -> {
            gift.removeCandy(choice_candy.getValue());
        });

    }
}
