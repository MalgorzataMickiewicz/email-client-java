package com.mm.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginWindowControler {

    @FXML
    private TextField emailAddressField;

    @FXML
    private TextField passwordAddressField;

    @FXML
    void loginButtonAction() {
        System.out.println("Klik!");
    }

}
