package com.example.calculadorafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.ParseException;

public class HelloController{

    @FXML
    private TextField textocalcu;
    @FXML
    private Button boton0;

    @FXML
    private Button boton1;

    @FXML
    private Button boton2;

    @FXML
    private Button boton3;

    @FXML
    private Button boton4;

    @FXML
    private Button boton5;

    @FXML
    private Button boton6;

    @FXML
    private Button boton7;

    @FXML
    private Button boton8;

    @FXML
    private Button boton9;

    @FXML
    private Button botonante;

    @FXML
    private Button botonclean;

    @FXML
    private Button botondelet;

    @FXML
    private Button botondivi;

    @FXML
    private Button botonmenos;

    @FXML
    private Button botonmulti;

    @FXML
    private Button botonporcen;

    @FXML
    private Button botonpunto;

    @FXML
    private Button botonresul;

    @FXML
    private Button botonsuma;

    @FXML
    private TextArea historial;

    private Boolean operationOn = true;
    private double lastOperation = 0;

    private Button botonAntiguo;

    @FXML
    void addvalue(ActionEvent event) {

            textocalcu.setText(textocalcu.getText() + ((Button)event.getSource()).getText());
            operationOn = true;
    }


    @FXML
    void addoperation(ActionEvent event) {
            botonAntiguo = (Button) event.getSource();
            if (operationOn) {
            textocalcu.setText(textocalcu.getText() + ((Button)event.getSource()).getText());
            operationOn = false;
        }
    }

    public void cleanScreen() {
        textocalcu.setText("");
        operationOn = true;
    }
    public void deleteValue() {
        if (!(textocalcu.getText().length() == 0)) {
            textocalcu.setText(textocalcu.getText().substring(0, textocalcu.getText().length() - 1));
        }
    }
    public void makeoperation () {
        String operationS = textocalcu.getText();

        try {
            double operation = Double.parseDouble(textocalcu.getText());
            switch (botonAntiguo.getId()) {
                case "boton0":
                    operation *= 0;
                    break;
                case "boton1":
                    operation *= 1;
                    break;
                case "boton2":
                    operation *= 2;
                    break;
                case "boton3":
                    operation *= 3;
                    break;
                case "boton4":
                    operation *= 4;
                    break;
                case "boton5":
                    operation *= 5;
                    break;
                case "boton6":
                    operation *= 6;
                    break;
                case "boton7":
                    operation *= 7;
                    break;
                case "boton8":
                    operation *= 8;
                    break;
                case "boton9":
                    operation *= 9;
                    break;
                default:
                    break;
            }
            textocalcu.setText("" + operation);
        } catch (NumberFormatException e) {
            textocalcu.setText("");
        }
    }
    public void anteriorresul () {
            if (!(lastOperation == 0)) {
                textocalcu.setText(textocalcu.getText() + lastOperation);
            }

    }
}