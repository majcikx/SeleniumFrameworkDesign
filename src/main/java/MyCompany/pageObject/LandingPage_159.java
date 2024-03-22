package MyCompany.pageObject;

import MyCompany.AbstractComponents.AbstractCompoment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage_159 extends AbstractCompoment {

    WebDriver driver;

    public LandingPage_159(WebDriver driver) {
        //initialization
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //WebElement userEmail = driver.findElement(By.id("userEmail"));

    //PageFactory
    @FindBy(id="userEmail")
    WebElement userEmail;

    @FindBy(id="userPassword")
    WebElement userPasswordEle;

    @FindBy(id="login")
    WebElement submit;

    public  void loginApplication(String email, String password){
        userEmail.sendKeys(email);
        userPasswordEle.sendKeys(password);
        submit.click();
    }

    public void goTo(){
        driver.get("https://rahulshettyacademy.com/client");
    }

}
