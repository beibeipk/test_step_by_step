/**
 * Created by xiebixia on 1/11/16.
 */
public class Klass {
    private Integer number;
    private Student leader;
    private Student member;

    public Klass(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public Student assignLeader(Student student){
        this.leader=student;
        return leader;
    }


    public String appendMember(Student student){
        if(student.getKlass().getNumber()==getNumber()){
            this.member=student;
            return null;
        }
        else {
            return ("It is not one of us.");
        }
    }

    public boolean isIn(Student student){
        if(student.getKlass().getNumber()==getNumber()){
            return true;
        }
        else {
            return false;
        }
    }
}
