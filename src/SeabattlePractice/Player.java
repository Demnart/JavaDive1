package SeabattlePractice;

import java.util.Scanner;

/**
 * Created by Артем on 13.09.2016.
 */
public class Player {
   public int getShoot(){
        System.out.println("Куда вы хотите выстрелить?");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.println("Координаты подтверждены");
        int shoot = Integer.parseInt(s);
        return shoot;
    }
}
