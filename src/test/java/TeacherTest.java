import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiebixia on 1/11/16.
 */
public class TeacherTest {
    @Test
    public void teacher_test(){
        Klass klass_2=new Klass(2);
        Klass klass_3=new Klass(3);
        List<Klass> klassList=new ArrayList<Klass>();
        klassList.add(klass_2);
        klassList.add(klass_3);
        Student student=new Student(002,"Jerry",12,klass_2);
        Teacher teacher = new Teacher(001,"Tom",21,student,klassList);
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Class 2, 3."));
    }

    @Test
    public void teacher_test_null(){
        Klass klass_2=new Klass(2);
        List<Klass> klassList=new ArrayList<Klass>();
        Student student=new Student(002,"Jerry",12,klass_2);
        Teacher teacher = new Teacher(001,"Tom",21,student,klassList);
        assertThat(teacher.introduce(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach No Class."));
    }

    @Test
    public void teacher_student_test_teach(){
        Klass klass_2=new Klass(2);
        Klass klass_3=new Klass(3);
        List<Klass> klassList=new ArrayList<Klass>();
        klassList.add(klass_2);
        klassList.add(klass_3);
        Student student=new Student(002,"Jerry",12,klass_2);
        Teacher teacher = new Teacher(001,"Tom",21,student,klassList);
        assertThat(teacher.introduceWith(),is("My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry."));
    }

    @Test
    public void teacher_student_test_unteach(){
        Klass klass_2=new Klass(2);
        Klass klass_3=new Klass(3);
        List<Klass> klassList=new ArrayList<Klass>();
        klassList.add(klass_3);
        Student student=new Student(002,"Jerry",12,klass_2);
        Teacher teacher = new Teacher(001,"Tom",21,student,klassList);
        assertThat(teacher.introduceWith(),is("My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry."));
    }

    @Test
    public void teacher_student_inteach(){
        Klass klass_2=new Klass(2);
        Klass klass_3=new Klass(3);
        List<Klass> klassList=new ArrayList<Klass>();
        klassList.add(klass_2);
        klassList.add(klass_3);
        Student Jerry=new Student(002,"Jerry",12,klass_2);
        Student Mary=new Student(003,"Mary",12,klass_2);
        klass_2.assignLeader(Mary);
        Teacher teacher = new Teacher(001,"Tom",21,Jerry,klassList);
        assertThat(teacher.isTeaching(Jerry),is("I am Tom. I know Jerry has joined Class 2."));
    }

    @Test
    public void teacher_student_inteach_leader(){
        Klass klass_2=new Klass(2);
        Klass klass_3=new Klass(3);
        List<Klass> klassList=new ArrayList<Klass>();
        klassList.add(klass_2);
        klassList.add(klass_3);
        Student Jerry=new Student(002,"Jerry",12,klass_2);
        klass_2.assignLeader(Jerry);
        Teacher teacher = new Teacher(001,"Tom",21,Jerry,klassList);
        assertThat(teacher.isTeaching(Jerry),is("I am Tom. I know Jerry become Leader of Class 2."));
    }
}
