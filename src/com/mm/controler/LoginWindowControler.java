package com.mm.controler;

import com.mm.EmailManager;
import com.mm.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginWindowControler extends AbstractControler {

    @FXML
    private TextField emailAddressField;

    @FXML
    private TextField passwordAddressField;

    public LoginWindowControler(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void loginButtonAction() {
        System.out.println("Klik!");
    }

}
