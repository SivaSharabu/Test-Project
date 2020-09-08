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

    @Test
    public void enterAUsername(){

        lp.enterUsername();
        //driver.findElement(By.id("Email")).clear();
        //driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
    }

    @Test
    public void enterBPassword(){
        lp.enterPassword();
        //driver.findElement(By.id("Password")).clear();
        //driver.findElement(By.id("Password")).sendKeys("admin");
    }

    @Test
    public void clickCLogin(){
       db = lp.submitCredentials();
       //driver.findElement(By.xpath("//input[@value='Log in']")).click();

       System.out.println(driver.getTitle());
    }
    @Test
    public void successfulLogin(){
        Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
    }
}