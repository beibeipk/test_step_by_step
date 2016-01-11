/**
 * Created by xiebixia on 1/11/16.
 */
public class Player {
    private Integer id;
    private String name;
    private Integer blood;
    private Integer atk;

    public Player(Integer id, String name,Integer blood, Integer atk) {
        this.id = id;
        this.name = name;
        this.blood=blood;
        this.atk = atk;
    }

    public Integer getAtk() {
        return atk;
    }

    public String getName() {
        return name;
    }

    public Integer getBlood() {
        return blood;
    }

    private void setBlood(Integer Blood) {
        blood=Blood;
    }

    public void attack(Player enemy){
        enemy.setBlood(enemy.getBlood()-getAtk());
    }

    public Integer getId() {
        return id;
    }
}
