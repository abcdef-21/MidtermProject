public class Hero extends Character {
    String weapon;
    public void attack(Character target){
        System.out.println(this.name+"は"+this.weapon+"で攻撃！"+target.name+"に10のダメージを与えた！");
        target.hp-=10;

    }
    public void heal(Hero h){
        System.out.println(this.name + "は回復呪文を唱えた！HPが20回復した！");
        h.hp +=20;
    }

}
