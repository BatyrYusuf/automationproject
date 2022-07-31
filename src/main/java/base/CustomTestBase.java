package base;

import com.ey.automation.base.Base;
import com.ey.automation.base.CurrentPageContext;
import com.ey.automation.base.DriverContext;
import com.ey.automation.base.TestInitialize;
import org.testng.annotations.*;
import pages.LoginPage;

import java.lang.reflect.Method;

public class CustomTestBase extends TestInitialize {

    public LoginPage loginPage(){
        Base base = new Base();
        CurrentPageContext.setCurrentPage(base.GetInstance(LoginPage.class));
        LoginPage loginPage = CurrentPageContext.getCurrentPage().As(LoginPage.class);
        return loginPage;
    }

}
