package automation.steps;

import automation.utils.CommonMethods;
import automation.utils.DriverUtils;
import automation.utils.PropertyReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void setUp(){
        if(PropertyReader.getProperty("platform").equals("local")){
            DriverUtils.createDriver();
        }else if(PropertyReader.getProperty("platform").equals("sauce")) {
            DriverUtils.createSauceDriver();
        }else if(PropertyReader.getProperty("platform").equals("browserstack")) {
            DriverUtils.createBrowserStackDriver();
        }else{
            throw new RuntimeException("Invalid platform");
        }
    }

    @After
    public void cleanUp(Scenario sc){
        byte[] data = CommonMethods.takeScreenshot();
        sc.attach(data, "image/png", "My screenshot");
        DriverUtils.getDriver().quit();
    }

}
