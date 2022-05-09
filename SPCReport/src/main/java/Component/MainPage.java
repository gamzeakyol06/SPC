package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    WebDriver driver;
    public MainPage (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, driver);
    }
    By graph_area = By.xpath("//div[@id='area1']");
    public WebElement Graph_Area() { return driver.findElement(graph_area);}

    By change = By.xpath("//a[@id='loginLink']");
    public WebElement Change_button() { return driver.findElement(change);}
}
