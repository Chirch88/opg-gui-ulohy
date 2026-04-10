package sk.spse.uloha1.procedural;

import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.datatransfer.FlavorEvent;

///
/// Trieda pre procedurálne vytvorené GUI
///
/// Upravujte túto triedu
///

public class Application extends javafx.application.Application {

    private TextField cField;
    private TextField fField;

    private void convertCtoF() {
        try {
            double celsius = Double.parseDouble(cField.getText());

            double fahrenheit = (celsius * 9 / 5) + 32;

            fField.setText(String.format("%.2f", fahrenheit));
        } catch (NumberFormatException e) {
            fField.setText("Chyba!");
        }
    }

    private void convertFtoC() {
        try {
            double fahrenheit = Double.parseDouble(fField.getText());

            double celsius = (fahrenheit - 32) * 5 / 9;

            cField.setText(String.format("%.2f", celsius));
        } catch (NumberFormatException e) {
            cField.setText("Chyba!");
        }
    }

    @Override
    public void start(Stage stage) {
        Label lblC = new Label("Stupne Celsia:");
        cField = new TextField("0");
        Label lblCUnit = new Label("°C");

        HBox rowC = new HBox(5, lblC,cField, lblCUnit);
        rowC.setAlignment(Pos.CENTER_RIGHT);
        rowC.setPadding(new Insets(10));


        Label lblF = new Label("Stupne Fahrenheita:");
        fField = new TextField("0");
        Label lblFUnit = new Label("°F");

        HBox rowF = new HBox(5, lblF, fField, lblFUnit);

        rowF.setPadding(new Insets(10));

        VBox root = new VBox(5, rowC, rowF);
        Scene scene = new Scene(root);





        cField.setOnKeyTyped(e -> convertCtoF());
        fField.setOnKeyTyped(e -> convertCtoF());

        stage.setTitle("Procedural Application 1");
        stage.setScene(scene);
        stage.show();
    }
}