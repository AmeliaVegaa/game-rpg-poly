public class Enemy extends Character {
    public void attack() {
        System.out.println("Enemy menyerang dengan senjatanya!");
    }
    
    public void move() {
        System.out.println("Enemy bergerak!");
    }
    
    public void move(int step) {
        System.out.println("Enemy bergerak " + step + " langkah ke depan!");
    }
}
