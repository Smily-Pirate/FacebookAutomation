package Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {
    WebDriver Logindriver;

    @FindBy(xpath = "input[id='email']")
    WebElement setEmail;

    @FindBy(xpath = "input[id='password']")
    WebElement setPassword;

    @FindBy(xpath = "button[type='submit']")
    WebElement clickSubmit;

    public  login(WebDriver driver){
        this.Logindriver = driver;
        PageFactory.initElements(driver, this);

    }

    public void enterEmail(String email){
        WebDriverWait wait = new WebDriverWait(Logindriver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(setEmail));
        setEmail.clear();
        setEmail.sendKeys("value");
    }

    public  void enterPassword(String password){
        WebDriverWait wait = new WebDriverWait(Logindriver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(setPassword));
        setPassword.clear();
        setPassword.sendKeys("password");
    }

    public  void clickLoginButton(){
        clickSubmit.click();
    }

}
