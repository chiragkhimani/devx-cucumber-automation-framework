package automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CommonMethods {

    public static byte[] takeScreenshot(){
        byte[] scrFile = ((TakesScreenshot)DriverUtils.getDriver()).getScreenshotAs(OutputType.BYTES);
        return scrFile;
    }


}
