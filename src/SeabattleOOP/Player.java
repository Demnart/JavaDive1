package SeabattleOOP;

import java.util.Scanner;

/**
 * Created by Артем on 13.09.2016.
 */
public class Player {
    public int getShoot(){
        System.out.println("Куда стрелять");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите координаты вашего выстрела");
        String s;
        s = scanner.nextLine();
        System.out.println("Координаты подтверждены");
        int shoot = Integer.parseInt(s);
        return shoot;
    }
}
