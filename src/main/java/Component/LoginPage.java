package Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    By loginnow = By.xpath("//h2[contains(text(),'Login Now')]");
    public WebElement LoginNow() {return driver.findElement(loginnow);}
    By lineId = By.xpath("//select[@id='LineId']");
    public WebElement LineID()  {return driver.findElement(lineId);}
    By workcenter = By.xpath("//select[@id='WorkcenterId']");
    public WebElement WorkCenter() {return  driver.findElement(workcenter);}
    By stationtype = By.xpath("//select[@id='StationType']");
    public WebElement StationType() {return driver.findElement(stationtype);}
    By submit =  By.xpath("//button[contains(text(),'Submit')]");
    public WebElement SubmitButton() {return driver.findElement(submit);}
}
