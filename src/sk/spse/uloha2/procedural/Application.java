package sk.spse.uloha2.procedural;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

///
/// Trieda pre procedurálne vytvorené GUI
///

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) {
        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(10);
        root.setVgap(15);
        root.setAlignment(Pos.CENTER);

        Label lblMeno = new Label("Užívateľské meno:");
        TextField txtMeno = new TextField();
        txtMeno.setPromptText("zadaj meno");
        root.add(lblMeno, 0, 0);
        root.add(txtMeno, 1, 0);

        Label lblHeslo = new Label("Heslo:");
        PasswordField txtHeslo = new PasswordField();
        txtHeslo.setPromptText("zadaj heslo");
        root.add(lblHeslo, 0, 1);
        root.add(txtHeslo, 1, 1);

        Label lblPohlavie = new Label("Pohlavie:");
        ToggleGroup pohlavieGroup = new ToggleGroup();

        RadioButton rbMuz = new RadioButton("Muž");
        rbMuz.setToggleGroup(pohlavieGroup);
        rbMuz.setSelected(true);

        RadioButton rbZena = new RadioButton("Žena");
        rbZena.setToggleGroup(pohlavieGroup);

        HBox hbPohlavie = new HBox(10, rbMuz, rbZena);
        root.add(lblPohlavie, 0, 2);
        root.add(hbPohlavie, 1, 2);

        Button btnRegistrovat = new Button("Registrovať");
        btnRegistrovat.setMaxWidth(Double.MAX_VALUE);
        root.add(btnRegistrovat, 0, 3, 2, 1);
        Button btnZavriet = new Button("Zavrieť");
        btnZavriet.setMaxWidth(Double.MAX_VALUE);
        root.add(btnZavriet, 0, 4, 2, 1);

        btnZavriet.setOnAction(e -> Platform.exit());
        btnRegistrovat.setOnAction(e -> {
            String meno = txtMeno.getText();
            String heslo = txtHeslo.getText();
            String pohlavie = ((RadioButton)pohlavieGroup.getSelectedToggle()).getText();

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Registrácia užívateľa");
            alert.setHeaderText("Registrácia prebehla úspešne");
            alert.setContentText("Užívateľ " + meno + " (" + pohlavie + ") s heslom " + heslo + " bol pridaný do systému");
            alert.showAndWait();
        });

        Scene scene = new Scene(root, 350, 280);

        stage.setTitle("Declarative Application 2");
        stage.setScene(scene);
        stage.show();
    }
}