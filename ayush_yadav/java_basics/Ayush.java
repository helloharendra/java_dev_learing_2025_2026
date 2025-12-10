public class Ayush{
    String name;
    int age;
    public Ayush(String name,int age){
        this.name =name;
        this.age =age;

    }
public void printAyush() {


System.out.println ("Hi im " + name+"My age is" +age);
}
public static void main (String[]args){
    Ayush p = new Ayush ("AYUSH",15);
    p.printAyush();
}
}