package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.net.MalformedURLException;

public class Base {
    protected static WebDriver driver;
    public final static String MAIN_PAGE_URL = "https://sf.eldor.com.tr/SPC/Account/Login";

        public void beforemethod () throws MalformedURLException, InterruptedException {

            ChromeOptions chromeOptions = new ChromeOptions();

            chromeOptions.setCapability("browserName", "chrome");
            //chromeOptions.setCapability("platformName", "LINUX");
            chromeOptions.addArguments("start-maximized");
            chromeOptions.addArguments("--headless");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--remote-allow-origins=*");


            System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver_win32_x/chromedriver.exe");
            System.out.println(System.getProperty("webdriver.chrome.driver")); //C:/Users/akyolg/IdeaProjects/SPC/
            driver = new ChromeDriver(chromeOptions);
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            System.out.println("hello spc jenkins");
        }

        public void aftermethod() {
            driver.quit();
        }
    }

