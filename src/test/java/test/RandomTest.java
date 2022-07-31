package test;

import base.CustomTestBase;
import org.testng.annotations.Test;

public class RandomTest extends CustomTestBase {

    @Test(priority = 0)
    public void LoginWithValidPassword(){
        loginPage().login();
    }

}
