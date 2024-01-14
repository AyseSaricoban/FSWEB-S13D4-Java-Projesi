public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public enum Weapon {
        SWORD, AXE, BOW;
    }

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        // healthPercentage'ı kontrol et ve sınırlar içinde ayarla
        this.healthPercentage = Math.max(0, Math.min(100, healthPercentage));
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        // damage kadar healthPercentage'ı düşür ve kontrol et
        this.healthPercentage = Math.max(0, this.healthPercentage - damage);

        // Oyuncunun canı 0'ın altına düşerse knockout mesajını yazdır
        if (this.healthPercentage == 0) {
            System.out.println(name + " player has been knocked out of game");
        }
    }

    public void restoreHealth(int healthPotion) {
        // healthPotion kadar healthPercentage'ı artır ve kontrol et
        this.healthPercentage = Math.min(100, this.healthPercentage + healthPotion);
    }

    public int healthRemaining() {
        return this.healthPercentage;
    }


}
