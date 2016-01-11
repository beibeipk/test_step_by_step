import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by xiebixia on 1/11/16.
 */
public class WorkerTest {
    @Test
    public void student_extend_person_test(){
        Worker worker = new  Worker("Tom",21);
        assertThat(worker.getName(),is("Tom"));
        assertThat(worker.getAge(),is(21));
        assertThat(worker.introduce(),is("My name is Tom. I am 21 years old. I am a Worker. I have a job."));
    }
}
