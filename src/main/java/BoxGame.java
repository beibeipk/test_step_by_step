import java.util.Random;

/**
 * Created by xiebixia on 1/11/16.
 */
public class BoxGame {
    private Player winner;
    private Player loser;
    public String gameResult(Career A, Career B){
        Career beginPlayer;
        Career followPlayer;
        Career forChange;
        Random random = new Random();
        Integer randomBegin=(int)(Math.random()*2);

        if(randomBegin==0){
            beginPlayer=A;
            followPlayer=B;
        }
        else{
            beginPlayer=B;
            followPlayer=A;
        }

        while (beginPlayer.getBlood()>0&&followPlayer.getBlood()>0){
            beginPlayer.attack(followPlayer);
            System.out.println(beginPlayer.getCareerName()+beginPlayer.getName()+beginPlayer.getWeapon().attackWeapon()
                    +"攻击了"+followPlayer.getCareerName()+followPlayer.getName()+","
                    +followPlayer.getName()+ "受到了"+(beginPlayer.getFinalAtk()-followPlayer.getDenfense())+"点伤害,"
                    +followPlayer.getName()+"剩余生命："+followPlayer.getBlood()+".");
            forChange=beginPlayer;
            beginPlayer=followPlayer;
            followPlayer=forChange;
        }

        winner=followPlayer;
        loser=beginPlayer;
        return (loser.getName()+"被打败了。");
    }

    public Player getWinner() {
        return winner;
    }

    public Player getLoser() {
        return loser;
    }
}
