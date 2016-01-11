/**
 * Created by xiebixia on 1/11/16.
 */
public class Career extends Player{
    public Career(Integer id, String name, Integer blood, Integer originAtk, String careerName, Weapon weapon, Weapon armor) {
        super(id, name, blood,originAtk);
        this.denfense = armor.getAtk();
        this.finalAtk =originAtk+weapon.getAtk();
        this.careerName = careerName;
        this.weapon = weapon;
        this.armor = armor;
    }
    private Integer finalAtk;
    private Integer denfense;
    private String careerName;
    private Weapon weapon;
    private Weapon armor;

    public String getCareerName() {
        return careerName;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Weapon getArmor() {
        return armor;
    }

    public Integer getFinalAtk() {
        return finalAtk;
    }

    public Integer getDenfense() {
        return denfense;
    }

    public void attack(Career enemy){
        enemy.setBlood(enemy.getBlood()-getFinalAtk()+enemy.getDenfense());
    }
}
