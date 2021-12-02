package Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Order {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Label sizePizza, crust, topping, type1, q1, type2, sizeDrink, q2;

    public void switchToDrink(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Drink.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void OrderConfirm(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Option.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void displayText1(String p) {
        sizePizza.setText(p);
    }
    public void displayCrust(String c) {
        crust.setText(c);
    }
    public void displaySide(String s) {
        type1.setText(s);
    }
}
