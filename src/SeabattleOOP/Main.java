package SeabattleOOP;

/**
 * Created by Артем on 13.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship(4);
        field.initArr();
        field.setShip(ship);

        System.out.println("Игра началась");

        do {
            field.show();
            int s = player.getShoot();
            field.doShoot(s);

        } while (field.isNotGameOver());
    }
}
