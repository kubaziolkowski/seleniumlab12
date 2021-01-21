import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CheckOutPage;
import pages.LetsTalkTeaPage;
import pages.OurPassionPage;
import pages.WelcomePage;


public class TeaTest {
    private WebDriver driver;


    @Before
    public void setUp(){
      System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void welcomeTest(){
        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.open();
        welcomePage.clickOurPassionLink();
    }

    @Test
    public void ourPassionTest(){
        OurPassionPage ourPassionPage = new OurPassionPage(driver);
        ourPassionPage.open();
        ourPassionPage.clickWelcomeLink();

        WelcomePage welcomePage = new WelcomePage(driver);
        welcomePage.clickOurPassionLink();

        Assert.assertTrue(ourPassionPage.isOurPassionHeaderVisible());
        Assert.assertEquals("Our Passion", ourPassionPage.getOurPassionHeaderText());
    }

    @Test
    public void letsTalkTeaTest(){
    LetsTalkTeaPage LetsTalkTeaPage = new LetsTalkTeaPage(driver);
    LetsTalkTeaPage.open();
    LetsTalkTeaPage.messageFill();
    }

    @Test
    public void CheckOutPageTest(){
       CheckOutPage CheckOutPage = new CheckOutPage(driver);
       CheckOutPage.open();
       CheckOutPage.fillInForm();
    }
    @After
    public void tearDown(){
        driver.close();
    }
}
