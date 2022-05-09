package Test;
import Base.Base;
import Component.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Line_101_Camera_Test extends Base {

    @BeforeTest
        public void BeforeMethod(){
        super.beforemethod();
        driver.get (MAIN_PAGE_URL);
        }

    @Test(description = "Success 101APLCamera")
        public void line_101_APL_Camera_Success() throws InterruptedException{
            try {

                LoginPage login = new LoginPage(driver);
                LineSelection line = new LineSelection(driver);
                WorkCenterSelection workcenter = new WorkCenterSelection(driver);
                StationTypeSelection stationtype = new StationTypeSelection(driver);
                MainPage main = new MainPage(driver);

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
                Thread.sleep(5000);
                String home_page_title = driver.getTitle();
                Assert.assertEquals(home_page_title, "SPC Data" );
                Assert.assertEquals(main.Graph_Area().isDisplayed(),true);
                System.out.println("line_101_APL_Camera pass");
                main.Change_button().click();
                Thread.sleep(5000);
        }
            catch (Exception e){
                e.printStackTrace();
                Assert.fail("fail");
            }
        }
    @Test(description = "Success 101ASLCamera")
    public void line_101_ASL_Camera_Success() throws InterruptedException{
        try {

            LoginPage login = new LoginPage(driver);
            LineSelection line = new LineSelection(driver);
            WorkCenterSelection workcenter = new WorkCenterSelection(driver);
            StationTypeSelection stationtype = new StationTypeSelection(driver);
            MainPage main = new MainPage(driver);

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
            Assert.assertEquals(home_page_title, "SPC Data" );
            Assert.assertEquals(main.Graph_Area().isDisplayed(),true);
            System.out.println("line_101_ASL_Camera pass");
            main.Change_button().click();
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(description = "Success 101IMLCamera")
    public void line_101_IML_Camera_Success() throws InterruptedException{
        try {

            LoginPage login = new LoginPage(driver);
            LineSelection line = new LineSelection(driver);
            WorkCenterSelection workcenter = new WorkCenterSelection(driver);
            StationTypeSelection stationtype = new StationTypeSelection(driver);
            MainPage main = new MainPage(driver);

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
            Assert.assertEquals(home_page_title, "SPC Data" );
            Assert.assertEquals(main.Graph_Area().isDisplayed(),true);
            System.out.println("line_101_IML_Camera pass");
            main.Change_button().click();
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    @Test(description = "Success 101COLCamera")
    public void line_101_COL_Camera_Success() throws InterruptedException{
        try {

            LoginPage login = new LoginPage(driver);
            LineSelection line = new LineSelection(driver);
            WorkCenterSelection workcenter = new WorkCenterSelection(driver);
            StationTypeSelection stationtype = new StationTypeSelection(driver);
            MainPage main = new MainPage(driver);

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
            Assert.assertEquals(home_page_title, "SPC Data" );
            Assert.assertEquals(main.Graph_Area().isDisplayed(),true);
            System.out.println("line_101_COL_Camera pass");
            main.Change_button().click();
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }
    //REL Camera yok
   /* @Test(description = "Success 101RELCamera")
    public void line_101_REL_Camera_Success() throws InterruptedException{
        try {

            LoginPage login = new LoginPage(driver);
            LineSelection line = new LineSelection(driver);
            WorkCenterSelection workcenter = new WorkCenterSelection(driver);
            StationTypeSelection stationtype = new StationTypeSelection(driver);
            MainPage main = new MainPage(driver);

            login.LineID().click();
            Thread.sleep(1000);
            line.LineID_101().click();
            Thread.sleep(1000);

            login.WorkCenter().click();
            Thread.sleep(1000);
            workcenter.WorkCenter_REL().click();
            Thread.sleep(1000);

            login.StationType().click();
            Thread.sleep(1000);
            stationtype.StationType_Camera().click();
            Thread.sleep(1000);

            login.SubmitButton().click();
            Thread.sleep(5000);
            String home_page_title = driver.getTitle();
            Assert.assertEquals(home_page_title, "SPC Data" );
            Assert.assertEquals(main.Graph_Area().isDisplayed(),true);
            System.out.println("line_101_REL_Camera pass");
            main.Change_button().click();
            Thread.sleep(5000);
        }
        catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
    }*/

    @AfterTest
        public void AfterMethod(){
        super.aftermethod();
        }
    }
