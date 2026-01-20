import java.util.Scanner;
public class ODD{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println(" Please Enter Your Numbers");
        int num = sc.nextInt();
        if (num % 3 == 0){
            System.out.println("odd number");
        }else{
            System.out.println("Even number");
        }
    }
}