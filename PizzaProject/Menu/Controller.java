package Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller /*implements Initializable*/ {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToPizza(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pizza.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSides(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sides.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDrink(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /*@FXML
    private RadioButton b1, b2, b3, b4, b5, b6, b7, b8;

    @FXML private ChoiceBox<Integer> CB;

    private Integer[] quantity = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        CB.getItems().addAll(quantity);

    }*/
}
