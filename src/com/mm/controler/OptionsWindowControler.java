package com.mm.controler;

import com.mm.EmailManager;
import com.mm.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Slider;

public class OptionsWindowControler extends AbstractControler{

    public OptionsWindowControler(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    private Slider FontSizerPicker;

    @FXML
    private ChoiceBox<?> themePicker;

    @FXML
    void applyButtonAction() {

    }

    @FXML
    void cancelButtonAction() {

    }
}
