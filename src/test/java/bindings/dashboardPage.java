package bindings;

//import pageObjects.dashboardpageObjects;
//import pageObjects.loginPageobjects;

import loginPage.*;

public class dashboardPage {


    public void clickcustParent(){
        loginPage lp1 = new loginPage();
        lp1.db.click_parent_customer_link();

        lp1.db.click_child_customer_link();
    }
}
