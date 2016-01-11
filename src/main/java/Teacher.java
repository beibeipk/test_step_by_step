/**
 * Created by xiebixia on 1/11/16.
 */
public class Teacher extends Person{
    private Student student;
    private Integer klass;

    public Teacher(Integer id, String name, Integer age, Student student, Integer klass) {
        super(id, name, age);
        this.klass = klass;
        this.student=student;
    }
    public Integer getklass() {
        return klass;
    }

    public String teachKlass() {
        if (getklass() == null) {
            return ("No Class");
        } else {
            return ("Class "+getklass());
        }
    }
    public String introduce(){
        return (super.introduce()+" I am a Teacher. I teach "+teachKlass()+".");
    }

    public String introduceWith(){
        if(student.getKlass()==getklass()){
            return ("My name is Tom. I am 21 years old. I am a Teacher. I teach "+student.getName()+".");
        }
        else{
            return ("My name is Tom. I am 21 years old. I am a Teacher. I don't teach "+student.getName()+".");
        }
    }
}
