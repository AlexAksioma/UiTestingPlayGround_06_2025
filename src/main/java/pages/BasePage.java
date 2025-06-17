package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.HomePageMenuItem;

import java.time.Duration;

public abstract class BasePage {

    static WebDriver driver;

    public void setDriver(WebDriver wd) {
        driver = wd;
    }

    public void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T extends BasePage> T clickButtonsHomePageMenuItem(HomePageMenuItem homePageMenuItem) {
        //WebElement element = driver.findElement(By.xpath("//a[text()='" + homePageMenuItem.getLocator() + "']"));
        //element.click();
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[text()='" + homePageMenuItem.getLocator() + "']"))).click();
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
            case CLICK -> {
                return (T) new ClickPage(driver);
            }
            case AJAX_DATA -> {
                return (T) new AjaxDataPage(driver);
            }
            case TEXT_INPUT -> {
                return (T) new TextInputPage(driver);
            }
            case CLIENT_SIDE_DELAY -> {
                return (T) new ClientSideDelayPage(driver);
            }
            default -> throw new IllegalArgumentException("wrong parameter homePageMenuItem");
        }

    }
}
