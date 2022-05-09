package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
    protected static WebDriver driver;
    public final static String MAIN_PAGE_URL = "https://sf.eldor.com.tr/SPC/Account/Login";

    public void beforemethod(){
        System.setProperty("webdriver.chrome.driver","src/main/drivers/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void aftermethod(){
        driver.quit();
        //driver.close();
    }
}
