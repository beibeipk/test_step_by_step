/**
 * Created by xiebixia on 1/11/16.
 */
public class Student extends Person{
    public Student (Integer id, String name, Integer age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }
    private Klass klass;

    public Integer getKlass() {
        return klass.getNumber();
    }

    public String introduce(){
        String status;
        if(getId()==klass.getLeader().getId()){
            status="Leader of";
        }
        else {
            status="at";
        }
        return (super.introduce()+" I am a Student. I am "+status+" Class "+getKlass()+".");
    }
}
