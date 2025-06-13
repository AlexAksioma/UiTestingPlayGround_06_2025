package ui_tests;

import manager.AppManager;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.ClassAttributePage;
import pages.HomePage;
import utils.HomePageMenuItem;

import static pages.BasePage.*;

public class ClassAttributeTests extends AppManager {

    ClassAttributePage classAttributePage;

    @Test
    public void classAttributeTest(){
        HomePage homePage = new HomePage(getDriver());
        classAttributePage = clickButtonsHomePageMenuItem(HomePageMenuItem.CLASS_ATTRIBUTE);
        Assert.assertTrue(classAttributePage.validateButtonClass());
    }
}
