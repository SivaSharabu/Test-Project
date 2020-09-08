package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboardpageObjects {

    WebDriver lDriver;
    public dashboardpageObjects(WebDriver rDriver) {
        lDriver = rDriver;
        PageFactory.initElements(rDriver, this);
    }

    @FindBy(xpath="(//span[contains(text(),'Customers')])[1]")
    @CacheLookup
    private WebElement lnk_Main_Customer;

    @FindBy(xpath="(//span[contains(text(),'Customers')])[2]")
    @CacheLookup
    private WebElement lnk_Child_Customer;

    public void click_parent_customer_link(){
        lnk_Main_Customer.click();
    }

    public void click_child_customer_link(){
        lnk_Child_Customer.click();
    }

}
