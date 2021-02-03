module JavaEmailClient {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;
    requires activation;
    requires java.mail;
    requires java.desktop;

    opens com.mm;
    opens com.mm.view;
    opens com.mm.controler;
    opens com.mm.model;
}