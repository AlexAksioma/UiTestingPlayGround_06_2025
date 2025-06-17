package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AjaxDataPage extends BasePage {
    public AjaxDataPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(id ="ajaxButton")
    WebElement ajaxButton;

    @FindBy(id = "spinner")
    WebElement spinner;

    @FindBy(id = "content")
    WebElement text;

    public boolean validateSpinner(){   //style="display:none"
        ajaxButton.click();
        return new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.attributeContains(spinner, "style", "display: none;"));
    }

    public boolean validateText(){   //style="display:none"
        ajaxButton.click();
        return new WebDriverWait(driver, Duration.ofSeconds(20))
                .until(ExpectedConditions.textToBePresentInElement(text, "Data loaded with AJAX get request."));
    }
}
