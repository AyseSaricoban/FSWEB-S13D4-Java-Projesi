public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());
        System.out.println("*********************************");
        Player player1 = new Player("Player1", 120, Player.Weapon
                .SWORD);
        Player player2 = new Player("Player2", -10, Player.Weapon.BOW);

        System.out.println("Initial health of " + player1.name + ": " + player1.healthRemaining());
        System.out.println("Initial health of " + player2.name + ": " + player2.healthRemaining());

        player1.loseHealth(30);
        player2.restoreHealth(20);

        System.out.println("Remaining health of " + player1.name + ": " + player1.healthRemaining());
        System.out.println("Remaining health of " + player2.name + ": " + player2.healthRemaining());
    }
}