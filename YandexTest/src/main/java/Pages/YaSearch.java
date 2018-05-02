package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YaSearch extends Chrome {
    public YaSearch(){

            driver.get("https://www.yandex.ru");
            WebElement element = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Маркет")));
            element.click();

    }
}
