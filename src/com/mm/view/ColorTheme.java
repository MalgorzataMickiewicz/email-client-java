package com.mm.view;

public enum ColorTheme  {
    LIGHT,
    DARK,
    DEAFULT;

    public static String getCssPath(ColorTheme colorTheme) {
        switch (colorTheme) {
            case LIGHT:
                return "css/themeLight.css";
            case DARK:
                return "css/themeDark.css";
            case DEAFULT:
                return "css/themeDeafult.css";
            default:
                return null;
        }
    }
}
