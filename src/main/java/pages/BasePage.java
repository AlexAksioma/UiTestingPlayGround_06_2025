package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.HomePageMenuItem;

public abstract class BasePage {

    static WebDriver driver;

    public void setDriver(WebDriver wd) {
        driver = wd;
    }

    public static <T extends BasePage> T clickButtonsHomePageMenuItem(HomePageMenuItem homePageMenuItem) {
        WebElement element = driver.findElement(
                By.xpath("//a[text()='" + homePageMenuItem.getLocator() + "']"));
        element.click();
        switch (homePageMenuItem) {
            case DYNAMIC_ID -> {
                return (T) new DynamicIDPage(driver);
            }
            case LOAD_DELAY -> {
                return (T) new LoadDelayPage(driver);
            }
            case HIDDEN_LAYERS -> {
                return (T) new HiddenLayersPage(driver);
            }
            case CLASS_ATTRIBUTE -> {
                return (T) new ClassAttributePage(driver);
            }
            default -> throw new IllegalArgumentException("wrong parametr homePageMenuItem");
        }

    }
}
