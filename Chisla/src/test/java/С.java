import org.junit.Test;
import java.lang.*;

public class С {


    @Test
     public void Summa() throws Exception {
        System.out.println("Тест с суммой:");
        Operations n = new Operations();
        n.Sum();
        }
    @Test
    public void Vicitanie() throws Exception {
        System.out.println("Тест с разностью:");
        Operations n = new Operations();
        n.Dec();
    }
    @Test
    public void Umnojenie() throws Exception {
        System.out.println("Тест с умножением:");
        Operations n = new Operations();
        n.Umn();
    }
    @Test
    public void Delelenie() throws Exception {
        System.out.println("Тест с делением:");
        Operations n = new Operations();
        n.Del();
    }




    }
