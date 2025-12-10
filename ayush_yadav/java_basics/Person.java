public class Person{
    String name;
    int age;
    //Constructor
    public Person(String name, int age ) {
        this.name =name;
        this.age =age;
    }
    //Method
    public void introduce(){
        System.out.println("Hi Im" + name + "and im "+ age + "Years old");

    }
    public static void main (String[]args){
        Person p = new Person (  "ayush", 15);
        p.introduce();
    }
}