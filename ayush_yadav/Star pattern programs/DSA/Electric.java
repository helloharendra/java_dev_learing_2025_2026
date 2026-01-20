 import java.util.Scanner;
  public class Electric{
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println( "ENTER YOUR UNIT");
        int units = sc.nextInt();
        System.out.println( "ENTER YOUR PER UNIT PRICE");
        int price = sc.nextInt();
      
        int bill;
        if (units <=100){
            bill = units * price;
            System.out.println ("Bill Amount :"+bill);
        }else{
            bill = (100 * price) + ((units - 100 ) * 8 );
            System.out.println ("Bill Amount :"+bill);
        }
    }
}