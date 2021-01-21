package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
    private final WebDriver driver;

    @FindBy(linkText = "Welcome")
    private WebElement welcomeLink;

    @FindBy(linkText = "Our Passion")
    private WebElement ourPassionLink;

    @FindBy(css =".txt h1")
    private WebElement ourPassionHeader;

    @FindBy(id = "card_type")
    private WebElement cardTypeDropdown;
    public CheckOutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "email")
    private WebElement emailinput;

    @FindBy(id = "name")
    private WebElement nameinput;

    @FindBy(id = "adress")
    private WebElement adressinput;

    @FindBy(id = "card_type")
    private WebElement card_typeinput;

    @FindBy(id = "card_number")
    private WebElement card_numberinput;

    @FindBy(id="cardholder_name")
    private WebElement cardholder_nameinput;

    @FindBy(id="verification_code")
    private WebElement verification_codeinput;

    @FindBy(id="btn btn-primary")
private WebElement submit;

    public void open(){
        driver.get("http://www.practiceselenium.com/chceck-out.html%22");
    }

    public void clickWelcomeLink(){
        welcomeLink.click();
    }

    public void chooseCardType(String cardType){
        Select select = new Select(cardTypeDropdown);
        select.selectByVisibleText("Visa");
    }

    public void fillInForm(){
        emailinput.sendKeys("hehehe@gmail.com");
        nameinput.sendKeys("Kuba");
        adressinput.sendKeys("Ayotallah Chomeini Street");
        card_numberinput.sendKeys("3621-2719-3211-0023");
        cardholder_nameinput.sendKeys("Kuba Ziolkowski");
        verification_codeinput.sendKeys("2497");
        submit.click();
    }
}