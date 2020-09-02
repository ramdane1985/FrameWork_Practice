package homeTest;

import base.CommonAPI;
import home.CustomerService;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerServiceTest extends CommonAPI {
    CustomerService object;
    @BeforeMethod
    public void init(){
        object= PageFactory.initElements(driver,CustomerService.class);
    }
    @Test
    public void setCustomerServiceTest(){
        object.setCustomerService();
    }
}
