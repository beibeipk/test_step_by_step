/**
 * Created by xiebixia on 1/11/16.
 */
public class Worker extends Person {

    public Worker(Integer id,String name, Integer age) {
        super(id, name, age);
    }

    public String introduce(){
        return (super.introduce()+" I am a Worker. I have a job.");
    }
}
