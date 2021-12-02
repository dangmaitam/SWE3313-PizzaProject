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

public class Drink implements Initializable{
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
        Parent root = FXMLLoader.load(getClass().getResource("Drink.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addToCart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Order.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Homepage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToContact(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ContactUs.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private RadioButton b1, b2, b3, b4, b5, b6, b7, b8, cart;

    @FXML private ChoiceBox<Integer> q1, q2, q3, q4, q5, q6, q7;
    @FXML private ChoiceBox<String> s1, s2, s3, s4, s5, s6, s7;

    private Integer[] quantity = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private String[] size = {"S", "M", "L"};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        q1.getItems().addAll(quantity);
        q2.getItems().addAll(quantity);
        q3.getItems().addAll(quantity);
        q4.getItems().addAll(quantity);
        q5.getItems().addAll(quantity);
        q6.getItems().addAll(quantity);
        q7.getItems().addAll(quantity);
        s1.getItems().addAll(size);
        s2.getItems().addAll(size);
        s3.getItems().addAll(size);
        s4.getItems().addAll(size);
        s5.getItems().addAll(size);
        s6.getItems().addAll(size);
        s7.getItems().addAll(size);
    }
}
