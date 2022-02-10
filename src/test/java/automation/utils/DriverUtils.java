package automation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverUtils {

    static WebDriver driver;

    public static void createDriver(){
        // Setting path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "src//test//resources//driver//chromedriver.exe");
        // Open the browser
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        driver.manage().window().maximize();
    }

    public static void createSauceDriver(){
        ChromeOptions options = new ChromeOptions();
        options.setPlatformName("Windows 10");
        options.setBrowserVersion("latest");

        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-seleniumtraining2015-08459");
        sauceOptions.put("accessKey", "f81dcfcb-4a75-4c06-8349-82570e8594ad");
        sauceOptions.put("name", "My First Test");

        options.setCapability("sauce:options", sauceOptions);
        URL url = null;
        try {
            url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver = new RemoteWebDriver(url, options);
    }

    public static void createBrowserStackDriver(){
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("os_version", "10.0");
        caps.setCapability("device", "Samsung Galaxy A51");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browser", "Chrome");
        try {
            driver = new RemoteWebDriver(new URL("https://chiragthakker2:oe2Xa5anZYUbLG9Yp4xo@hub-cloud.browserstack.com/wd/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver(){
        return driver;
    }


}
