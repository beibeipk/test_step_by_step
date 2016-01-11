/**
 * Created by xiebixia on 1/11/16.
 */
public class Game {
    public static void main(String[] args){
        Weapon Sticks=new Weapon("优质木棒",3);
        Weapon non=new Weapon("",0);
        Career Tom=new Career(001,"Tom",100,10,"战士",Sticks,non);
        Career Mary=new Career(002,"Mary",50,5,"普通人",non,non);
        BoxGame box=new BoxGame();
        box.gameResult(Tom,Mary);
    }
}
