import java.util.Scanner;
public class Speed{
    public static void main (String[]args){
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter Your Speed ");
        int Speed = Sc.nextInt();
        if(Speed < 120){
            System.out.println("Safe Drive");
        }else{
            System.out.println(" Not Safe ");
        }

    }
}