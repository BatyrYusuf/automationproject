package pages;

import com.ey.automation.config.Settings;
import com.ey.automation.listener.ReportListener;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;


public class LoginPage extends CommonPage{
    @FindBy(how = How.XPATH, using="//input[@id='Email']")
    public WebElement username;
    @FindBy(how = How.XPATH, using="//input[@id='Password']")
    public WebElement password;
    @FindBy(how = How.XPATH, using="//button[@class='button-1 login-button']")
    public WebElement loginButton;


    @Step("Login to the nopCommerce")
    public void login(){
        try{
            ReportListener.info("Login is started");
            waitUntilElementVisible(username);
            username.sendKeys(Settings.Username);
            password.sendKeys(Settings.Password);
            loginButton.click();
            Assert.fail();


        }catch(Exception e){

        }
    }
}
