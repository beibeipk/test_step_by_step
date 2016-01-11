/**
 * Created by xiebixia on 1/11/16.
 */
public class Person {
    private Integer id;
    private String name;
    private Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

//    public String introduce(){
//        return ("My name is "+getName()+". I am "+getAge()+" years old.");
//    }
        public String introduce(){
        return ("My name is "+getName()+". I am "+getAge()+" years old.");
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }
}
