package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    public HomePage (WebDriver driver)
    {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy (xpath = "//span[contains(text(),'Contact Us')]")
    public WebElement btn_bookApointment;
    @FindBy (css = "[name = 'name']")
    public WebElement txt_Name;
    @FindBy (css = "[name = 'email']")
    public WebElement txt_Email;

    @FindBy (css = "[name = 'phone']")
    public WebElement txt_Phone;

    @FindBy (css = "[name = 'address']")
    public WebElement txt_Address;

    @FindBy(css = "[type='submit']")
    public WebElement btn_submit;

    public void bookappointMent()
    {
        WebDriverWait wait  = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(btn_bookApointment)).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txt_Name);
        txt_Name.sendKeys("Afifa Sultana");
        txt_Phone.sendKeys("+880181555555");
        txt_Email.sendKeys("afif.sultana.me@gmail.com");
        txt_Address.sendKeys("Proshika, Dhaka");
        btn_submit.click();

    }

}
