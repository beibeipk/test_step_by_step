/**
 * Created by xiebixia on 1/11/16.
 */
public class Weapon {
    private String name;
    private Integer atk;

    public Weapon(String name, Integer atk) {
        this.name = name;
        this.atk = atk;
    }

    public String getName() {
        return name;
    }
    public String attackWeapon() {
        if (name == "") {
            return "";
        } else {
            return ("用" + name);
        }
    }

    public Integer getAtk() {
        return atk;
    }
}
