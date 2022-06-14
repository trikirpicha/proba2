package Trane;

public class Trane{

    public static void main(String[] args) {

        Person kate = new Person("Kate");
        System.out.println(kate.getName());     // Kate
        changeName(kate);
        System.out.println(kate.getName());     // Alice
    }
    static void changeName(Person p){
        p.setName("Alice");
    }
}
class Person{

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    Person(String name){
//        this.name = name;
//    }
//    public void setName(String name){
//        this.name = name;
//    }
//    public String getName(){
//
//        return this.name;
//    }
}