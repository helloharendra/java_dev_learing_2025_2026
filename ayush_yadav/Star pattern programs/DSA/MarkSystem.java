import java.util.Scanner;
 public class MarkSystem{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Your Mark");
        int mark = sc.nextInt();
        
        if (mark >= 90){
            System.out.println("Grade = A");
        }else if  (mark >= 80){ 
         System.out.println("Grade = B");
         } else if  (mark >= 70){ 
         System.out.println("Grade = C"); 
           } else if (mark >= 60){ 
         System.out.println("Grade = d");
         } else{
          System.out.println(" Fail");
         }
        }
    }
