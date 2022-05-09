package Component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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

    By nav_tab = By.xpath("//div[@id='nav-tab']");
    public WebElement Nav_Tab_Count() { return driver.findElement(nav_tab);}

    By product = By.xpath("//h3[@id='product']");
    public WebElement Product() { return driver.findElement(product);}

    By ppm = By.xpath(" //h4[@id='ppm']");
    public WebElement PPMValue() { return driver.findElement(ppm);}


    public List<WebElement> Tabs(){
    WebElement parent = driver.findElement(By.xpath("//div[@id='nav-tab']"));
    List<WebElement> tabs = parent.findElements(By.xpath("//*[@id=\"camera-tab\"]")); return tabs; }

    public List<WebElement> Tspan_Value(){
    List<WebElement> tspans = driver.findElements(By.tagName("tspan"));return tspans;}

    public List<WebElement> Graph_Value(){
    WebElement parent = driver.findElement(By.className("card"));
    List<WebElement> graphs = parent.findElements(By.tagName("rect")); return graphs;}

    public WebElement tooltip_Value(){
        WebElement tip = driver.findElement(By.xpath("//*[@class=\"highcharts-label-box highcharts-tooltip-box\"]"));return tip;}

    public void Nav_Tavb(){
        List<WebElement> navs = driver.findElements(By.tagName("nav"));
        int t = navs.size();
        System.out.println(t);
        /*for(WebElement nav : navs){
            int t = navs.size();
            System.out.println(t);
        }*/
    }

}
