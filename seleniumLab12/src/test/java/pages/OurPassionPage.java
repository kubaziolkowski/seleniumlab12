package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OurPassionPage {
    private WebDriver driver;

    @FindBy(linkText = "Welcome")
    private WebElement welcomeLink;

    @FindBy(linkText = "Our Passion")
    private WebElement ourPassionLink;

    @FindBy(css = ".txt h1")
    private WebElement ourPassionHeader;

    public OurPassionPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void open(){
        driver.get("http://www.practiceselenium.com/welcome.html");
    }
    public void clickWelcomeLink(){
        welcomeLink.click();
    }
    public String getOurPassionHeaderText(){
        return ourPassionHeader.getText();
    }
    public boolean isOurPassionHeaderVisible(){
        return ourPassionHeader.isDisplayed();
    }

}
