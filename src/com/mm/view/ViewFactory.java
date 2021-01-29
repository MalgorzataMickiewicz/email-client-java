package com.mm.view;

import com.mm.EmailManager;
import com.mm.controler.AbstractControler;
import com.mm.controler.LoginWindowControler;
import com.mm.controler.MainWindowControler;
import com.mm.controler.OptionsWindowControler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {
    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindow() {

        AbstractControler controler = new LoginWindowControler(emailManager, this, "LoginWindow.fxml");
        initializeStage(controler);
    }

    public void showMainWindow() {
        AbstractControler controler = new MainWindowControler(emailManager, this, "MainWindow.fxml");
        initializeStage(controler);
    }

    public void showOptionsWindow() {
        AbstractControler controler = new OptionsWindowControler(emailManager, this, "OptionsWindow.fxml");
        initializeStage(controler);
    }
    
    private void initializeStage(AbstractControler abstractControler) {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(abstractControler.getFxmlName()));
        fxmlLoader.setController(abstractControler);
        Parent parent;
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void closeStage(Stage stageToClose) {
        stageToClose.close();
    }
}
