import io.qameta.allure.Allure;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class tinkoffTest {

    @Test
    public void startWebDriver() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.tinkoff.ru/");
        Assert.assertTrue("title should start with Лучший интернет-банк. Кредит наличными и кредитные карты онлайн",
                driver.getTitle().startsWith("Лучший интернет-банк. Кредит наличными и кредитные карты онлайн"));


        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"x48761\"]/div[3]/div/div/div/div/div/div/div[6]/a/span")));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"x48761\"]/div[3]/div/div/div/div/div/div/div[6]/a/span"));
        element.click();

        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div[2]/div/div/div[2]/div/ul/li[2]/span[2]/a/span")));
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div[2]/div/div/div[2]/div/ul/li[2]/span[2]/a/span"));
        element.click();

        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span")));
        if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span")).getText().contains("Москве") == false) {

            element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span"));
            element.click();

            wait = new WebDriverWait(driver, 15);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/span/a/span")));
            element = driver.findElement(By.linkText("г. Москва"));
            element.click();

        }

        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/section/ul/li[1]/span[2]/a/span")));
        String title = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/section/ul/li[1]/span[2]/a/span")).getAttribute("Value");
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/section/ul/li[1]/span[2]/a/span"));
        element.click();

        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div[1]/div/div/div/div[3]/div/ul/li[2]/div/a/span")));
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div[1]/div/div/div/div[3]/div/ul/li[2]/div/a/span"));
        element.click();

        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[6]/div/div[1]/div/div/button")));
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[6]/div/div[1]/div/div/button"));
        element.click();

if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[1]/div/div[2]")).getText().contains("Поле обязательное") == true) {

    element = driver.findElement(By.xpath("//*[@id=\"payerCode\"]"));
    element.click();
    TimeUnit.SECONDS.sleep(2);
    element.sendKeys("123");
    TimeUnit.SECONDS.sleep(2);
    element.sendKeys(Keys.ENTER);

    if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[1]/div/div[2]")).getText().contains("Поле неправильно заполнено") == true) {

        element = driver.findElement(By.xpath("//*[@id=\"payerCode\"]"));
        element.click();
        TimeUnit.SECONDS.sleep(2);
        element.sendKeys("4567890");
        TimeUnit.SECONDS.sleep(2);
        element.sendKeys(Keys.ENTER);
    }
}

        if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[2]/div/div[2]")).getText().contains("Поле обязательное") == true) {

            element = driver.findElement(By.xpath("//*[@id=\"period\"]"));
            element.click();
            TimeUnit.SECONDS.sleep(2);
            element.sendKeys("12.2");
            TimeUnit.SECONDS.sleep(2);
            element.sendKeys(Keys.ENTER);

            if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[2]/div/div[2]")).getText().contains("Поле заполнено некорректно") == true) {

                element = driver.findElement(By.xpath("//*[@id=\"period\"]"));
                element.click();
                TimeUnit.SECONDS.sleep(2);
                element.sendKeys("017");
                TimeUnit.SECONDS.sleep(2);
                element.sendKeys(Keys.ENTER);
            }
        }

        if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[4]/div/div/div/div/div/div/div/div[2]")).getText().contains("Поле обязательное") == true) {

            element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[4]/div/div/div/div/div/div/div/div[1]/label/div/input"));
            element.click();
            TimeUnit.SECONDS.sleep(2);
            element.sendKeys("9");
            TimeUnit.SECONDS.sleep(2);
            element.sendKeys(Keys.ENTER);

            if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[4]/div/div/div/div/div/div/div/div[2]")).getText().contains("Минимум — 10") == true) {

                element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[4]/div/div/div/div/div/div/div/div[1]/label/div/input"));
                element.click();
                TimeUnit.SECONDS.sleep(2);
                element.sendKeys("0000");
                TimeUnit.SECONDS.sleep(2);
                element.sendKeys(Keys.ENTER);

            }
            if (driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[4]/div/div/div/div/div/div/div/div[2]")).getText().contains("Максимум — 15 000") == true)
             {

                element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[4]/div/div[2]/div[1]/div/div/div/div[4]/div[1]/form/div[4]/div/div/div/div/div/div/div/div[1]/label/div/input"));
                element.click();
                TimeUnit.SECONDS.sleep(2);
                element.sendKeys(Keys.BACK_SPACE);
                TimeUnit.SECONDS.sleep(2);
                element.sendKeys(Keys.ENTER);
            }
        }


        driver.navigate().to("https://www.tinkoff.ru/");
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"x48761\"]/div[3]/div/div/div/div/div/div/div[6]/a/span")));
        element = driver.findElement(By.xpath("//*[@id=\"x48761\"]/div[3]/div/div/div/div/div/div/div[6]/a/span"));
        element.click();


        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search-and-pay-container\"]/div[2]/div[2]/div/form/div[3]/div/div/div/div/label/div/input")));
        element = driver.findElement(By.xpath("//*[@id=\"search-and-pay-container\"]/div[2]/div[2]/div/form/div[3]/div/div/div/div/label/div/input"));
        element.click();
        TimeUnit.SECONDS.sleep(2);
        element.sendKeys("ЖКУ-Москва");
        TimeUnit.SECONDS.sleep(2);
        element.sendKeys(Keys.ENTER);

        driver.navigate().to("https://www.tinkoff.ru/");
        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"x48761\"]/div[3]/div/div/div/div/div/div/div[6]/a/span")));
        element = driver.findElement(By.xpath("//*[@id=\"x48761\"]/div[3]/div/div/div/div/div/div/div[6]/a/span"));
        element.click();


        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div[2]/div/div/div[2]/div/ul/li[2]/span[2]/a/span")));
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div[2]/div/div/div[2]/div/ul/li[2]/span[2]/a/span"));
        element.click();


        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span")));
        element = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[5]/div/div[2]/div/div/div/div[2]/div/div/div/span/span/span"));
        element.click();

        wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/span/a/span")));
        element = driver.findElement(By.linkText("г. Санкт-Петербург"));
        element.click();
        Assert.assertFalse("Нет искомого", driver.findElements(By.linkText("ЖКУ-Москва")).size()>0);
        }
}





