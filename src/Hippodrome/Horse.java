package Hippodrome;

/**
 * Created by Артем on 12.09.2016.
 */
public class Horse {
    int age;
    String name;
    int speed;
    boolean isMale;

    void eat(){
        System.out.println("hruuum");

    }

    void about(){
        String sex = (isMale) ? "Male":"Female";//Тернарная операция. В скобках boolean значение, если оно равно true  то выполняеться
        // то что находиться до двоеточий в нашем варианте в переменную sex присваивается значение "Male", если же оно равно false,
        //которая находиться после двоеточий в нашем варианте переменной sex присваиваеться значение "Female"
        System.out.printf("Имя: %s, Возраст :%d, Пол %s\t\t",name,age,sex);

    }
    void speedHorse(){
        about();
        System.out.println("Скорость лошади:" + speed);
    }

}

