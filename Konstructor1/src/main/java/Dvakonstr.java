public class Dvakonstr {
    String s;

    //Выводим сообщение полученное при создании объекта

    public Dvakonstr(String s){
        System.out.println(s);
    }

    //Выводим 111

    public Dvakonstr(){
        System.out.println("111") ;
    }

    //Объекты:
    public static void main(String[] args) {
        //Объект с отправкой сообщений

        Dvakonstr objs = new Dvakonstr("Сообщение есть");

        //Объект без отправки сообщений

        Dvakonstr objnos = new Dvakonstr();
    }

}