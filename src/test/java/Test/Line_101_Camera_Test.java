package Test;
import Base.Base;
import Component.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.net.MalformedURLException;

public class Line_101_Camera_Test extends Base {
    @BeforeSuite
    public void BeforeMethod() throws MalformedURLException, InterruptedException {
        super.beforemethod();
        driver.get(MAIN_PAGE_URL);
    }
    @Test(description = "Success 101APLCamera", priority = 1)
    public void line_101_APL_Camera_Success() throws InterruptedException{
        SoftAssert softassert = new SoftAssert();
        LoginPage login = new LoginPage(driver);
        LineSelection line = new LineSelection(driver);
        WorkCenterSelection workcenter = new WorkCenterSelection(driver);
        StationTypeSelection stationtype = new StationTypeSelection(driver);
        MainPage main = new MainPage(driver);
            try {
                Actions action = new Actions(driver);
                action.moveToElement(login.LoginNow()).build().perform();

                //wait.until(ExpectedConditions.visibilityOfAllElements(login.LoginNow()));
                System.out.println(login.LoginNow().getText());
                login.LineID().click();
                Thread.sleep(1000);
                line.LineID_101().click();
                Thread.sleep(1000);

                login.WorkCenter().click();
                Thread.sleep(1000);
                workcenter.WorkCenter_APL().click();
                Thread.sleep(1000);

                login.StationType().click();
                Thread.sleep(1000);
                stationtype.StationType_Camera().click();
                Thread.sleep(1000);

                login.SubmitButton().click();
                Thread.sleep(2000);
                String home_page_title = driver.getTitle();
                Assert.assertEquals(home_page_title, "SPC Data" ); // SPC main sayfasi gelmiyorsa fail olsun
                Assert.assertEquals(main.Graph_Area().isDisplayed(),true);  // graph area yaratilmiyorsa fail olsun
                Thread.sleep(1000);

                System.out.println("\n"+"line_101_APL_Camera");
                String product_text = main.Product().getText();
                int tab_count = main.Tabs().size();
                System.out.println(product_text +" "+" "+ tab_count +" "+ "Camera measurement is available");
                for ( int tab = 0;  tab< main.Tabs().size(); tab++)
                {
                    main.Tabs().get(tab).click();
                    Thread.sleep(2000);
                    String text_tab = main.Tabs().get(tab).getText();
                    Thread.sleep(1000);
                    System.out.println("\n"+text_tab);
                    Thread.sleep(2000);
                    String ppm_value = main.PPMValue().getText();
                    System.out.println(ppm_value);
                    int graph_count = (main.Graph_Value().size())/6;
                    System.out.println(graph_count + " chart is available");
                    int i=0;
                    for (WebElement tspan : main.Tspan_Value())
                    {
                        String text_tspan = tspan.getText();
                        if (text_tspan.contentEquals("0 %")) {i++;}
                    }
                    int ok_graph_count = i/2;
                    if(graph_count==0){
                        System.out.println("No measurement result");
                        softassert.fail(text_tab + " No Data");
                    }
                    else{System.out.println(ok_graph_count + " of measurement result is 0%");}

                }
                softassert.assertAll();
            }

            catch (Exception e){
                e.printStackTrace();
                softassert.assertAll();
            }
    }
    @Test(description = "Success 101ASLCamera", priority = 2)
    public void line_101_ASL_Camera_Success() throws InterruptedException{
        SoftAssert softassert = new SoftAssert();
        LoginPage login = new LoginPage(driver);
        LineSelection line = new LineSelection(driver);
        WorkCenterSelection workcenter = new WorkCenterSelection(driver);
        StationTypeSelection stationtype = new StationTypeSelection(driver);
        MainPage main = new MainPage(driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(main.Change_button()).click().build().perform();
        //main.Change_button().click();
        Thread.sleep(5000);
        try {
            //wait.until(ExpectedConditions.visibilityOfAllElements(login.LoginNow()));
            System.out.println(login.LoginNow().getText());
            login.LineID().click();
            Thread.sleep(1000);
            line.LineID_101().click();
            Thread.sleep(1000);

            login.WorkCenter().click();
            Thread.sleep(1000);
            workcenter.WorkCenter_ASL().click();
            Thread.sleep(1000);

            login.StationType().click();
            Thread.sleep(1000);
            stationtype.StationType_Camera().click();
            Thread.sleep(1000);

            login.SubmitButton().click();
            Thread.sleep(5000);
            String home_page_title = driver.getTitle();
            Assert.assertEquals(home_page_title, "SPC Data" ); // SPC main sayfasi gelmiyorsa fail olsun
            Assert.assertEquals(main.Graph_Area().isDisplayed(),true);  // graph area yaratilmiyorsa fail olsun
            Thread.sleep(1000);

            System.out.println("\n"+"line_101_ASL_Camera");
            String product_text = main.Product().getText();
            int tab_count = main.Tabs().size();
            System.out.println(product_text +" "+" "+ tab_count +" "+ "Camera measurement is available");
            for ( int tab = 0;  tab< main.Tabs().size(); tab++)
            {
                main.Tabs().get(tab).click();
                Thread.sleep(2000);
                String text_tab = main.Tabs().get(tab).getText();
                Thread.sleep(1000);
                System.out.println("\n"+text_tab);
                Thread.sleep(2000);
                String ppm_value = main.PPMValue().getText();
                System.out.println(ppm_value);
                int graph_count = (main.Graph_Value().size())/6;
                System.out.println(graph_count + " chart is available");
                int i=0;
                for (WebElement tspan : main.Tspan_Value())
                {
                    String text_tspan = tspan.getText();
                    if (text_tspan.contentEquals("0 %")) {i++;}
                }
                int ok_graph_count = i/2;
                if(graph_count==0){
                    System.out.println("No measurement result");
                    softassert.fail(text_tab + " No Data");
                }
                else{System.out.println(ok_graph_count + " of measurement result is 0%");}

            }
            softassert.assertAll();
        }

        catch (Exception e){
            e.printStackTrace();
            softassert.assertAll();
        }
    }
    @Test(description = "Success 101IMLCamera", priority = 3)
    public void line_101_IML_Camera_Success() throws InterruptedException{
        SoftAssert softassert = new SoftAssert();
        LoginPage login = new LoginPage(driver);
        LineSelection line = new LineSelection(driver);
        WorkCenterSelection workcenter = new WorkCenterSelection(driver);
        StationTypeSelection stationtype = new StationTypeSelection(driver);
        MainPage main = new MainPage(driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(main.Change_button()).click().build().perform();
        //main.Change_button().click();
        Thread.sleep(5000);
        try {
            //wait.until(ExpectedConditions.visibilityOfAllElements(login.LoginNow()));
            System.out.println(login.LoginNow().getText());
            login.LineID().click();
            Thread.sleep(1000);
            line.LineID_101().click();
            Thread.sleep(1000);

            login.WorkCenter().click();
            Thread.sleep(1000);
            workcenter.WorkCenter_IML().click();
            Thread.sleep(1000);

            login.StationType().click();
            Thread.sleep(1000);
            stationtype.StationType_Camera().click();
            Thread.sleep(1000);

            login.SubmitButton().click();
            Thread.sleep(5000);
            String home_page_title = driver.getTitle();
            Assert.assertEquals(home_page_title, "SPC Data" ); // SPC main sayfa gelmiyorsa fail olsun
            Assert.assertEquals(main.Graph_Area().isDisplayed(),true);  // graph area yarat?lm?yorsa fail olsun
            Thread.sleep(1000);

            System.out.println("\n"+"line_101_IML_Camera");
            String product_text = main.Product().getText();
            int tab_count = main.Tabs().size();
            System.out.println(product_text +" "+" "+ tab_count +" "+ "Camera measurement is available");
            for ( int tab = 0;  tab< main.Tabs().size(); tab++)
            {
                main.Tabs().get(tab).click();
                Thread.sleep(2000);
                String text_tab = main.Tabs().get(tab).getText();
                Thread.sleep(1000);
                System.out.println("\n"+text_tab);
                Thread.sleep(2000);
                String ppm_value = main.PPMValue().getText();
                System.out.println(ppm_value);
                int graph_count = (main.Graph_Value().size())/6;
                System.out.println(graph_count + " chart is available");
                int i=0;
                for (WebElement tspan : main.Tspan_Value())
                {
                    String text_tspan = tspan.getText();
                    if (text_tspan.contentEquals("0 %")) {i++;}
                }
                int ok_graph_count = i/2;
                if(graph_count==0){
                    System.out.println("No measurement result");
                    softassert.fail(text_tab + " No Data");
                }
                else{System.out.println(ok_graph_count + " of measurement result is 0%");}

            }
            softassert.assertAll();
        }

        catch (Exception e){
            e.printStackTrace();
            softassert.assertAll();
        }
    }
    @Test(description = "Success 101COLCamera", priority = 4)
    public void line_101_COL_Camera_Success() throws InterruptedException{
        SoftAssert softassert = new SoftAssert();
        LoginPage login = new LoginPage(driver);
        LineSelection line = new LineSelection(driver);
        WorkCenterSelection workcenter = new WorkCenterSelection(driver);
        StationTypeSelection stationtype = new StationTypeSelection(driver);
        MainPage main = new MainPage(driver);
        Actions actions = new Actions(driver);
        actions.moveToElement(main.Change_button()).click().build().perform();
        //main.Change_button().click();
        Thread.sleep(5000);
        try {
            //wait.until(ExpectedConditions.visibilityOfAllElements(login.LoginNow()));
            System.out.println(login.LoginNow().getText());
            login.LineID().click();
            Thread.sleep(1000);
            line.LineID_101().click();
            Thread.sleep(1000);

            login.WorkCenter().click();
            Thread.sleep(1000);
            workcenter.WorkCenter_COL().click();
            Thread.sleep(1000);

            login.StationType().click();
            Thread.sleep(1000);
            stationtype.StationType_Camera().click();
            Thread.sleep(1000);

            login.SubmitButton().click();
            Thread.sleep(5000);
            String home_page_title = driver.getTitle();
            Assert.assertEquals(home_page_title, "SPC Data" ); // SPC main sayfas? gelmiyorsa fail olsun
            Assert.assertEquals(main.Graph_Area().isDisplayed(),true);  // graph area yarat?lm?yorsa fail olsun
            Thread.sleep(5000);

            System.out.println("\n"+"line_101_COL_Camera");
            String product_text = main.Product().getText();
            int tab_count = main.Tabs().size();
            System.out.println(product_text +" "+" "+ tab_count +" "+ "Camera measurement is available");
            for ( int tab = 0;  tab< main.Tabs().size(); tab++)
            {
                main.Tabs().get(tab).click();
                Thread.sleep(2000);
                String text_tab = main.Tabs().get(tab).getText();
                Thread.sleep(1000);
                System.out.println("\n"+text_tab);
                Thread.sleep(2000);
                String ppm_value = main.PPMValue().getText();
                System.out.println(ppm_value);
                int graph_count = (main.Graph_Value().size())/6;
                System.out.println(graph_count + " chart is available");
                int i=0;
                    for (WebElement tspan : main.Tspan_Value())
                    {
                        String text_tspan = tspan.getText();
                        if (text_tspan.contentEquals("0 %")) {i++;}
                    }
                    int ok_graph_count = i/2;
                        if(graph_count==0){
                            System.out.println("No measurement result");
                            softassert.fail(text_tab + " No Data");
                        }
                        else{System.out.println(ok_graph_count + " of measurement result is 0%");}
            }
            softassert.assertAll();
        }
        catch (Exception e){
            e.printStackTrace();
            softassert.assertAll();
        }
    }
    @AfterTest
    public void AfterMethod(){
        super.aftermethod();
        }
    }