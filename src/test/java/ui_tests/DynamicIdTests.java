package ui_tests;

import manager.AppManager;
import org.testng.annotations.Test;
import pages.DynamicIDPage;
import pages.HomePage;
import utils.HomePageMenuItem;

import static pages.BasePage.*;

public class DynamicIdTests extends AppManager {

    DynamicIDPage dynamicIDPage;

    @Test
    public void dynamicIdTest(){
        new HomePage(getDriver());
        dynamicIDPage = clickButtonsHomePageMenuItem(HomePageMenuItem.DYNAMIC_ID);
    }

}
