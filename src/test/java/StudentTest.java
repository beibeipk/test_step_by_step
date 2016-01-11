import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiebixia on 1/11/16.
 */
public class StudentTest {
    @Test
    public void student_leader_test(){
        Klass klass=new Klass(2);
        Student Tom = new Student(001,"Tom",21,klass);
        klass.assignLeader(Tom);
        assertThat(Tom.introduce(),is("My name is Tom. I am 21 years old. I am a Student. I am Leader of Class 2."));
    }

    @Test
    public void student_nonleader_test(){
        Klass klass=new Klass(2);
        Student Tom = new Student(001,"Tom",21,klass);
        Student Jerry = new Student(002,"Jerry",12,klass);
        klass.assignLeader(Jerry);
        assertThat(Tom.introduce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));
    }

    @Test
    public void student_class_test(){
        Klass klass=new Klass(2);
        Klass klass_1=new Klass(1);
        Student Tom = new Student(001,"Tom",21,klass);
        assertThat(klass_1.appendMember(Tom),is("It is not one of us."));
    }
}
