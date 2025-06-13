package ui_tests;

import manager.AppManager;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.HiddenLayersPage;
import pages.HomePage;
import utils.HomePageMenuItem;

public class HiddenLayersTests extends AppManager {

    HiddenLayersPage hiddenLayersPage;
    @Test(expectedExceptions = {org.openqa.selenium.ElementClickInterceptedException.class})
    public void hiddenLayersTest(){
        new HomePage(getDriver());
        hiddenLayersPage = BasePage.clickButtonsHomePageMenuItem(HomePageMenuItem.HIDDEN_LAYERS);
        hiddenLayersPage.validateBtnCanNotBeHitTwice();
    }
}
