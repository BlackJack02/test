import org.junit.Assert;
import java.io.FileReader;
import java.util.Scanner;

public class Operations {

    public void Sum() throws Exception{
            int s = 1;
            FileReader fr = new FileReader("data.txt");
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                String[] r = scan.nextLine().split(";");
                int res2 = Integer.parseInt(r[3]);
                String znak = r[2];
                if (znak.equals("+")) {
                    try {
                    Assert.assertTrue("True", Integer.parseInt(r[0]) + Integer.parseInt(r[1]) == res2);
                    System.out.println("Сумма выполнена успешно на строке " + s);
                }
                    catch (AssertionError ex){
                        System.out.println("Введены некорректные данные на строке " + s);

            }
        }
                s++;
        }
        fr.close();
    }

    public void Dec() throws Exception{
        FileReader fr = new FileReader ("data.txt");
        Scanner scan = new Scanner(fr);
        int s=1;
        while (scan.hasNextLine()){
            String[] r = scan.nextLine().split(";");
            int res2 = Integer.parseInt(r[3]);
            String znak = r[2];
            if (znak.equals("-")) {
                try {
                    Assert.assertTrue("True", Integer.parseInt(r[0]) - Integer.parseInt(r[1]) == res2);
                    System.out.println("Вычитание выполнено успешно на строке " + s);
                }
                catch (AssertionError ex){
                    System.out.println("Введены некорректные данные на строке " + s);

                }
            }
            s++;
        }
        fr.close();
    }

    public  void Umn() throws Exception{
        FileReader fr = new FileReader("data.txt");
        Scanner scan = new Scanner(fr);
        int s =1;
        while (scan.hasNextLine()){
            String[] r = scan.nextLine().split(";");
            int res2 = Integer.parseInt(r[3]);
            String znak = r[2];
            if (znak.equals("*")) {
                try {
                    Assert.assertTrue("True", Integer.parseInt(r[0]) * Integer.parseInt(r[1]) == res2);
                    System.out.println("Умножение выполнено успешно на строке " + s);
                }
                catch (AssertionError ex){
                    System.out.println("Введены некорректные данные на строке " + s);

                }
            }
            s++;
        }
        fr.close();
    }

    public void Del() throws Exception{
        FileReader fr = new FileReader("data.txt");
        Scanner scan = new Scanner(fr);
        int s = 1;
        while (scan.hasNextLine()){
            String[] r = scan.nextLine().split(";");
            int res2 = Integer.parseInt(r[3]);
            String znak = r[2];
            if (znak.equals("/")) {
                try {
                    Assert.assertTrue("True", Integer.parseInt(r[0]) / Integer.parseInt(r[1]) == res2);
                    System.out.println("Делеие выполнено успешно на строке " + s);
                }
                catch (AssertionError ex){
                    System.out.println("Введены некорректные данные на строке " + s);

                }
            }
            s++;
        }
        fr.close();
    }
}

