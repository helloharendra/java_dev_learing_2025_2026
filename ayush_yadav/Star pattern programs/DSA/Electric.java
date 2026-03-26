import java.util.Scanner;
public class Electric{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Unit");
        int unit = sc.nextInt();
        System.out.println("Enter Your per unit price ");
        int price = sc.nextInt();

        int bill;
        if (unit<=100){
            bill = unit * price;
            System.out.println("Bill Amount + : " + bill);
        }else{
            bill = (100*price) + ((unit - 100) * 8 );
            System.out.println("bill Amount + : " + bill);
        }

    }
} 