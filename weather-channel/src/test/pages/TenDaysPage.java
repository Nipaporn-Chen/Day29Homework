package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TenDaysPage extends BasePage {
    protected WebDriver driver;

    public TenDaysPage (WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "caret-up")
    public  WebElement btn;

    @FindBy(xpath = "//h3[text()='Today']")
    public WebElement dateName;

    @FindBy(xpath = "//span[@data-testid='TemperatureValue']")
    public WebElement highTmp;

    @FindBy(xpath = "//span[@data-testid='lowTempValue']")
    public WebElement lowTemp;

    @FindBy(xpath = "//span[@class='DetailsSummary--extendedData--365A_']")
    public WebElement description;
}
