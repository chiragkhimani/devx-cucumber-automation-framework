package automation.steps;

import automation.utils.CommonMethods;
import automation.utils.DriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(){
        DriverUtils.createDriver();
    }

    @After
    public void cleanUp(Scenario sc){
        byte[] data = CommonMethods.takeScreenshot();
        sc.attach(data, "image/png", "My screenshot");
        DriverUtils.getDriver().quit();
    }

}
