import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiebixia on 1/11/16.
 */
public class BoxGameTest {
    @Test
    public void box_game_test(){
        Player Tom=new Player(001,"Tom",100,10);
        Player Mary=new Player(002,"Mary",1000,10);
        BoxGame box=new BoxGame();
        assertThat(box.gameResult(Tom,Mary),is("Tom被打败了。"));
    }
}
