public class Static {

    static int ID = 0;

    //ID увеличиваем на 1

    public Static(){
        ID++;
    }

    //Выводим ID

    public void viv(){
        System.out.println(ID);
    }
    public static void main(String[] args) {

        //Увеличиваем ID на 1 и выводим

      Static obj1 = new Static();
      obj1.viv();

        //Увеличиваем ID на 1 и выводим

      Static obj2 = new Static();
      obj2.viv();

        //Увеличиваем ID на 1 и выводим
        
      Static obj3 = new Static();
      obj3.viv();

    }
}

