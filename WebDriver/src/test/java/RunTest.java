import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RunTest {

    private static WebDriver driver;
    private static String SearchURL = "https://yandex.ru/";
    private static int N = 10;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(SearchURL);
    }

    @After
    public void close() {
        driver.quit();
    }

    @Test
    public void test1(){

        WebElement dynamicElement = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"text\"]")));
        dynamicElement.sendKeys("bell integrator");
        dynamicElement.sendKeys(Keys.ENTER);

        dynamicElement = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("organic__url-text")));
        Assert.assertTrue(driver.findElements(By.className("organic__url-text")).size() > 3);
        System.out.println("Тест 1 пройден успешно");
    }
    @Test
    public void test2(){
        WebElement dynamicElement = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"text\"]")));
        dynamicElement.sendKeys("sdjaljksdglijsdgljsandglinlIGUBHIOSehtl;isudbfls;dfgasdg");
        dynamicElement.sendKeys(Keys.ENTER);

        dynamicElement = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("misspell__message")));
        Assert.assertTrue(driver.findElement(By.className("misspell__message")).getText().contains("По вашему запросу ничего не нашлось"));
        System.out.println("Тест 2 пройден успешно");

    }

}
