package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageobjects {

    WebDriver lDriver;
    public loginPageobjects(WebDriver rDriver){
        lDriver = rDriver;
        PageFactory.initElements(lDriver, this);
    }

    @FindBy(id="Email")
    @CacheLookup
    private WebElement username;

    @FindBy(id="Password")
    @CacheLookup
    private WebElement password;

    @FindBy (xpath ="//input[@value='Log in']" )
    @CacheLookup
    private WebElement btnSubmit;

    public void enterUsername(){
        username.sendKeys("admin@yourstore.com");
    }

    public void enterPassword(){
        password.sendKeys("admin");
    }

    public dashboardpageObjects submitCredentials(){
        btnSubmit.click();
        return new dashboardpageObjects(lDriver);
    }

}
