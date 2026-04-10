package sk.spse.stylovanie.uloha1.declarative;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * Controller pre FXML súbor – obsahuje logiku aplikácie
 */
public class Controller {

    @FXML
    private TextField Cfield;
    @FXML
    private TextField Ffield;

    @FXML
    private void convertCtoF() {
        try {
            double celsius = Double.parseDouble(Cfield.getText());

            double fahrenheit = (celsius * 9 / 5) + 32;

            Ffield.setText(String.format("%.2f", fahrenheit));
        } catch (NumberFormatException e) {
            Ffield.setText("Chyba!");
        }
    }

    @FXML
    private void convertFtoC() {
        try {
            double fahrenheit = Double.parseDouble(Ffield.getText());

            double celsius = (fahrenheit - 32) * 5 / 9;

            Cfield.setText(String.format("%.2f", celsius));
        } catch (NumberFormatException e) {
            Cfield.setText("Chyba!");
        }
    }
}