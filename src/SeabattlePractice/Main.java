package SeabattlePractice;


/**
 * Created by Артем on 13.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Ship ship = new Ship(4);
        Player player = new Player();
        field.initArr();
        field.setShip(ship);


        System.out.println("Игра началась");
        do{
            field.show();
           field.doShoot(player.getShoot());

        }while(field.isNotGameOvera());

    }
}
