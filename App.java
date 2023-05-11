public class App {
    public static void main(String[] args) {
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
            hero.attack();  
            enemy.attack(); 
        
        Character character1 = new Hero();
        Character character2 = new Enemy();
        Character character3 = new Witch();
        Character character4 = new Fighter();
        
        character1.attack(); 
        character2.attack(); 
        character3.attack(); 
        character4.attack(); 
        
        Witch witch = new Witch();
            witch.attack();
        
        hero.move();             
            hero.move("Timur laut");      
        enemy.move();            
            enemy.move(77);           
        character3.move();       
        character4.move();       
    }
}
