public class GameMaster {
    public static void main(String[] args){
    Hero h = new Hero();
    h.name = "アベル";
    h.weapon ="銅の剣" ;
    h.hp =100;
    Slime s = new Slime();
    s.name = "スライムA";
    s.hp =30;
    System.out.println("冒険が始まる...!");
    h.showStatus();
    s.showStatus();
    h.attack(s);
    s.showStatus();
    s.attack(h);
    h.showStatus();
    h.heal(h);
    h.showStatus();
    h.attack(s);
    h.attack(s);
    h.attack(s);
    System.out.println("---戦闘終了---");
    h.showStatus();
    s.showStatus();
    h.isAlive();
    s.isAlive();
    }
}
