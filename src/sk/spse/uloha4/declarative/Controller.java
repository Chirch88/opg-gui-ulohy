package sk.spse.uloha4.declarative;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Controller pre FXML súbor – obsahuje logiku aplikácie
 */
public class Controller {

    public VBox vbox1 = new VBox();
    public VBox vbox2 = new VBox();
    public VBox vbox3 = new VBox();
    public VBox vbox4 = new VBox();



    public String getRandomColor() {
        List<String> farby = Arrays.asList("red", "green", "blue", "orange", "yellow", "pink", "violet");
        Random random = new Random();
        int index = random.nextInt(farby.size());
        return farby.get(index);
    }

    @FXML
    private void randomize() {
        vbox1.setStyle("-fx-background-color: " + getRandomColor());
        vbox2.setStyle("-fx-background-color: " + getRandomColor());
        vbox3.setStyle("-fx-background-color: " + getRandomColor());
        vbox4.setStyle("-fx-background-color: " + getRandomColor());
    }

    @FXML
    public void zavrietAction() {
        Platform.exit();
    }
}
