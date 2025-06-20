public abstract class Character implements Creature {
    String name;
    int hp;
    public abstract void attack(Character target);
    public final boolean isAlive(){
        if(hp>0){
            return true;
        }
        else{
            return false;
        }
    }
    public void showStatus(){
        System.out.println(name+":HP"+hp);
    }
}
