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
    System.out.println("戦闘開始！");
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
    System.out.println("アベルは生きている:"+ h.isAlive());
    System.out.println("スライムAは生きている:"+ s.isAlive());
    System.out.println("---参照の確認---");
    Character partyMember = h;
    partyMember.hp -=50;
    System.out.print("partyMember経由でHPを減らした後：");
    h.showStatus();

    }
}
