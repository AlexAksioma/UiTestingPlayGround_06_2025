package utils;

public enum HomePageMenuItem {

    DYNAMIC_ID("Dynamic ID"),
    CLASS_ATTRIBUTE("Class Attribute"),
    HIDDEN_LAYERS("Hidden Layers"),
    LOAD_DELAY("Load Delay");
    private final String locator;
    HomePageMenuItem(String locator){
        this.locator = locator;
    }
    public String getLocator(){
        return locator;
    }
}
