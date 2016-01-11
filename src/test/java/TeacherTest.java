import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiebixia on 1/11/16.
 */
public class TeacherTest {
    @Test
    public void teacher_test(){
        Student student=new Student("Jerry",12,2);
        Teacher teacher = new Teacher("Tom",21,student, 2);
        assertThat(teacher.getName(),is("Tom"));
        assertThat(teacher.getAge(),is(21));
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2."));
    }

    @Test
    public void teacher_test_null(){
        Student student=new Student("Jerry",12,2);
        Teacher teacher = new Teacher("Tom",21, student, null);
        assertThat(teacher.getName(),is("Tom"));
        assertThat(teacher.getAge(),is(21));
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }

    @Test
    public void teacher_student_test_teach(){
        Student student=new Student("Jerry",12,2);
        Teacher teacher = new Teacher("Tom",21, student, 2);
        assertThat(teacher.getName(),is("Tom"));
        assertThat(teacher.getAge(),is(21));
        assertThat(teacher.introduceWith(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry."));
    }

    @Test
    public void teacher_student_test_unteach(){
        Student student=new Student("Jerry",12,2);
        Teacher teacher = new Teacher("Tom",21, student, 3);
        assertThat(teacher.getName(),is("Tom"));
        assertThat(teacher.getAge(),is(21));
        assertThat(teacher.introduceWith(),is("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry."));
    }
}
