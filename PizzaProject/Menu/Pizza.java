package Menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Pizza {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToPizza(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Pizza.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToSides(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Sides.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToDrink(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Drink.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
    private RadioButton small, medium, large, xl;
    @FXML
    private CheckBox c1, c2, c3, t1, t2, t3, t4, t5;
    @FXML
    TextField textField1;

    public float total = 0;

    public ArrayList<String> getPizza(ActionEvent event) throws IOException {
        ArrayList<String> pizza = new ArrayList<>();
        if (small.isSelected()) {
            pizza.add(small.getText());
            total+= 9.99;
        } else if (medium.isSelected()) {
            pizza.add(medium.getText());
            total += 10.99;
        } else if (large.isSelected()) {
            pizza.add(large.getText());
            total += 11.99;
        } else if (xl.isSelected()) {
            pizza.add(xl.getText());
            total += 12.99;
        }
        if(t1.isSelected()) {
            pizza.add(c1.getText());
        } else if(t2.isSelected()) {
            pizza.add(c2.getText());
        } else if(t3.isSelected()) {
            pizza.add(c3.getText());
        }
        return pizza;
    }

    public void addToCart(ActionEvent event) throws IOException {
        //String pizza = small.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Order.fxml"));
        root = loader.load();

        Order order = loader.getController();
        //order.displayText1(small.getText());

        if (small.isSelected()) {
            order.displayText1(small.getText());
        } else if (medium.isSelected()) {
            order.displayText1(medium.getText());
        } else if (large.isSelected()) {
            order.displayText1(large.getText());
        } else if (xl.isSelected()) {
            order.displayText1(xl.getText());
        }
        if(t1.isSelected()) {
            order.displayCrust(t1.getText());
        } else if(t2.isSelected()) {
            order.displayCrust(t2.getText());
        } else if(t3.isSelected()) {
            order.displayCrust(t3.getText());
        }

        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        //stage.show();

    }
}