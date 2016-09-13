package SeabattleOOP;

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
        cells[ship.position]= 'X'   ;
    }

    void doShoot(int shoot) {
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
    }

    void show(){
        System.out.println(cells);
    }
    boolean isNotGameOver() {
       return cells[ship.position] == 'X';
    }

}
