package Yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Phones extends YandexMarket{



    public Phones(){
        WebElement dynamicElement = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/noindex/ul/li[1]/a")));
        Actions actions = new Actions(driver);
        actions.moveToElement(dynamicElement).build().perform();

        WebElement Element = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Мобильные телефоны")));

        Element.click();

         Element = (new WebDriverWait(driver, N))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"search-prepack\"]/div/div/div[2]/div/div[1]/div[4]/fieldset/ul/li[1]/div/a/label/div")));

        Element.click();

    }
}
