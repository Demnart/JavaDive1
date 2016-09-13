package SeabattlePractice;

/**
 * Created by Артем on 13.09.2016.
 */
public class Field {

    public static final int SIZE = 10;
    char[] cells = new char[SIZE];
    Ship ship;

    void initArr(){
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';

        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.position] = 'X';
    }
    void show(){
        System.out.println(cells);
    }

    void doShoot(int shoot){
        switch (cells[shoot]) {
            case '.':
                System.out.println("Вы промахнулись");
                cells[shoot] = '*';
                System.out.println(cells);
                break;
            case '*':
                System.out.println("Вы уже стреляли");
                System.out.println(cells);
                break;
            case 'X':
                System.out.println("ВЫ попали!!!");
                cells[shoot] = '!';
                System.out.println(cells);
                break;
            default:
                System.out.println("Eror");
        }
    }

    boolean isNotGameOvera(){
        return cells[ship.position] == 'X';
    }
}
