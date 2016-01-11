import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;

/**
 * Created by xiebixia on 1/11/16.
 */
public class PersonTest {
    @Test
    public void person_test(){
        Person person = new Person(id, "Tom",21);
        assertThat(person.getName(),is("Tom"));
        assertThat(person.getAge(),is(21));
        assertThat(person.introduce(),is("My name is Tom. I am 21 years old."));
    }
}
