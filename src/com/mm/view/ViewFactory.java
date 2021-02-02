package com.mm.view;

import com.mm.EmailManager;
import com.mm.controler.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ViewFactory {
    private EmailManager emailManager;
    private ColorTheme colorTheme = ColorTheme.DEFAULT;
    private FontSize fontSize = FontSize.MEDIUM;
    private ArrayList<Stage> activeStages;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
        activeStages = new ArrayList<Stage>();
    }

    public ColorTheme getColorTheme() {
        return colorTheme;
    }

    public FontSize getFontSize() {
        return fontSize;
    }

    public void setColorTheme(ColorTheme colorTheme) {
        this.colorTheme = colorTheme;
    }

    public void setFontSize(FontSize fontSize) {
        this.fontSize = fontSize;
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

    public void showComposeMessageWindow() {
        AbstractControler controler = new ComposeMessageControler(emailManager, this, "ComposeMessageWindow.fxml");
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
        activeStages.add(stage);
    }

    public void closeStage(Stage stageToClose) {
        stageToClose.close();
        activeStages.remove(stageToClose);
    }

    public void updateStyles() {
        for(Stage stage: activeStages) {
            Scene scene = stage.getScene();
            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource(colorTheme.getCssPath(colorTheme)).toExternalForm());
            scene.getStylesheets().add(getClass().getResource(FontSize.getCssPath(fontSize)).toExternalForm());
        }
    }
}
