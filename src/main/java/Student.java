/**
 * Created by xiebixia on 1/11/16.
 */
public class Student extends Person{
    public Student (Integer id, String name, Integer age, Integer klass) {
        super(id, name, age);
        this.klass = klass;
    }
    private Integer klass;

    public Integer getKlass() {
        return klass;
    }

    public String introduce(){
        return (super.introduce()+" I am a Student. I am at Class "+getKlass()+".");
    }
}
