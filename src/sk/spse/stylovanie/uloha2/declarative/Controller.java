package sk.spse.stylovanie.uloha2.declarative;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private TextField menoField;

    @FXML
    private PasswordField hesloField;

    @FXML
    private ToggleGroup pohlavieGroup;

    @FXML
    public void registrujButton() {
        String meno = menoField.getText();
        String heslo = hesloField.getText();

        if (pohlavieGroup.getSelectedToggle() != null) {
            String pohlavie = ((RadioButton)pohlavieGroup.getSelectedToggle()).getText();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registrácia užívateľa");
            alert.setHeaderText("Registrácia prebehla úspešne");
            alert.setContentText("Užívateľ " + meno + " (" + pohlavie + ") s heslom " + heslo + " bol pridaný do systému");
            alert.showAndWait();
        }
    }

    @FXML
    public void zavrietAction() {
        Platform.exit();
    }
}