package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public final static String MAIN_PAGE_URL = "https://sf.eldor.com.tr/SPC/Account/Login";

    public void beforemethod(){
        System.setProperty("webdriver.chrome.driver","src/main/driver/chromedriver.exe");
        System.out.println(System.getProperty("webdriver.chrome.driver"));
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get (MAIN_PAGE_URL);
    }
    public void aftermethod(){
        driver.quit();
        //driver.close();
    }
}
