package bindings;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import pageObjects.loginPageobjects;
import static java.lang.Thread.*;

public class baseclass {

    WebDriver driver;
    //loginPageobjects lp;
    public void initBrowser(String browser){

        if (browser.equals("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        if (browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.get("https://admin-demo.nopcommerce.com");

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //lp = new logingPageobjects(driver);
    }
}
