/**
 * Created by xiebixia on 1/11/16.
 */
public class Klass {
    private Integer number;
    private Student leader;

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


}
