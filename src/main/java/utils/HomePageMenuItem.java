package utils;

public enum HomePageMenuItem {

    DYNAMIC_ID("Dynamic ID"),
    CLASS_ATTRIBUTE("Class Attribute"),
    HIDDEN_LAYERS("Hidden Layers"),
    LOAD_DELAY("Load Delay"),
    AJAX_DATA("AJAX Data"),
    CLIENT_SIDE_DELAY("Client Side Delay"),
    CLICK("Click"),
    TEXT_INPUT("Text Input")
    ;
    private final String locator;
    HomePageMenuItem(String locator){
        this.locator = locator;
    }
    public String getLocator(){
        return locator;
    }
}
