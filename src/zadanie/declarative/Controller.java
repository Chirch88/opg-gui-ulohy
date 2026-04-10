package zadanie.declarative;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

/**
 * Controller pre FXML súbor – obsahuje logiku aplikácie
 */
public class Controller {

    @FXML
    private TextArea textAreaVypis;

    @FXML
    private void pridajAStiahni(String text) {
        textAreaVypis.appendText(text);
        textAreaVypis.setScrollTop(Double.MAX_VALUE);
    }

    @FXML
    void pridajRuku() {
        pridajAStiahni("\nRuka pridaná.");
    }

    @FXML
    void pridajNohu() {
        pridajAStiahni("\nNoha pridaná.");
    }

    @FXML
    void pridajHlavu() {
        pridajAStiahni("\nHlava pridaná.");
    }

    @FXML
    void pridajTrup() {
        pridajAStiahni("\nTrup pridaný.");
    }

    @FXML
    void poskladaj() {
        String novyText = "\nMontujem!!!\n--------------\n ROBOT HOTOVÝ\n--------------";
        pridajAStiahni(novyText);
    }
}