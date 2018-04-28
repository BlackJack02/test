import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Main {

    private static WebDriver driver;
    private static String SearchURL = "https://market.yandex.ru/";
    private static int N = 10;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(SearchURL);

    }

    @After
    public void close() {
       // driver.quit();
    }

    @Test
    public void test1(){
        WebElement dynamicElement = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/noindex/ul/li[1]/a")));
        Actions actions = new Actions(driver);
        actions.moveToElement(dynamicElement).build().perform();

        WebElement Element = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Мобильные телефоны")));

        Element.click();

    }

}