package Pages;
import org.junit.AfterClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Market extends YaSearch {
    public Market( String p) {
        try{

            WebElement element = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/noindex/ul/li[2]/a")));
            Actions actions = new Actions(driver);
            actions.moveToElement(element).build().perform();
            WebElement notebooks = (new WebDriverWait(driver,10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.linkText(p)));
            actions.moveToElement(notebooks).build().perform();
            notebooks.click();
            System.out.println("Шаг перехода выполнен");
        }
        catch (Exception ex){
            System.out.println("Шаг перехода не выполнен");
            driver.close();
        }


    }
    public void Do(String to) {
        try {


            WebElement element = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='glpriceto']")));

            element.sendKeys(to);
            System.out.println("Шаг ввода значения 'До' выполнен");

        }
        catch (Exception ex){
            System.out.println("Шаг ввода значения 'До' не выполнен");
            driver.close();
        }
    }
    public void Ot(String to){
        try {



        WebElement element = (new WebDriverWait(driver,10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='glpricefrom']")));

        element.sendKeys(to);
        System.out.println("Шаг ввода значения 'От' выполнен");

        }
    catch (Exception ex){
            System.out.println("Шаг ввода значения 'От' не выполнен");
            driver.close();
    }
    }
    public void Company(String name){
        try {
            WebElement notebooks = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("_2Wg9rE1HzR")));
            notebooks.click();
            WebElement comp = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='7893318-suggester']")));
            comp.sendKeys(name);
            comp.sendKeys(Keys.ENTER);
            WebElement cop = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"search-prepack\"]/div/div/div[2]/div/div[1]/div[4]/fieldset/ul/li[1]/div/a/label/div/span")));
            cop.click();
            driver.navigate().refresh();
            System.out.println("Шаг выбора производителя выполнен");

        }
        catch (Exception ex){
            System.out.println("Шаг выбора производителя не выполнен");
            driver.close();

    }
    }
   

    public void Element12(int elN) {
        try {
            WebElement notebooks = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.n-snippet-card2")));
            driver.navigate().refresh();
            Assert.assertTrue(driver.findElements(By.cssSelector("div.n-snippet-card2")).size() == elN);
            System.out.println("Шаг проверки числа элементов выполнен");
        }
        catch (Exception ex){
            System.out.println("Шаг проверки числа элементов не выполнен");
            driver.close();
        }
    }
    public void ZapomnimPerviy(){
        String note;
        try {


            WebElement notebooks = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.n-snippet-card2")));
            driver.navigate().refresh();
            note = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[4]/div[1]/div/a")).getText();
            WebElement search = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='header-search']")));
            search.sendKeys(note);
            search.sendKeys(Keys.ENTER);
            WebElement noteb = (new WebDriverWait(driver, 10))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.className("n-title__text")));
            Assert.assertTrue(driver.findElement(By.className("n-title__text")).getText().contains(note));
            System.out.println("Шаг проверки выполнен");

        }
        catch (Exception ex){
            System.out.println("Шаг проверки не выполнен");
            driver.close();
        }
    }

}
