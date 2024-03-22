package MyCompany.pageObject;

import MyCompany.AbstractComponents.AbstractCompoment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductCatalogue_159 extends AbstractCompoment {

    WebDriver driver;

    public ProductCatalogue_159(WebDriver driver) {
        //initialization
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    //List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

    //PageFactory
    @FindBy(css=".mb-3")
    List<WebElement> products;



}
