package tests;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TenDaysPage;
import utils.SeleniumUtils;

import java.util.List;

public class TenDaysTest extends BaseTest {
    TenDaysPage tenDaysPage;
    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){
        homePage = new HomePage(getDriver());
        tenDaysPage = new TenDaysPage(getDriver());
    }
    @Test(testName = "10 days", description = "10 days weather description")
    public void test03() {
        homePage.click(homePage.closePopUpBtn);
        homePage.click(homePage.tendaysBtn);
        tenDaysPage.click(tenDaysPage.btn);
        System.out.print(tenDaysPage.getText(tenDaysPage.dateName) + " ");
        System.out.print(tenDaysPage.getText(tenDaysPage.highTmp) + " ");
        System.out.print(tenDaysPage.getText(tenDaysPage.lowTemp) + " ");
        System.out.print(tenDaysPage.getText(tenDaysPage.description));

    }
}
