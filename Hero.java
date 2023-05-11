public class Hero extends Character {
    public void attack() {
        System.out.println("Hero menyerang dengan pedang!");
    }
    
    public void specialAttack() {
        System.out.println("Hero menggunakan special attack!");
    }
    
    public void move() {
        System.out.println("Hero bergerak!");
    }
    
    public void move(String direction) {
        System.out.println("Hero bergerak ke arah " + direction + "!");
    }
}
