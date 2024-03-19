package MyCompany;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class StandAloneTest_152 {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //setup of general wait for test
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/client");

        //MxTest@gmail.com/Password123
        driver.findElement(By.id("userEmail")).sendKeys("MxTest@gmail.com");
        driver.findElement(By.id("userPassword")).sendKeys("Password123");
        driver.findElement(By.id("login")).click();

        List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));

        WebElement prod =  products.stream().filter(product ->
                product. findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
                prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#toast-container")));
        //ng-animating
        //causing performance issue
        //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".ng-animating")));
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector(".ng-animating"))));
        driver.findElement(By.cssSelector("[routerlink*='cart']")).click();
        driver.quit();

    }
}
