/**
 * Created by xiebixia on 1/11/16.
 */
public class Player {
    private Integer id;
    private String name;
    private Integer blood;
    private Integer originAtk;

    public Player(Integer id, String name,Integer blood, Integer originAtk) {
        this.id = id;
        this.name = name;
        this.blood=blood;
        this.originAtk = originAtk;
    }

    public String getName() {
        return name;
    }

    public Integer getBlood() {
        return blood;
    }

    public void setBlood(Integer Blood) {
        blood=Blood;
    }

    public void attack(Player enemy){
        enemy.setBlood(enemy.getBlood()-getOriginAtk());
    }

    public Integer getId() {
        return id;
    }

    public Integer getOriginAtk() {
        return originAtk;
    }
}
