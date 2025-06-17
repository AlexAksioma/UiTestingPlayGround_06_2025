package ui_tests;

import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AjaxDataPage;
import pages.HomePage;
import utils.HomePageMenuItem;

import static pages.BasePage.*;

public class AjaxDataTests extends AppManager {

    AjaxDataPage ajaxDataPage;

    @BeforeClass
    public void goToAjaxPage(){
        new HomePage(getDriver());
        ajaxDataPage = clickButtonsHomePageMenuItem(HomePageMenuItem.AJAX_DATA);
    }

    @Test
    public void spinnerTest(){
        Assert.assertTrue(ajaxDataPage.validateSpinner());
    }
    @Test
    public void textTest(){
        Assert.assertTrue(ajaxDataPage.validateText());
    }

}
