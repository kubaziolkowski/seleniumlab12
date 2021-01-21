package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
private WebDriver driver;

    @FindBy(linkText = "Welcome")
    private WebElement welcomeLink;

    @FindBy(linkText = "Our Passion")
    private WebElement ourPassionLink;

    public WelcomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
public void open(){
        driver.get("http://www.practiceselenium.com/welcome.html");
}
public void clickOurPassionLink(){
        ourPassionLink.click();
}

}
