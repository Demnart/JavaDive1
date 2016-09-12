package Hippodrome;
import java.util.Random;

/**
 * Created by Артем on 12.09.2016.
 */
public class Main {
    public static void main(String[] args) {

        Horse[] horses = new Horse[10];
        Horse horse1 = new Horse();
        horse1.speed = 0;
//      Player player = new Player();
        for (int i = 0; i < horses.length; i++) {
            Random random = new Random();
            horses[i] = new Horse();
            horses[i].name = "Буцефал" + i;
            horses[i].age = 1 + random.nextInt(9);
            horses[i].speed = 10 + random.nextInt(90);
            horses[i].isMale = random.nextBoolean();
            if(horse1.speed < horses[i].speed){
                horse1.speed =horses[i].speed;
            }

        }
//        if (horse1.speed > player.getSpeed()) {
//            System.out.println("Вы не угадали!Ваша ставка " + player.getRate() + " обнулилась" );
//        }
//        else if (horse1.speed < player.getSpeed()) {
//            System.out.println("Вы не угадали!Ваша ставка " + player.getRate() + " обнулилась" );
//        } else if (horse1.speed == player.getSpeed()) {
//            System.out.println("Вы угадали! Поздравляем ВАС!!!");
//        } else {
//            System.out.println("Eror!!!");
//        }

        for (Horse horse : horses) {
            horse.speedHorse();
        }

    }
}
