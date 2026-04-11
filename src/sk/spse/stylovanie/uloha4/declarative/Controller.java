package sk.spse.stylovanie.uloha4.declarative;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
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

    public ImageView sup1 = new ImageView();
    public ImageView sup2 = new ImageView();
    public ImageView sup3 = new ImageView();
    public ImageView sup4 = new ImageView();

    public String getRandomColor() {
        List<String> farby = Arrays.asList("red", "green", "blue", "orange", "yellow", "pink", "violet");
        Random random = new Random();
        int index = random.nextInt(farby.size());
        return farby.get(index);
    }
    public double getRandomOpacity() {
        double a = Math.random();
        return (double) Math.round(a * 100) /100;
    }

    public double getRandomAngle() {
        return (Math.random() * 361);
    }

    public double getRandomScaleX() {
        return Math.random() * 2 + .2;
    }

    public double getRandomScaleY() {
        double a = (Math.random() * 1.5 + .2);
        return (double) Math.round(a * 100) /100;
    }

    @FXML
    private void randomize() {
        vbox1.setStyle("-fx-background-color: " + getRandomColor() + ";-fx-opacity: " + getRandomOpacity());
        vbox2.setStyle("-fx-background-color: " + getRandomColor() + ";-fx-opacity: " + getRandomOpacity());
        vbox3.setStyle("-fx-background-color: " + getRandomColor() + ";-fx-opacity: " + getRandomOpacity());
        vbox4.setStyle("-fx-background-color: " + getRandomColor() + ";-fx-opacity: " + getRandomOpacity());

        sup1.setStyle("-fx-rotate: " + getRandomAngle());
        sup2.setStyle("-fx-scale-x: " + getRandomScaleX());
        sup3.setStyle("-fx-scale-y: " + getRandomScaleY());
        sup4.setStyle("-fx-rotate: " + getRandomAngle() + ";-fx-scale-x: " + getRandomScaleX() + ";-fx-scale-y: " + getRandomScaleY());



    }




    @FXML
    public void zavrietAction() {
        Platform.exit();
    }
}
