import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiebixia on 1/11/16.
 */
public class StudentTest {
    @Test
    public void student_test(){
        Student student = new Student("Tom",21,2);
        assertThat(student.getName(),is("Tom"));
        assertThat(student.getAge(),is(21));
        assertThat(student.introduce(),is("My name is Tom. I am 21 years old. I am a Student. I am at Class 2."));
    }
}
