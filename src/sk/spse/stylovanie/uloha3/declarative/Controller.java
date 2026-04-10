package sk.spse.stylovanie.uloha3.declarative;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.net.URI;

/**
 * Controller pre FXML súbor – obsahuje logiku aplikácie
 */
public class Controller {

    public ImageView obrazok;
    public Slider slider;


    @FXML
    public void zavriButton() {
        zavrietAction();
    }

    @FXML
    public void zavrietAction() {
        Platform.exit();
    }

    @FXML
    public void linkOpen() {
        try {
            Desktop.getDesktop().browse(new URI("http://spse-po.sk"));
        }   catch (Exception e) {
            e.printStackTrace();
        }
    }

}
