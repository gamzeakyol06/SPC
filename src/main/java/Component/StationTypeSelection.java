package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class StationTypeSelection {
    WebDriver driver;
    public StationTypeSelection(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, driver);
    }
    By stationtype_camera = By.xpath("//option[contains(text(),'Camera')]");
    public WebElement StationType_Camera() {return driver.findElement(stationtype_camera);}
    By stationtype_collaudo = By.xpath("//option[contains(text(),'Collaudo')]");
    public WebElement StationType_Collaudo() {return driver.findElement(stationtype_collaudo);}
    By stationtype_sensor= By.xpath("//option[contains(text(),'Sensor')]");
    public WebElement StationType_Sensor() {return driver.findElement(stationtype_sensor);}
    By stationtype_marsilliCSV = By.xpath("//option[contains(text(),'Marsilli-CSV Files')]");
    public WebElement StationType_MarsilliCSV() {return driver.findElement(stationtype_marsilliCSV);}
    By stationtype_marsilliMDB = By.xpath("//option[contains(text(),'Marsilli-MDB Files')]");
    public WebElement StationType_MarsilliMDB() {return driver.findElement(stationtype_marsilliMDB);}
    By stationtype_laser= By.xpath("//option[contains(text(),'Laser Measurements')]");
    public WebElement StationType_Laser() {return driver.findElement(stationtype_laser);}
    By stationtype_plasma = By.xpath("//option[contains(text(),'Plasma/Resistance')]");
    public WebElement StationType_Plasma() {return driver.findElement(stationtype_plasma);}
    By stationtype_traceability= By.xpath(" //option[contains(text(),'Traceability')]");
    public WebElement StationType_Traceability() {return driver.findElement(stationtype_traceability);}
    By stationtype_test = By.xpath("//option[contains(text(),'Test')]");
    public WebElement StationType_Test() {return driver.findElement(stationtype_test);}
    By stationtype_conveyor = By.xpath("//option[contains(text(),'Conveyor')]");
    public WebElement StationType_Conveyor() {return driver.findElement(stationtype_conveyor);}
    By stationtype_counters = By.xpath("//option[contains(text(),'Counters')]");
    public WebElement StationType_Counters() {return driver.findElement(stationtype_counters);}

}
