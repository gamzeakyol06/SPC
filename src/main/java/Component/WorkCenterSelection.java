package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class WorkCenterSelection {
    WebDriver driver;
    public WorkCenterSelection(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, driver);
    }
    // 101-102-104-105-107-106
    By workcenter_APL = By.xpath("//option[contains(text(),'APL')]");
    public WebElement WorkCenter_APL() {return driver.findElement(workcenter_APL);}
    By workcenter_ASL = By.xpath("//option[contains(text(),'ASL')]");
    public WebElement WorkCenter_ASL() {return driver.findElement(workcenter_ASL);}
    By workcenter_IML = By.xpath("//option[contains(text(),'IML')]");
    public WebElement WorkCenter_IML() {return driver.findElement(workcenter_IML);}
    By workcenter_COL = By.xpath("//option[contains(text(),'COL')]");
    public WebElement WorkCenter_COL() {return driver.findElement(workcenter_COL);}
    By workcenter_REL = By.xpath("//option[contains(text(),'REL')]");
    public WebElement WorkCenter_REL() {return driver.findElement(workcenter_REL);}
    //103-106
    By workcenter_TIL = By.xpath("//option[contains(text(),'TIL')]");
    public WebElement WorkCenter_TIL() {return driver.findElement(workcenter_TIL);}
    By workcenter_FSL = By.xpath("//option[contains(text(),'FSL')]");
    public WebElement WorkCenter_FSL() {return driver.findElement(workcenter_FSL);}
    //106
    By workcenter_AVL = By.xpath("//option[contains(text(),'AVL')]");
    public WebElement WorkCenter_AVL() {return driver.findElement(workcenter_AVL);}
    By workcenter_COL3 = By.xpath("//option[contains(text(),'COL3')]");
    public WebElement WorkCenter_COL3() {return driver.findElement(workcenter_COL3);}
    By workcenter_COL4= By.xpath("//option[contains(text(),'COL4')]");
    public WebElement WorkCenter_COL4() {return driver.findElement(workcenter_COL4);}
    //ZEHUS- ALL PT - SUB need to be added




}
