import Pages.Market;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RunTest {
    @Before
    public void Begin(){
        System.out.println("Начало теста");
    }

    @After
    public void End(){
        System.out.println("Тест завершен");
    }

    @Test
    public void Run() {
        Market run = new  Market("Ноутбуки");
        run.Do("30000");
        run.Company("HP");
        run.Company("Lenovo");
        run.Element12(48);
        run.ZapomnimPerviy();
        run.driver.quit();


    }

    @Test
    public void Run2(){
        Market run = new Market("Планшеты");
        run.Do("25000");
        run.Ot("20000");
        run.Company("Acer");
        run.Company("DELL");
        run.Element12(48); //Проверка не работает так как значение не 48 и не 12
        run.ZapomnimPerviy();
        run.driver.quit();


    }

}