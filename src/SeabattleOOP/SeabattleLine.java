package SeabattleOOP;

import java.util.Scanner;

/**
 * Created by Артем on 12.09.2016.
 */
public class SeabattleLine {
    public static void main(String[] args) {
        char[] cells = new char[10];

        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int position = 4;
        cells[position] = 'X';
        do {
            System.out.println(cells);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите координаты вашего выстрела");
            String s;
            s = scanner.nextLine();
            System.out.println("Координаты подтверждены");
            int shoot = Integer.parseInt(s);
            switch (cells[shoot]) {
                case '.':
                    System.out.println("Вы промахнулись");
                    cells[shoot] = '*';
                    break;
                case 'X':
                    System.out.println("Вы попали!!!");
                    cells[shoot] = '$';
                    System.out.println(cells);
                    break;
                case '*':
                    System.out.println("Вы уже стреляли в эту ячейку");
                    break;
                default:
                    System.out.println("Eror");
            }

        } while (cells[position] == 'X');







    }

}
