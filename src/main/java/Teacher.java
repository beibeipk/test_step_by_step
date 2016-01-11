import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiebixia on 1/11/16.
 */
public class Teacher extends Person{
    private Student student;
    private List<Klass> klasses;

    public Teacher(Integer id, String name, Integer age, Student student, List<Klass> klasses) {
        super(id, name, age);
        this.klasses = klasses;
        this.student=student;
    }
    public List<Klass> getklasses() {
        return klasses;
    }

    public String teachKlasses() {
        String status;
        if (getklasses().size()==0) {
            status="No Class";
        } else {
            status="Class "+getklasses().get(0).getNumber();
            for(int i=1;i<getklasses().size();i++){
                status+=", "+getklasses().get(i).getNumber();
            }
        }
        return  status;
    }
    public String introduce(){
        return (super.introduce()+" I am a Teacher. I teach "+teachKlasses()+".");
    }

    public String introduceWith(){
        Integer judgement=0;
        String status =" ";
        for(int i=0;i<getklasses().size();i++){
            if(student.getKlass().getNumber()==getklasses().get(i).getNumber()){
                judgement=1;
                status=" ";
            }
        }
        if(judgement==0){
            status=" don't ";
        }
        return ("My name is Tom. I am 21 years old. I am a Teacher. I"+status+"teach "+student.getName()+".");
    }

    public String isTeaching(Student student){
        Integer classTeacherStudent = null;
        String joinOrLeader;
        for(int i=0;i<getklasses().size();i++){
            if(getklasses().get(i).isIn(student)==true){
                classTeacherStudent=student.getKlass().getNumber();
            }
        }
        if(student.leaderStatus()==true){
            joinOrLeader=" become Leader of ";
        }
        else {
            joinOrLeader=" has joined ";
        }
        return ("I am "+getName()+". I know "+student.getName()+joinOrLeader+"Class "+classTeacherStudent+".");
    }
}
