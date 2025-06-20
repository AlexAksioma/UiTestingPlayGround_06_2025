package ui_tests;

import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.ClientSideDelayPage;
import pages.HomePage;
import utils.HomePageMenuItem;

public class ClientSideDelayTests extends AppManager {

    @Test
    public void clientSideDelayTest(){
        new HomePage(getDriver());
        ClientSideDelayPage clientSideDelayPage =
                BasePage.clickButtonsHomePageMenuItem(HomePageMenuItem.CLIENT_SIDE_DELAY);
        Assert.assertTrue(clientSideDelayPage.validateAppearText());
    }
}
