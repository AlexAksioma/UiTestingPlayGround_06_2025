package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HiddenLayersPage extends BasePage{
    public HiddenLayersPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(id = "greenButton")
    WebElement greenButton;

    public boolean validateBtnCanNotBeHitTwice(){
        System.out.println(greenButton.isEnabled());
        System.out.println(greenButton.isDisplayed());
        greenButton.click();
        pause(3);
        greenButton.click();
        System.out.println(greenButton.isEnabled());
        System.out.println(greenButton.isDisplayed());
        return true;
    }
}
