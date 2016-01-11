/**
 * Created by xiebixia on 1/11/16.
 */
public class Game {
//    BoxGame运行
//    public static void main(String[] args){
//        Player Tom=new Player(001,"Tom",100,10);
//        Player Mary=new Player(002,"Mary",1000,10);
//        BoxGame box=new BoxGame();
//        System.out.println(box.gameResult(Tom,Mary));
//    }
    public static void main(String[] args){
        Player Tom=new Player(001,"Tom",100,10);
        Player Mary=new Player(002,"Mary",1000,12);
        BoxGame box=new BoxGame();
        box.gameResult(Tom,Mary);
    }
}
