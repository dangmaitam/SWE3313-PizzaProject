package Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Sides implements Initializable{
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
    private CheckBox check1, check2, check3;
    @FXML
    private RadioButton r1, r2;
    @FXML
    private ChoiceBox<Integer> q1, q2, q3;

    private Integer[] quantity = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        q1.getItems().addAll(quantity);
        q2.getItems().addAll(quantity);
        q3.getItems().addAll(quantity);
    }

    public void addToCart(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        root = loader.load();

        Order order = loader.getController();

        if(check1.isSelected()) {
            order.displaySide(check1.getText());
        } else if(check2.isSelected()) {
            order.displaySide(check2.getText());
        } else if(check3.isSelected()) {
            order.displaySide(check3.getText());
        }

        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();


    }
}
