package bindings;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.loginPageobjects;
import pageObjects.dashboardpageObjects;

import static java.lang.System.*;

public class loginPage extends baseclass{

    public loginPageobjects lp;
    public dashboardpageObjects db;

    @BeforeTest
    public void setup(){
       initBrowser("Chrome");
       lp = new loginPageobjects(driver);
    }

    @Test(priority = 0)
    public void enterAUsername(){

        lp.enterUsername();
        //driver.findElement(By.id("Email")).clear();
        //driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
    }

    @Test(priority = 1)
    public void enterBPassword(){
        lp.enterPassword();
        //driver.findElement(By.id("Password")).clear();
        //driver.findElement(By.id("Password")).sendKeys("admin");
    }

    @Test(priority = 2)
    public void clickCLogin(){
       db = lp.submitCredentials();
       //driver.findElement(By.xpath("//input[@value='Log in']")).click();

       System.out.println(driver.getTitle());
    }
    @Test(priority = 3)
    public void successfulLogin(){

        Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
    }

    @Test (priority = 4)  this method should be in dashboardPage.java ???
    public void clickparentCust(){
        db.
    }
}