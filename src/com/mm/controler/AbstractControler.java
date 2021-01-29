package com.mm.controler;

import com.mm.EmailManager;
import com.mm.view.ViewFactory;

public abstract class AbstractControler {

    protected EmailManager emailManager;
    protected ViewFactory viewFactory;
    private String fxmlName;

    public AbstractControler(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}
