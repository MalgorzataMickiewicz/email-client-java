package com.mm.controler;

import com.mm.EmailManager;
import com.mm.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeView;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowControler extends AbstractControler implements Initializable {

    @FXML
    private TreeView<String> emailsPreview;

    @FXML
    private TableView<String> emailsTableView;

    @FXML
    private WebView emailWebView;

    public MainWindowControler(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }

    @FXML
    void optionsAction() {
        viewFactory.showOptionsWindow();
    }

    @FXML
    void addAccountAction() {
        viewFactory.showLoginWindow();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setUpEmailsPreview();
    }

    private void setUpEmailsPreview() {
        emailsPreview.setRoot(emailManager.getFoldersRoot());
        emailsPreview.setShowRoot(false);
    }
}
