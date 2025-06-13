package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class DynamicIDPage extends BasePage{
    public DynamicIDPage(WebDriver driver) {
        setDriver(driver);
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10), this);
    }

    @FindBy(css = "button[class = 'btn btn-primary']")
    WebElement btnDynamicID;

    public boolean validateBtnIdentification(){
        String selector = "button[class = 'btn btn-primary']";
        driver.findElement(By.cssSelector(selector)).click();
        return selector.contains("id");
    }

    public boolean validateID(){
        btnDynamicID.click();
        String idBefore = btnDynamicID.getAttribute("id");
        driver.navigate().refresh();
        String idAfter = btnDynamicID.getAttribute("id");
        return idAfter.equals(idBefore);
    }


}
