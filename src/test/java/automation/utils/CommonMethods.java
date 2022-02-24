package automation.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.Random;

public class CommonMethods {

    public static byte[] takeScreenshot(){
        byte[] scrFile = ((TakesScreenshot)DriverUtils.getDriver()).getScreenshotAs(OutputType.BYTES);
        return scrFile;
    }

    public static String generateRandomSSN() {
        int m = (int) Math.pow(10, 8);
        int ssn = m + new Random().nextInt(9 * m);
        return String.valueOf(ssn);
    }

    public static void main(String[] args) {
        System.out.println(generateRandomSSN());
    }


}
