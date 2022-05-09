package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LineSelection {
    WebDriver driver;
    public LineSelection(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    By lineId_101 = By.xpath("//option[contains(text(),'101')]");
    public WebElement LineID_101()  {return driver.findElement(lineId_101);}
    By lineId_102 = By.xpath("//option[contains(text(),'102')]");
    public WebElement LineID_102()  {return driver.findElement(lineId_102);}
    By lineId_103 = By.xpath("//option[contains(text(),'103')]");
    public WebElement LineID_103()  {return driver.findElement(lineId_103);}
    By lineId_104 = By.xpath("//option[contains(text(),'104')]");
    public WebElement LineID_104()  {return driver.findElement(lineId_104);}
    By lineId_105 = By.xpath("//option[contains(text(),'105')]");
    public WebElement LineID_105()  {return driver.findElement(lineId_105);}
    By lineId_106 = By.xpath("//option[contains(text(),'106')]");
    public WebElement LineID_106()  {return driver.findElement(lineId_106);}
    By lineId_107 = By.xpath("//option[contains(text(),'107')]");
    public WebElement LineID_107()  {return driver.findElement(lineId_107);}
    By lineId_ZEHUS = By.xpath("//option[contains(text(),'ZEHUS')]");
    public WebElement LineID_ZEHUS()  {return driver.findElement(lineId_ZEHUS);}
    By lineId_PT42 = By.xpath("//option[contains(text(),'PT42')]");
    public WebElement LineID_PT42()  {return driver.findElement(lineId_PT42);}
    By lineId_PT28 = By.xpath("//option[contains(text(),'PT28')]");
    public WebElement LineID_PT28()  {return driver.findElement(lineId_PT28);}
    By lineId_PT29 = By.xpath("//option[contains(text(),'PT29')]");
    public WebElement LineID_PT29()  {return driver.findElement(lineId_PT29);}
    By lineId_PT36 = By.xpath("//option[contains(text(),'PT36')]");
    public WebElement LineID_PT36()  {return driver.findElement(lineId_PT36);}
    By lineId_SUB = By.xpath("//option[contains(text(),'SUB')]");
    public WebElement LineId_SUB() {return driver.findElement(lineId_SUB); }
}