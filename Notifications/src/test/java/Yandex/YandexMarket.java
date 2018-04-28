package Yandex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

public class YandexMarket {
    public   WebDriver driver;
    private  String SearchURL = "https://market.yandex.ru/";
    public   int N = 10;


    public YandexMarket() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--disable-notifications");
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get(SearchURL);
        }
        catch (Exception ex){
            driver.close();
        }
    }

    @FindBy( xpath ="//*[@id='header-search']")
    WebElement search;

    @FindBy(xpath = "/html/body/div[1]/div/div[1]/noindex/div[2]/div/div[2]/div/div[1]/form/span/span[2]/button")
    WebElement button;

    public void inputText(String locValue){
        search.sendKeys(locValue);
    }
    public void buttonClick(){
        button.click();
    }
}
