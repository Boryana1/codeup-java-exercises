import java.sql.SQLOutput;

public class Person {
    private String name;
    public String getName(){
//TODO: return the person's name
        return name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("%s says hello!", this.name);
    }
//        Person p1 = new Person();
    public Person(String personName){
        name = personName;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Anna");
        p1.sayHello();
    }
}
