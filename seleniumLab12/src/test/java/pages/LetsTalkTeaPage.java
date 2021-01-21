package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LetsTalkTeaPage {
    private WebDriver driver;

    @FindBy(name = "name")
    private WebElement nameInput;
    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "subject")
    private WebElement subjectInput;
    @FindBy(name = "message")
    private WebElement messageInput;
    @FindBy(name = "form-submit")
    private WebElement submitMessage;

    public LetsTalkTeaPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    public void open(){
        driver.get("http://www.practiceselenium.com/welcome.html");
    }

public void messageFill(){
        nameInput.sendKeys("Kuba");
    emailInput.sendKeys("ukwalserdeczny@gmail.com");
    subjectInput.sendKeys("Witam");
    messageInput.sendKeys("Halooo haloo");
    submitMessage.click();
    }

}